package dad.javafx.bindings.samples;

import javafx.application.Application;
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
	
	private StringProperty texto = new SimpleStringProperty("3,1416");
	
	private DoubleProperty numero = new SimpleDoubleProperty(6.25);

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		numeroText = new TextField();
		numeroText.setMaxWidth(100);

		VBox root = new VBox(5);
		root.setAlignment(Pos.CENTER);
		root.getChildren().addAll(numeroText);

		Scene scene = new Scene(root, 320, 200);

		numeroText.textProperty().bindBidirectional(texto);
		
		texto.bindBidirectional(numero, new NumberStringConverter());
		
		numero.addListener((o,ov,nv) -> System.out.println(nv));
		
		primaryStage.setScene(scene);
		primaryStage.setTitle("Binding sample 2");
		primaryStage.show();
		
	}

	public static void main(String[] args) {
		launch(args);
	}

}
