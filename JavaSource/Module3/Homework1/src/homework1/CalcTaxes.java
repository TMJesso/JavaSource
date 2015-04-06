/* 
 * IUK
 * Professor: Dr. Awny Alnusair
 *  Name: Theral Jessop
 * Course: INFO 211
 * Date: January 23, 2015
 * Homework 1:
 * Problem 4:
 * Description:
 * The taxes in Aruba are based on annual income with the following formula. 
 * •	For incomes of 10,000 guilders or less, the taxes = income * .02. 
 * •	For incomes more than 10,000 but less than 25,000, citizens pay 2% on the first 10,000 and 3% on the rest. 
 * •	For incomes above $25,000 , citizens pay 3%
 * 
 * Create a program that asks the user to enter the income as input using an input dialog. Your program then determines
 * and displays using a Message Dialog the amount of taxes that user is supposed to pay for that year.
 * 
 * variables:
 * taxes				(double)
 * income				(double)
 * 
 * entryCheck			(boolean)
 */ 

// import necessary packages in order to use
package homework1;

// import JOptionPane class
import javax.swing.*;

public class CalcTaxes {

	public static void main(String[] args) {
		// declare variables
		double taxes=0.0, income=0.0;
		boolean entryCheck=true;
		
		// validate input
		while(entryCheck) {
			try
			{
				income=Double.parseDouble(JOptionPane.showInputDialog("Enter annual income:"));
			}
			catch (NumberFormatException|NullPointerException e)
			{
				// invalid input detected
				JOptionPane.showMessageDialog(null, "Invalid Entry!");
				continue;
			}
			// input out of bounds of allowed entry
			if (income<0) {
				// error message for invalid entry
				JOptionPane.showMessageDialog(null, "Invalid annual income entered!\n\nCannot be less than 0!");
			} else {
				// exit loop
				entryCheck=false;
			}
		}
		if (income<=10000) {
			taxes=(Math.round((((income*.02))*100)))/100;
		} else	if (income<25000) {
				taxes=(Math.round((((10000*.02)+((income-10000)*.03))*100)))/100;
		} else {
			taxes=(Math.round((((income*.03))*100)))/100;
		}
		// display results to user
		JOptionPane.showMessageDialog(null, "The calculated annual taxes are: $"+taxes);
	}

}
