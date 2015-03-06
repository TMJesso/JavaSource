/* 
 * Name: Theral Jessop
 * Course: INFO 211
 * Date: January 22, 2015
 * Description:
 * program that asks the user to enter the income as input using an input dialog. Your 
 * program then determines and displays using a Message Dialog the amount of taxes that
 * user is supposed to pay for that year.
 * 
 * The taxes in Aruba are based on annual income with the following formula.
 * 
 * For incomes of 10,000 guilders or less, the taxes = income * .02.
 * For incomes more than 10,000 but less than 25,000, citizens pay 2% on the first 10,000 and 3% on the rest.
 * For incomes above $25,000 , citizens pay 3%
 * 
 * variables:
 * income			(double)
 * taxes			(double)
 * notNumber		(boolean)
 * 
 * 
 */ 

// import necessary packages in order to use
package mySamplePackage;

// import for JOptionPane class
import javax.swing.*;

public class ArubaTaxes {

	public static void main(String[] args) {
		// declare variables for use
		double income=0.0, taxes=0.0;
		boolean notNumber=true;
		
		while (notNumber) {
			try
			{
				income=Double.parseDouble(JOptionPane.showInputDialog("What is your annual income?"));
				notNumber=false;
			}
			catch (NumberFormatException e)
			{
				JOptionPane.showMessageDialog(null, "Invalid Input!");
			}
			if (income<=0) {
				JOptionPane.showMessageDialog(null, "Invalid Input!");
				notNumber=false;
			}
		}
		if (income<=10000) {
			taxes=income*.02;
		} else if (income>10000) {
			if (income<=25000) {
				taxes=((10000)*.02)+((income-10000)*.03);
			} else {
				taxes=income*.03;
			}
		} 
		JOptionPane.showMessageDialog(null, "You owe $"+taxes+" guilders in taxes!");
	}
}
