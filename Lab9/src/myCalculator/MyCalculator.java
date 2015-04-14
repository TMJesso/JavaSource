package myCalculator;
import javax.swing.JOptionPane;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;

@SuppressWarnings("unused")
public class MyCalculator extends Application {
	  private Calculate calculate = new Calculate();
	  private Face faceState = new Face();
	  private TextField displayValue = new TextField();
	  private TextField face = new TextField();
	  private float inputValue;

	public static void main(String[] args) {
	    launch(args);
	}

	public void start(Stage primaryStage) {
		
	    Scene scene = new Scene(getPane(), 200, 350);
	    primaryStage.setTitle("My Fun Calculator"); // Set the stage title
	    primaryStage.setScene(scene); // Place the scene in the stage
	    primaryStage.show(); // Display the stage
		
	}
	
	public float getInputValue() {
		return this.inputValue;
	}
	
	public float getDisplayValue() {
		return Float.parseFloat(this.displayValue.getText());
	}
	
	public void setInputValue(float inputValue) {
		this.inputValue = inputValue;
	}
	
	public void setDisplayValue(String displayValue) {
		this.displayValue.setText(displayValue);
	}
	
	public void setFace(boolean face) {
		if (face) {
			this.face.setText(":-)");
		} else {
			this.face.setText(":-(");
		}
	}
	
	protected BorderPane getPane() {
		
		Font arial = Font.font("Times New Romans", FontWeight.BOLD, 20);
		
		Button one = new Button("1");
		one.setFont(arial);
		Button two = new Button("2");
		two.setFont(arial);
		Button three = new Button("3");
		three.setFont(arial);
		Button four = new Button("4");
		four.setFont(arial);
		Button five = new Button("5");
		five.setFont(arial);
		Button six = new Button("6");
		six.setFont(arial);
		Button seven = new Button("7");
		seven.setFont(arial);
		Button eight = new Button("8");
		eight.setFont(arial);
		Button nine = new Button("9");
		nine.setFont(arial);
		Button zero = new Button("0");
		zero.setFont(arial);
		Button clear = new Button("C");
		clear.setFont(arial);
		Button divide = new Button(" /");
		divide.setFont(arial);
		Button add = new Button("+");
		add.setFont(arial);
		Button minus = new Button(" -");
		minus.setFont(arial);
		Button multiply = new Button(" *");
		multiply.setFont(arial);
		
		
		HBox topPane = new HBox(2);
		  topPane.setPadding(new Insets(11,12,13,14));
	
		  
		  topPane.getChildren().addAll(displayValue, face);
		  topPane.setAlignment(Pos.TOP_CENTER);

		  GridPane centerPane = new GridPane();
		  centerPane.setHgap(5.5);
		  centerPane.setVgap(5.5);
		  centerPane.add(seven, 0,0);
		  centerPane.add(eight, 1,0);
		  centerPane.add(nine, 2, 0);
		  centerPane.add(divide, 3,0);
		  centerPane.add(four, 0,1);
		  centerPane.add(five, 1,1);
		  centerPane.add(six, 2,1);
		  centerPane.add(multiply, 3,1);
		  centerPane.add(one, 0, 2);
		  centerPane.add(two, 1, 2);
		  centerPane.add(three, 2, 2);
		  centerPane.add(minus, 3, 2);
		  centerPane.add(zero, 1, 3);
		  centerPane.add(clear, 2, 3);
		  centerPane.add(add, 3, 3);
		  
		 // centerPane.getChildren().addAll(seven, eight, nine, divide, four, five, six, multiply, one, two, three, minus, zero, clear, add);
		  centerPane.setAlignment(Pos.CENTER);
		  
		  
		  BorderPane mainPane = new BorderPane();
		  mainPane.setTop(topPane);
		  mainPane.setCenter(centerPane);
		  mainPane.setStyle("-fx-border-color: red");

		  one.setOnAction(new EventHandler<ActionEvent>() {
		    @Override public void handle(ActionEvent e) {
		    	setInputValue(1);
			    }
		});
		  
		multiply.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent e) {
			calculate.multiply(getInputValue());
			setDisplayValue(calculate.getDisplayValue()+"");
			}
		});
		return mainPane;
	}
	
	
}
