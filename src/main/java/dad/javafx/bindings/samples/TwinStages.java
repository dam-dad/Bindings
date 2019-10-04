package dad.javafx.bindings.samples;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class TwinStages extends Application {
	
	private Stage secondaryStage;

	@Override
	public void start(Stage primaryStage) throws Exception {

		primaryStage.setTitle("Primary");
		primaryStage.setScene(new Scene(new Pane(), 320, 200));
		primaryStage.show();

		secondaryStage = new Stage();
		secondaryStage.setTitle("Secondary");
		secondaryStage.setScene(new Scene(new Pane(), 320, 200));
		secondaryStage.show();
		
		primaryStage.xProperty().addListener((o, ov, nv) -> {
			secondaryStage.setX(nv.doubleValue() + primaryStage.getWidth());
		});

		primaryStage.yProperty().addListener((o, ov, nv) -> {
			secondaryStage.setY(nv.doubleValue());
		});
		
		primaryStage.widthProperty().addListener((o, ov, nv) -> {
			secondaryStage.setWidth(nv.doubleValue());
		});

		primaryStage.heightProperty().addListener((o, ov, nv) -> {
			secondaryStage.setHeight(nv.doubleValue());
		});
		
		secondaryStage.xProperty().addListener((o, ov, nv) -> {
			primaryStage.setX(nv.doubleValue() - secondaryStage.getWidth());
		});

		secondaryStage.yProperty().addListener((o, ov, nv) -> {
			primaryStage.setY(nv.doubleValue());
		});
		
		secondaryStage.widthProperty().addListener((o, ov, nv) -> {
			primaryStage.setWidth(nv.doubleValue());
		});

		secondaryStage.heightProperty().addListener((o, ov, nv) -> {
			primaryStage.setHeight(nv.doubleValue());
		});


	}

	public static void main(String[] args) {
		launch(args);
	}

}
