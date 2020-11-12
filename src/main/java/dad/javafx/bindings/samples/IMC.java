package dad.javafx.bindings.samples;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class IMC {

	public static void main(String[] args) {
		
		DoubleProperty altura = new SimpleDoubleProperty(0);
		DoubleProperty masa = new SimpleDoubleProperty(0);
		DoubleProperty imc = new SimpleDoubleProperty();
		StringProperty diagnostico = new SimpleStringProperty();
		
		imc.bind(masa.divide(altura.multiply(altura)));
		imc.addListener((o, ov, nv) -> {
			double i = nv.doubleValue();
			if (i > 10 && i < 20) {
				diagnostico.set("Sobrepeso");
			} else {
				diagnostico.set("No sobrepeso ;-D");
			}
		});
		
		diagnostico.addListener((o, ov, nv) -> System.out.println(nv));

		altura.set(176);
		masa.set(80);
		
	}

}
