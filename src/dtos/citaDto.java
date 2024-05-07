package dtos;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class citaDto {
	String dniString= "aaaaa";
	String apellidoString  ="aaaa";
	String nombreString  ="aaaaa";
	String especiaString = "aaaaa";
	LocalDateTime fecha  =LocalDateTime.of(9999, 12, 31, 23, 59);
	@Override
	public String toString() {
		return "citaDto [dniString=" + dniString + ", apellidoString=" + apellidoString + ", nombreString="
				+ nombreString + ", especiaString=" + especiaString + ", fecha=" + fecha
				+ ", getDniString()=" + getDniString() + ", getApellidoString()=" + getApellidoString()
				+ ", getNombreString()=" + getNombreString() + ", getEspeciaString()=" + getEspeciaString()
				+ ", getFechaString()=" + getFecha() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
	public citaDto () {}
	public citaDto(String dniString, String apellidoString, String nombreString, String especiaString) {
		super();
		this.dniString = dniString;
		this.apellidoString = apellidoString;
		this.nombreString = nombreString;
		this.especiaString = especiaString;
		this.fecha = fecha;
	}
	
	public String getDniString() {
		return dniString;
	}
	public void setDniString(String dniString) {
		this.dniString = dniString;
	}
	public String getApellidoString() {
		return apellidoString;
	}
	public void setApellidoString(String apellidoString) {
		this.apellidoString = apellidoString;
	}
	public String getNombreString() {
		return nombreString;
	}
	public void setNombreString(String nombreString) {
		this.nombreString = nombreString;
	}
	public String getEspeciaString() {
		return especiaString;
	}
	public void setEspeciaString(String especiaString) {
		this.especiaString = especiaString;
	}
	public LocalDateTime getFecha() {
		return fecha;
	}
	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}
	
}
