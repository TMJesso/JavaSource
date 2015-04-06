/* 
 * Name: Theral Jessop
 * Course: INFO 211
 * Date: January 22, 2015
 * Description:
 * Write a program that asks the user to type in two integer values. Test these two numbers to
 * determine whether the first is evenly divisible by the second and then display an appropriate
 * message at the terminal.
 * 
 * variables:
 * num1			(int)
 * num2			(int)
 * remain		(double)
 * notNumber	(boolean)
 * 
 * 
 */ 

// import necessary packages in order to use
package mySamplePackage;

// import for JOptionPane class
import javax.swing.*;

public class EvenDivisible {

	public static void main(String[] args) {
		// declare variables
		int num1=0, num2=0, remain=0;
		//double remain=0.0;
		boolean notNumber=true;
		
		while (notNumber) {
			try
			{
				// get user input
				num1=Integer.parseInt(JOptionPane.showInputDialog("Please enter first integer value"));
				num2=Integer.parseInt(JOptionPane.showInputDialog("Please enter second integer value"));
				
				// set value to exit loop
				notNumber=false;
			}
			catch (NumberFormatException e)
			{
				// display error message
				JOptionPane.showMessageDialog(null, "Invalid integer entered");
			}
		}
		remain=num1%num2;
		if (remain==0) {
			JOptionPane.showMessageDialog(null, num1+" is evenly divisable by "+num2);
		} else {
			JOptionPane.showMessageDialog(null, num1+" is NOT evenly diviable by "+num2);
		}
		

		

	}

}
