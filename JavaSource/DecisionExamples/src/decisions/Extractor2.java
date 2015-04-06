/* 
 * IUK
 * Professor: Dr. Awny Alnusair
 *  Name: Theral Jessop
 * Course: INFO 211
 * Date: February 2, 2015
 * Lab 2:
 * Program 6
 * Description:
 * Write a program that takes an integer keyed in from the terminal and extracts and displays each
 * digit of the integer in English. So if the user types in 932, the program should display:
 * 
 *  variables:
 *  input				String
 *  output				String
 * 	outputArea			JTextArea
 * 
 * 
 */ 
package decisions;
import javax.swing.*;
public class Extractor2 {
	public static void main(String[] args) {
		// declare variables
		String input="", output="Phonenetics\n\n";
		int getNumber=0;
		JTextArea outputArea = new JTextArea(10,15);
		boolean loop=true;
		// as long as the user wants to enter numbers loop
		while (loop) {
			input=JOptionPane.showInputDialog("Enter a number to change to the word combination, or * to exit");
			if (input.equals("")) { // user has left input blank
				JOptionPane.showMessageDialog(null, "Invalid entry!");
				continue;
			} else if (input.equals("*")) { // user wants to exit
				loop=false;
				continue;
			} else { // calculate phonetics
				// loop through the input and get each individual character
				for (int x=0;x<input.length();x++) {
					try {
						// validate number
						getNumber=input.charAt(x);
					} catch (NumberFormatException|NullPointerException|IndexOutOfBoundsException e) {
						// display error message
						JOptionPane.showMessageDialog(null, "Extreme Error!");
						continue;
					}
					// get phonetics and add it to the output string
					switch (getNumber) {
					case 48: output+="Zero\n";break;
					case 49: output+="One\n";break;
					case 50: output+="Two\n";break;
					case 51: output+="Three\n";break;
					case 52: output+="Four\n";break;
					case 53: output+="Five\n";break;
					case 54: output+="Six\n";break;
					case 55: output+="Seven\n";break;
					case 56: output+="Eight\n";break;
					case 57: output+="Nine\n";break;
					}
				}
			}
			// display results to user
			outputArea.setText(output);
			JOptionPane.showMessageDialog(null, outputArea);
			// reset output variable
			output="Phonenetics\n\n";
		}
	}
}
