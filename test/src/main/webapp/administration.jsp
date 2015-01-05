<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Administration</title>
<script type="text/javascript">
	function delete_auteurs(){
		// TODO
		// Appel AJAX pour supprimer les éléments sélectionnés
	}
</script>
</head>
<body>
	<center>
		<h2>Administration</h2>
	</center>
	
	<fieldset>
		<legend>Auteurs</legend>
		<table>
			<thead>
				<td>Sélectionner</td>
				<td>Prénom</td>
				<td>Nom</td>
				<td></td>
			</thead>
			<tbody>
				<tr>
					<td><input type="checkbox" name="" value="" /></td>
					<td><p>Florent</p></td>
					<td><p>Peysson</p></td>
					<td><a href="auteur.jsp?action=edit&id=1">Modifier</a></td>
				</tr>
			</tbody>
		</table>
		<!-- <p>Pour la sélection : <a href="javascript:void(0)" onclick="delete_auteurs()">Supprimer</a> -->
		<p>Pour la sélection : <a href="auteur.jsp?action=delete">Supprimer</a>
		<hr></hr>
		<a href="auteur.jsp?action=add">Ajouter un utilisateur</a>
	</fieldset>
	
</body>
</html>