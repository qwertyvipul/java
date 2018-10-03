package noob;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class HelloWorld extends Application{

	@Override
	public void start(Stage stage) throws Exception {
		
		Line line = new Line();
		line.setStartX(150);
		line.setStartY(250);
		line.setEndX(400);
		line.setEndY(250);
		
		//Create a new group
		Group group = new Group();
		
		//Creating the text object
		Text text = new Text();
		text.setFont(new Font(45));
		text.setX(150);
		text.setY(200);
		text.setText("Hello World!");
		
		//Obsevable list object
		ObservableList list = group.getChildren();
		list.add(text);
		list.add(line);
		
		
		//Create a scene for the group by passing height and width
		Scene scene = new Scene(group, 600, 400);
		
		//Setting color to the screen
		scene.setFill(Color.LAVENDER);
		
		//Set title to the stage
		stage.setTitle("Hello World!");
		
		//Add scene to the stage
		stage.setScene(scene);
		
		//Display the contents of the stage
		stage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}