package fx;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class FxCheckBox extends Application{
	
	Label allFruits;
	
	CheckBox cbApple;
	CheckBox cbBanana;
	CheckBox cbMango;
	
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("Check Box");
		FlowPane rootNode = new FlowPane(10, 10);
		rootNode.setAlignment(Pos.CENTER);
		Scene mainScene = new Scene(rootNode, 300, 300);
		
		Label heading = new Label("Select Friuts");
		Label reponse = new Label("No fruits selected");
		allFruits = new Label("Fruits: <none>");
		
		cbApple = new CheckBox("Apple");
		cbBanana = new CheckBox("Banana");
		cbMango = new CheckBox("Mango");
		
		cbApple.setOnAction(new EventHandler<ActionEvent>(){
			@Override
			public void handle(ActionEvent e) {
				if(cbApple.isSelected()) {
					reponse.setText("Apple selected");
				}else {
					reponse.setText("Apple cleared");
				}
				showAll();
			}
		});
		
		cbBanana.setOnAction(new EventHandler<ActionEvent>(){
			@Override
			public void handle(ActionEvent e) {
				if(cbBanana.isSelected()) {
					reponse.setText("Banana selected");
				}else {
					reponse.setText("Banana cleared");
				}
				showAll();
			}
		});
		
		cbMango.setOnAction(new EventHandler<ActionEvent>(){
			@Override
			public void handle(ActionEvent e) {
				if(cbMango.isSelected()) {
					reponse.setText("Mango selected");
				}else {
					reponse.setText("Mango cleared");
				}
				showAll();
			}
		});
		
		rootNode.getChildren().addAll(heading, cbApple, cbBanana, cbMango, reponse, allFruits);
		primaryStage.setScene(mainScene);
		primaryStage.show();
	}
	
	void showAll() {
		String fruits = "";
		if(cbApple.isSelected()) fruits = "Apple ";
		if(cbBanana.isSelected()) fruits += "Banana ";
		if(cbMango.isSelected()) fruits += "Mango";
		
		if(fruits.equals("")) fruits = "<none>";
		allFruits.setText(fruits);
	}
	
}
