package requeteSOAP;

import javax.xml.namespace.QName;
import javax.xml.soap.SOAPConnectionFactory;
import javax.xml.soap.SOAPConnection;
import javax.xml.soap.MessageFactory;
import javax.xml.soap.SOAPMessage;
import javax.xml.soap.SOAPPart;
import javax.xml.soap.SOAPEnvelope;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPBody;
import javax.xml.soap.SOAPElement;
import javax.xml.transform.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import meserreurs.MonException;

public class SOAPFactory {
	public static SOAPMessage createMessage(String operation, String destination) throws MonException
	{
		return SOAPFactory.createMessage(operation, destination, null);
	}
	
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
	
	public static List<String> sendReceive(String destination, SOAPMessage message) throws SOAPException, TransformerException
	{
		//creation de la connexion
		SOAPConnectionFactory soapConnFactory = SOAPConnectionFactory.newInstance();
		SOAPConnection connection = soapConnFactory.createConnection();
		
		//message.writeTo(System.out);
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
		
		// on crée le transformeur pour visualiser le message
		//TransformerFactory transformerFactory = TransformerFactory.newInstance();
		//Transformer transformer = transformerFactory.newTransformer();
		
		// On extrait le contenu du corps BODY
		//Source sourceContent = reply.getSOAPPart().getContent();
		
		// Sortie de la transformation
		//StreamResult unresult = new StreamResult(System.out);
		//transformer.transform(sourceContent, unresult);
		
		// on ferme la connexion
		connection.close();
		
		return results;
	}
}
