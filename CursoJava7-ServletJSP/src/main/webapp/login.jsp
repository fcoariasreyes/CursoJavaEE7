<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>login</title>
</head>
<body>
	<h1>Ingreso de Usuarios version JSP</h1>
	<form action="LoginServlet" method="POST">
		<label>Nombre usuario</label>
		<input type="text" id="usuario" name="usuario" />
		<label>Clave</label>
		<input type="password" id="clave" name="clave" />
		<input type="submit" value="Ingresar"/>
	</form>


</body>
</html>