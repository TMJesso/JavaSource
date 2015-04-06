/* 
 * IUK
 * Professor: Dr. Awny Alnusair
 *  Name: Theral Jessop
 * Course: INFO 211
 * Date: January 28, 2015
 * Lab 2:
 * Sports team
 * Description:
 * ask user for their favorite sports team
 * if sports team entered equals "colts" then exit loop
 * otherwise keep asking user for favorite sports team
 *
 * 
 */
package decisions;
	// get class to create dialog boxes
	import javax.swing.*;
public class SportsTeam{

	public static void main(String[] args) {
		// create variables
		boolean loop=true;
		String input="";
		// loop until user enters colts (ignore case)
		while (loop) {
			// get user input
			input = JOptionPane.showInputDialog("Enter your favorite superbowl team");
			// validate user input
			if (input.equalsIgnoreCase("colts")) {
				// validation is true
				JOptionPane.showMessageDialog(null, "Good Choice!");
				// exit loop
				loop=false;
			}
		}
	}

}
