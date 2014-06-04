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
<title>Juegos jee|Wishlist</title>
</head>
<body>
<%@ include file="includes/header.jsp" %>

 	<div class="row" style="padding-top: 10%; margin-bottom: 10%">
 	<div class="col-md-10 col-md-offset-1" style="background-color: #555; padding: 5px; border-radius:10px">
 	<h1 align="center">Tu WishList</h1>
 		<table class="table">
                <thead>
                  <tr>
                    <th>Producto</th>
                    <th>Cantidad</th>
                    <th>Precio Unitario</th>
                    <th>Total</th>
                    <th>Acciones</th>
                  </tr>
                </thead>
                <tbody>
                  <s:iterator value="wishlist">
						<tr>
							<th><s:property value="product.name"/></th>
							<th><s:property value="quantity"/></th>
							<th><s:property value="product.prize"/></th>
							<th><s:property value="product.prize*quantity"/></th>
							<th>
								<s:form action="wishlistToCartAction">
									<s:hidden value="%{product.idProduct}" name="idPrd"/>
									<s:submit value="Agregar al carrito" cssClass="btn btn-warning"/>
								</s:form>	
								<s:form action="quitWishAction">
									<s:hidden value="%{product.idProduct}" name="idPrd"/>
									<s:submit value="quitar de la wishlist" cssClass="btn btn-dange" />
								</s:form>								
							</th>
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