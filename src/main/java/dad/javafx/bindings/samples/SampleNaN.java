package dad.javafx.bindings.samples;

import javafx.beans.binding.Bindings;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class SampleNaN {

	public static void main(String[] args) {

		DoubleProperty a = new SimpleDoubleProperty(0);
		DoubleProperty b = new SimpleDoubleProperty(0);
		StringProperty x = new SimpleStringProperty();
		
		x.addListener((o, ov, nv) -> System.out.println("x ---> ov=" + ov + "/nv=" + nv)); 
		
		DoubleProperty imc = new SimpleDoubleProperty();
		
		x.bind(
				Bindings
					.when(b.isEqualTo(0))
					.then("No válido. Debe introducir una altura distinto de cero.")
					.otherwise(imc.asString())
			);
		
		imc.bind(a.divide(b));
		
	}

}
