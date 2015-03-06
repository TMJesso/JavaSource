package myPracticePackage;
import javax.swing.*;

import myLib.MyLibrary;
public class ParkingGarage {

	public static void main(String[] args) {
		MyLibrary getNumber = new myLib.MyLibrary();
		double num1 = 0.0, amount = 0.0;
		boolean loop = true;
		while (loop) {
			num1 = getNumber.getDouble("How many hours were you in the Parking Garage?");	
			if (num1==0.0) {
				JOptionPane.showMessageDialog(null, "Zero hours are not allowed!");
				continue;
			} else if (num1<0) {
				JOptionPane.showMessageDialog(null, "Negative numbers cannot callculate to positive amounts");
				continue;
			} else if (num1<3.0) {
				amount = 2.0;
			} else {
				amount = (Math.floor(((0.5 + 0.5 * num1)*100)))/100;
			}
			loop = false;
		}
		JOptionPane.showMessageDialog(null, "Your parging garage fee is : $" + amount);
		
	}

}
