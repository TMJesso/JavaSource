package practice;

import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextArea;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Font;


public class DescriptionPane extends BorderPane {
	/** Label for displaying an image and a title
	 * 
	 */
	private Label lblImageTitle = new Label();
	
	/** text area for displaying text
	 * 
	 */
	private TextArea taDescription = new TextArea();
	
	public DescriptionPane() {
		// center the icon and text and place the text under the icon
		lblImageTitle.setContentDisplay(ContentDisplay.TOP);
		lblImageTitle.setPrefSize(200,  100);
		
		// set the font in the label and the text field
		lblImageTitle.setFont(new Font("SanSerif", 16));
		lblImageTitle.setFont(new Font("Serif", 14));
		
		taDescription.setWrapText(true);
		taDescription.setEditable(false);
		
		// Create a scroll pane to hold the text area
		ScrollPane scrollPane = new ScrollPane(taDescription);
		
		// place label and scroll pane in the border pane
		setLeft(lblImageTitle);
		setCenter(scrollPane);
		setPadding(new Insets(5, 5, 5, 5));
	}
	
	/** set the title
	 * 
	 */
	public void setTitle(String title) {
		lblImageTitle.setText(title);
	}
	
	/** set the image view
	 * 
	 */
	public void setImageView(ImageView icon) {
		lblImageTitle.setGraphic(icon);
	}
	
	/** set the text description
	 * 
	 */
	public void setDescription(String text) {
		taDescription.setText(text);
	}
}