package fx;

import java.io.FileInputStream;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class FxImageButton extends Application{
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("Image With Button");
		FlowPane rootNode = new FlowPane(10, 10);
		rootNode.setAlignment(Pos.CENTER);
		primaryStage.setScene(new Scene(rootNode, 200, 400));
		Label response = new Label("Puch a button.");
		
		Image oldcar = new Image(new FileInputStream("old-car.jpg"));
		ImageView imageView1 = new ImageView(oldcar);
		ImageView imageView2 = new ImageView(oldcar);
		imageView1.setFitWidth(150);
		imageView1.setFitHeight(100);
		imageView2.setFitWidth(150);
		imageView2.setFitHeight(100);
		
		Button btnOldcar1 = new Button("Old Car - 1", imageView1);
		Button btnOldcar2 = new Button("Old Car - 2", imageView2);
		
		btnOldcar1.setContentDisplay(ContentDisplay.TOP);
		btnOldcar2.setContentDisplay(ContentDisplay.TOP);
		
		btnOldcar1.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent e) {
				response.setText("Old Car - 1");
			}
		});
		
		btnOldcar2.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent e) {
				response.setText("Old Car - 2");
			}
		});
		
		rootNode.getChildren().addAll(response, btnOldcar1, btnOldcar2);
		primaryStage.show();
	}
}
