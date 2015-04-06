package myPracticePackage;
import javax.swing.*;

import myLib.MyLibrary;
public class ArubaTaxes {

	public static void main(String[] args) {
		MyLibrary getIncome = new myLib.MyLibrary();
		double income = 0.0, taxes = 0.0;
		boolean loop=true;
		while (loop) {
			income = getIncome.getDouble("What was your $$$ annual income?");
			if (income == 0) {
				JOptionPane.showMessageDialog(null, "Invalid Income entry!\nMust be greater than 0");
				continue;
			} else if (income < 0) {
				JOptionPane.showMessageDialog(null, "Invalid Income entry!\nCannot be a Negative Number");
				continue;
			} else if (income <= 10000.0) {
				taxes = (Math.floor(((income * .02)*100)))/100;
			} else if (income > 10000.0 && income < 25000) {
				taxes = (Math.floor((((10000.0 * .02) + ((income - 10000.0)*.03))*100)))/100;
			} else {
				taxes = (Math.floor(((income * .03)*100)))/100;
			}
			loop = false;
		}
		JOptionPane.showMessageDialog(null, "You owe $" + taxes + " for the income of $" +income);
	}

}
