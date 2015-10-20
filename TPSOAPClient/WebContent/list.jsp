<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Liste des pays</title>
	
	<link rel="stylesheet" type="text/css" href="css/layout.css">
</head>
<body>
	<h3>Choix des pays</h3>
	
	<form action="Controleur?action=viewPays" method="POST">
		Sélectionnez le pays que vous souhaitez parmi la liste suivante :
		<br /> 
		<select name="pays">
			<c:forEach items="${listNomPays}" var="item" >
				<option value="${item}">${item}</option>
			</c:forEach>
		</select>
		<br />
		<input type="submit" value="Valider" />
	</form>	
	
	<c:if test="${nomPays = ''}">
		<br />
		${nomPays} a été selectionné
	</c:if>
</body>
</html>