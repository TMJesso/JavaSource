import javax.swing.JOptionPane;

/*
 * Name: Theral Jessop
 * Course: I 101
 * Date: 2/24/2014
 * Program Description:
 * The formula to calculate the balance after 10 years when the user inputs the principle and the interest rate
 * Interest Rate, compounded annually, n years using the following formula:
 * Balance = p *(1 + r)^n
 * 
 * 
 */
public class Principle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// (1) Declare variables
		
		double principle, rate, numYears, balance;
		
		// (2) Get Principle and Rate from user (Can also get years to improve usability)
		
		principle = Float.parseFloat(JOptionPane.showInputDialog("Enter the Principle"));

		rate = Float.parseFloat(JOptionPane.showInputDialog("Enter the Rate of Interest as a percent"));
		
		numYears = 10;
		
		// (3) Do the calculation and get the balance
		rate = rate/100;
		
		balance = principle * Math.pow(1 + rate,numYears);
		
		// (4) Display the output
		
		JOptionPane.showMessageDialog(null, "The Balance is " + balance);

				
//math.
	}

}
