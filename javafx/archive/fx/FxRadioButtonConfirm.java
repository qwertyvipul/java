package fx;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class FxRadioButtonConfirm extends Application{

	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("Radio Button");
		
		FlowPane rootNode = new FlowPane(10, 10);
		rootNode.setAlignment(Pos.CENTER);
		
		Scene mainScene = new Scene(rootNode, 400, 200);
		
		Label response = new Label("Select your choice.");
		
		RadioButton rbTrain = new RadioButton("Train");
		RadioButton rbCar = new RadioButton("Car");
		RadioButton rbPlane = new RadioButton("Plane");
		
		ToggleGroup toggleGroup = new ToggleGroup();
		rbTrain.setToggleGroup(toggleGroup);
		rbCar.setToggleGroup(toggleGroup);
		rbPlane.setToggleGroup(toggleGroup);
		
		Button confirmButton = new Button("Confirm Selection");
		
		confirmButton.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent arg0) {
				RadioButton rb = (RadioButton)toggleGroup.getSelectedToggle();
				response.setText(rb.getText() + " is selected");
			}
		});
		
		rootNode.getChildren().addAll(response, rbTrain, rbCar, rbPlane, confirmButton);
		primaryStage.setScene(mainScene);
		primaryStage.show();
	}
	
}
