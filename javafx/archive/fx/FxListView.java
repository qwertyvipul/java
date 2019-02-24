package fx;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.MultipleSelectionModel;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class FxListView extends Application{
	Label response;
	
	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) {
		primaryStage.setTitle("List View");
		FlowPane rootNode = new FlowPane(10, 10);
		rootNode.setAlignment(Pos.CENTER);
		
		Scene mainScene = new Scene(rootNode, 100, 200);
		
		response = new Label("Select fruit");
		
		//observable list of entries for the list view
		ObservableList<String> fruitList = 
				FXCollections.observableArrayList("Apple", "Banana", "Mango");
		
		//create the list view
		ListView<String> fruitListView = new ListView<String>(fruitList);
		
		//set the preferred width and height
		fruitListView.setPrefSize(80, 40);
		
		MultipleSelectionModel<String> selectionModel = fruitListView.getSelectionModel();
		
		/*
		 * For multiple selections
		 * getSelectionModel().setSelectionModel(SelectionMode.MULTIPLE)
		 */
		
		
		/*
		 * Use a change listener to respond to a change of selection within a list view
		 * */
		
		selectionModel.selectedItemProperty().addListener(new ChangeListener<String>() {
			@Override
			public void changed(ObservableValue<? extends String> 
			changed, String oldVal, String newVal) {
				response.setText("Fruit selected is " + newVal);
			}
		});
		
		rootNode.getChildren().addAll(fruitListView, response);
		primaryStage.setScene(mainScene);
		primaryStage.show();
	}
}
