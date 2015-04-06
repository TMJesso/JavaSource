package myPracticePackage;

import myLib.MyLibrary;

public class CurrentTemp {

	public static void main(String[] args) {
		MyLibrary accessLib = new myLib.MyLibrary();
		int temp = 0;
		String message = "", input = "", header = "";
		header = "What is the current temperature (* to exit)";
		boolean loop = true;
		while (loop) {
			input = accessLib.getString(header);
			if (input.equals("*")) {
				loop = false;
				continue;
			} else if (input.charAt(0) > 57) {
				accessLib.sayOutput("Number expected! Encountered String instead");
				continue;
			} else {
				temp = accessLib.intString(input);
			}
			if (temp < 0) {
				message = "Extremely Cold - Freezing";
			} else if (temp >= 0 && temp <= 33) {
				message = "Very Cold";
			} else if (temp >=34 && temp <= 70) {
				message = "Nice";
			} else if (temp >= 71 && temp <= 85) {
				message = "Warm";
			} else if (temp >= 86 && temp <= 100) {
				message = "Very Hot";
			} else {
				message = "Extremely Hot";
			}
			accessLib.sayOutput(message);
		}
	}

	
}
