package controleur;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.soap.SOAPMessage;

import requeteSOAP.SOAPFactory;

@WebServlet("/Controleur")
public class Controleur extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String VIEW_PAYS = "viewPays";
	private static final String LIST_PAYS = "listPays";
	private static final String ERROR_PAGE = "/index.jsp";
	
	private static String ADR_SERVICE = "http://localhost:8080/PWSCalcul/services/Calculette";
	private static String SERVICE_PACK = "http://calcul"; // Nom du package
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String actionName = req.getParameter("action");
		String destinationPage = ERROR_PAGE;
		
		try {
			if (VIEW_PAYS.equals(actionName))
			{ //Voir un pays
				
			} else if (LIST_PAYS.equals(actionName))
			{ //Liste des pays
				SOAPMessage mess = SOAPFactory.createMessage("getNamesPays", SERVICE_PACK);
				SOAPFactory.sendReceive(ADR_SERVICE, mess);
				
				destinationPage = "/list.jsp";
			} else 
			{ // Aucune action = page par defaut = page d'accueil
				destinationPage = "/index.jsp";
			}
		} catch (Exception e)
		{
			System.out.println(e);
		}
		
		// Redirection vers la page jsp appropriee 
	    RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(destinationPage);
        dispatcher.forward(req, resp); 
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	}
}
