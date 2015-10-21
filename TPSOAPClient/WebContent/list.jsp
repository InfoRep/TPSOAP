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
	<div class="choixPays">
		<h3>
			Choix des pays
			<hr />
		</h3>
		
		<form action="Controleur?action=listPays" method="POST">
			Sélectionnez le pays que vous souhaitez parmi la liste suivante :
			<br /> 
			<select name="pays">
				<c:forEach items="${listNomPays}" var="item" >
					<option value="${item}">${item}</option>
				</c:forEach>
			</select>
			<br />
			<button>Obtenir détails</button>
		</form>	
	</div>
	
	<c:if test="${not empty pays}">
		<div class="viewPays" border="0">
			<h3>
				Plus d'informations concernant ${pays.nomPays }
				<hr />
			</h3>
			<table style="float:left">
				<tr>
					<td>
						<u>Capitale</u>
					</td>
					<td>${pays.nomCapitale }</td>
				</tr>
				<tr>
					<td><u>Nombre d'habitants</u></td>
					<td>${pays.nbHabitants }</td>
				</tr>
			</table>
			<div style="float:right">
				<img src="http://maps.google.com/maps/api/staticmap?language=fr&size=800x300&zoom=4&maptype=terrain&sensor=false&center=${pays.nomPays}" alt="map monde google" />
			</div>
		</div>
	</c:if>
</body>
</html>