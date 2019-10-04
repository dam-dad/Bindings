package dad.javafx.bindings.custom;

import javafx.beans.binding.StringBinding;
import javafx.beans.binding.StringExpression;

public class TrimBinding extends StringBinding {
	
	private StringExpression x;
	
	public TrimBinding(StringExpression x) {
		super();
		bind(this.x = x);
	}

	@Override
	protected String computeValue() {
		return x.get().trim();
	}

}
