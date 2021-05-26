package controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import models.Personne;
import services.servicePersonne;

@WebServlet("/AjoutEtudiant")
public class AjoutEtudiant extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.getServletContext().getRequestDispatcher("/AjoutEtudiant.jsp").include(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		boolean res = false;
		PrintWriter out = response.getWriter();
		Personne p = new Personne(request.getParameter("nom"), request.getParameter("prenom"), request.getParameter("email"), request.getParameter("mot de passe"), null);
		 try {
			res = servicePersonne.AjouterPersonne(p);
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
