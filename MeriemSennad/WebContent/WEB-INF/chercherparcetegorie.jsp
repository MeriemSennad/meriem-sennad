<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="models.Personne"%>
<%Personne p = (Personne)session.getAttribute("Personne");
if(p==null){
	response.sendRedirect("http://localhost:8080/MeriemSennad/authentification.jsp");

}else{

%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
  <meta content="width=device-width, initial-scale=1.0" name="viewport">

  <title>Espace_Etudiant</title>
  <meta content="" name="description">
  <meta content="" name="keywords">

  <!-- Favicons -->
  <link href="assets/img/favicon.png" rel="icon">
  <link href="assets/img/apple-touch-icon.png" rel="apple-touch-icon">

  <!-- Google Fonts -->
  <link href="https://fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,600,600i,700,700i|Raleway:300,300i,400,400i,500,500i,600,600i,700,700i|Poppins:300,300i,400,400i,500,500i,600,600i,700,700i" rel="stylesheet">

  <!-- Vendor CSS Files -->
  <link href="assets/vendor/aos/aos.css" rel="stylesheet">
  <link href="assets/vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">
  <link href="assets/vendor/bootstrap-icons/bootstrap-icons.css" rel="stylesheet">
  <link href="assets/vendor/boxicons/css/boxicons.min.css" rel="stylesheet">
  <link href="assets/vendor/glightbox/css/glightbox.min.css" rel="stylesheet">
  <link href="assets/vendor/swiper/swiper-bundle.min.css" rel="stylesheet">

  <!-- Template Main CSS File -->
  <link href="assets/css/style.css" rel="stylesheet">

</head>
<body>
     <header id="header" class="fixed-top">
    <div class="container-fluid d-flex justify-content-between align-items-center">

      <h1 class="logo me-auto me-lg-0"><a href="index.html"><span><%=p.getNom()+" "+p.getPrenom() %></span></a></h1>
      
      <nav id="navbar" class="navbar order-last order-lg-0">
        <ul>
          <li><a class="active" href="index.html">Accueil</a></li>
          <li><a href="about.html">AccesLivre</a></li>
          <li><a href="resume.html">ReserverLivre</a></li>
          <li><a href="services.html">ListerLivres</a></li>
          <li><a href="portfolio.html"></a></li>
          <li><a href="contact.html"></a></li>
        </ul>
        <i class="bi bi-list mobile-nav-toggle"></i>
      </nav><!-- .navbar -->

      <div class="header-social-links">
        <a href="#" class="twitter"><i class="bi bi-twitter"></i></a>
        <a href="#" class="facebook"><i class="bi bi-facebook"></i></a>
        <a href="#" class="instagram"><i class="bi bi-instagram"></i></a>
        <a href="#" class="linkedin"><i class="bi bi-linkedin"></i></i></a>
      </div>

    </div>

  </header>
  <div class="form-group row">
                                                                <label class="col-sm-2 col-form-label">Categorie</label>
                                                                <div class="col-sm-10">
                                                                	<%ArrayList<Categorie> categories = ServiceCategorie.listeCategories();%>
                                                                    <select name="select" class="form-control">
                                                                    	<% for(Categorie c:categories){ %>
                                                                        <option value="opt1"><%=c.getNom() %></option>
                                                                        <%} %>
                                                                    </select>
                                                                </div>
                                                            </div>
</body>
</html>
<%}%>