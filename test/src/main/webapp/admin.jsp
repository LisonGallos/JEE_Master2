<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="UTF-8"%>




<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h2>Liste des auteurs</h2>
	<%
		String test = "vide";
		test = (String) request.getAttribute("test");
		out.println(test);
	%>
	<%=test%>
	<ul>
		<c:forEach var="author" items="${authors}" varStatus="rowCounter">
			<li><c:out value="${author.firstname}" /></li>
		</c:forEach>
	</ul>

	<h2>Liste des jeux</h2>
	<ul>
		<c:forEach var="game" items="${games}" varStatus="rowCounter">
			<li><c:out value="${game.name}" /></li>
		</c:forEach>
	</ul>

	<h2>Ajout d'une jeu</h2>
	<form method="post" action="http://localhost:8080/test/AdminServlet">
		Nom : <input type=text size=20 name=name><br> description
		: <input type=text size=20 name=description><br> Nombre
		de joueurs max : <input type=text size=20 name=maxPlayer><br>
		Nombre de joueurs min : <input type=text size=20 name=minPlayer><br>
		Temps de jeu : <input type=text size=20 name=playingTime><br>
		Année : <input type=text size=20 name=publicationYear><br>
		Age minimum : <input type=text size=20 name=suggestedAge><br>
		Auteur : <input type=text size=20 name=auteur><br> <input
			type="submit" value="Envoyer" />
	</form>



</body>
</html>