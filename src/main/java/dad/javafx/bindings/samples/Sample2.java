package dad.javafx.bindings.samples;

import javafx.beans.binding.StringExpression;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Sample2 {
	
	public static void main(String[] args) {
		
		StringProperty nombre = new SimpleStringProperty();
		StringProperty apellidos = new SimpleStringProperty();
		StringProperty nombreCompleto = new SimpleStringProperty();

		StringExpression expr = nombre.concat("---").concat(apellidos);
		
		nombreCompleto.bind(expr);
		
		nombre.set("Chuck");

		apellidos.set("Norris González");
		
		System.out.println(nombreCompleto.get());

		nombre.set("Chuckie");

		System.out.println(nombreCompleto.get());
		
		nombreCompleto.unbind();
		
		nombreCompleto.set("Perico Palotes");
		
	}

}
