package application;


import com.sun.javafx.property.adapter.ReadOnlyPropertyDescriptor.ReadOnlyListener;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.StrokeLineCap;
import javafx.stage.Stage;

public class Line2 extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		primaryStage.setTitle("Drawing Lines");
		Group root =new Group();
		Scene scene=new Scene(root,300,150,Color.GRAY);
		
		Line redline=new Line(10,10,200,10);
		
		redline.setStroke(Color.RED);
		redline.setStrokeWidth(10);
		redline.setStrokeLineCap(StrokeLineCap.BUTT);
		redline.getStrokeDashArray().addAll(15d,5d,15d,15d,20d);
		redline.setStrokeDashOffset(10);
		
		root.getChildren().add(redline);
		
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}
