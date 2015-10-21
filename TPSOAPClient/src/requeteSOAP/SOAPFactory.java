package requeteSOAP;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import javax.xml.namespace.QName;
import javax.xml.soap.MessageFactory;
import javax.xml.soap.SOAPBody;
import javax.xml.soap.SOAPConnection;
import javax.xml.soap.SOAPConnectionFactory;
import javax.xml.soap.SOAPElement;
import javax.xml.soap.SOAPEnvelope;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPMessage;
import javax.xml.soap.SOAPPart;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import meserreurs.MonException;
import metier.Pays;

public class SOAPFactory {
	/**
	 * Creation d'un message SOAP avec l'opération, la destination et sans paramètre
	 */
	public static SOAPMessage createMessage(String operation, String destination) throws MonException
	{
		return SOAPFactory.createMessage(operation, destination, null);
	}
		
	/**
	 * Creation d'un message SOAP avec l'operation, la destination 
	 * et 1 paramètre défini
	 */
	public static SOAPMessage createMessage(String operation, String destination, String nameParameter, String valueParameter) throws MonException {
		Map<String, String> parameters = new HashMap<>();
		parameters.put(nameParameter, valueParameter);
		return SOAPFactory.createMessage(operation, destination, parameters);
	}
	
	/**
	 * Creation d'un message SOAP avec une opération, une destination 
	 * et une liste de paramètres
	 */
	public static SOAPMessage createMessage(String operation, String destination, Map<String, String> parameters) throws MonException  {
		try {
			MessageFactory messageFactory =  MessageFactory.newInstance();			
			SOAPMessage message = messageFactory.createMessage();
			SOAPPart soapPart = message.getSOAPPart();
			SOAPEnvelope envelope = soapPart.getEnvelope();
			SOAPBody body = envelope.getBody();
			
			// On crée l'élément principal et le namespace'
			QName bodyName = new QName(destination, operation, "m");
			
			SOAPElement bodyElement = body.addBodyElement(bodyName); // On crée l’enveloppe
			
			// On passe les paramêtres
			if (parameters != null)
				for (Entry<String, String> entry : parameters.entrySet())
				{
					QName q = new QName(entry.getKey());
					bodyElement.addChildElement(q).addTextNode(entry.getValue());
				}
			
			message.saveChanges(); // On sauve le message
			
			return message;
		} catch (Exception e)
		{
			throw new MonException(e.getMessage());
		}
	}
	
	/**
	 * Envoi d'un message soap avec reponse 1 ou plusieurs String
	 */
	public static List<String> sendReceive(String destination, SOAPMessage message) throws SOAPException
	{
		//creation de la connexion
		SOAPConnectionFactory soapConnFactory = SOAPConnectionFactory.newInstance();
		SOAPConnection connection = soapConnFactory.createConnection();
		
		SOAPMessage reply = connection.call(message, destination);
		SOAPPart soapPart = reply.getSOAPPart();
		SOAPBody body = soapPart.getEnvelope().getBody();
		
		// on examine les éléments renvoyés dans une liste
		Iterator iter = body.getChildElements();	
		Node resultOuter = ((Node) iter.next());
		NodeList nl = resultOuter.getChildNodes();
		
		List<String> results = new ArrayList<>();
		for (int i = 0; i < nl.getLength(); ++i)
		{
			Node result = nl.item(i).getFirstChild();
			//System.out.println(result.getNodeValue());
			results.add(result.getNodeValue());
		}
		
		// on ferme la connexion
		connection.close();
		
		return results;
	}
	
	/**
	 * Envoi d'un message soap avec reponse contenant un pays
	 */
	public static Pays sendReceiveOnePays(String destination, SOAPMessage message) throws SOAPException
	{
		//creation de la connexion
		SOAPConnectionFactory soapConnFactory = SOAPConnectionFactory.newInstance();
		SOAPConnection connection = soapConnFactory.createConnection();
		
		SOAPMessage reply = connection.call(message, destination);
		SOAPPart soapPart = reply.getSOAPPart();
		SOAPBody body = soapPart.getEnvelope().getBody();
		
		// examiner l'element renvoyé = Pays (ne doit pas être null)
		Iterator iter = body.getChildElements();			
		Node resultOuter = ((Node) iter.next()).getFirstChild();	
		NodeList nl = resultOuter.getChildNodes();
		
		Pays p = new Pays();
		for (int i = 0; i < nl.getLength(); ++i)
		{
			Node result = nl.item(i);
			String nodeName = result.getNodeName();
			String nodeValue = result.getFirstChild().getNodeValue();
			
			//Deserialiser l'object Pays
			if (nodeName.contains("nbHabitants"))
				p.setNbHabitants(Integer.valueOf(nodeValue));
			else if (nodeName.contains("nomCapitale"))
				p.setNomCapitale(nodeValue);
			else if (nodeName.contains("nomPays"))
				p.setNomPays(nodeValue);
		}
		
		// on ferme la connexion
		connection.close();
		
		return p;
	}
	
	/**
	 * Verifier l'envoi et la reception d'un message SOAP
	 * Le retour XML s'affiche dans la console
	 */
	public static void checkSendReceive(String destination, SOAPMessage message)
	{
		try {
			//creation de la connexion
			SOAPConnectionFactory soapConnFactory = SOAPConnectionFactory.newInstance();
			SOAPConnection connection = soapConnFactory.createConnection();
			
			//message.writeTo(System.out);
			SOAPMessage reply = connection.call(message, destination);
			
			// on crée le transformeur pour visualiser le message
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			
			// On extrait le contenu du corps BODY
			Source sourceContent = reply.getSOAPPart().getContent();
			
			// Sortie de la transformation
			StreamResult unresult = new StreamResult(System.out);
			transformer.transform(sourceContent, unresult);
			
			// on ferme la connexion
			connection.close();
		} catch(SOAPException e) {
			System.out.println("SOAP Exception");
			e.printStackTrace();
		} catch (TransformerException e) {
			System.out.println("Transformer Exception");
			e.printStackTrace();
		} catch(Exception e)
		{
			System.out.println("Exception");
			e.printStackTrace();
		}
	}
}
