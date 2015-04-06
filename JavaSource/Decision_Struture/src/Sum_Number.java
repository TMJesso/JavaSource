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
 * m_value     ** value from user
 * allNumbers  ** Running total
 * evenNumbers ** Total of all even numbers
 * oddNumbers  ** Total of all odd numbers
 * m_conTinue  ** to determine if the first number entered was an "Exit" number and if it was do not display the results
 * 
 * 
 */
public class Sum_Number {

	public static void main(String[] args) {
		// define variables
		int allNumbers = 0;
		int evenNumbers = 0;
		int oddNumbers = 0;
		int m_value = 0;
		int m_conTinue = 0;
				
		// get numbers from user until user enters 0 or less and add it up and determine if it is even or 
		// odd and add it to the even or odd variables
		
		for ( int m_Counter = 1; m_Counter  > 0;) { // m_Counter is not incremented  so the user can exit using 0 or less
			m_value = Integer.parseInt(JOptionPane.showInputDialog("Enter any number.  Enter 0 or a negative number to exit"));
			// check to see if the user is exiting
			if (m_value == 0 || m_value < 0) {
				m_Counter = 0;
			} else {
				// user not exiting so add the number and determine if it is even or odd and add to appropriate variable
				allNumbers = allNumbers + m_value;
				// since a number was entered change this to 1 to display the results
				m_conTinue = 1;
				if (m_value%2 == 0) {
					// Even number
					evenNumbers = evenNumbers + m_value;
				} else {
					// odd number
					oddNumbers = oddNumbers + m_value;
				}		
			}
		}
		// Display the results only if a number was entered besides 0 the first time
		if (m_conTinue == 1) {
			JOptionPane.showMessageDialog(null, "The total of all the numbers is "+allNumbers+". The total of the even numbers is "+evenNumbers+". The total for the odd numbers is "+oddNumbers);
		}
	

	}

}
