package fx;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ToggleButton;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class FxToggleButton extends Application{
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("Toggle Button");
		FlowPane rootNode = new FlowPane(10, 10);
		rootNode.setAlignment(Pos.CENTER);
		
		Scene mainScene = new Scene(rootNode, 400, 300);
		Label response = new Label("Press the button.");
		ToggleButton toggleButton = new ToggleButton("On/Off");
		
		toggleButton.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent e) {
				if(toggleButton.isSelected()) response.setText("Button is On");
				else response.setText("Button is Off");
			}
		});
		
		rootNode.getChildren().addAll(response, toggleButton);
		primaryStage.setScene(mainScene);
		primaryStage.show();
	}

}
