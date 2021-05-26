package controllers;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.management.relation.Role;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import models.Personne;


@WebServlet("/authentification")
public class authentification extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.getServletContext().getRequestDispatcher("/authetification.jsp").include(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		String email=request.getParameter("email");
		String mdp=request.getParameter("motdepasse");
		Personne p = null;
		 try {
			p = services.servicePersonne.Authentification(email,mdp);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		if(p!=null) {
			HttpSession Session = request.getSession();
			Session.setAttribute("Personne",p);
			if(models.Role.ADMIN.equals(p.getRole())) {
				response.sendRedirect("http://localhost:8080/MeriemSennad/homeAdmin.jsp");
			}else if(models.Role.ETUDIANT.equals(p.getRole())) {
				response.sendRedirect("http://localhost:8080/MeriemSennad/homeEtudiant.jsp");}
		}else {response.sendRedirect("http://localhost:8080/MeriemSennad/authentification.jsp");}
	}

}