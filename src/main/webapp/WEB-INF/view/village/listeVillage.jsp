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
	<h1 style="text-align:center">Liste des villages</h1>
	<div class="container">
	<table class="table table-striped table-bordered">
		<tr class="thead-light">
			<th>ID</th><th>Nom du village</th><th>Suppression</th><th>Edition</th>
		</tr>
		<c:forEach items="${villages}" var="v">
			<tr>
				<td>${v.id}</td>
				<td>${v.nom}</td>
				<td><a onclick="return confirm('Etes-vous sur ?')" href="supprimerVillage?id=${v.id}">Supprimer</a></td>
				<td><a href="editerVillage?id=${v.id}">Edit</a></td>
			</tr>
		</c:forEach>
	</table>
	</div>
</body>
</html>