import javax.swing.JOptionPane;

/*
 * Author: Theral Jessop
 * Date: March 4, 2014
 * Description:
 * Write a program that allows the user to enter three integer numbers.
 * The program should determine the maximum number and the minimum number.
 * Variables: num1, num2, num3, max, min
 * 
 * 
 */
public class Compare_Integer {

	public static void main(String[] args) {
		// declare variables
		int num1, num2, num3, max, min;
		
		// Get input from user
		num1 = Integer.parseInt(JOptionPane.showInputDialog("Enter first integer "));
		num2 = Integer.parseInt(JOptionPane.showInputDialog("Enter second integer "));
		num3 = Integer.parseInt(JOptionPane.showInputDialog("Enter thrid integer "));
		max = num1;
		min = num1;
		// Processing: Get max and min values
		if (max > num2) {
			max = num2;
		}
		if (max > num3) {
			max = num3;
		}
		
		if (min < num2) {
			min = num2;
		}
		if (min < num3) {
			min = num3;
		}
		
		
		// Display the results
		JOptionPane.showMessageDialog(null, "The maximum number is " + max + " And the minimum number is " + min);
		
		
	}

}