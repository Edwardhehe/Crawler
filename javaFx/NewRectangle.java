package application;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class NewRectangle extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		primaryStage.setTitle("Ô²½Ç¾ØÐÎÊ¾Àý");
		Group group=new Group();
		
		Rectangle rectangle=new Rectangle(20,20,200,200);
		
		rectangle.setArcHeight(15);
		rectangle.setArcWidth(15);
		
		rectangle.setStroke(Color.BLACK);
		group.getChildren().add(rectangle);
		
		Scene scene=new Scene(group,1000,1000);
		primaryStage.setScene(scene);
		primaryStage.show();
}
	public static void main(String[] args) {
		launch(args);
	}
}
