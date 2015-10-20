package controleur;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Controleur")
public class Controleur extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String VIEW_PAYS = "viewPays";
	private static final String LIST_PAYS = "listPays";
	private static final String ERROR_PAGE = "/index.jsp";
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String actionName = req.getParameter("action");
		String destinationPage = ERROR_PAGE;
		
		if (VIEW_PAYS.equals(actionName))
		{ //Voir un pays
			
		} else if (LIST_PAYS.equals(actionName))
		{ //Liste des pays
			
			
			destinationPage = "/list.jsp";
		} else 
		{ // Aucune action = page par defaut = page d'accueil
			destinationPage = "/index.jsp";
		}
		
		// Redirection vers la page jsp appropriee 
	    RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(destinationPage);
        dispatcher.forward(req, resp); 
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	}
}
