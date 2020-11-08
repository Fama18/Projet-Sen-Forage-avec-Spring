<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html >
<head>
<meta charset="ISO-8859-1">
<title>Modifier un client</title>
</head>
<link href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" />
<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.7.0/css/all.css" integrity="sha384-lZN37f5QGtY3VHgisS14W3ExzMWZxybE1SJSEsQp9S+oqd12jhcu+A56Ebc1zFSJ" crossorigin="anonymous" />
<body style="background-color:#ADD8E6">
<br />
	<br />
  <div class="container">
  <h1 style="text-align:center">Modifier les informations d'un client</h1>
	<form action="updateClient" method="post">
		 <div class="form-group">
		   <label for="nomFamille">Nom de Famille:</label>
		   <i class="fas fa-user"></i>
			<input type="text" name="nomFamille" class="form-control" value="${clients.nomFamille}"/>
		 </div>
		 <div class="form-group">
		   <label for="adresse">Adresse:</label>
		   <i class="fas fa-address-book"></i>
			<input type="text" name="adresse" class="form-control" value="${clients.adresse}"/>
		 </div>
		<div class="form-group">
		  <label for="telephone">Telephone:</label>
		   <i class="fas fa-phone"></i>
			<input type="text" name="telephone" class="form-control" value="${clients.telephone}"/>
		</div>
			<label>Sélectionner un village : </label>
			<i class="fas fa-square"></i>
		<div class="form-group">
			<select name="village_id" class="form-control" value="${clients.village_id}">
					    		<option>--Sélectionner un village--</option>
					    		<c:forEach items="${villages}" var="v">
					    		<option value="${v.id}">${v.nom}</option>
					    		</c:forEach>
			</select> 
		</div>
		    <input type="submit" value="Modifier" class="btn btn-primary">
	</form>
	${msg}
	<br />
	<br />
	<a href="ListeClients" class="nav-link">Liste clients</a>
  </div>
</body>
</html>