<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Pagina Principal</title>
</head>
<body>

	<h2>Se ha iniciado sesi&oacute;n</h2>
	<h3>Usuario <%= session.getAttribute("usuario") %> | <a href="CerrarSesion">Cerrar sesi&oacute;</a></h3>
	<p>Las opciones de men&uacute; son las siguiente</p>
	<ul>
		<li>Listado usuarios</li>
		<li>Ingreso de usuarios</li>
		<li>Informaci&oacute;n usuarios</li>
	</ul>
	<%if (session.getAttribute("privilegio").toString().equals("ADMIN")){ %>
		<h3>Tienes super privilegios - Cuidado con lo que haces!!!</h3>
	<%} %>
</body>
</html>