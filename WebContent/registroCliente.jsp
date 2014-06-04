<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">
<link href="css/bootstrap.css" rel="stylesheet">
<link href="css/carousel.css" rel="stylesheet">
<link rel="stylesheet" href="css/bootstrap-social.css">
<link rel="stylesheet" href="css/font-awesome.css">
<title>Editar Cliente</title>
</head>
<body>

	<%@ include file="includes/header.jsp" %>

 	<div class="row" style="padding-top: 10%; margin-bottom: 10%">
 	<div class="col-md-3 col-md-offset-4" style="background-color: #555; padding: 5px; border-radius:10px">
 		<h3>Bienvenido. Por favor, llene el formulario para registrarse</h3>
 		<s:form action="registerClientAction">
			<s:textfield cssClass="form-control" name="userName" label="Nombre de Usuario"/>
			<s:textfield cssClass="form-control" name="passWord" label="Contrase�a"/>
			<s:textfield cssClass="form-control" name="name" label="Nombres"/>
			<s:textfield cssClass="form-control" name="lastName" label="Apellidos"/>
			<s:textfield cssClass="form-control" name="email" label="Correo Electr�nico"/>
			<s:textfield cssClass="form-control" name="birthDate" label="Fecha de Nacimiento"/>
			<s:submit cssClass="btn btn-default" value="Registrar"/>
		</s:form>
 	</div>
 	</div>
 	
 	 <!-- /END THE FEATURETTES -->
      <%@ include file="includes/footer.php" %>

</body>
</html>