package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Line;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		VBox vBox=new VBox();
		final Scene scene=new Scene(vBox,300,250);
		scene.setFill(null);
		
		Line line=new Line(100,10,10,100);
		vBox.getChildren().add(line);
		
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
