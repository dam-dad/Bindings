package dad.javafx.bindings.model;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.ReadOnlyIntegerWrapper;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class PersonaFX {
	private StringProperty nombre = new SimpleStringProperty();
	private StringProperty apellidos = new SimpleStringProperty();
	private ObjectProperty<Sexo> sexo = new SimpleObjectProperty<>();
	private ObjectProperty<LocalDate> fechaNacimiento = new SimpleObjectProperty<>();
	private StringProperty nacionalidad = new SimpleStringProperty();
	private ReadOnlyIntegerWrapper edad = new ReadOnlyIntegerWrapper();

	public PersonaFX() {
		fechaNacimiento.addListener((o, ov, nv) -> {
			edad.set((int) nv.until(LocalDate.now(), ChronoUnit.YEARS));
		});
	}

	public String getNombre() {
		return nombre.get();
	}

	public void setNombre(String nombre) {
		this.nombre.set(nombre);
	}

	public StringProperty nombreProperty() {
		return nombre;
	}

	public final StringProperty apellidosProperty() {
		return this.apellidos;
	}

	public final String getApellidos() {
		return this.apellidosProperty().get();
	}

	public final void setApellidos(final String apellidos) {
		this.apellidosProperty().set(apellidos);
	}

	public final ObjectProperty<Sexo> sexoProperty() {
		return this.sexo;
	}

	public final Sexo getSexo() {
		return this.sexoProperty().get();
	}

	public final void setSexo(final Sexo sexo) {
		this.sexoProperty().set(sexo);
	}

	public final ObjectProperty<LocalDate> fechaNacimientoProperty() {
		return this.fechaNacimiento;
	}

	public final LocalDate getFechaNacimiento() {
		return this.fechaNacimientoProperty().get();
	}

	public final void setFechaNacimiento(final LocalDate fechaNacimiento) {
		this.fechaNacimientoProperty().set(fechaNacimiento);
	}

	public final StringProperty nacionalidadProperty() {
		return this.nacionalidad;
	}

	public final String getNacionalidad() {
		return this.nacionalidadProperty().get();
	}

	public final void setNacionalidad(final String nacionalidad) {
		this.nacionalidadProperty().set(nacionalidad);
	}

	public final javafx.beans.property.ReadOnlyIntegerProperty edadProperty() {
		return this.edad.getReadOnlyProperty();
	}

	public final int getEdad() {
		return this.edadProperty().get();
	}

}
