<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Edita tu Información</title>
</head>
<body>
	<s:form action="updateInfoPersonalMUser">
		<s:textfield name="name" label="Nombres" value="%{#session['muser'].name}"/>
		<s:textfield name="lastName" label="Apellidos" value="%{#session['muser'].lastName}"/>
		<s:textfield name="email" label="Correo Electrónico" value="%{#session['muser'].email}"/>
		<s:submit value="Actualizar"/>
	</s:form>
</body>
</html>