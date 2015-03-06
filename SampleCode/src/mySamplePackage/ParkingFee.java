/* 
 * Name: Theral Jessop
 * Course: INFO 211
 * Date: January 22, 2015
 * Description:
 * A parking garage charges $2.0 minimum fee to park for up to three hours. The garage charges an
 * additional $0.50 per hour for each hour or part thereof in excess of three hours. The maximum
 * charge for any given 24-hour period is $10.00.
 * Assume that no car parks for longer than 24 hours at a time. Write a program that calculates and
 * displays the parking charges for each customer who parked in the garage yesterday.
 * 
 * For example, if the user inputs 12 hours, your program displays the total charge of $6.5
 * 
 * Algebra
 * amount = .5(x-3)+2
 * amount = .5x-1.5+2
 * amount = .5x +.5
 * maximum is $10.00
 * 
 * minimum is $2.00 as long as the hours are greater than 0 at garage
 * 
 * 
 * variables:
 * parkingFee			(double)
 * hoursParked			(double)
 * notNumber			(boolean)

 */ 

// import necessary packages in order to use
package mySamplePackage;

// import for JOptionPane class
import javax.swing.*;

public class ParkingFee {

	public static void main(String[] args) {
		// declare variables for use
		// declare fee variable and set it
		double parkingFee=0.00;
		boolean notNumber=true;
		// declare hours variable and set it
		double hoursParked=0.0;
		
		while (notNumber) {
			try
			{
				hoursParked=Float.parseFloat(JOptionPane.showInputDialog("How many hours was your vehicle in the garage?\n\nCannot be 0 or a negative number"));
				notNumber=false;
			}
			catch (NumberFormatException e)
			{
				JOptionPane.showMessageDialog(null, "Invalid Entry!");
			}
			if (hoursParked<0) {
				JOptionPane.showMessageDialog(null, "Invalid Entry!");
				notNumber=true;
			}
		}
		if (hoursParked<=3) {
			parkingFee=2.0;
			
		} else {
			parkingFee=(.5*hoursParked+.5);
		}
		if (parkingFee>10) {
			parkingFee=10;
		}
		JOptionPane.showMessageDialog(null, hoursParked+" hours in the garage costs "+parkingFee);
		
		
		
	}

}
