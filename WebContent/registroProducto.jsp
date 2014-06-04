<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registro Producto</title>
</head>
<body>

	<%@ include file="includes/header.php" %>

 	<div class="row" style="padding-top: 10%; margin-bottom: 10%">
 	<div class="col-md-3 col-md-offset-4" style="background-color: #555; padding: 5px; border-radius:10px">
 		<h3>Bienvenido. Por favor, llene el formulario para registrar el producto</h3>
 		<s:form action="registerProductAction">
			<s:textfield cssClass="form-control" name="name" label="Nombre"/>
			<s:textarea cssClass="form-control" name="desc" label="Descripción"/>
			<s:textfield cssClass="form-control" name="prize" label="Precio"/>
			<s:textfield cssClass="form-control" name="quantity" label="Cantidad"/>
			<s:textfield cssClass="form-control" name="image" label="Imagen"/>
			<s:submit cssClass="btn btn-default" value="Registrar"/>
		</s:form>
 	</div>
 	</div>
 	
 	 <!-- /END THE FEATURETTES -->
      <%@ include file="includes/footer.php" %>

</body>
</html>