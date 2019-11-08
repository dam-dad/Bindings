package dad.javafx.bindings.samples;

import javafx.beans.binding.StringBinding;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;

public class Formato {

	public static void main(String[] args) {

		DoubleProperty pi = new SimpleDoubleProperty(Math.PI); 
		
		StringBinding piString = pi.asString("%.2f");
		
		System.out.println(piString.get());
		
	}

}
