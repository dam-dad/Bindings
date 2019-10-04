package dad.javafx.bindings.samples;

import javafx.application.Application;
import javafx.beans.binding.Bindings;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.util.converter.NumberStringConverter;

public class Sample6 extends Application {
	
	private TextField numeroText;
	
	private StringProperty textoProperty = new SimpleStringProperty(this, "texto");
	
	private DoubleProperty numeroProperty = new SimpleDoubleProperty(this, "numero");

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		numeroText = new TextField();
		numeroText.setMaxWidth(100);

		VBox root = new VBox(5);
		root.setAlignment(Pos.CENTER);
		root.getChildren().addAll(numeroText);

		Scene scene = new Scene(root, 320, 200);

//		numeroText.textProperty().addListener((ob, oldValue, newValue) -> System.out.println("listener1: " + newValue));

		textoProperty.bindBidirectional(numeroText.textProperty());
//		textoProperty.addListener((ob, oldValue, newValue) -> System.out.println("listener2: " + newValue));
		
		Bindings.bindBidirectional(textoProperty, numeroProperty, new NumberStringConverter());
		
		numeroProperty.addListener((o,ov,nv) -> System.out.println(nv));
		
		primaryStage.setScene(scene);
		primaryStage.setTitle("Binding sample 2");
		primaryStage.show();
		
		numeroProperty.set(123.5);
	}

	public static void main(String[] args) {
		launch(args);
	}

}
