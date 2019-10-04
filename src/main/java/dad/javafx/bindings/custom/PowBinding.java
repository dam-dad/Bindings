package dad.javafx.bindings.custom;

import javafx.beans.binding.DoubleBinding;
import javafx.beans.binding.DoubleExpression;

public class PowBinding extends DoubleBinding {
	
	private DoubleExpression x, y;
	
	public PowBinding(DoubleExpression x, DoubleExpression y) {
		super();
		bind(this.x = x, this.y = y);
	}

	@Override
	protected double computeValue() {
		return Math.pow(x.get(), y.get());
	}

}
