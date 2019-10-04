package dad.javafx.bindings.hola;

import dad.javafx.bindings.custom.StringBindings;
import javafx.application.Application;
import javafx.beans.binding.Bindings;
import javafx.beans.binding.StringBinding;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class HolaBindings extends Application {

	private TextField nombreText;
	private Label saludoLabel;
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		nombreText = new TextField();
		nombreText.setPromptText("Introduce un nombre");

		saludoLabel = new Label("-");
		
		VBox root = new VBox(4, nombreText, saludoLabel);
		root.setAlignment(Pos.CENTER);
		root.setFillWidth(false);
		
		// establezco los bindeos
		
		StringBinding nombre = StringBindings.trim(nombreText.textProperty());

		saludoLabel.textProperty().bind(
				Bindings
					.when(nombre.isEmpty())
					.then("No hay nadie a quien saludar")
					.otherwise(Bindings.concat("¡Hola ", nombre, "!"))
			);
		
		Scene scene = new Scene(root, 320, 200);
		
		primaryStage.setTitle("HolaMundo con Bindings");
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}
