/*
 * IUK
 * Professor: Dr. Awny Alnusair
 *  Name: Theral Jessop
 * Course: INFO 211
 * Date: January 29, 2015
 * Quiz 1:
 * Problem 5:
 * 
 * Description:
 * Create a Java Application that asks the user for 5 numbers. When the user is done 
 * entering the numbers, your program displays a histogram of these numbers as seen 
 * below in the sample run.
 * 
 * Enter number: 8
 * Enter number: 2
 * Enter number: 2
 * Enter number: 3
 * Enter number: 6
 * ********
 * **
 * **
 * ***
 * ******
 *
 * 
 * 
 * 
 */
package quiz1;
	// load package to display dialog boxes
	import javax.swing.*;
public class Problem5 {
	public static void main(String[] args) {
		// declare variables
		int[] numbers = new int[5];
		boolean loop = true;
		String display = "";
		// get 5 numbers
		for (int x = 0; x <= 4; x++) {
			loop = true;
			// as long as the user enters an invalid entry loop
			while (loop) {
				try {
					numbers[x]=Integer.parseInt(JOptionPane.showInputDialog("For (" + (x + 1) + ") Enter a number greater than 0:"));
					if (numbers[x]<1) {
						// Error! Number entered is less than 1
						JOptionPane.showMessageDialog(null, "Invalid number entered!");
						continue;
					} else {
						// user entered a valid entry
						loop=false;
					}
				} catch (NumberFormatException|NullPointerException e) {
					// Error! Invalid entry detected
					JOptionPane.showMessageDialog(null, "Invalid Entry!");
					continue;
				}
			}
		}
		// prepare output
		for (int x = 0; x <= 4; x++) {
			for (int y = 1; y <= numbers[x]; y ++) {
				// # of stars for the number entered
				display += "*";
			}
			// generate a new line
			display += "\n";
		}
		// display results
		JOptionPane.showMessageDialog(null, display);
	}
}
