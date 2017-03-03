package tuto.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import tuto.bean.TestBean;

public class TestServlet extends HttpServlet {

	@Override
	public void doGet( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException{
		/*response.setContentType("text/html");
	    response.setCharacterEncoding( "UTF-8" );
	    PrintWriter out = response.getWriter();
	    out.println("<!DOCTYPE html>");
	    out.println("<html>");
	    out.println("<head>");
	    out.println("<meta charset=\"utf-8\" />");
	    out.println("<title>Test</title>");
	    out.println("</head>");
	    out.println("<body>");
	    out.println("<p>Ceci est une page générée depuis une servlet.</p>");
	    out.println("</body>");
	    out.println("</html>");*/
		
		/* Création du bean */
	    TestBean premierBean = new TestBean();

	    /* Initialisation de ses propriétés */
	    premierBean.setNom( "Coyote" );
	    premierBean.setPrenom( "Wile E." );
	     
	    /* Stockage du message et du bean dans l'objet request */
	    request.setAttribute( "coyote", premierBean );
		
		String paramAuteur = request.getParameter( "auteur" );
	    String message = "Transmission de variables : OK ! " + paramAuteur;
	    request.setAttribute( "test", message );
		
		//La méthode forward() de l'objet RequestDispatcher permet depuis une servlet de rediriger la paire requête/réponse HTTP vers une autre servlet ou vers une page JSP.
		this.getServletContext().getRequestDispatcher( "/WEB-INF/test.jsp" ).forward( request, response );
	}
}
