package myPracticePackage;

import myLib.MyLibrary;

public class ServiceProvider {

	public static void main(String[] args) {
		MyLibrary accessLib = new myLib.MyLibrary();
		boolean loop = true;
		int service = 0, amount = 0;
		String input = "";
		while (loop) {
			input = accessLib.getString("Which service did the customer use (1 - 4)? or (* to exit)");
			if (input.equals("*")) {
				loop = false;
				continue;
			} else if (input.charAt(0) > 57) {
				accessLib.sayOutput("Number expected! String encountered!");
				continue;
			} else {
				service = accessLib.intString(input);
				switch (service) {
					case 1: amount += 100;break;
					case 2: amount += 200;break;
					case 3: amount += 300;break;
					case 4: amount += 400;break;
					default: accessLib.sayOutput("Invalid Service Number!");break;
				}
			}
		}
		accessLib.sayOutput("Customer Services total $" + amount);
	}

}
