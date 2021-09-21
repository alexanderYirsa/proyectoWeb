<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP de Ejemplo</title>
</head>
<body>
	<h1>Mi Primer JSP</h1>
	<form method="get" action="./DemoServlet">
		<table>
			<tr>
				<td><label>Nombre:</label></td>
				<td><input type="text" name="nombre"></td>
				<td><label>Cedula:</label></td>
				<td><input type="text" name="cedula"></td>
			</tr>
			<tr>
				<td><input type="submit" value="Enviar"></td>
			</tr>	
		</table>
	</form>
</body>
</html>
