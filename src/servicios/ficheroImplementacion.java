package servicios;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import controladores.inicio;
import dtos.citaDto;
import dtos.clienteDto;
/*
 * implementacion que implemta a ficheroInterfaz
 */
public class ficheroImplementacion implements ficheroInterfaz {

	@Override
	public void escrituraLog(String escritura) {
		try {
			BufferedWriter bWriter = new BufferedWriter(new FileWriter(inicio.rutaLog,true));
			bWriter.write(escritura+ "\n");
			bWriter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("error al conectarse con ficheros");
			String errorString = e.toString();
			escrituraLog(errorString);
		}

	}

	@Override
	public void escrituraCita() {
		// TODO Auto-generated method stub
		try {
			Scanner scanner=  new Scanner(System.in);
			System.out.println("escribe la fecha (dd-MM-yyyy)");
			String fechString = scanner.nextLine();
			String rutaString="C:\\Users\\profesor\\Desktop\\"+"informe-"+inicio.sfecha+".txt";
			BufferedWriter bWriter = new BufferedWriter(new FileWriter(rutaString));
			for (citaDto cita :inicio.listaCita) {
				DateTimeFormatter formatter= DateTimeFormatter.ofPattern("dd-MM-yyyy");
				if(cita.getFecha().format(formatter).equals(fechString)) {
				bWriter.write(cita.getDniString().concat(cita.getApellidoString()).concat(cita.getNombreString()).concat(cita.getEspeciaString()).concat("\n"));
				}
			}
			bWriter.close();
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("error al conectarse con ficheros");
			String errorString = e.toString();
			escrituraLog(errorString);
		}
	}

}
