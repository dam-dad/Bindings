package dad.javafx.bindings.model;

import java.time.LocalDate;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class VideoJuego {
	private StringProperty nombre = new SimpleStringProperty();
	private StringProperty descripcion = new SimpleStringProperty();
	private ObjectProperty<Genero> genero = new SimpleObjectProperty<Genero>();
	private ObjectProperty<LocalDate> fechaLanzamiento = new SimpleObjectProperty<LocalDate>();
	private DoubleProperty precio = new SimpleDoubleProperty();

	public final StringProperty nombreProperty() {
		return this.nombre;
	}

	public final String getNombre() {
		return this.nombreProperty().get();
	}

	public final void setNombre(final String nombre) {
		this.nombreProperty().set(nombre);
	}

	public final StringProperty descripcionProperty() {
		return this.descripcion;
	}

	public final String getDescripcion() {
		return this.descripcionProperty().get();
	}

	public final void setDescripcion(final String descripcion) {
		this.descripcionProperty().set(descripcion);
	}

	public final ObjectProperty<Genero> generoProperty() {
		return this.genero;
	}

	public final Genero getGenero() {
		return this.generoProperty().get();
	}

	public final void setGenero(final Genero genero) {
		this.generoProperty().set(genero);
	}

	public final ObjectProperty<LocalDate> fechaLanzamientoProperty() {
		return this.fechaLanzamiento;
	}

	public final LocalDate getFechaLanzamiento() {
		return this.fechaLanzamientoProperty().get();
	}

	public final void setFechaLanzamiento(final LocalDate fechaLanzamiento) {
		this.fechaLanzamientoProperty().set(fechaLanzamiento);
	}

	public final DoubleProperty precioProperty() {
		return this.precio;
	}

	public final double getPrecio() {
		return this.precioProperty().get();
	}

	public final void setPrecio(final double precio) {
		this.precioProperty().set(precio);
	}

}
