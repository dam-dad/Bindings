package dad.javafx.bindings.model;

import java.util.Date;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.StringProperty;

public class AlumnoFX {
	private StringProperty nombre;
	private StringProperty apellidos;
	private ObjectProperty<Date> fechaNacimiento;

	public StringProperty nombreProperty() {
		return this.nombre;
	}

	public String getNombre() {
		return this.nombreProperty().get();
	}

	public void setNombre(final String nombre) {
		this.nombreProperty().set(nombre);
	}

	public StringProperty apellidosProperty() {
		return this.apellidos;
	}

	public String getApellidos() {
		return this.apellidosProperty().get();
	}

	public void setApellidos(final String apellidos) {
		this.apellidosProperty().set(apellidos);
	}

	public ObjectProperty<Date> fechaNacimientoProperty() {
		return this.fechaNacimiento;
	}

	public Date getFechaNacimiento() {
		return this.fechaNacimientoProperty().get();
	}

	public void setFechaNacimiento(final Date fechaNacimiento) {
		this.fechaNacimientoProperty().set(fechaNacimiento);
	}

}
