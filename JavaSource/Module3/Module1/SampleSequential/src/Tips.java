/*
 * Name: Theral Jessop
 * Course: INFO 211
 * Date: January 16, 2015
 * Program Description:
 * Write a program that computes tips for services rendered; the required information is the amount
 * of the bill and the percentage tip. The program should display tip amount.
 * 
 * (Hint: Tip = Amount * Percentage / 100)
 * 
 * 
 * 
 * 
 * 
 */


// import necessary packages in order to use
// classe(s): JOptionPane
import javax.swing.*;

public class Tips {

	public static void main(String[] args) {
		// set variables
		double tip, amount, percent;
		// get user input
		// get amount
		amount = Double.parseDouble(JOptionPane.showInputDialog("Please enter the amount"));
		// get percent
		percent = Double.parseDouble(JOptionPane.showInputDialog("Please enter the percent: eg: 12.5"));
		// calculate the tip
		tip = (Math.floor((amount * (percent/100))*100))/100;
		// show the user
		JOptionPane.showMessageDialog(null, "The tip is: $" + tip);
		
	
	}

}
