package myPracticePackage;
import javax.swing.*;

import myLib.MyLibrary;
public class Extractor {
	public static void main(String[] args) {
		// declare variables & setup library access
		MyLibrary accessLib = new myLib.MyLibrary();
		String input="", output="Phonenetics\n\n";
		JTextArea outputArea = new JTextArea(5,10);
		boolean loop=true;
		// as long as the user wants to enter numbers loop
		while (loop) {
			input=accessLib.getString("Enter a number to change to the word combination, or * to exit");
			if (input.equals("")) { // user has left input blank
				accessLib.sayOutput("Empty! Cannot be left empty!");
				continue;
			} else if (input.charAt(0) > 57) {
				accessLib.sayOutput("Number expected! Encountered a String instead!");
				continue;
			} else if (input.equals("*")) { // user wants to exit
				loop=false;
				continue;
			} else { // calculate phonetics
				output = accessLib.checkInt(output, input);
			}
			outputArea.setText(output);
			accessLib.sayOutput(outputArea);
			// reset output variable
			output="Phonenetics\n\n";
		}
	}
}
