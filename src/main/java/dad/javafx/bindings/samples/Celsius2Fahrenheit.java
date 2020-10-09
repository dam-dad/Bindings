package dad.javafx.bindings.samples;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;

public class Celsius2Fahrenheit {

	public static void main(String[] args) {

		DoubleProperty f = new SimpleDoubleProperty();
		DoubleProperty c = new SimpleDoubleProperty();
		
		// conversión de grados celsius a grados fahrenheit
		// f = c * (9/5) + 32
		f.bind(c.multiply(9/5).add(32));
		f.addListener((o, ov, nv) -> System.out.println("f=" + nv));
		
		c.set(34.0);
		c.set(0.0);
		c.set(4.0);
		c.set(3.0);
		c.set(1234.0);
		
	}

}
