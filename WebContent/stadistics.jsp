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
<link rel="shortcut icon" href="img/favicon.ico" type="image/x-icon" />
<title>Estadisticos</title>
</head>
<body>
<%@ include file="includes/header.jsp" %>

<div class="row" style="padding-top: 10%; margin-bottom: 10%">
<div class="col-md-10 col-md-offset-1" style="background-color: #555; padding: 5px; border-radius:10px">

<table class="table">

<tr>
	<th>Producto</th>
	<th>Copias restantes</th>
	<th>Precio</th>
	<th>Numero de ventas</th>
	<th>Porcentaje de ventas desde su creacion</th>
	<th>Rango de edades de compradores</th>
</tr>
<tr>
	<td><s:property value="product.name"/> </td>
	<td><s:property value="product.quantity"/> </td>
	<td><s:property value="product.prize"/> </td>
	<td><s:property value="numberSolds"/> </td>
	<td><s:property value="soldPercentage"/>%</td>
	<td><s:property value="agerate"/> </td>
</tr>

</table>
<form action="listProductsAction">
<button type="submit" class="btn btn-primary">Volver</button>
</form>
</div>
</div>

<%@ include file="includes/footer.php" %>
</body>
</html>