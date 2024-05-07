package servicios;
/*
 * interfaz encargada de las operativas
 */
public interface operativaInterfaz {
	/*
	 * metodo que añade un cliente
	 */
	public void registro()throws Exception;
	/*
	 * metodo que solicita una cita
	 */
	public void solicitarCita()throws Exception;
	/*
	 * metodo que valida  a un cliente
	 */
	public void validar()throws Exception;
	/*
	 * metodo que escribe en fichero las citas
	 */
	public void imprimir()throws Exception ;
	/*
	 * metodo que hace una consulta
	 */
	public void  consultar() throws Exception;
}
