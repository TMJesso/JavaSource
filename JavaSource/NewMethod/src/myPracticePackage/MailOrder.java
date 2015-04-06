package myPracticePackage;

import myLib.MyLibrary;

public class MailOrder {

	public static void main(String[] args) {
		MyLibrary accessLib = new myLib.MyLibrary();
		boolean loop = true, loop1 = true;
		double[] amount = new double[5];
		int prod = 0, qty = 0, x = 0;
		String message = "", product = "Product " + (x + 1) + " total amount is $";
		while (loop) {
			loop1 = true;
			prod = accessLib.getInteger("Which product was sold? (1 - 5) or (0 to exit");
			if (prod == 0) {
				loop = false;
				continue;
			}
			while (loop1) {
				qty = accessLib.getInteger("Enter quantitiy sold:");
				if (qty < 1) {
					accessLib.sayOutput("Invalid quantity entered!\n\nQuantity must be 1 or higher");
					continue;
				} else {
					loop1 = false;
					continue;
				}
			}
			switch (prod) {
				case 1: amount[(prod - 1)] += (Math.round(((2.98 * qty)*100.0)))/100.0;break;
				case 2: amount[(prod - 1)] += (Math.round(((4.50 * qty)*100.0)))/100.0;break;
				case 3: amount[(prod - 1)] += (Math.round(((9.98 * qty)*100.0)))/100.0;break;
				case 4: amount[(prod - 1)] += (Math.round(((4.49 * qty)*100.0)))/100.0;break;
				case 5: amount[(prod - 1)] += (Math.round(((6.87 * qty)*100.0)))/100.0;break;
				default: accessLib.sayOutput("Invalid product number!");break;
			}
		}
		for (x = 0; x<4; x++) {
			message += product + amount[x] + "\n\n";
		}
		accessLib.sayOutput(message);
	}
}
