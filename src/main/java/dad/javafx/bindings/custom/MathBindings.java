package dad.javafx.bindings.custom;

import javafx.beans.binding.DoubleExpression;
import javafx.beans.property.SimpleDoubleProperty;

public class MathBindings {
	
	public static PowBinding pow(DoubleExpression x, DoubleExpression y) {
		return new PowBinding(x, y);
	}

	public static PowBinding pow(DoubleExpression x, double y) {
		return new PowBinding(x, new SimpleDoubleProperty(y));
	}
	
	public static SqrtBinding sqrt(DoubleExpression x) {
		return new SqrtBinding(x);
	}
	
}
