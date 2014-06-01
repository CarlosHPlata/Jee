<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Edita tu Login</title>
</head>
<body>
	<s:form action="updateUsernamePasswordMUser">
		<s:textfield name="userName" label="Nombre de usuario" value="%{#session['muser'].userName}"/>
		<s:password name="passWord" label="Contraseña" value="%{#session['muser'].passWord}" showPassword="true"/>
		<s:submit value="Actualizar"/>
	</s:form>
	
</body>
</html>