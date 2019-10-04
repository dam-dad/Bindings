package dad.javafx.bindings.samples;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;

public class Sample0 {

	public static void main(String[] args) {
		
		DoubleProperty a = new SimpleDoubleProperty(2);
		DoubleProperty b = new SimpleDoubleProperty(4);
		
		DoubleProperty c = new SimpleDoubleProperty();

		// o = observable, ov = oldValue, nv = newValue
		c.addListener((o, ov, nv) -> {
			System.out.println("C antes valía " + ov + " y ahora vale " + nv);
		});
		
		// c = a * (b + 100)
		c.bind(a.multiply(b.add(100)));
		
		a.set(5);
		
	}

}
