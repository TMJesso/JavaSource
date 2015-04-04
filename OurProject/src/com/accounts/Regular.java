package com.accounts;

import com.customer.Customer;

public class Regular extends Account {
	protected double regularInterestRate;
	protected double regularFixedCharge;
	
	public Regular(String accountNumber, double balance, Customer customer) {
		super(accountNumber, balance, customer);
		this.regularInterestRate = 6.0;
		this.regularFixedCharge = 10.0;
	}
	
	// get
	
	public String getRegularInterestRate() {
		return this.regularInterestRate + "%";
	}
	
	public String getRegularFixedCharge() {
		return "$" + this.regularFixedCharge;
	}
	
	
	// set
	
	protected String setRegularInterestRate(double regularInterestRate) {
		String output = "";
		if (regularInterestRate > 0 && regularInterestRate < 1) {
			regularInterestRate *= 100;
		}
		if (regularInterestRate < 0) {
			return "Invalid interest rate! Unsuccessfully changed!";
		}
		output += "Successfully change interest rate from " + regularInterestRate + "%";
		this.regularInterestRate = regularInterestRate;
		output += " to " + this.regularInterestRate + "%";
		return output;
	}
	
	
	protected String setRegularFixedCharge(double regularFixedCharge) {
		String output = "";
		if (regularFixedCharge < 0) {
			regularFixedCharge = 10;
			output += "\nInvalid fixed charge! Set to default ($10.00)";
			this.regularFixedCharge = 10.00;
			return output;
		}
		output += "\nSuccessfully changed fixed charge from $" + this.regularFixedCharge;
		this.regularFixedCharge = regularFixedCharge;
		output += "\nto $" + regularFixedCharge;
		return output;
	}
	
	
	
	// eof calculations
	public String eomCalculations() {
		String output = "";
		
		
		
		return output;
	}

	@Override
	public String deposit(double amount) {
		
		
		
		return null;
	}

	@Override
	public String withdrawal(double amount) {
		
		
		
		return null;
	}

	
	public String toString() {
		String output = "";
		
		
		
		
		return output;
	}
}
