package dtos;

import java.time.LocalDate;

public class clienteDto {
	
	long id ;
	String dni= "aaaa";
	String nombre  = "aaaa";
	String apellidos = "aaaa";
	String nombreCompleto ="aaaaa";
	LocalDate fechaAlta =  LocalDate.now(); 
	boolean validado = false;
	@Override
	public String toString() {
		return "clienteDto [id = "+ id +", " + dni + ", nombre=" + nombre + ", apellidos=" + apellidos + ", nombreCompleto="
				+ nombreCompleto + ", fechaAlta=" + fechaAlta + ", validado=" + validado + "]";
	}
	
	public clienteDto( long id, String dni, String nombre, String apellidos) {
		super();
		this.id = id;
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.nombreCompleto = apellidos+", "+nombre;
		this.fechaAlta = fechaAlta;
		this.validado = validado;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
		
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getNombreCompleto() {
		return nombreCompleto;
	}
	public void setNombreCompleto(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}
	public LocalDate getFechaAlta() {
		return fechaAlta;
	}
	public void setFechaAlta(LocalDate fechaAlta) {
		this.fechaAlta = fechaAlta;
	}
	public boolean isValidado() {
		return validado;
	}
	public void setValidado(boolean validado) {
		this.validado = validado;
	}
	
	
}