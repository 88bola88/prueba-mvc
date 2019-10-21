package es.servinform.prueba.struts.actions;

import java.io.Serializable;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;
import org.apache.struts.action.ActionMessages;
import org.apache.struts.actions.DispatchAction;
import org.apache.struts.upload.FormFile;

import es.servinform.prueba.struts.forms.DocumentoAdjuntoForm;

/**
 * @author Servinform, S.A.
 */
public class AdjuntarDocumentoAction extends DispatchAction implements Serializable
{
	/** Identificador para serialización. */
	private static final long serialVersionUID = 508418810822584579L;

	// Destinos del action.
	/** Nombre del forward hacia la pantalla. */
	private static final String SUCCESS = "success";

	/**
	 * Acción por defecto, inicia la pantalla.
	 * 
	 * @param mapping Mapeo con los posibles destinos del Action
	 * @param form Formbean asociado al Action
	 * @param request Objeto request con los datos de la petición
	 * @param response Objeto response con los datos de la respuesta
	 * @return Destino al que debe ir la aplicación tras la ejecución de este método
	 */
	public ActionForward unspecified(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response)
	{
		return mapping.findForward(SUCCESS);
	}

	/**
	 * Valida que el documento tenga el formato correcto.
	 * 
	 * @param mapping Mapeo con los posibles destinos del Action
	 * @param form Formbean asociado al Action
	 * @param request Objeto request con los datos de la petición
	 * @param response Objeto response con los datos de la respuesta
	 * @return Destino al que debe ir la aplicación tras la ejecución de este método
	 */
	public ActionForward adjuntar(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response)
	{
		String forward = SUCCESS;
		DocumentoAdjuntoForm docuForm = (DocumentoAdjuntoForm)form;			
		FormFile file = docuForm.getFichero();
		file.getFileSize();
		if(file.getContentType().equals("application/pdf")) {
			System.out.println(file.getFileSize());
			log.info("El fichero ocupa: " +file.getFileSize());
			ActionMessages messages = new ActionMessages();
			messages.add(ActionMessages.GLOBAL_MESSAGE, new ActionMessage("ok", file.getFileSize()/1024));
			saveMessages(request, messages);
		}
		else {
			ActionErrors errors = new ActionErrors();
			errors.add("error", new ActionMessage("error.adjunto"));
			saveErrors(request, errors);
		}
		return mapping.findForward(forward);		
	}
}