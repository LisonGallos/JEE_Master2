<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	String action = request.getParameter("action");
%>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Administration - Auteur</title>
</head>
<body>
	<center>
		<h2>Administration - Auteur</h2>
	</center>
	
	<%
		if(action.equals("add")){
			%>
			<fieldset>
				<legend>Ajouter un auteur</legend>
				<input type="text" value="" name="firstname" placeholder="Prénom"/>
				<input type="text" value="" name="lastname" placeholder="Nom" />
				<a href="">Valider</a>
			</fieldset>
			<%
		}
		else if(action.equals("edit")){
			int id_auteur = Integer.parseInt(request.getParameter("id"));
			%>
			<fieldset>
				<legend>Modifier un auteur</legend>
				<input type="text" value="<%= id_auteur %>" name="firstname" placeholder="Prénom"/>
				<input type="text" value="" name="lastname" placeholder="Nom" />
				<a href="">Valider</a>
			</fieldset>
			<%
		}
		else {
			// On retourne une 404
			response.sendError(HttpServletResponse.SC_NOT_FOUND);
		}
	%>
	
</body>
</html>