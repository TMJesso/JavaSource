/* 
 * Name: Theral Jessop
 * Course: INFO 211
 * Date: January 21, 2015
 * Description:
 * Write a program that allows the user to enter three integer numbers. Your program should
 * determine the maximum number and the minimum number. Don’t use built-in language
 * functions.
 * 
 * variables:
 * num1 (int)
 * num2 (int)
 * num3 (int)
 * max  (int)
 * min  (int)
 * notNumber (boolean)
 * 
 */ 

// import necessary packages in order to use


package mySamplePackage;
// import for JOptionPane class
import javax.swing.*;

public class ThreeMax {

	public static void main(String[] args) {
		// declare variables to be used
		int num1 = 0, num2 = 0, num3=0, max=0, min=0;
		// variable to loop if not a number
		boolean notNumber=false;
		
		// get user input
		// loop if user did not enter a number
		while (!notNumber) {
			try {
				num1 = Integer.parseInt(JOptionPane.showInputDialog("Please enter first number"));
				notNumber=true;
			}
			catch (NumberFormatException e)
			{
				JOptionPane.showMessageDialog(null, "Invalid Entry!");
			}
		}
		// reset loop value
		notNumber=false;
		// loop if user did not enter a number
		while (!notNumber) {
			try {
				num2 = Integer.parseInt(JOptionPane.showInputDialog("Please enter second number"));
				notNumber=true;
			}
			catch (NumberFormatException e)
			{
				JOptionPane.showMessageDialog(null, "Invalid Entry!");
			}
		}
		// reset loop value
		notNumber=false;
		// loop if user did not enter a number
		while(!notNumber) {
			try {
				num3 = Integer.parseInt(JOptionPane.showInputDialog("Plese enter third number"));
				notNumber=true;
			}
			catch (NumberFormatException e)
			{
				JOptionPane.showMessageDialog(null, "Invalid Entry!");
			}
		}
		// set max to num1
		max = num1;
		// set min to num1
		min = num1;
		// compare max to num2
		if (num2>max) {
			max=num2;
		}
		// compare max to num3
		if (num3>max) {
			max=num3;
		}
		// compare min to num2
		if (num2<min) {
			min=num2;
		}
		// compare min to num3
		if (num3<min) {
			min=num3;
		}
		// display the results to the user
		JOptionPane.showMessageDialog(null,"The highest value number is: "+max+"\n\nThe lowest value number is: "+min);
	}
}
