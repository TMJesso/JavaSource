/*
 * IUK
 * Professor: Dr. Awny Alnusair
 *  Name: Theral Jessop
 * Course: INFO 211
 * Date: January 29, 2015
 * Quiz 1:
 * Problem 1:
 * 
 * Description:
 * Write a program that will keep asking the user for integer numbers until the user enters * which 
 * will end the input. Once the user is done entering numbers, your program will print out the sum 
 * of the numbers entered. Use InputDialog and MessageDialog for user input and output, respectively.
 *
 * 
 * 
 * 
 */
package quiz1;
	// load package to display dialog boxes
	import javax.swing.JOptionPane;
public class Program1 {
	public static void main(String[] args) {
		// declare variables
		boolean loop=true;
		String input="";
		int num=0, counter=0;
		// loop until user enters exit character
		while (loop) {
			// get input
			input=JOptionPane.showInputDialog("Enter a number or * to exit");
			// does the user want to exit
			if (input.equals("*")) {
				loop = false;
			} else {
				// validate entry
				try {
					// sum the number entered
					num+=Integer.parseInt(input);
					counter++;
				} catch (NumberFormatException|NullPointerException e) {
					JOptionPane.showMessageDialog(null, "Invalid entry!");
				}
			}
		}
		// display results
		JOptionPane.showMessageDialog(null, "You have entered " + counter + " numbers and their sum is: "+num);
	}
}
