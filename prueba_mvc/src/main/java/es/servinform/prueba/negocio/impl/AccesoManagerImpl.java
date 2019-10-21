package es.servinform.prueba.negocio.impl;

import es.servinform.prueba.negocio.manager.IAccesoManager;

/**
 * Implementaci�n del servici�n para la gesti�n del acceso.
 * 
 * @author Servinform, S.A.
 */
public class AccesoManagerImpl implements IAccesoManager {
	/**
	 * Comprueba si el usuario est� permitido.
	 * 
	 * @param usuario  usuario
	 * @param password contrase�a
	 * @return true si es correcto
	 * @throws Exception posible excepci�n
	 */

	private static final String USER_DEFAULT ="USUARIO";
	private static final String PASS_DEFAULT ="1234";
	
	public int acceder(String usuario, String password) throws Exception
	{		
		return validate(usuario, password);
	}

	private int validate(String user, String pass) {
		int codeError = -1;
		if (user == null || pass == null) {
			codeError = 0;
		} else if (!USER_DEFAULT.equalsIgnoreCase(user) ||  !PASS_DEFAULT.equalsIgnoreCase(pass)) {
			codeError =1;
		}
		return codeError;
	}
}
