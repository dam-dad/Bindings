package dad.javafx.bindings.samples;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Sample1 {
	
	public static void main(String[] args) {
		
		StringProperty nombre = new SimpleStringProperty();
				
		nombre.addListener((o, ov, nv) -> {
			System.out.println("valor anterior: " + ov);
			System.out.println("valor nuevo: " + nv);
		});

		nombre.set("Mariano");
		
		nombre.set("Marianico");

		nombre.set("Marianete");
		
		System.out.println(nombre.get());
		
	}

}
