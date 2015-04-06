package myPracticePackage;

import javax.swing.JTextArea;

import myLib.MyLibrary;

public class Factorial {

	public static void main(String[] args) {
		MyLibrary accessLib = new myLib.MyLibrary();
		String output="\tx\tx!\n\n", results = "";
		int factors = 0;
		factors = accessLib.getInteger("How many factorials to you want?");
		JTextArea outputArea = new JTextArea((5 + factors),(20 + factors));
		for (int x=1; x<=factors; x++) {
			results += "\t" + x + accessLib.factor(output, x) + "\n";
		}
		outputArea.setText(results);
		accessLib.sayOutput(outputArea);
		
	}

}
