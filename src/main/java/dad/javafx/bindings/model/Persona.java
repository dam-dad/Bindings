package dad.javafx.bindings.model;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

// bean java
public class Persona {
	private String nombre;
	private String apellidos;
	private Sexo sexo;
	private LocalDate fechaNacimiento;
	private String nacionalidad;
	
	public String getNombreCompleto() {
		return nombre + " " + apellidos;
	}
	
	public Integer getEdad() {
		return (int)fechaNacimiento.until(LocalDate.now(), ChronoUnit.YEARS);
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

	public Sexo getSexo() {
		return sexo;
	}

	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

}
