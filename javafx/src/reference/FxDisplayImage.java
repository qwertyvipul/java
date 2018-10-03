package reference;

import java.io.FileInputStream;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class FxDisplayImage extends Application{
	public static void main(String[] args){
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("Display An Image");
		FlowPane rootNode = new FlowPane();
		rootNode.setAlignment(Pos.CENTER);
		
		Scene mainScene = new Scene(rootNode, 600, 400);
		primaryStage.setScene(mainScene);
		
		//One Way
		Image oldcar = new Image(new FileInputStream("old-car.jpg"));
		
		//Another Way
		/*
		 * Create a res directory in your src folder and add your image in there
		 */
		
		//Image oldcar = new Image(getClass().getResourceAsStream("/res/old-car.jpg"));
		ImageView imageView = new ImageView(oldcar);
		imageView.setFitWidth(300);
		imageView.setFitHeight(200);
		
		rootNode.getChildren().add(imageView);
		primaryStage.show();
	}
}
