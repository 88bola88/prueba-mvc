package es.servinform.prueba.struts.actions;

import java.io.Serializable;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;
import org.apache.struts.actions.DispatchAction;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import es.servinform.prueba.negocio.manager.IAccesoManager;
import es.servinform.prueba.struts.forms.AccesoForm;

/**
 * Action que gestiona el acceso a la aplicación.
 * 
 * @author Servinform, S.A.
 */
public class AccesoAction extends DispatchAction implements Serializable
{
	/** Identificador para serialización. */
	private static final long serialVersionUID = -8713452764407354681L;

	/** Para interactuar con el sistema de logs de la aplicación. */
	private static final Logger log = LoggerFactory.getLogger(AccesoAction.class);

	// Destinos del action.
	/** Acceso correcto. */
	private static final String ACCESO_CORRECTO = "success";
	
	private static final String ACCESS_FAILED ="failed";

	// Inyecciones.
	/** Manager de acceso. */
	private IAccesoManager accesoManager = null;

	/**
	 * Método que accedde a la aplicación.
	 * 
	 * @param mapping Mapeo con los posibles destinos del Action
	 * @param form Formbean asociado al Action
	 * @param request Objeto request con los datos de la petición
	 * @param response Objeto response con los datos de la respuesta
	 * @return Destino al que debe ir la aplicación tras la ejecución de este método
	 * @throws Exception Excepción
	 */
	public ActionForward acceder(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception
	{
		log.debug("AccesoAction --> acceder");
		ActionForward forward = null;
		AccesoForm formulario = (AccesoForm) form;		
		int codeError = this.accesoManager.acceder(formulario.getUsuario(), formulario.getPassword());
		if (codeError<0)
		{
			log.debug("El usuario ha accedido correctamente.");
			forward = mapping.findForward(AccesoAction.ACCESO_CORRECTO);
		}
		else {
			ActionErrors errors = new ActionErrors();
			switch (codeError) {
			case 0:
				log.error("Error datos vacios");
				errors.add("error", new ActionMessage("error.login.empty"));
			case 1:
				log.error("Error datos incorrectos");
				errors.add("error", new ActionMessage("error.login.failed"));
			default:
				break;
			}
			saveErrors(request, errors);
			forward = mapping.findForward(ACCESS_FAILED);
		}
		

		return forward;
	}

	/**
	 * Establece el manager de acceso.
	 * 
	 * @param accesoManager IAccesoManager manager de acceso
	 */
	public void setAccesoManager(IAccesoManager accesoManager)
	{
		this.accesoManager = accesoManager;
	}

}