package es.servinform.prueba.struts.forms;

import java.io.Serializable;

import org.apache.struts.action.ActionForm;

/**
 * Form que sirve para el acceso de la aplicación.
 * 
 * @author Servinform, S.A.
 */
public class AccesoForm extends ActionForm implements Serializable
{
	/** Identificador para serialización. */
	private static final long serialVersionUID = -4236178182064965200L;

	/** Indica la acción a realizar. */
	private String opcion;

	/** Indica el usuario. */
	private String usuario;

	/** Indica el password. */
	private String password;
	
	private String email;
	
	private String messageError;
	
	
	
	/**
	 * getter
	 * @return
	 */
	public String getMessageError() {
		return messageError;
	}
	
	/**
	 * setter
	 * @param messageError
	 */
	public void setMessageError(String messageError) {
		this.messageError = messageError;
	}
	/**
	 * getter
	 * @return
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * setter 
	 * @param email
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * Obtiene la acción a realizar.
	 * 
	 * @return String acción a realizar
	 */
	public String getOpcion()
	{
		return opcion;
	}

	/**
	 * Establece la acción a realizar.
	 * 
	 * @param opcion String acción a realizar
	 */
	public void setOpcion(String opcion)
	{
		this.opcion = opcion;
	}

	/**
	 * Obtiene el usuario.
	 * 
	 * @return String usuario
	 */
	public String getUsuario()
	{
		return usuario;
	}

	/**
	 * Establece el usuario.
	 * 
	 * @param usuario String usuario
	 */
	public void setUsuario(String usuario)
	{
		this.usuario = usuario;
	}

	/**
	 * Obtiene el password.
	 * 
	 * @return String password
	 */
	public String getPassword()
	{
		return password;
	}

	/**
	 * Establece el password.
	 * 
	 * @param password String password
	 */
	public void setPassword(String password)
	{
		this.password = password;
	}

}