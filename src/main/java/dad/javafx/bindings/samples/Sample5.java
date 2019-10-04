package dad.javafx.bindings.samples;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Sample5 extends Application {
	
	private Label anchoLabel, anchoValueLabel;
	private Label altoLabel, altoValueLabel;

	@Override
	public void start(Stage primaryStage) throws Exception {

		anchoLabel = new Label("Ancho:");
		anchoValueLabel = new Label();
		
		HBox anchoPane = new HBox(5);
		anchoPane.setAlignment(Pos.CENTER);
		anchoPane.getChildren().addAll(anchoLabel, anchoValueLabel);

		altoLabel = new Label("Alto:");
		altoValueLabel = new Label();
		
		HBox altoPane = new HBox(5);
		altoPane.setAlignment(Pos.CENTER);
		altoPane.getChildren().addAll(altoLabel, altoValueLabel);

		VBox root = new VBox(5);
		root.setAlignment(Pos.CENTER);
		root.getChildren().addAll(anchoPane, altoPane);

		Scene scene = new Scene(root, 320, 200);
		
		anchoValueLabel.textProperty().bind(scene.widthProperty().asString());
		altoValueLabel.textProperty().bind(scene.heightProperty().asString());
		primaryStage.titleProperty().bind(anchoValueLabel.textProperty().concat(" + ").concat(altoValueLabel.textProperty()));
		
		primaryStage.setScene(scene);
//		primaryStage.setTitle("Binding sample 1");
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}

}
