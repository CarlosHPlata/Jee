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
<title>Juegos JEE|Bienvenido</title>
</head>
<body>

	
<!-- NAVBAR -->




    <div class="navbar-wrapper">
      <div class="container">

        <div class="navbar navbar-inverse navbar-static-top" role="navigation">
          <div class="container">
            <div class="navbar-header">
              <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
              </button>
              <a class="navbar-brand" href="indexAction"><img src="img/logo.png" alt="Gamers Logo"></a>
            </div>
            <div class="col-sm-6 col-md-9">
            <div class="navbar-collapse collapse">
              
              <!--Store list-->
              
              <ul class="nav navbar-nav">
			  <li class="dropdown">
			    <a href="#" class="dropdown-toggle" data-toggle="dropdown">Tienda <b class="caret"></b></a>
			    <ul class="dropdown-menu">
			      <li><a href="catalogAction">Catalogo</a></li>
			      <li class="divider"></li>
			      
			      <s:iterator value="consoles">
			      <li><a href="catalogByConsoleAction?idConsole=<s:property value="idConsole"/>"><s:property value="company"/></a></li>
			      </s:iterator>
			      
			    </ul>
			  </li>
			  
              <!-- end Store list -->
              
              <!-- Usuario navbar -->
              <li class="dropdown">
			  <a href="#" class="dropdown-toggle" data-toggle="dropdown"> Usuario <b class="caret"></b></a>
			  <ul class="dropdown-menu">
			  
			  <s:if test="%{#session['muser']==null}">
			  
			    <li><a href="InitSession.jsp">Iniciar sesion</a></li>
			    
			  </s:if><s:else>
			  
			  	<li><a href="#">WishList</a></li>
			    <li><a href="#">ShoppingCart</a></li>
			    <li><a href="#">Historial de compras</a></li>
			    
			    <li class="divider"></li>
			    
			    <li><a href="#">Informacion de perfil</a></li>
			    <li><a href="#">Formas de pago</a></li>
			    <li><a href="#">Direcciones de envio</a></li>
			    
			    <s:if test="#session['muser'].type==true">
			    	<li class="divider"></li>
				    <li class="dropdown-submenu">
				        <a href="#">Editar catalogo</a>
				        <ul tabindex="-1" class="dropdown-menu">
				          <li><a href="#" title="Iformacion productos">Productos</a></li>
				          <li><a href="#" title="Informacion consolas">Consolas</a></li>
				        </ul>
				    </li>
				    <li><a href="#">Informacion de usuarios</a></li>
			    </s:if>
			  
			  	<li class="divider"></li>
			  	<li><a href="logoutAction">Cerrar Sesion</a></li>
			  
			  </s:else>
			  
			  </ul>
			</li>
			</ul>
              <!-- end usuario navbar -->
                
              <div class="col-sm-3 col-md-2 pull-right">
              <form class="navbar-form" role="search">
                <div class="input-group">
                  <input type="text" class="form-control" placeholder="Search" name="srch-term" id="srch-term">
                  <div class="input-group-btn">
                    <button class="btn btn-primary" type="submit"><i class="glyphicon glyphicon-search"></i></button>
                  </div>
                </div>
              </form>
              </div>
            </div>
            </div>
          </div>
          </div>
        </div>
        </div>



<!-- Fin NAVBAR -->





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
				<a href="listConsolesOnProductAction">Ver mi Historial de Compras</a>
			</p>
			
		</div>
	</div>

	<!-- /END THE FEATURETTES -->
	<%@ include file="includes/footer.php"%>

</body>
</html>