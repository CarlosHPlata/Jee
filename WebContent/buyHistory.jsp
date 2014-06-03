<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Historial de Compras</title>
</head>
<body>

	<%@ include file="includes/header.php" %>

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
                	<s:iterator value="buyhistory">
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
 	</div>
 	</div>
 	
 	 <!-- /END THE FEATURETTES -->
      <%@ include file="includes/footer.php" %>

</body>
</html>