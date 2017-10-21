package application;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.effect.DropShadow;
import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;
import javafx.stage.Stage;

public class Criclelee extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		primaryStage.setTitle("ÍÖÔ²Ê¾Àý");
		Group root=new Group();
		Group group=new Group();
		Scene scene = new Scene(root, 300, 250, Color.WHITE);
		
		DropShadow dShadow=new DropShadow();
		dShadow.setOffsetY(3.0);
		dShadow.setColor(Color.color(0.4, 0.4, 0.4));
		
		Ellipse ellipse=new Ellipse();
		ellipse.setCenterX(50.0f);
		ellipse.setCenterY(50.0f);
		ellipse.setRadiusX(50.0f);
		ellipse.setRadiusY(25.0f);
		ellipse.setEffect(dShadow);
		
		group.getChildren().add(ellipse);
		
		root.getChildren().add(group);
		
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
	public static void main(String[] args) {
		launch(args);
	}

}
