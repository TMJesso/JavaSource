/* 
 * Name: Theral Jessop
 * Course: INFO 211
 * Date: January 21, 2015
 * Description:
 * Write a program to that gets a number between 1 and 31 as input. This number represents a day of
 * the month. Depending on the number entered, your program should display messages according
 * to the following table:
 * 
 * Day:
 * 1-10		It is Day <day entered>
 *			It is early in the month
 * 
 * 11-20	It is Day <day entered >
 * 			It is middle of the month
 * 
 * 21-31 	It is Day <day entered >
 * 			It is the end of the month
 * 
 * For example if it the user enters 30, your program should display “It is Day 30. It is the end of the
 * month”.
 * 
 * variable:
 * day			(int)
 * notNumber	(boolean)
 * message		(String)
 */ 

// import necessary packages in order to use
package mySamplePackage;

// import for JOptionPane class
import javax.swing.*;

public class DayMessage {

	public static void main(String[] args) {
		// declare day variable
		int day=0;
		// declare loop variable
		boolean notNumber=true;
		// loop as long as no number was entered
		// then validate number entered
		while (notNumber) {
			try
			{
				// get user input
				day=Integer.parseInt(JOptionPane.showInputDialog("Please enter a day (1 - 31)"));
				// set value to exit loop
				notNumber=false;
			}
			catch (NumberFormatException e)
			{
				// display error message
				JOptionPane.showMessageDialog(null, "Invalid day entered");
			}
			// check to see if the user entered a day greater than 31 or less than 1
			if (!notNumber) {
				if (day>31 || day<1) {
			
				// display error message
				JOptionPane.showMessageDialog(null, "You have entered an invalid day! (1 - 31 ONLY!)");
				// set value to loop
				notNumber=true;
				}
			}
		}
		if (day>=1) {
			if (day<=10) {
				JOptionPane.showMessageDialog(null, "It is Day "+day+"\n  It is early in the month");
			}
		}
		if (day>=11) {
			if (day<=20) {
				JOptionPane.showMessageDialog(null, "It is Day "+day+"\n  It is middle of the month");
			}
		}
		if (day>=21) {
			if (day<=31) {
				JOptionPane.showMessageDialog(null, "It is Day "+day+"\n  It is the end of the month");
			}
		}
	}

}
