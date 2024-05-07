package servicios;
/*
 * interfaz que se encarga de los menus
 */
public interface menuInterfaz {
	/*
	 * metodo que se encarga de recoger la opcion del usuario
	 * @return devuelve la opcion del usuario
	 */
	public int menuPrincipal()throws Exception;
	/*
	 * metodo que se encarga de recoger la opcion del usuario
	 * @return devuelve la opcion del usuario
	 */
	public int menuEmpleado()throws Exception;
	/*
	 * metodo que se encarga de recoger la opcion del usuario
	 * @return devuelve la opcion del usuario
	 */
	public int menuCliente()throws Exception;
	/*
	 * menu que mustra la especialidad
	 */
	public String menuEspecilidad()throws Exception;
}
