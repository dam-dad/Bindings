package dad.javafx.bindings.samples;

import javafx.application.Application;
import javafx.beans.binding.Bindings;
import javafx.beans.binding.StringExpression;
import javafx.beans.property.SimpleStringProperty;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Sample7 extends Application {
	
	private TextField nombreText;
	private Label saludoLabel;
	private CheckBox hayNombreCheck;

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		nombreText = new TextField();
		nombreText.setMaxWidth(100);
		
		saludoLabel = new Label();
		
		hayNombreCheck = new CheckBox();

		VBox root = new VBox(5);
		root.setAlignment(Pos.CENTER);
		root.getChildren().addAll(nombreText, saludoLabel, hayNombreCheck);

		Scene scene = new Scene(root, 320, 200);
		
		primaryStage.setScene(scene);
		primaryStage.setTitle("Binding sample 2");
		primaryStage.show();
		
		StringExpression saludoExpression = 
			new SimpleStringProperty("¡¡¡Hola")
				.concat(
					Bindings
						.when(Bindings.isEmpty(nombreText.textProperty()))
						.then("")
						.otherwise(" "))
				.concat(nombreText.textProperty())
				.concat("!!!");
			
		saludoLabel.textProperty().bind(saludoExpression);
		
		nombreText.editableProperty().bind(hayNombreCheck.selectedProperty());
					
		
	}

	public static void main(String[] args) {
		launch(args);
	}

}
