package controladores;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import dtos.citaDto;
import dtos.clienteDto;
import servicios.ficheroImplementacion;
import servicios.ficheroInterfaz;
import servicios.menuImplementacion;
import servicios.menuInterfaz;
import servicios.operativaInterfaz;
import servicios.oprativaImplementacion;
/*
 * clase principal
 */
public class inicio {

	public static List<citaDto>listaCita= new ArrayList<>();
	public static List<clienteDto>listaClienteDtos= new ArrayList<>();
	public static DateTimeFormatter formatter= DateTimeFormatter.ofPattern("ddMMyyyy");
	public static LocalDate hoyDate = LocalDate.now();
	public static String sfecha = hoyDate.format(formatter);
	public static String rutaLog = "C:\\Users\\profesor\\Desktop\\"+"log-"+sfecha+".txt";
	/*
	 * metodo principal
	 */
	public static void main(String[] args) {
		ficheroInterfaz fi   = new ficheroImplementacion();
		menuInterfaz mInterfaz= new menuImplementacion();
		operativaInterfaz oInterfaz = new oprativaImplementacion();
		int eleccion ;
		int eleccion2;
		int eleccion3;
		boolean abrir= false;
		String escriteraLogString;
		try {
			do{
				eleccion= mInterfaz.menuPrincipal();
				switch (eleccion) {
				case 0: 
					System.out.println("cerrado");
					escriteraLogString= "cerrar";
					fi.escrituraLog(escriteraLogString);
					abrir=true;
					break;
				case 1: 
					escriteraLogString= "menu empleado";
					fi.escrituraLog(escriteraLogString);
					eleccion2=mInterfaz.menuEmpleado();
					switch (eleccion2){
					case 0: escriteraLogString= "volver";
					fi.escrituraLog(escriteraLogString);
						break;
					case 1: escriteraLogString= "validar";
					fi.escrituraLog(escriteraLogString);
						oInterfaz.validar();
						break;
					case 2 : 
						escriteraLogString= "imprimir";
						fi.escrituraLog(escriteraLogString);
						oInterfaz.imprimir();
						break;
					default:
						System.out.println("eleccion incorrecta");
						break;
					}
					break;
				case 2: 
				escriteraLogString= "menu cliente";
				fi.escrituraLog(escriteraLogString);
				eleccion3= mInterfaz.menuCliente();
				switch (eleccion3) {
				case 0: escriteraLogString= "volver";
				fi.escrituraLog(escriteraLogString);
					break;
				case 1: escriteraLogString= "registro";
				fi.escrituraLog(escriteraLogString);
					oInterfaz.registro();
					break;
				case 2 : escriteraLogString= "solicitar";
				fi.escrituraLog(escriteraLogString);
					oInterfaz.solicitarCita();
					break;
				case 3 : escriteraLogString= "consultar";
				fi.escrituraLog(escriteraLogString);
				oInterfaz.consultar();
					break;
				default:
					System.out.println("eleccion incorrecta");
					break;
				}
					break;
			
			default:
				System.out.println("eleccion incorrecta");
				break;
			}	
			}while (!abrir);
				
			
		} catch (Exception e) {
			System.out.println("error al conectarse con ficheros");
			String errorString = e.toString();
			fi.escrituraLog(errorString);
		}

	}

}
