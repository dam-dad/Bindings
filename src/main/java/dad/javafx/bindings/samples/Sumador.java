package dad.javafx.bindings.samples;

import javafx.application.Application;
import javafx.beans.binding.Bindings;
import javafx.beans.binding.DoubleBinding;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;
import javafx.stage.Stage;
import javafx.util.converter.NumberStringConverter;

public class Sumador extends Application {
	
	// view
	private TextField operando1Text, operando2Text, resultadoText;
	private Line linea;
	private Button resetButton;

	// model
	private DoubleProperty operando1 = new SimpleDoubleProperty(0);
	private DoubleProperty operando2 = new SimpleDoubleProperty(0);
	private DoubleProperty resultado = new SimpleDoubleProperty(0);
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		operando1Text = new TextField();
		operando1Text.setAlignment(Pos.BASELINE_RIGHT);
		operando1Text.relocate(150, 10);
		operando1Text.setPrefWidth(100);
		
		operando2Text = new TextField();
		operando2Text.setAlignment(Pos.BASELINE_RIGHT);
		operando2Text.relocate(150, 40);
		operando2Text.setPrefWidth(100);
		
		resultadoText = new TextField();
		resultadoText.setAlignment(Pos.BASELINE_RIGHT);
		resultadoText.relocate(150, 80);
		resultadoText.setPrefWidth(100);
		
		linea = new Line(50, 73, 250, 73); // (x1, y1), (x2, y2)
		
		Label sumarLabel = new Label("+");
		sumarLabel.relocate(50, 40);
		sumarLabel.setStyle("-fx-font-size: 16pt;");
		
		resetButton = new Button("Reiniciar");
		resetButton.relocate(100, 120);
		resetButton.setOnAction(e -> onResetButtonAction(e));

		Pane root = new Pane(operando1Text, 
				operando2Text, resultadoText, linea, 
				sumarLabel, resetButton);
		
		Scene scene = new Scene(root, 320, 200); 
		
		primaryStage.setTitle("Sumador");
		primaryStage.setScene(scene);
		primaryStage.show();
		
		Bindings.bindBidirectional(
				operando1Text.textProperty(), 
				operando1, 
				new NumberStringConverter()
			);
		
		Bindings.bindBidirectional(
				operando2Text.textProperty(), 
				operando2, 
				new NumberStringConverter()
			);
		
		DoubleBinding sumaBinding = operando1.add(operando2); 
		
		resultado.bind(sumaBinding);
		
		resultadoText.textProperty().bind(resultado.asString());
		
	}

	private void onResetButtonAction(ActionEvent e) {
		operando1.set(0);
		operando2.set(0);
	}

	public static void main(String[] args) {
		launch(args);
	}

}
