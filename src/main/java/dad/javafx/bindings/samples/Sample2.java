package dad.javafx.bindings.samples;

import javafx.beans.binding.Bindings;
import javafx.beans.binding.StringExpression;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Sample2 {
	
	public static void main(String[] args) {
		
		StringProperty nombre = new SimpleStringProperty("Perico");
		StringProperty apellidos = new SimpleStringProperty("Palotes");
		
		StringProperty nombreCompleto = new SimpleStringProperty();
		nombreCompleto.addListener((o, ov, nv) -> System.out.println("ov=" + ov + "/nv=" + nv)); 

		StringExpression expr1 = nombre.concat("---").concat(apellidos);
//		StringExpression expr2 = Bindings.concat(nombre, "---", apellidos);
		
		nombreCompleto.bind(expr1);
		
		nombre.set("Chuck");

		apellidos.set("Norris González");
		
		System.out.println(nombreCompleto.get());

		nombre.set("Chuckie");

		System.out.println(nombreCompleto.get());
		
		nombreCompleto.unbind();
		
		nombreCompleto.set("Perico Palotes");
		
	}

}
