package dad.javafx.bindings.samples;

import javafx.application.Application;
import javafx.beans.binding.Bindings;
import javafx.beans.binding.StringExpression;
import javafx.beans.property.SimpleStringProperty;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Sample4 extends Application {
	
	private Label widthLabel, heightLabel, areaLabel; 
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		widthLabel = new Label();

		heightLabel = new Label();

		areaLabel = new Label();

		StringExpression expresion =
				new SimpleStringProperty("(")
				.concat(primaryStage.xProperty().asString())
				.concat(", ")
				.concat(primaryStage.yProperty().asString())
				.concat(")");
		
		widthLabel.textProperty().bind(Bindings.concat("ancho=", primaryStage.widthProperty().asString()));

		heightLabel.textProperty().bind(
				new SimpleStringProperty("alto=")
				.concat(primaryStage.heightProperty().asString())
				);
		
		areaLabel.textProperty().bind(
				primaryStage.widthProperty()
					.multiply(primaryStage.heightProperty())
					.asString()
				);
		
		VBox root = new VBox(5, widthLabel, heightLabel, areaLabel);
		root.setAlignment(Pos.CENTER);
		
		Scene scene = new Scene(root, 320, 200);
		
		primaryStage.titleProperty().bind(expresion);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}

}
