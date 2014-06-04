<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ include file="includes/config.php" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">

<title>Juegos JEE|Catalogo</title>

<link href="css/bootstrap.css" rel="stylesheet">
<link href="css/carousel.css" rel="stylesheet">
<link rel="stylesheet" href="css/bootstrap-social.css">
<link rel="stylesheet" href="css/font-awesome.css">
</head>
<body>
<%@ include file="includes/header.jsp" %>
    <div class="container marketing" style="margin-top: 10%">

      <!-- Three columns of text below the carousel -->
      <div class="row">
      
      	<s:iterator value="products" var="product">
      		<div class="col-lg-3 col-sm-12" style="border: 1px solid #555">
	          <img class="img-rounded" src="img/<s:property value="image"/>" alt="Generic placeholder image" width="200" height="200">
	          <h2><s:property value="name"/></h2>
	          <p class="text" style="overflow:hidden;text-overflow: ellipsis; -webkit-line-clamp: 11;"><s:property value="desc"/></p>
	          <p class="tags">
	          	
	          </p>
	          <p class="p-buttons">
	          
	          <s:if test="%{#session['muser']!=null}">
	          </s:if>
	            <a class="btn btn-primary" href="detailProductAction?idProduct=<s:property value="idProduct"/>" role="button">Ver más &raquo;</a>
	          </p>
	        </div><!-- /.col-lg-3 -->
      	</s:iterator>
      </div>
      
    </div>
<%@ include file="includes/footer.php" %>
</body>
</html>