import javax.swing.JOptionPane;

/*
 * Author: Theral Jessop
 * Date: March 4, 2014
 * Description:
 * Create a program that uses a loop to keep asking the user for positive numbers.
 * Your program should provide a way of displaying the sum of these numbers when the user is finished.
 * Use a technique to end the user input. 
 * 
 * For example, you can ask the user to enter a 0 or a negative integer to end the input.
 * 
 * Display the sum of all numbers
 * Display the sum of only even numbers
 * Display the sum of only odd numbers

 * Variables:
 * m_value
 * allNumbers
 * evenNumbers
 * oddNumbers
 * m_Counter
 * 
 * 
 * 
 */
public class Sum_Numbers {

	public static void main(String[] args) {
		// define variables
		int allNumbers;
		int evenNumbers;
		int oddNumbers;
		int m_value;
		
		// get numbers from user until user enters 0
		for ( int m_Counter = 1; m_Counter  > 0;) {
			m_value = Integer.parseInt(JOptionPane.showInputDialog("Enter a number between 1 and 100.  Enter 0 to exit"));
			if (m_value == 0) {
				m_Counter = 0;
			} else {
				
			}
		}
			

	}

}
