<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="c"%>
<html>
<head>
<title>Acceso al formulario de inicio</title>
<script type="text/javascript" src="js/acceso.js""></script>
<link rel="stylesheet" href="css/styles.css">
</head>
<body>
	<html:form action="acceso">
		<html:hidden property="opcion" value="" />
		<div>
			<center>
				<h2>ACCESO</h2>
				<fieldset>

					<table border="0">
						<tbody>
							<tr>
								<td>Usuario</td>
								<td><html:text property="usuario" /></td>
							</tr>
							<tr>
								<td>Contraseña</td>
								<td><html:password property="password" /></td>
							</tr>
							<tr>
								<td>Email</td>
								<td><html:text property="email" styleId="email" /></td>
							</tr>
							<tr>
								<td></td>
								<td><input type="button" value="Aceptar" name="btn_aceptar"
									onclick="javascript:acceder()" /></td>
							</tr>
						</tbody>
					</table>
				</fieldset>
			</center>
			<div class="errorInfo">
				<html:messages id="errors" property="error">
					<div>
						<span>${errors}</span>
					</div>
				</html:messages>
			</div>

		</div>
	</html:form>
</body>
</html>