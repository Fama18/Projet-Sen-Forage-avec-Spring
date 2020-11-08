<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html >
<head>
<meta charset="ISO-8859-1">
<title>Modifier un village</title>
</head>
<link href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" />
<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.7.0/css/all.css" integrity="sha384-lZN37f5QGtY3VHgisS14W3ExzMWZxybE1SJSEsQp9S+oqd12jhcu+A56Ebc1zFSJ" crossorigin="anonymous" />
<body style="background-color:#ADD8E6">
<br />
	<br />
  <div class="container">
  <h1 style="text-align:center">Modifier les informations d'un village</h1>
	<form action="updateVillage" method="post">
		 <div class="form-group">
		   <label for="nom">Nom du village:</label>
		   <i class="fas fa-user"></i>
			<input type="text" name="nom" class="form-control" value="${village.nom}"/>
		 </div>
		    <input type="submit" value="Modifier" class="btn btn-primary">
	</form>
	${msg}
	<br />
	<br />
	<a href="ListeVillages" class="nav-link">Liste villages</a>
  </div>
</body>
</html>