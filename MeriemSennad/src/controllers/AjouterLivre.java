package controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import models.Livre;
import models.Personne;
import services.serviceLivre;
import services.servicePersonne;

/**
 * Servlet implementation class AjouterLivre
 */
@WebServlet("/AjouterLivre")
public class AjouterLivre extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		boolean res = false;
		PrintWriter out = response.getWriter();
		Livre L = new Livre(request.getParameter("ref"), request.getParameter("name"), request.getParameter("genre"), request.getParameter("description"),Integer.parseInt(request.getParameter("edition")) ,request.getParameter("categorie"),request.getParameter("auteur"));
		 try {
			res = serviceLivre.AjouterLiv(L);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		if(res) {
		   response.sendRedirect("http://localhost:8080/MeriemSennad/homeAdmin.jsp");
		}else {
		   response.sendRedirect("http://localhost:8080/MeriemSennad/AjouterEtudiant.jsp");
		}
	}

}
