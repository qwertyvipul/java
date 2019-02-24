package fx;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class FxButtonEvent extends Application{
	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("Button Event");
		FlowPane rootNode = new FlowPane(10, 10);
		
		//Position the controls in center
		rootNode.setAlignment(Pos.CENTER);
		
		Scene mainScene = new Scene(rootNode, 300, 100);
		primaryStage.setScene(mainScene);
		
		Label response = new Label("Push a Button!");
		Button btnAlpha = new Button("Alpha");
		Button btnBeta = new Button("Beta");
		
		btnAlpha.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent e) {
				response.setText("Alpha Button Clicked!");
			}
		});
		
		btnBeta.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent e) {
				response.setText("Beta Button Clicked!");
			}
		});
		
		rootNode.getChildren().addAll(btnAlpha, btnBeta, response);
		primaryStage.show();
	}
}
