package es.servinform.prueba.negocio.manager;

/**
 * Interfaz que define los m�todos de negocio para la gesti�n del acceso.
 * 
 * @author Servinform, S.A.
 */
public interface IAccesoManager
{
	/**
	 * Comprueba si el usuario est� permitido.
	 * 
	 * @param usuario usuario
	 * @param password contrase�a
	 * @return true si es correcto
	 * @throws Exception posible excepci�n
	 */
	int acceder(String usuario, String password) throws Exception;
}
