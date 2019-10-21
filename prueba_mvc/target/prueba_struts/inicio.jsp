<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="c"%>


<html>
<head>
<title>Acceso al formulario de inicio</title>
</head>

<script type="text/javascript">
	/**
	 * M�todo encargado de redireccionar al action.
	 */
	function acceder() {
		var validate = validateEmail();
		if (!validate) {
			alert("Email invalido");
		} else {
			var f = document.forms[0];
			f.opcion.value = "acceder";
			f.submit();
		}
	}

	function validateEmail() {
		var email = document.getElementById("email");
		var pattern = /^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/;
		if (email.value.match(pattern)) {
			return true;
		} else {
			return false;
		}

	}
</script>

<body>
	<html:form action="acceso">
		<html:hidden property="opcion" value="" />
		<div>
			<center>
				<h2>ACCESO</h2>
				<hr>
				<fieldset>

					<table border="0">
						<tbody>
							<tr>
								<td>Usuario</td>
								<td><html:text property="usuario" /></td>
							</tr>
							<tr>
								<td>Contrase�a</td>
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
			<div>
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