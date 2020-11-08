<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Liste des clients</title>
</head>
<link href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" />
<body style="background-color:#BDB76B">
<br />
	<br />
	<h1 style="text-align:center">Liste des clients</h1>
	<div class="container">
	<table class="table table-striped table-bordered">
		<tr class="thead-light">
			<th>ID</th><th>Nom Client</th><th>Adresse</th><th>Telephone</th><th>Suppression</th><th>Edition</th>
		</tr>
		<c:forEach items="${clients}" var="c">
			<tr>
				<td>${c.id}</td>
				<td>${c.nomFamille}</td>
				<td>${c.adresse}</td>
				<td>${c.telephone}</td>
				<td><a onclick="return confirm('Etes-vous sur ?')" href="supprimerClient?id=${c.id}">Supprimer</a></td>
				<td><a href="modifierClient?id=${c.id}">Edit</a></td>
			</tr>
		</c:forEach>
	</table>
	</div>
</body>
</html>