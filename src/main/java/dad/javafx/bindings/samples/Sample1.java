package dad.javafx.bindings.samples;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Sample1 {
	
	public static void main(String[] args) {
		
		StringProperty nombre = new SimpleStringProperty();
				
		nombre.addListener((observable, oldValue, newValue) -> {
			System.out.println("valor anterior: " + oldValue);
			System.out.println("valor nuevo: " + newValue);
		});

		nombre.set("Mariano");
		
		nombre.set("Marianico");

		nombre.set("Marianete");
		
		System.out.println(nombre.get());
		
	}

}
