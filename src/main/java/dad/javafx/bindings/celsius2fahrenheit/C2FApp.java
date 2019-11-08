package dad.javafx.bindings.celsius2fahrenheit;

import javafx.application.Application;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.util.converter.NumberStringConverter;

public class C2FApp extends Application {

	private TextField celsiusText;
	private Label fahrenheitLabel;
	
	private DoubleProperty celsius = new SimpleDoubleProperty(0);
	private DoubleProperty fahrenheit = new SimpleDoubleProperty(0);
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		celsiusText = new TextField();
		celsiusText.setPrefColumnCount(5);
		
		fahrenheitLabel = new Label();
		
		HBox root = new HBox(5, celsiusText, new Label("C = "), fahrenheitLabel);
		root.setAlignment(Pos.CENTER);
		
		// bindeos
//		Bindings.bindBidirectional(celsiusText.textProperty(), celsius, new NumberStringConverter());
		
		celsiusText.textProperty().bindBidirectional(celsius, new NumberStringConverter());
		
		fahrenheit.bind(celsius.multiply(9.0/5.0).add(32));
		
		fahrenheitLabel.textProperty().bind(fahrenheit.asString().concat("F"));
		
		Scene scene = new Scene(root, 320, 200);
		
		primaryStage.setTitle("Conversor de C a F");
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}

	public static void main(String[] args) {
		launch(args);
	}

}
