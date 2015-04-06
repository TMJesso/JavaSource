package examLib;

import java.util.Random;

import javax.swing.*;

public class MyExamLib {
	private Random randGen = new Random();

	// display custom message to the user
	public void sayOutput(String message) {
		JOptionPane.showMessageDialog(null, message);
	}
	
	// display custom message using JTextArea 
	public void sayOutput(JTextArea outputArea) {
		JOptionPane.showMessageDialog(null, outputArea);
	}
	
	// generates a random number based upon the criteria that the user specifies by digits
	// makes the random number generator very portable between this and other methods
	public int genRandomNumber(int digits) {
		boolean chkExit = true;
		int isValueOk = randGen.nextInt(digits+1);
		while (chkExit) {
			if (isValueOk == 0 ) {
				isValueOk = randGen.nextInt(digits+1);
			} else {
				chkExit = false;
			}
		}
		return isValueOk;
	}

	// process and display 20 random numbers
	public void processNumber() {
		int total = 0, num = 0;
		for (int x = 0; x <=19; x++) {
			num = genRandomNumber(100);
			System.out.println("Random number " + (x + 1) + " is " + num);
			total+=num;
		}
		System.out.println("Numbers total " + total);
	}
	
	// initialize array and return it back to the calling method
	public double[] initializeArray(double[] inArray) {
		double initValue = 0.25;
		for (int x = 0; x<=5; x++) {
			inArray[x] = initValue;
			initValue +=.25;
		}
		return inArray;
	}
	
	// finds the maximum number in the array
	public double arrayMaximum(double[] inArray) {
		int x = 0;
		double max = inArray[x];
		for (int n = 1; n<inArray.length; n++) {
			if (max < inArray[n]) {
				max = inArray[n];
				x = n;
			}
		}
		return inArray[x];
	}
	
	// calculate the sum of the array elements
	public double arrayTotal(double[] inArray) {
		double total = 0.0;
		for (int x = 0; x < inArray.length; x++) {
			total += inArray[x];
		}
		return total;
	}
}
