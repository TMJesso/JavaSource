/* 
 * IUK
 * Professor: Dr. Awny Alnusair
 *  Name: Theral Jessop
 * Course: INFO 211
 * Date: January 28, 2015
 * Lab 2:
 * Program 6
 * Description:
 * Write a program that takes an integer keyed in from the terminal and extracts and displays each
 * digit of the integer in English. So if the user types in 932, the program should display:
 * 
 *  variables:
 *  num					String
 *  display				String
 *  debug				boolean
 * outputArea			JTextArea
 * digit				int
 * factor				int
 * digitArray			int[]
 * 
 * 
 */ 
package decisions;
	// get class to create dialog boxes
	import javax.swing.*;
public class Extractor {

	public static void main(String[] args) {
		// declare variables
		boolean debug=false;
		String num="", display="";
		JTextArea outputArea = new JTextArea(5,10);
		int digit=0, factor=1;
		// ask user for any number
		num=JOptionPane.showInputDialog("Enter a number to phoneticaly extract each digit");
		// prepare array to hold the individual digits
		int[]  digitArray= new int[num.length()];
		// calculate the factor of 10's
		for (int p=1;p<num.length();p++) {
			factor*=10;
		}
		// convert string to an integer
		digit=Integer.parseInt(num);
		// loop through the digits and set display according to the digit
		for (int x=0;x<num.length();x++) {
			// get first digit
			digitArray[x]=digit/factor;
			// prepare for next digit
			digit=digit % factor;
			// debugging 
			if (debug) {
				System.out.println(num+"  "+digitArray[x]+"  "+factor);
			}
			// set factor back by 10
			factor/=10;
			// set display string according to the digit found
			switch (digitArray[x]) {
			case 0: display+="Zero\n";break;
			case 1: display+="One\n";break;
			case 2: display+="Two\n";break;
			case 3: display+="Three\n";break;
			case 4: display+="Four\n";break;
			case 5: display+="Five\n";break;
			case 6: display+="Six\n";break;
			case 7: display+="Seven\n";break;
			case 8: display+="Eight\n";break;
			case 9: display+="Nine\n";break;
			}
		}
		// set display in JTextArea
		outputArea.setText(display);
		// display JTextArea results
		JOptionPane.showMessageDialog(null, outputArea);
	}
}
