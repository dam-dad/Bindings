package dad.javafx.bindings.samples;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;

public class SampleMenos2 {

	public static void main(String[] args) {

		DoubleProperty a = new SimpleDoubleProperty();
		DoubleProperty b = new SimpleDoubleProperty();
		DoubleProperty c = new SimpleDoubleProperty();
		
		a.bind(b);
		
		c.bind(a);
		
		b.set(7);
		
		a.unbind();
		
		b.set(15);
		
		System.out.println(c.get());
		
	}

}
