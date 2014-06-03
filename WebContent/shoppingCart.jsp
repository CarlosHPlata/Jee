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
<title>Juegos JEE|Carrito de Compras</title>
</head>
<body>
<%@ include file="includes/header.jsp" %>

 	<div class="row" style="padding-top: 10%; margin-bottom: 10%">
 	<div class="col-md-10 col-md-offset-1" style="background-color: #555; padding: 5px; border-radius:10px">
 		<table class="table">
                <thead>
                  <tr>
                    <th>Clave de Compra</th>
                    <th>Producto</th>
                    <th>Fecha</th>
                    <th>Cantidad</th>
                    <th>Precio Unitario</th>
                    <th>Total</th>
                    <th>Acciones</th>
                  </tr>
                </thead>
                <tbody>
                  <s:iterator value="shoppingcart">
						<tr>
							<th><s:property value="id.idcart" /></th>
							<th><s:property value="product.name" /></th>
							<th><s:property value="date" /></th>
							<th><s:property value="quantity" /></th>
							<th><s:property value="product.prize" /></th>
							<th><s:property value="total" /></th>
							<th><a href="#">Borrar</a></th>
						</tr>
					</s:iterator>
                </tbody>
          </table>
          <div class="col-md-11"></div>
          <div class="col-md-1"><button type="button" class="btn btn-success">Success</button></div>
 	</div>
 	</div>
 	
 	 <!-- /END THE FEATURETTES -->
      <%@ include file="includes/footer.php" %>

</body>
</html>