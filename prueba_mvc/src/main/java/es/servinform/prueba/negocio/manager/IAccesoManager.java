package es.servinform.prueba.negocio.manager;

/**
 * Interfaz que define los métodos de negocio para la gestión del acceso.
 * 
 * @author Servinform, S.A.
 */
public interface IAccesoManager
{
	/**
	 * Comprueba si el usuario está permitido.
	 * 
	 * @param usuario usuario
	 * @param password contraseña
	 * @return true si es correcto
	 * @throws Exception posible excepción
	 */
	int acceder(String usuario, String password) throws Exception;
}
