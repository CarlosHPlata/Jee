<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Bienvenido</title>
</head>
<body>

	<%@ include file="includes/header.php" %>

	<div class="row" style="padding-top: 10%; margin-bottom: 10%">
		<div class="col-md-3 col-md-offset-4" style="background-color: #555; padding: 5px; border-radius: 10px">
			<h1>Bienvenido<s:property value="#session['muser'].name" /></h1>

			<p>
				<a href="editInfoPersonalAction">Editar tu información personal</a>
			</p>
			<p>
				<a href="editLoginPasswordAction">Cambiar tu nombre de usuario y contraseña</a>
			</p>
			<p>
				<a href="displayWishListAction">Ver mi Wishlist</a>
			</p>
			<p>
				<a href="displayShoppingCartAction">Ver mi Carrito de Compras</a>
			</p>
			<p>
				<a href="displayBuyHistoryAction">Ver mi Historial de Compras</a>
			</p>
		</div>
	</div>

	<!-- /END THE FEATURETTES -->
	<%@ include file="includes/footer.php"%>

</body>
</html>