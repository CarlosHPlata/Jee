<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Editar Producto</title>
</head>
<body>

	<%@ include file="includes/header.php" %>

 	<div class="row" style="padding-top: 10%; margin-bottom: 10%">
 	<div class="col-md-10 col-md-offset-1" style="background-color: #555; padding: 5px; border-radius:10px">
 		<s:form  cssClass="form-horizontal" action="updateInfoProductAction">
			<s:textfield name="name" label="Nombres" value="%{#session['muser'].name}"/>
			<s:textfield name="lastName" label="Apellidos" value="%{#session['muser'].lastName}"/>
			<s:textfield name="email" label="Correo Electrónico" value="%{#session['muser'].email}"/>
			<s:submit cssClass="btn btn-default" value="Actualizar"/>
		</s:form>
 	</div>
 	</div>
 	
 	 <!-- /END THE FEATURETTES -->
      <%@ include file="includes/footer.php" %>

</body>
</html>