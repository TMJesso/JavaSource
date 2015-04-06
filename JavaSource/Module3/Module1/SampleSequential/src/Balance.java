/*
 * Name: Theral Jessop
 * Course: INFO 211
 * Date: January 16, 2015
 * Program Description:
 * 
 * Write a program to request the principal p and the interest rate r as input, and compute
 * the balance after 10 years.
 * 
 * When p dollars are deposited in a savings account at interest rate r compounded annually,
 * the balance after n years can be computer using the following formula:
 * balance = p * (1 + r) ^ n
 * 
 * 
 */

// import necessary packages in order to use
// classe(s): JOptionPane
import javax.swing.*;

public class Balance {

	public static void main(String[] args) {
		// set variables
		double p, r, n, balance;
		// get user input
		// ask the user for principal
		p = Double.parseDouble(JOptionPane.showInputDialog("What is the Principal?"));
		// ask the user for interest rate
		r = (Double.parseDouble(JOptionPane.showInputDialog("What is the interest rate? eg. 12.5")))/100;
		// ask user for number of years
		n = Double.parseDouble(JOptionPane.showInputDialog("How many years will it be compounded?"));
		balance = (Math.floor((p * Math.pow((1+r),n))*100))/100;
		// show the user the results
		JOptionPane.showMessageDialog(null, "The Balacnce after "+n+" years is $"+balance);
		
	}

}
