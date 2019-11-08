package dad.javafx.bindings.dimensiones;

import javafx.application.Application;
import javafx.beans.binding.Bindings;
import javafx.beans.binding.DoubleBinding;
import javafx.beans.property.ReadOnlyDoubleProperty;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class DimensionesApp extends Application {
	
	private Label anchoLabel;
	private Label altoLabel;
	private Label areaLabel;
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		anchoLabel = new Label();
		altoLabel = new Label();
		areaLabel = new Label();
		
		VBox root = new VBox(5, anchoLabel, altoLabel, areaLabel);
		root.setFillWidth(false);
		root.setAlignment(Pos.CENTER);
		
		ReadOnlyDoubleProperty ancho = primaryStage.widthProperty();
		ReadOnlyDoubleProperty alto = primaryStage.heightProperty();
		DoubleBinding area = ancho.multiply(alto);
		
		anchoLabel.textProperty().bind(
				Bindings
					.concat("Ancho: ")
					.concat(ancho.asString("%.0f"))
				);
		altoLabel.textProperty().bind(
				Bindings
					.concat("Ancho: ")
					.concat(alto.asString("%.0f"))
				);
		areaLabel.textProperty().bind(
				Bindings
					.concat("Área: ")
					.concat(area.asString("%3.0f"))
				);
		
		Scene scene = new Scene(root, 320, 200);
		
		primaryStage.setTitle("HolaJavaFX con Bindings");
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}

	public static void main(String[] args) {
		launch(args);
	}

}
