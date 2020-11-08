<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html >
<head>
<meta charset="ISO-8859-1">
<title>Authentification</title>
</head>
<link href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" />
<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.7.0/css/all.css" integrity="sha384-lZN37f5QGtY3VHgisS14W3ExzMWZxybE1SJSEsQp9S+oqd12jhcu+A56Ebc1zFSJ" crossorigin="anonymous" />
<body style="background-color:#ADD8E6">
<br />
	<br />
  <div class="container">
  <h1 style="text-align:center">Page d'authentification</h1>
	<form action="Accueil" method="post">
		 <div class="form-group">
		   <label for="nomFamille">Username:</label>
		   <i class="fas fa-user"></i>
			<input type="text" name="email" class="form-control" placeholder="Entrer votre username" />
		 </div>
		 <div class="form-group">
		   <label for="adresse">Mot de passe:</label>
		   <i class="fas fa-address-user"></i>
			<input type="password" name="password" class="form-control" placeholder="Entrer votre mot de passe" />
		 </div>
		    <input type="submit" value="Envoyer" class="btn btn-success">
	</form>
	<br />
	<br />
  </div>
</body>
</html>