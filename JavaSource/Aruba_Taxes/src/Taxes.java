import javax.swing.JOptionPane;

/*
 * Name: Theral Jessop
 * Class: INFO I 101
 * Date: March 3, 2014
 * 
 * Description: Aruba taxes formula:
 * 
 * Income <= 10,000 pay 2%
 * 
 * Income > 10,000 but less than 25,000 pay 2% on first 10,000 and 3% on rest
 * 
 * Income >= 25,000 pay 3%
 * 
 */
public class Taxes {

	public static void main(String[] args) {
		// Declare variables
		
		float income = 0, calculate = 0;
		double taxes = 0;
		
		// Get input
		
		income = Float.parseFloat(JOptionPane.showInputDialog ("Enter your Income"));
		
		// Processing
		if (income <= 10000) {
			taxes = income * .02;
			
		}
		if (income > 10000) {
			if (income < 25000) {
				calculate = income - 10000;
					if (calculate > 0) {
						taxes = (10000 * .02) + (calculate * .03);
					} else {
						taxes = income * .02;
					}
					
			}
		}
		if (income >= 25000) {
			taxes = income * .03;
		
		}
		
		// Display the output
		
		JOptionPane.showMessageDialog(null, "Your taxes are " + taxes);
		
		
		

	}

}
