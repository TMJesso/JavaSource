import javax.swing.JOptionPane;

/*
 * Author: Theral Jessop
 * Date: March 4, 2014
 * Description:
 * A parking garage charges $2.00 minimum fee to park for up to three hours.
 * The garage charges an additional $0.50 per hour for each hour or part thereof in excess of three hours.
 * The maximum charge for any given 24-hour period is $10.00.
 * 
 * Assume that no car parks for longer than 24 hours at a time.
 * Write a program that calculates and displays the parking charges for each customer who parked in the garage yesterday.
 * 
 * For example:
 * If the user inputs 12 hours, your program displays the total charges of $6.50.
 * 
 * 
 * Algebra
 * amount = .5(x-3)+2
 * amount = .5x +.5
 * maximum is $10.00
 * 
 * 
 * variables:
 * parkingFee
 * hoursParked
 * conTinue
 * decImal
 * 
 */
public class ParkingFee {

	public static void main(String[] args) {
		// declare variables
		double decImal=0.00;
		float parkingFee = 0, hoursParked = 0;
		int conTinue = 0;
		
		// Get hours parked from user
		
		hoursParked = Float.parseFloat(JOptionPane.showInputDialog("Enter the number of hours you were parked in the garage..."));
		
		// processing: determine fee according to how many hours user was parked in garage
		// if the hours parked are greater than 24 and less than or equal to 0 it will display a "Invalid entry" message
		// and prevent the program from displaying any other information by using the conTinue variable
		
		if (hoursParked > 24 || hoursParked <= 0) {
			JOptionPane.showMessageDialog(null, "Invalid entry");
			conTinue = 0;
		} else {
			if (hoursParked > 3) {
	
			parkingFee = (float) (.5 * hoursParked+.5);
			decImal= parkingFee- Math.round(parkingFee);
			
			//check to see if decImal is a negative value
			if (decImal < 0) {
				// reverse the order of mathematical equation if negative
				decImal = Math.round(parkingFee) - parkingFee;
			}
			decImal=decImal*100;
			decImal=Math.round(decImal);
			decImal=decImal/100;
			parkingFee = (float) (Math.round(parkingFee) + decImal);
			
			conTinue = 1;
			} else {
				parkingFee = (float) 2.00;
				conTinue = 1;
				
			}
		}
		if (parkingFee > 10) {
			parkingFee = (float) 10.00;
		}
		
		// display parking fee to user only if the variable conTinue is set as 1 which means that the hours are set appropriately
		if (conTinue == 1) { 
			JOptionPane.showMessageDialog(null, "You parked for "+hoursParked+" hours today. Your parking fee for today is $"+parkingFee);
			// debugging only
			// JOptionPane.showMessageDialog(null, "You parked for "+hoursParked+" hours today. Your parking fee for today is $"+parkingFee + "    "+decImal);
		}
	}
	

}
