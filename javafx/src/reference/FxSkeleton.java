package reference;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class FxSkeleton extends Application{
	public static void main(String[] args) {
		//To launch the JavaFx Application
		launch(args);
	}
	
	@Override
	public void init() {
		System.out.println("Inside the init() method.");
	}
	
	@Override
	public void start(Stage stage) {
		System.out.println("Inside the start() method.");
		stage.setTitle("Skeleton");
		
		//One of the several layouts
		FlowPane rootNode = new FlowPane();
		
		Scene scene = new Scene(rootNode, 300, 200);
		stage.setScene(scene);
		
		Label label = new Label("Hello World!");
		rootNode.getChildren().add(label);
		
		//To remove a label
		//rootNode.getChildren().remove(label);
		
		stage.show();
	}
	
	@Override
	public void stop() {
		System.out.println("Inside the stop() method.");
	}
}
