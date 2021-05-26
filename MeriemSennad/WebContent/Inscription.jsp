<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!doctype html>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <link href="https://fonts.googleapis.com/css?family=Roboto:300,400&display=swap" rel="stylesheet">

    <link rel="stylesheet" href="fonts/icomoon/style.css">

    <link rel="stylesheet" href="css/owl.carousel.min.css">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="css/bootstrap.min.css">
    
    <!-- Style -->
    <link rel="stylesheet" href="css/style.css">
    <script src="js/jquery-3.3.1.min.js"></script>
    <script src="js/popper.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <script src="js/main.js"></script>

    <title>Inscription</title>
  </head>
  <body>
  

  <div class="d-md-flex half">
    <div class="bg" style="background-image: url('images/bg_1.jpg');"></div>
    <div class="contents">

      <div class="container">
        <div class="row align-items-center justify-content-center">
          <div class="col-md-12">
            <div class="form-block mx-auto">
              <div class="text-center mb-5">
                <h3 class="text-uppercase">Inscription à <strong>BibliothéqueFSBM</strong></h3>
              </div>
              <form action="Inscription" method="post">
                 <div class="form-group first">
                  <label for="username">Nom :</label>
                  <input type="text" class="form-control" placeholder="entrer votre nom" id="username" name="nom">
                </div>
                <div class="form-group first">
                  <label for="username">Prenom :</label>
                  <input type="text" class="form-control" placeholder="entrer votre prenom" id="username" name="prenom">
                </div>
                <div class="form-group first">
                  <label for="username">E_mail :</label>
                  <input type="text" class="form-control" placeholder="your-email@gmail.com" id="username" name="email">
                </div>
                <div class="form-group last mb-3">
                  <label for="password">Mot de passe :</label>
                  <input type="password" class="form-control" placeholder="Your Password" id="password" name="mot de passe">
                </div>
                
                <div class="d-sm-flex mb-5 align-items-center">
                  <label class="control control--checkbox mb-3 mb-sm-0"><span class="caption">Remember me</span>
                    <input type="checkbox" checked="checked"/>
                    <div class="control__indicator"></div>
                  </label>
                  <span class="ml-auto"><a href="http://localhost:8080/MeriemSennad/authentification.jsp" class="forgot-pass">S'authentifié</a></span> 
                </div>

                <input type="submit" value="S'inscrire" class="btn btn-block py-2 btn-primary">
                
                
                
              </form>
            </div>
          </div>
        </div>
      </div>
    </div>

    
  </div>
    
    

    
  </body>
</html>