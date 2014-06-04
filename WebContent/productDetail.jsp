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
<title>Juegos JEE|Detalle de Producto</title>
</head>
<body>
<%@ include file="includes/header.jsp" %>


 	<div class="row" style="padding-top: 10%; margin-bottom: 10%">
 	<div class="col-md-10 col-md-offset-1" style="background-color: #555; padding: 5px; border-radius:10px">
 		<h1 style="padding-left: 10px"><s:property value="product.name"/></h1>
 		<div class="row">
 		<div class="col-md-4">
 			<img style="width: 100%; height: 100%" src="img/<s:property value="product.image"/>" class="img-rounded">
 		</div>
 		
		<div class="col-md-8">
	 		<p class="lead" > <s:property value="product.desc" /> </p>
	 		
 		</div>
 		</div>
 		<div class="row">
 			<div class="col-md-4">
 				<s:iterator status="status1" begin="1" end="%{product.stars}">
 					<s:if test="%{#session['muser']!=null}">
 					<a href="rateGameAction?rate=<s:property value="%{#status1.count}"/>&prod=<s:property value="product.idProduct"/>" >
 					</s:if>
 					<img style="width: 30px; height: 30px" src="img/star.png">
 					<s:if test="%{#session['muser']!=null}">
 					</a>
 					</s:if>
 				</s:iterator>
 				<s:iterator status="status2" begin="%{product.stars}" end="4">
 					<s:if test="%{#session['muser']!=null}">
 					<a href="rateGameAction?rate=<s:property value="%{#status2.count + product.stars}"/>&prod=<s:property value="product.idProduct"/>" >
 					</s:if>
 					<img style="width: 30px; height: 30px" src="img/staroff.png">
 					<s:if test="%{#session['muser']!=null}">
 					</a>
 					</s:if>
 				</s:iterator>
	 		</div>
	 		<div class="col-md-8">
	 			<s:if test="%{#session['muser']!=null}">
	 				<s:if test="%{#session['muser'].type==false}">
				 		<label style="color: red; font-weight: bolder;"><s:property value="product.prize"/></label>
				 		<s:form action="addProductWishListAction">
				 			<s:hidden name="idPrd" value="%{product.idProduct}"/>
				 			<s:submit cssClass="btn btn-info" value="Aparta tu copia"></s:submit>
				 		</s:form>
				 		<s:form action="addProductToCartAction">
				 			<s:hidden name="idPrd" value="%{product.idProduct}"/>
				 			<s:submit cssClass="btn btn-warning" value="Añade al carrito"></s:submit>
				 		</s:form>
				 		<s:form action="buyProductNowAction">
				 			<s:hidden name="idPrd" value="%{product.idProduct}"/>
				 			<s:submit cssClass="btn btn-success" value="Compra ya"></s:submit>
				 		</s:form>
			 		</s:if>
				</s:if>
	 		</div>
 		</div>
 	</div>
 	</div>
 	
 	 <!-- /END THE FEATURETTES -->
      <%@ include file="includes/footer.php" %>

</body>
</html>