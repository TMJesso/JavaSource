package com.accounts;

import java.util.Scanner;

import com.customer.Customer;

public class Gold extends Account {
	protected double interestRate = 5.0;
	protected double interestAmount;
	
	public Gold(String accountNumber, double balance, Customer customer) {
		super(accountNumber, balance, customer);
		this.interestAmount = 0.0;
	}
	
	
	// get
	
	public String getInterestRate() {
		return this.interestRate + "%";
	}
	
	public String getInterestAmount() {
		return "$" + this.interestAmount;
	}
	
	// set
	
	protected String setInterestRate(double interestRate) {
		String output = "";
		if (interestRate > 0 && interestRate < 1) {
			interestRate *= 100;
		}
		if (interestRate < 0) {
			return "Invalid interest rate! Unsuccessfully changed!";
		}
		output += "Successfully change interest rate from " + interestRate + "%";
		this.interestRate = interestRate;
		output += " to " + this.interestRate + "%";
		return output;
	}

	// end of month methods
	@SuppressWarnings("resource")
	public String eomCalculations() {
		// has the operator ran the reports
		Scanner input = new Scanner(System.in);
		System.out.println("Performing EOM calculations will reset all data.\nIf you have not run your EOM reports, press N and run reports\nbefore prcedding\n\nContinue? (Y or N)");
		String yn = input.nextLine();
		if (yn.equalsIgnoreCase("n")) {
			return "Run Reports First!";
		}
		
		// calculate fees where applicable
		String output = "";
		numberOfTransactions++;
		this.balance += this.interestAmount;
		output = "\nNumber of transactions: " + this.numberOfTransactions;
		
		// reset monthly transactions
		this.numberOfTransactions = 0;
		output += "\n\nEnd of Month Successful!";
		return output;
	}

	
	public String deposit(double amount) {
		String output = "";
		if (amount < 0) {
			output = "Invalid amount specified! Transaction was NOT successful!";
			return output;
		}
		numberOfTransactions++;
		this.balance += amount;

		output += "\nDeposit Amount: " + amount;
		output += "\n----------------------------------\n";
		output += "New Balance: " + this.balance;
		return output;
	}


	public String withdrawal(double amount) {
		String output = "";
		if (amount < 0) {
			output = "Invalid amount specified! Transaction was NOT successful!";
			return output;
		}
		numberOfTransactions++;
		this.balance -= amount;
		
		output += "\nWithdrawal Amount: " + amount;
		output += "\n----------------------------------\n";
		output += "New Balance: " + this.balance;
		return output;
	}
	
	public String toString() {
		String output = "Customer: " + this.customer;
		output += "\nAccount type: Checking";
		output += "\nBalance: $" + this.balance;
		output += "\nInterest Amount: $" + this.interestAmount;
		output += "\nTransaction\nNumber\t\t\tDescription\t\t\t\t\tAmount";
		return output;
	}


}
