package servicios;
/*
 /*
 * implementacion que implemta a menuInterfaz
 */
 

import java.util.Scanner;

public class menuImplementacion implements menuInterfaz {
	Scanner scanner  =new Scanner(System.in);
	@Override
	public int menuPrincipal() throws Exception{
		System.out.println("0. cerrar");
		System.out.println("1. empleado");
		System.out.println("2. cliente");
		int eleccion  =scanner.nextInt();
		return eleccion;
	}
	@Override
	public int menuEmpleado() throws Exception{
		System.out.println("0. volver");
		System.out.println("1. validar cliente");
		System.out.println("2. imprimir cita");
		int eleccion  =scanner.nextInt();
		return eleccion;
	}
	@Override
	public int menuCliente() throws Exception{
		System.out.println("0. volver");
		System.out.println("1. registro cliente");
		System.out.println("2. solicitud cita");
		System.out.println("3. consultar cita");
		int eleccion  =scanner.nextInt();
		return eleccion;
	}
	@Override
	public String menuEspecilidad() throws Exception{
		System.out.println("escribe el nombre de la especialidad");
		System.out.println("1.Psicologia");
		System.out.println("2.Traumatologia");
		System.out.println("3.Fisioterapia");
		String especialidadString= scanner.nextLine();
		return especialidadString;
	}

}
