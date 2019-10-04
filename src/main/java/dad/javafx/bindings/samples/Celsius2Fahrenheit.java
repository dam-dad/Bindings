package dad.javafx.bindings.samples;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;

public class Celsius2Fahrenheit {

	public static void main(String[] args) {

		DoubleProperty f = new SimpleDoubleProperty();
		DoubleProperty c = new SimpleDoubleProperty();
		
		// conversión de grados celsius a grados fahrenheit
		f.bind(c.multiply(9/5).add(32));
		
		c.set(34.0);
		
		System.out.println(f.get());
		
	}

}
