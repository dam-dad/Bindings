package dad.javafx.bindings.custom;

import javafx.beans.binding.DoubleBinding;
import javafx.beans.binding.DoubleExpression;

public class SqrtBinding extends DoubleBinding {
	
	private DoubleExpression x;
	
	public SqrtBinding(DoubleExpression x) {
		super();
		this.x = x;
		bind(x);
	}

	@Override
	protected double computeValue() {
		return Math.sqrt(x.get());
	}

}
