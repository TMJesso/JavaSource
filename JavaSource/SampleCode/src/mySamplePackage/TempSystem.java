/* 
 * Name: Theral Jessop
 * Course: INFO 211
 * Date: January 22, 2015
 * Description:
 * Write a Java program to print out a different message based on the current temperature according to the following temperature system:
 * 
 * If the temperature is:			The message is:
 *          <0						“Extremely Cold – Freezing”
 *          0-33					“Very Cold”
 *          34-70					“Nice”
 *          71-85					“Warm”
 *          86-100					“Very Hot”
 *          >100					“Extremely Hot”
 * 
 * variables:
 * temp				(int)
 * notNumber		(boolean)
 * message			(String)
 * 
 * 
 * 
 */ 

// import necessary packages in order to use
package mySamplePackage;

// import for JOptionPane class
import javax.swing.*;

public class TempSystem {

	public static void main(String[] args) {
		// declare variables for use
		int temp=0;
		boolean notNumber=true;
		String message="";
		while (notNumber) {
			try
			{
				temp=Integer.parseInt(JOptionPane.showInputDialog("What is the temperature?"));
				notNumber=false;
			}
			catch (NumberFormatException e)
			{
				JOptionPane.showMessageDialog(null, "Invalid Input!");
			}
		}
		if (temp<0) {
			message="Extremely Cold - Freezing";
		}
		if (temp>=0) {
			if (temp<=33) {
				message="Very Cold";
			}
		}
		if (temp>=34) {
			if (temp<=70) {
				message="Nice";
			}
		}
		if (temp>=71) {
			if (temp<=85) {
				message="Warm";
			}
		}
		if (temp>=86) {
			if (temp<=100) {
				message="Very Hot";
			}
		}
		if (temp>100) {
			message="Extremely Hot";
		}
		JOptionPane.showMessageDialog(null, message);
	}

}
