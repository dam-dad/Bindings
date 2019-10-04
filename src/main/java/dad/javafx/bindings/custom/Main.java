package dad.javafx.bindings.custom;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;

public class Main {

	public static void main(String[] args) {
		
		DoubleProperty a = new SimpleDoubleProperty(9);
		DoubleProperty c = new SimpleDoubleProperty();

		
		c.bind(MathBindings.sqrt(MathBindings.pow(a, 4).divide(2)));

		System.out.println(c.get());

		a.set(8);

		System.out.println(c.get());
		
	}

}
