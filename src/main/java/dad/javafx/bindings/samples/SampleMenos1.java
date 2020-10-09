package dad.javafx.bindings.samples;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class SampleMenos1 {

	public static void main(String[] args) {

		DoubleProperty a = new SimpleDoubleProperty(5);
		a.addListener((observable, oldValue, newValue) -> System.out.println("oldValue=" + oldValue + "/newValue=" + newValue));
		
		System.out.println(a.get());
		
		a.set(123);
		a.set(4);
		a.set(3);
		a.set(7);
		
		StringProperty b = new SimpleStringProperty();
		b.addListener((observable, oldValue, newValue) -> System.out.println("oldValue=" + oldValue + "/newValue=" + newValue));
		
		b.set("hola");
	}

}
