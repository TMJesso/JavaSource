package com.accounts;

import java.util.*;

import com.customer.Customer;

public class Regular extends Account {
	protected double regularInterestRate;
	protected double regularFixedCharge;
	protected double regularInterestAmount;
	protected ArrayList<String> regular;
	public Regular(String accountNumber, double accountBalance, Customer customer) {
		super(accountNumber, accountBalance, customer);
		this.regularFixedCharge = 10.0;
		this.regularInterestRate = 6.0;
		this.regularInterestAmount = 0.0;
	}
	
	// get
	
	public String getRegularInterestRate() {
		return this.regularInterestRate + "%";
	}
	
	public String getRegularFixedCharge() {
		return "$" + this.regularFixedCharge;
	}

	// set
	
	protected String setRegularInterestRate(double rate) {
		String output = "";
		if (rate > 0 && rate < 1) {
			rate *= 100.0;
		} else if (rate < 0) {
			output += "Invalid interest rate! Setting to the default of 6.0%";
			rate = 6.0;
			return output;
		}
		output += "Interest rate changeed successfully from " + this.regularInterestRate + "%\n";
		this.regularInterestRate = rate;
		output += "to " + rate + "%";
		return output;
	}
	
	protected String setRegularFixedCharge(double charge) {
		String output = "";
		if (charge < 0) {
			output += "Invalid interest charge! Setting to the default value of $10.00";
			charge = 10.0;
			return output;
		}
		output += "Interest charge successfully changed from $" + this.regularFixedCharge;
		this.regularFixedCharge = charge;
		output += "\nto $" + charge;
		return output;
	}
	
	// eom calcualtions
	
	@Override
	public String eomCalculations() {
		String output = "";
		if( this.accountBalance <= 0) {
			output = "Interest not calculated due to lack of funds. ";
		} else {
			// calculate interest for 1 year compounded monthly7
			// I = P x (1 + r/n)^(n x t)
			// P = accountBalance : Principle
			// r = rate : interest rate (in decimal)
			// t = year : number of years, months, days, etc in this case it is years
			// n = numTimes : how often : months, quarters, days etc. in this case it is one month
			
			double rate = this.regularInterestRate / 100;
			double years = 1;
			double numTimes = 1/12.0;
			double interest = (this.accountBalance * Math.pow(1 + (rate / numTimes), (numTimes * years))) - this.accountBalance - this.regularFixedCharge;
			this.regularInterestAmount += ((Math.floor(interest*100.0))/100.0) - this.regularFixedCharge;
			this.accountBalance += ((Math.floor(interest*100.0))/100.0);
			this.addTransaction("Regular EOM Interest earned", interest);
			output += "Interest calculated and applied! End of Month calculations successfully completed!";
		}
		return output;
	}

	
	// deposit and withdrawal
	
	@Override
	public String makeDeposit(double amount) {
		String output = "";
		if (amount <= 0) {
			output += "Invalid deposit amount! Deposit was NOT succeddfully applied";
			return output;
		}
		output += "Deposit successfully applied!";
		this.accountBalance += amount;
		this.addTransaction("Regular Deposit", amount);
		return output;
	}

	@Override
	public String makeWithdrawal(double amount) {
		String output = "";
		if (amount <= 0) {
			output += "Invalid withdrawal amount!\nWithdrawal was unsuccessful!";
		} else {
			output += "Withdrawal was successfully applied to the account!";
			this.accountBalance -= amount;
			this.addTransaction("Regular Withdrawal", amount);
		}
		return output;
	}
	
	protected void addTransaction(String description, double amount) {
		this.regular.add(generateDate() + "\t" + description + "\t" + amount + "\t" + generateUniqueTransNumber());
	}

	private int generateUniqueTransNumber() {
		return (int) Calendar.getInstance().getTimeInMillis();
	}
	
	private java.util.Date generateDate() {
		return (new java.util.Date());
	}

	// display information
	
	public String toString() {
		String output = "\n=============================================\n";
		output += "\nCustomer Info";
		output += "\n" + this.customer;
		output += "\n\tRegular Account Info";
		output += "\n\t" + this.accountNumber;
		output += "\n\tInterest earned ytd: $" + this.regularInterestAmount;
		output += "\n\tBalance: $" + this.accountBalance + "\n";
		output += "\t\tTransactions\n";
		for (String e: regular) {
			output += "\t\t" + e + "\n";
		}
		output += "\n=============================================\n";
		return output;
	}

}
