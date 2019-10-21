package es.servinform.prueba.struts.forms;

import java.io.Serializable;

import org.apache.struts.action.ActionForm;
import org.apache.struts.upload.FormFile;

/**
 * Form que sirve para el tratamiento de documento.
 * 
 * @author Servinform, S.A.
 */
public class DocumentoAdjuntoForm extends ActionForm implements Serializable
{
	/** Identificador para serialización. */
	private static final long serialVersionUID = 6383855269564246917L;

	/** Fichero subido por el usuario. */
	private FormFile fichero = null;

	/**
	 * Obtiene el fichero subido por el usuario.
	 * 
	 * @return el fichero subido por el usuario
	 */
	public FormFile getFichero()
	{
		return fichero;
	}

	/**
	 * Establece el fichero subido por el usuario.
	 * 
	 * @param fichero el fichero subido por el usuario
	 */
	public void setFichero(FormFile fichero)
	{
		this.fichero = fichero;
	}
	
	
}
