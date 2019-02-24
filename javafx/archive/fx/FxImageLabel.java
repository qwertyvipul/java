package fx;

import java.io.FileInputStream;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class FxImageLabel extends Application{
	public static void main(String[] args){
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("Use an Image in Label");
		FlowPane rootNode = new FlowPane();
		rootNode.setAlignment(Pos.CENTER);
		
		Scene mainScene = new Scene(rootNode, 600, 400);
		primaryStage.setScene(mainScene);
		
		
		Image oldcar = new Image(new FileInputStream("old-car.jpg"));
		ImageView imageView = new ImageView(oldcar);
		ImageView imageView2 = new ImageView(oldcar);
		imageView.setFitWidth(150);
		imageView.setFitHeight(100);
		imageView2.setFitWidth(150);
		imageView2.setFitHeight(100);
		
		Label oldcarLabel = new Label("Old Car", imageView);
		Label oldcarLabel2 = new Label("Old Car", imageView2);
		oldcarLabel2.setContentDisplay(ContentDisplay.TOP);
		
		rootNode.getChildren().addAll(oldcarLabel, oldcarLabel2);
		primaryStage.show();
	}
}
