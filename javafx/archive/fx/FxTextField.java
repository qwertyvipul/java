package fx;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Separator;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class FxTextField extends Application{
	public static void main(String[] args) {
		launch(args);
	}
	
	public void start(Stage primaryStage) throws Exception{
		primaryStage.setTitle("Text Field");
		
		FlowPane rootNode = new FlowPane(10, 10);
		rootNode.setAlignment(Pos.CENTER);
		Scene mainScene = new Scene(rootNode, 200, 120);
		
		Label response = new Label("Search string: ");
		
		Button searchButton = new Button("Search");
		
		TextField searchField = new TextField();
		searchField.setPromptText("Enter search string...");
		searchField.setPrefColumnCount(15);
		
		//When enter button is pressed directly from text field
		searchField.setOnAction(new EventHandler<ActionEvent>(){
			public void handle(ActionEvent e) {
				response.setText("Search string: " + searchField.getText());
			}
		});
		
		//When search button is pressed
		searchButton.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent e) {
				response.setText("Search string: " + searchField.getText());
			}
		});
		
		//Use separator to better organize the layout
		Separator separator = new Separator();
		separator.setPrefWidth(180);
		
		rootNode.getChildren().addAll(searchField, searchButton, separator, response);
		primaryStage.setScene(mainScene);
		primaryStage.show();
	}
}
