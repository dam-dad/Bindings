package dad.javafx.bindings.samples;

import javafx.application.Application;
import javafx.beans.binding.StringExpression;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Sample3 extends Application {
	
	private TextField nombreText, apellidosText;
	private Label completoLabel;

	@Override
	public void start(Stage primaryStage) throws Exception {

		nombreText = new TextField();
		nombreText.setMaxWidth(100);

		apellidosText = new TextField();
		apellidosText.setMaxWidth(100);

		completoLabel = new Label("-");
		
		VBox root = new VBox(5);
		root.setAlignment(Pos.CENTER);
		root.getChildren().addAll(nombreText, apellidosText, completoLabel);

		Scene scene = new Scene(root, 320, 200);
		
		primaryStage.setTitle("Sample3");
		primaryStage.setScene(scene);
		primaryStage.show();
		
		StringExpression expr =
			nombreText.textProperty().
				concat(" ").
				concat(apellidosText.textProperty());
		
		completoLabel.textProperty().bind(expr);
		
	}

	public static void main(String[] args) {
		launch(args);
	}

}
