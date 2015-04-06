package myPracticePackage;
import javax.swing.*;
public class MaxNumber {
	public static void main(String[] args) {
		// declare non-static (object) methods name
		MyNumberMethods askNumber = new MyNumberMethods();
		// declare variables
		String input = "";
		boolean loop = true;
		// loop until user asks to exit
		while (loop) {
			// get input
			input = JOptionPane.showInputDialog("Enter three digit integer or * to exit:");
			// is the user exiting?
			if (input.equals("*")) {
				loop = false;
				continue;
			}
			// how many digits were entered?
			switch (input.length()) {
				case 1: JOptionPane.showMessageDialog(null, "I cannot determin the max and min on a single digit number!");break;
				case 2: JOptionPane.showMessageDialog(null, "The Maximum number is: "+askNumber.findMax(input.charAt(0), input.charAt(1)));JOptionPane.showMessageDialog(null, "THe Minimum number is: "+askNumber.findMin(input.charAt(0), input.charAt(1)));break;
				case 3: JOptionPane.showMessageDialog(null, "The Maximum number is: "+askNumber.findMax(input.charAt(0), input.charAt(1), input.charAt(2)));JOptionPane.showMessageDialog(null, "THe Minimum number is: "+askNumber.findMin(input.charAt(0), input.charAt(1), input.charAt(2)));break;
				default: JOptionPane.showMessageDialog(null, "I cannot determine the max and min on a 4 digit or greater number, yet");break;
			}
		}
	}
}
// my number class to check max and min of values
class MyNumberMethods {
	// find the int number of 2 values
	public char findMax(int num1, int num2) {
		int max = num1;
		if (max < num2) {
			max = num2;
		}
		return (char) max;
	}
	// find the int number of 3 values
	public char findMax(int num1, int num2, int num3) {
		return (char) findMax(findMax(num1, num2), num3);
	}
	// find the float number of 2 values
	public char findMax(float num1, float num2) {
		float max = num1;
		if (max < num2) {
			max=num2;
		}
		return (char) max;
	}
	// find the max float number of 3 values
	public char findMax(float num1, float num2, float num3) {
		return (char) findMax(findMax(num1, num2), num3);
	}
	// find the min int number of 2 values
	public char findMin(int num1, int num2) {
		int min = num1;
		if (min > num2) {
			min = num2;
		}
		return (char) min;
	}
	// find the min int number of 3 values
	public char findMin(int num1, int num2, int num3) {
		return (char) findMin(findMin(num1, num2), num3);
	}
	// find the min float number of 2 values
	public char findMin(float num1, float num2) {
		float min = num1;
		if (min > num2) {
			min = num2;
		}
		return (char) min;
	}
	// find the min float numbers of 3 values
	public char findMin(float num1, float num2, float num3) {
		return (char) findMin(findMin(num1, num2), num3);
	}
	
}