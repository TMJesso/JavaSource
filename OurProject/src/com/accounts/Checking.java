package com.accounts;

import com.customer.Customer;

public class Checking extends Account {
	protected double transactionFee = 3.0;
	protected double transactionFeeAmount;

	
	public Checking(String accountNumber, double balance, Customer customer) {
		super(accountNumber, balance, customer);
		this.transactionFeeAmount = 0.00;
	}
	
	// get
	
	public double getTransactionFees() {
		return this.transactionFee;
	}
	
	public double getTransactionFeeAmount() {
		return this.transactionFeeAmount;
	}
	
	
	// set
	
	public String setTransactionFee(double transactionFee) {
		String output = "Fee changed from " + this.transactionFee;
		this.transactionFee = transactionFee;
		output += " to " + this.transactionFee;
		return output;
	}
	
	
	
	// end of month methods
	public String eomCalculations() {
		/*
		// has the operator ran the reports
		Scanner input = new Scanner(System.in);
		System.out.println("Performing EOM calculations will reset all data.\nIf you have not run your EOM reports, press N and run reports\nbefore prcedding\n\nContinue? (Y or N)");
		String yn = input.nextLine();
		if (yn.equalsIgnoreCase("n")) {
			return "Run Reports First!";
		}
		*/
		
		// calculate fees
		String output = "";
		numberOfTransactions++;
		this.transactionFeeAmount = (this.numberOfTransactions-2) * this.transactionFee;
		
		this.balance -= this.transactionFeeAmount;
		this.toString();
		// reset monthly transactions
		this.numberOfTransactions = 0;
		output = "\n\nEnd of Month Successful!";
		return output;
	}


	// required methods (deposit and withdrawal)

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
		if (this.balance < amount) {
			amount = this.balance;
		} else {
		}
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
		output += "\nTransaction Fee: $" + this.transactionFee;
		output += ". First 2 transactions per month are free";
		// this is for debugging only and must be removed before final version is distributed 
		// end of removal section
		output += "\nTransaction\nNumber\t\t\tDescription\t\t\t\t\tAmount";
		
		
		return output;
	}


}
