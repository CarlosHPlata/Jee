<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>¡Éxito!</title>
</head>
<body>
	<h1>Tu información ha sido actualizada <s:property value="#session['muser'].name"/></h1>
	
	<p>
		<a href="portal.jsp">regresar a tu portal</a>
	</p>
	
</body>
</html>