package dad.javafx.bindings.samples;

import dad.javafx.bindings.custom.PowBinding;
import javafx.application.Application;
import javafx.beans.binding.DoubleBinding;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.util.converter.NumberStringConverter;

public class CustomBindingSample extends Application {
	
	private TextField xText, yText, zText, nText;
	
	private DoubleProperty x, y, z, n;

	@Override
	public void start(Stage primaryStage) throws Exception {
		xText = new TextField();
		xText.setAlignment(Pos.BASELINE_RIGHT);
		xText.setPrefColumnCount(5);

		yText = new TextField();
		yText.setAlignment(Pos.BASELINE_RIGHT);
		yText.setPrefColumnCount(5);

		zText = new TextField();
		zText.setAlignment(Pos.BASELINE_RIGHT);
		zText.setPrefColumnCount(5);

		nText = new TextField();
		nText.setAlignment(Pos.BASELINE_RIGHT);
		nText.setPrefColumnCount(5);
		nText.setEditable(false);
		
		HBox xPane = new HBox(5, new Label("X = "), xText);
		xPane.setAlignment(Pos.CENTER);
		
		HBox yPane = new HBox(5, new Label("Y = "), yText);
		yPane.setAlignment(Pos.CENTER);

		HBox zPane = new HBox(5, new Label("Z = "), zText);
		zPane.setAlignment(Pos.CENTER);

		HBox nPane = new HBox(5, new Label("N = (X^Y + 5) / Z = "), nText);
		nPane.setAlignment(Pos.CENTER);

		VBox root = new VBox(5);
		root.setAlignment(Pos.CENTER);
		root.getChildren().addAll(xPane, yPane, zPane, nPane);
		
		Scene scene = new Scene(root, 320, 200);
		
		primaryStage.setTitle("Custom Binding");
		primaryStage.setScene(scene);
		primaryStage.show();
		
		x = new SimpleDoubleProperty(0);
		y = new SimpleDoubleProperty(0);
		z = new SimpleDoubleProperty(0);
		n = new SimpleDoubleProperty(0);
		
		xText.textProperty().bindBidirectional(x, new NumberStringConverter());
		yText.textProperty().bindBidirectional(y, new NumberStringConverter());
		zText.textProperty().bindBidirectional(z, new NumberStringConverter());
		nText.textProperty().bind(n.asString("%.2f"));
		
		DoubleBinding formula = (new PowBinding(x, y).add(5)).divide(z);
		
		n.bind(formula);
		
	}

	public static void main(String[] args) {
		launch(args);
	}

}
