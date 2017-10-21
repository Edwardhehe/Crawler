package application;


import com.sun.media.jfxmedia.events.NewFrameEvent;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Rectangle extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		primaryStage.setTitle("¾ØÐÎÊ¾Àý");
		Group root=new Group();
		Scene scene=new Scene(root,300,250,Color.WHITE);
		
		javafx.scene.shape.Rectangle rectangle=new javafx.scene.shape.Rectangle();
		rectangle.setX(50);
		rectangle.setY(50);
		rectangle.setWidth(200);
		rectangle.setHeight(100);
		
		root.getChildren().add(rectangle);
		
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
	public static void main(String[] args) {
		launch(args);
	}
	
}
