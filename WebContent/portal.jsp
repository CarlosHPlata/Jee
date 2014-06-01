<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Bienvenido</title>
</head>
<body>
	<h1>Bienvenido <s:property value="#session['muser'].name"/> </h1>
	
	<p>
		<a href="editInfoPersonalMUser">Editar tu información personal</a>
	</p>
	<p>
		<a href="editLoginPasswordMUser">Cambiar tu nombre de usuario y contraseña</a>
	</p>
	
</body>
</html>