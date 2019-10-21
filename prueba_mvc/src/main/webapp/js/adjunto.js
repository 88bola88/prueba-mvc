/**
 * Método encargado de redireccionar al action.
 */
function adjuntar() {
	if (!validateFile()) {
		alert("No se ha insertado ningun fichero");
		return;
	}
	var f = document.forms[0];
	f.opcion.value = "adjuntar";
	f.submit();
}

function validateFile() {
	if (document.getElementById("file").files.length > 0) {
		return true;
	} else {
		return false;
	}
}