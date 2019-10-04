package dad.javafx.bindings.samples;

import javafx.application.Application;
import javafx.beans.binding.Bindings;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Bidireccional extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		TextField texto1 = new TextField(); 

		TextField texto2 = new TextField(); 
		
		VBox root = new VBox(5, texto1, texto2);
		root.setAlignment(Pos.CENTER);
		root.setFillWidth(false);
		
		Scene scene = new Scene(root, 320 ,200);
		
		primaryStage.setTitle("Bidireccional");
		primaryStage.setScene(scene);
		primaryStage.show();
		
//		texto2.textProperty().bindBidirectional(texto1.textProperty());
		
		Bindings.bindBidirectional(texto1.textProperty(), texto2.textProperty());
	}

	public static void main(String[] args) {
		launch(args);
	}
	
}
