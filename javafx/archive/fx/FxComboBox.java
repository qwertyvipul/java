package fx;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class FxComboBox extends Application{
	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("Combo Box");
		FlowPane rootNode = new FlowPane(10, 10);
		rootNode.setAlignment(Pos.CENTER);
		
		Scene mainScene = new Scene(rootNode, 280, 120);
		
		Label response = new Label("Select your choice");
		ComboBox<String> fruitCombo = new ComboBox<String>(
				FXCollections.observableArrayList("Apple", "Banana", "Mango"));
		
		fruitCombo.setValue("Select your choice");
		
		fruitCombo.setOnAction(new EventHandler<ActionEvent>(){
			public void handle(ActionEvent e) {
				response.setText("Selected fruit is: " + fruitCombo.getValue());
			}
		});
		
		rootNode.getChildren().addAll(fruitCombo, response);
		primaryStage.setScene(mainScene);
		primaryStage.show();
	}
}
