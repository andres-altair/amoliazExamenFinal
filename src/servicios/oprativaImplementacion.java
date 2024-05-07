package servicios;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import controladores.inicio;
import dtos.citaDto;
import dtos.clienteDto;
/*
 * implementacion que implementa a operativaInterfaz
 */

public class oprativaImplementacion implements operativaInterfaz {
	Scanner scanner  =new Scanner(System.in);
	@Override
	public void registro()throws Exception {
		long id = crearId();
		String dniString  = scanner.nextLine();
		String nombreString = scanner.nextLine();
		String apellidoString  =scanner.nextLine();
		clienteDto cliente  =new clienteDto(id, dniString, nombreString, apellidoString);
		inicio.listaClienteDtos.add(cliente);

	}
	/*
	 * metodo que crea automaticamenta la id del cliente
	 */
	private long crearId() throws Exception{
		int cantidad= inicio.listaClienteDtos.size();
		long id= 1;
		if(cantidad==0) 
		{
			id= 1;
		}else {
			id = cantidad;
		}
		return id;
	}
	@Override
	public void solicitarCita() throws Exception	{
		for(clienteDto clienteDto : inicio.listaClienteDtos) {
			System.out.println(clienteDto.toString());
		}
		System.out.println("escribe el dni");
		String dniString = scanner.nextLine();
		for(clienteDto clienteDto : inicio.listaClienteDtos) {
			if(clienteDto.getDni().equals(dniString) && clienteDto.isValidado()==true) {
				menuInterfaz miInterfaz = new menuImplementacion();
				String especialidadString= miInterfaz.menuEspecilidad() ;
				System.out.println("escribe la fecha y hora(dd-MM-yyyy HH:mm:ss)");
				String fechaString  = scanner.nextLine();
				DateTimeFormatter formatter= DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
				LocalDateTime fechaDateTime= LocalDateTime.parse(fechaString,formatter);
				citaDto cita= new citaDto();
				cita.setDniString(dniString);
				cita.setNombreString(clienteDto.getNombre());
				cita.setApellidoString(clienteDto.getApellidos());
				cita.setEspeciaString(especialidadString);
				cita.setFecha(fechaDateTime);
				inicio.listaCita.add(cita);				
			}	
		}
	}
	@Override
	public void validar()throws Exception {
		int contador=0;
		for (clienteDto clienteDto : inicio.listaClienteDtos) {
			if(clienteDto.isValidado()==false) {
				contador++;
				System.out.println(clienteDto.getDni()+" - " + clienteDto.getApellidos()+", "+clienteDto.getNombre());
			}
		}
		if(contador>0) {
			System.out.println("que clienete quieres(el dni) ");
			String dniString = scanner.nextLine();
			for (clienteDto clienteDto : inicio.listaClienteDtos) {
				if(clienteDto.getDni().equals(dniString) && clienteDto.isValidado()==false) {
					clienteDto.setValidado(true);
				}
			}
		}else {
			System.out.println("no hay cliente para validar");
		}
		
	}
	@Override
	public void imprimir() throws Exception{
		System.out.println("escribe la fecha (dd-MM-yyyy)");
		String fechString = scanner.nextLine();
		for (clienteDto clienteDto :inicio.listaClienteDtos) {
			if(clienteDto.equals(fechString)) {
				ficheroInterfaz ficheroInterfaz   = new ficheroImplementacion();
				ficheroInterfaz.escrituraCita();

			}	
		}	
	}
	@Override
	public void consultar() throws Exception {
		System.out.println("escribe  tu dni");
		String dniString = scanner.nextLine();
		System.out.println("escribe la fecha de inicio(dd-MM-yyyy)");
		String fechaString  = scanner.nextLine();
		DateTimeFormatter formatter= DateTimeFormatter.ofPattern("dd-MM-yyyy");
		LocalDateTime fechaDateTime= LocalDateTime.parse(fechaString,formatter);
		System.out.println("escribe la fecha de fin(dd-MM-yyyy)");
		String fechaString2  = scanner.nextLine();
		LocalDateTime fechaDateTime2= LocalDateTime.parse(fechaString2,formatter);
		
		for (citaDto cita :inicio.listaCita) {
			if(fechaDateTime.isAfter( cita.getFecha()) && fechaDateTime2.isEqual(cita.getFecha()) && dniString.equals(cita.getDniString())){
			System.out.println(cita.getFecha().format(formatter) + " " + cita.getEspeciaString());
			}
		}	
	}
}
