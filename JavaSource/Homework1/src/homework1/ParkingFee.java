/* 
 * IUK
 * Professor: Dr. Awny Alnusair
 *  Name: Theral Jessop
 * Course: INFO 211
 * Date: January 23, 2015
 * Homework 1:
 * Problem 3:
 * Description:
 * A parking garage charges $2.0 minimum fee to park for up to three hours. The garage charges
 * an additional $0.50 per hour for each hour or part thereof in excess of three hours. 
 * The maximum charge for any given 24-hour period is $10.00.
 * Assume that no car parks for longer than 24 hours at a time. Write a program that calculates
 * and displays the parking charges for each customer who parked in the garage yesterday. 
 * 
 * For example, if the user inputs 12 hours, your program displays the total charge of $6.5
 * 
 * formula:
 * .5(x-3)+2
 * .5x-1.5+2
 * .5x+.5
 * 
 * 
 * variables:
 * hours				(double)
 * fee					(double)
 * 
 * entryCheck			(boolean)
 */ 

// import necessary packages in order to use
package homework1;

// import JOptionPane class
import javax.swing.*;

public class ParkingFee {

	public static void main(String[] args) {
		// declare variables
		double hours=0.0, fee=0.0;
		boolean entryCheck=true;
		
		// get hours parked in garage
		// validate entry
		while (entryCheck) {
			try
			{
				hours=Double.parseDouble(JOptionPane.showInputDialog("Enter hours vehicle was parked in the garage:\n(0 - 24)\n\n(assuming vehicle was there 24 hours or less)"));
			}
			catch (NumberFormatException|NullPointerException e)
			{
				JOptionPane.showMessageDialog(null, "Invalid Entry");
				continue;
			}
			// validate hours<0 or hours>24
			if (hours<0 || hours>24) {
				// error message if hours outside of boundaries
				JOptionPane.showMessageDialog(null, "Invalid hours entered!\n\nHours cannot be less than 0 or greater than 24");
			} else {
				// exit loop
				entryCheck=false;
			}
		}
		// calculate fee
		// is hours <=3
		if (hours<=3) {
			// no charge if hours is 0
			if (hours==0) {
				fee=0;
			} else { // default fee is $2 for 3 or less hours unless 0 was used
				fee=2.0;
			}
		} else{ // more than 3 hours was entered
					fee = (Math.floor(((.5*hours+.5)*100)))/100;
		}
		// fee greater than maximum allowed ($10)
		if (fee>10) {
			fee=10;
		}
		
		// show results to user
		// show how many hours vehicle was in garage
		System.out.println("Parking in the garage for "+hours+" hours");
		// show how much the fee is for the hours vehicle was in garage
		System.out.println("The parking fee is: $"+fee);
		// thank you for using the garage
		System.out.println("Thank you for using IUK Parking Garage!");
	}

}
