<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>
<html>
<head>
<title>Adjuntar archivo</title>
<script type="text/javascript" src="js/adjunto.js""></script>
<link rel="stylesheet" href="css/styles.css">
</head>
<body>
	<html:form action="adjuntarDocumento" enctype="multipart/form-data">
		<html:hidden property="opcion" value="" />
		<div>
			<center>
				<h2>ADJUNTAR DOCUMENTO</h2>
				<fieldset>
					<table border="0">
						<tbody>
							<tr>
								<td>Fichero</td>
								<td><html:file property="fichero" styleId="file" /></td>
							</tr>
							<tr>
								<td></td>
								<td><input type="button" value="Adjuntar"
									name="btn_adjuntar" onclick="javascript:adjuntar()" /></td>
							</tr>
						</tbody>
					</table>
				</fieldset>
			</center>
			<div class="messageContainer">
				<logic:messagesPresent message="true">
					<html:messages id="message" message="true">
						<div class="successInfo">
							<span><bean:write name="message" /></span>
						</div>
					</html:messages>
				</logic:messagesPresent>

				<div></div>
				<html:messages id="errors" property="error">
					<div class="errorInfo">
						<span>${errors}</span>
					</div>
				</html:messages>
			</div>
		</div>
	</html:form>
</body>
</html>