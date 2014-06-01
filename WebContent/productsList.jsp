<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Lista de Productos</title>
</head>
<body>

	<%@ include file="includes/header.php" %>

 	<div class="row" style="padding-top: 10%; margin-bottom: 10%">
 	<div class="col-md-10 col-md-offset-1" style="background-color: #555; padding: 5px; border-radius:10px">
 		<table class="table">
                <thead>
                  <tr>
                    <th>Clave de Producto</th>
                    <th>Nombre</th>
                    <th>Precio</th>
                    <th>Estrellas</th>
                    <th>Cantidad</th>
                    <th>Fecha de creaci&oacute;n</th>
                    <th>Acciones</th>
                  </tr>
                </thead>
                <tbody>
                  <tr>
                  	<th>1</th>
                    <th><a href="#">Halo 5</a></th>
                    <th>$Infinito + 1</th>
                    <th>5</th>
                    <th>21093</th>
                    <th>2014-05-30</th>
                    <th><a href="#">Editar Borrar</a></th>
                  </tr>
                </tbody>
              	</table>
 	</div>
 	</div>
 	
 	 <!-- /END THE FEATURETTES -->
      <%@ include file="includes/footer.php" %>

</body>
</html>