package practice;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;

public class ComboBoxDemo extends Application {
	// declare an array of Strings for flag titles
	private String[] flagTitles = {"Canada", "China", "Denmark", "France", "Germany", "India", "Norway", "United Kingdom", "United States of America"};
	
	// declare an ImageView array for the national flags of 9 countries
	private ImageView[] flagImage = {
			new ImageView("image/ca.gif"),
			new ImageView("image/china.gif"),
			new ImageView("image/denmark.gif"),
			new ImageView("image/fr.gif"),
			new ImageView("image/germany.gif"),
			new ImageView("image/india.gif"),
			new ImageView("image/norway.gif"),
			new ImageView("image/uk.gif"),
			new ImageView("image/us.gif")};
	
	// declare an array of strings for flag descriptions
	private String[] flagDescription = new String[9];
	
	// declare and create a description pane
	private DescriptionPane descriptionPane = new DescriptionPane();
	
	
	
	public void start(Stage primaryStage) {
		
	}
}
