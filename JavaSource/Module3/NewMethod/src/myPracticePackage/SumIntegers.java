package myPracticePackage;

import myLib.MyLibrary;

public class SumIntegers {

	public static void main(String[] args) {
		MyLibrary accessLib = new myLib.MyLibrary();
		boolean loop = true;
		int num = 0, counter = 0;
		String input = "";
		while (loop) {
			input = accessLib.getString("Please enter an integer! (* to exit)");
			if (input.equals("*")) {
				loop = false;
				continue;
			} else if (input.charAt(0) > 57) {
				accessLib.sayOutput("Number expected! String encountered!");
				continue;
			} else {
				num+=accessLib.intString(input);
				counter++;
			}
		}
		if (counter > 0) {
			accessLib.sayOutput("You entered "+ counter + " numbers and the sum of them is " + num);
		}
	}

}
