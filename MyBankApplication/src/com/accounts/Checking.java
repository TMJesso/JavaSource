package com.accounts;

import java.util.*;

import com.customer.Customer;

public class Checking extends Account {
	protected double checkingTransactionFee;
	protected double checkingTransactionFeeAmount;
	protected ArrayList<String> checking;
	
	public Checking(String accountNumber, double accountBalance, Customer customer) {
		super(accountNumber, accountBalance, customer);
		this.checkingTransactionFee = 3.0;
		this.checkingTransactionFeeAmount = 0.0;
		this.checking = new ArrayList<>();
	}
	
	public String getCheckingTransactionFee() {
		return "$" + this.checkingTransactionFee;
	}
	
	public String getCheckingTransactionFeeAmount() {
		return "$" + this.checkingTransactionFeeAmount;
	}
	
	protected String setCheckingTransactionFee(double fee) {
		String output = "";
		if (fee < 0) {
			fee = 3.0;
			output += "Invalid fee entered! Changing to default of $3.00\n";
		}
		output += "Checking transaction fee $ " + this.checkingTransactionFee;
		output += "\nchanged to $" + fee;
		return output;
	}
	
	public String eomCalculations() {
		String output = "";
		this.numberOfTransactions++;
		double verifyFeeAmount = (this.numberOfTransactions -2) * this.checkingTransactionFee;
		if (this.checkingTransactionFeeAmount == verifyFeeAmount) {
			this.accountBalance -= this.checkingTransactionFeeAmount;
			this.addTransaction("Checking EOM Fees", this.checkingTransactionFeeAmount);
			output += "End Of Month transactions processed and successfully completed!";
			this.checkingTransactionFeeAmount = 0.0; // set the monthly Transaction Fee to 0
	} else {
			output += "\nError found calculating transaction fee amount!\n";
			output += "Halting calculations! Unable to finish EOM Calculations!";
		}
		return output;
	}
	
	public String makeDeposit(double amount) {
		String output = "";
		if (amount <= 0) {
			output += "Invalid deposit amount! Deposit was not applied to the account!";
		} else {
			this.numberOfTransactions++;
			if(this.numberOfTransactions > 2) {
				this.checkingTransactionFeeAmount += this.checkingTransactionFee;
			}
			this.accountBalance += amount;
			this.addTransaction("Checking Deposit", amount);
			output += "Deposit successfully applied to the account!";
		}
		return output;
	}
	
	public String makeWithdrawal(double amount) {
		String output = "";
		if (amount <= 0) {
			output += "Invalid withdrawal amount! Withdrawal was not applied to the account!";
			return output;
		} else if (amount < this.accountBalance) {
			amount = this.accountBalance;
			output += "Withdrawal reduced to available funds!\n";
		}
		this.numberOfTransactions++;
		if (this.numberOfTransactions > 2) {
			this.checkingTransactionFeeAmount += this.checkingTransactionFee;
		}
			output += "Withdrawal successfully applied to the account!";
		this.accountBalance -= amount;
		this.addTransaction("Checking Withdrawal", amount);
		return output;
	}
	
	protected void addTransaction(String description, double amount) {
		this.checking.add(generateDate() + "\t" + description + "\t" + amount + "\t" + generateUniqueTransNumber());
	}

	private int generateUniqueTransNumber() {
		return (int) Calendar.getInstance().getTimeInMillis();
	}
	
	private java.util.Date generateDate() {
		return (new java.util.Date());
	}

	
	public String toString() {
		String output = "\n=============================================\n";
		output += "\nCustomer Info";
		output += "\n" + this.customer;
		output += "\n\tChecking Account Info";
		output += "\n\t" + this.accountNumber;
		output += "\n\tBalance: $" + this.accountBalance + "\n";
		output += "\n\tTranaction Fees: $" + this.checkingTransactionFeeAmount;
		output += "\n\t\tTransactions\n";
		for (String e: checking) {
			output += "\t\t" + e + "\n";
		}
		output += "\n=============================================\n";
		return output;
	}
}
