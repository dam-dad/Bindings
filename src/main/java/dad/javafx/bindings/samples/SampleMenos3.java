package dad.javafx.bindings.samples;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;

public class SampleMenos3 {

	public static void main(String[] args) {

		DoubleProperty a = new SimpleDoubleProperty(0);
		DoubleProperty b = new SimpleDoubleProperty(0);
		
		DoubleProperty c = new SimpleDoubleProperty();
		c.addListener((o, ov, nv) -> System.out.println("c ---> ov=" + ov + "/nv=" + nv)); 
		
		// c = a * (b - 5)
		c.bind(a.multiply(b.subtract(5)));
		
		a.set(3);
		b.set(5);
		
	}

}
