package practice;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.collections.FXCollections;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.SelectionMode;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;

public class ListViewDemo extends Application {
	
	// declare an array of Strings for flag titles
	private String[] flagTitles = {"Canada", "China", "Denmark", "France", "Germany", "India", "Norway", "United Kingdom", "United States of America"};
	
	// declare an ImageView array for the national flags of 9 countries
	private ImageView[] ImageViews = {
			new ImageView("image/ca.gif"),
			new ImageView("image/china.gif"),
			new ImageView("image/denmark.gif"),
			new ImageView("image/fr.gif"),
			new ImageView("image/germany.gif"),
			new ImageView("image/india.gif"),
			new ImageView("image/norway.gif"),
			new ImageView("image/uk.gif"),
			new ImageView("image/us.gif")
	};
	
	@Override // Override the start method in the Application class
	public void start(Stage primaryStage) {
		ListView<String> lv = new ListView<>(FXCollections.observableArrayList(flagTitles));
		lv.setPrefSize(400, 400);
		lv.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
		
		// create a pane to hold image viewws
		FlowPane imagePane = new FlowPane(10,10);
		BorderPane pane = new BorderPane();
		pane.setLeft(new ScrollPane(lv));
		pane.setCenter(imagePane);
		lv.getSelectionModel().selectedItemProperty().addListener(ov -> {
			imagePane.getChildren().clear();
			for (Integer i: lv.getSelectionModel().getSelectedIndices()) {
				imagePane.getChildren().add(ImageViews[i]);
			}
		});
		
		// create a scene and place it in the stage
		Scene scene = new Scene(pane, 450, 170);
		primaryStage.setTitle("ListViewDemo"); // set the stage title
		primaryStage.setScene(scene); // place the scene in the stage
		primaryStage.show(); // display the stage
	}
}