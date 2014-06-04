<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Inicia sesion</title>
</head>
<body>

	<%@ include file="includes/header.php" %>

 	<div class="row" style="padding-top: 10%; margin-bottom: 10%">
 	<div class="col-md-3 col-md-offset-4" style="background-color: #555; padding: 5px; border-radius:10px">
 		<s:head/>
	
		<s:actionerror/>
		
		
		<s:form action="loginAction">
			<s:textfield cssClass="form-control" name="userName" label="Nombre de usuario"/>
			<s:password cssClass="form-control" name="passWord" label="Contrase�a"/>
			<s:submit value="Entrar" cssClass="btn btn-default"/>
		</s:form>
		<a href="./registroCliente.jsp">Reg�strate Aqu�</a>
		
 	</div>
 	</div>
 	
 	 <!-- /END THE FEATURETTES -->
      <%@ include file="includes/footer.php" %>

</body>
</html>