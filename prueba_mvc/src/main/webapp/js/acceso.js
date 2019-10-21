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