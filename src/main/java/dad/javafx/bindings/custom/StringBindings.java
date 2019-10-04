package dad.javafx.bindings.custom;

import javafx.beans.binding.StringBinding;
import javafx.beans.binding.StringExpression;

public class StringBindings {
	
	public static StringBinding trim(StringExpression x) {
		return new TrimBinding(x);
	}
	
}
