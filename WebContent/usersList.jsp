<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Lista de Usuarios</title>
</head>
<body>

	<%@ include file="includes/header.php" %>

	<div class="row" style="padding-top: 10%; margin-bottom: 10%">
		<div class="col-md-10 col-md-offset-1" style="background-color: #555; padding: 5px; border-radius: 10px">
			<table class="table">
				<thead>
					<tr>
						<th>Clave de Usuario</th>
						<th>Nombre de Usuario</th>
						<th>Contrase&ntilde;a</th>
						<th>Nombres</th>
						<th>Apellidos</th>
						<th>Email</th>
						<th>Fecha de Nacimiento</th>
						<th>Acciones</th>
					</tr>
				</thead>
				<tbody>
					<tr>
						<s:iterator value="users">
							<th><s:property value="id" /></th>
							<th><a href="#"><s:property value="userName" /></a></th>
							<th><s:property value="passWord" /></th>
							<th><s:property value="name" /></th>
							<th><s:property value="lastName" /></th>
							<th><s:property value="email" /></th>
							<th><s:property value="birthDate" /></th>
							<th><a href="#">Editar Borrar</a></th>
						</s:iterator>
					</tr>
				</tbody>
			</table>
		</div>
	</div>

	<!-- /END THE FEATURETTES -->
    <%@ include file="includes/footer.php" %>
</body>
</html>