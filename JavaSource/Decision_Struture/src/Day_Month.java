import javax.swing.JOptionPane;

/*
 * Author: Theral Jessop
 * Date: March 4, 2014
 * Description:
 * Write a program that gets a number between 1 and 31 as input.  This number represents a day of the month.
 * Depending on the number entered, your program should display messages according to the following table:
 * 
 * Day        Message:
 * 1 - 10     It is Day <day entered>. It is early in the month.
 * 
 * 11 - 20    It is Day <day entered>. It is the middle of the month.
 * 
 * 21 - 31    It is Day <day entered>. It is the end of the month.
 * 
 * For example:
 * If the user enters 30, your program should display "It is Day 30. It is the end of the month."
 * 
 * Variables:
 * day
 * 
 * 
 */
public class Day_Month {

	public static void main(String[] args) {
		// declare variables
		
		int day;
		
		// Get the day from the user
		
		day = Integer.parseInt(JOptionPane.showInputDialog("What day is it?"));
		
		// Processing: is it between 1 and 10 or 11 and 20 or 21 and 31
		
		if (day < 1 || day > 31) {
			JOptionPane.showMessageDialog(null, "You have entered an invalid day.");
		}
		if (day >= 1) {
			if (day <=10) {
				JOptionPane.showMessageDialog(null, "It is Day " + day + ". It is early in the month.");
			}
		}
		if (day >= 11) {
			if (day <= 20) {
				JOptionPane.showMessageDialog(null, "It is Day "+ day + ". It is the middle of the month.");				
			}
		}
		if (day >=21) {
			if (day <= 31) {
				JOptionPane.showMessageDialog(null, "It is Day " + day + ". It is the end of the month.");
			}
		}

	}

}
