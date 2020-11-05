<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html >
<head>
<meta charset="ISO-8859-1">
<title>Ajouter un client</title>
</head>
<body>
	<form action="saveClient" method="post">
		<pre>
			nom de Famille : <input type="text" name="nomFamille" />
			Adresse : <input type="text" name="adresse" />
			Telephone : <input type="text" name="telephone" />
			<label>Sélectionner un village : </label>
			<select name="village_id">
					    		<option>--Sélectionner un village--</option>
					    		<c:forEach items="${listV}" var="v">
					    		<option value="${v.id}">${v.nomFamille}</option>
					    		</c:forEach>
			</select> 
		    <input type="submit" value="ajouter">
		</pre>
	</form>
	${msg}
	<br />
	<br />
	<a href="ListeClients">Liste clients</a>
</body>
</html>