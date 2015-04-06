package com.accounts;

import com.customer.Customer;
import java.util.*;

public class Gold extends Account {
	protected double goldInterestAmount;
	protected double goldInterestRate;
	protected ArrayList<String> gold;
	
	public Gold(String accountNumber, double accountBalance, Customer customer) {
		super(accountNumber, accountBalance, customer);
		this.goldInterestAmount = 0.0;
		this.goldInterestRate = 5.0;
		this.gold = new ArrayList<>();
	}
	
	public String getGoldInterestAmount() {
		String output = "$" + this.goldInterestAmount;
		return output;
	}
	
	public String getGoldInterestRate() {
		String output = this.goldInterestRate + "%";
		return output;
	}
	
	protected String setGoldInterestRate(double rate) {
		String output = "";
		if (rate > 0 && rate < 1) {
			rate *= 100.0;
		} else if (rate < 0) {
			output += "Invalid interest rate! Setting to the default of 5.0%";
			rate = 5.0;
			return output;
		}
		output += "Interest rate changeed successfully from " + this.goldInterestRate + "%\n";
		this.goldInterestRate = rate;
		output += "to " + rate + "%";
		return output;
	}
	
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
			
			double rate = this.goldInterestRate / 100;
			double years = 1;
			double numTimes = 1/12.0;
			double interest = (this.accountBalance * Math.pow(1 + (rate / numTimes), (numTimes * years))) - this.accountBalance;
			this.goldInterestAmount += ((Math.floor(interest*100.0))/100.0);
			this.accountBalance += ((Math.floor(interest*100.0))/100.0);
			this.addTransaction("Gold EOM Interest Earned", interest);
			output += "Interest calculated and applied! End of Month calculations successfully completed!";
		}
		return output;
	}
	
	public String makeDeposit(double amount) {
		String output = "";
		if (amount <= 0) {
			output += "Invalid deposit amount!\nDeposit was unsuccessful!";
		} else {
			output += "Depost was successfully applied to account!";
			this.accountBalance += amount;
			this.addTransaction("Gold Deposit", amount);
		}
		return output;
	}
	
	public String makeWithdrawal(double amount) {
		String output = "";
		if (amount <= 0) {
			output += "Invalid withdrawal amount!\nWithdrawal was unsuccessful!";
		} else {
			output += "Withdrawal was successfully applied to the account!";
			this.accountBalance -= amount;
			this.addTransaction("Gold Withdrawal", amount);
		}
		return output;
	}
	
	protected void addTransaction(String description, double amount) {
		this.gold.add(generateDate() + "\t" + description + "\t" + amount + "\t" + generateUniqueTransNumber());
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
		output += "\n\tGold Account Info";
		output += "\n\t" + this.accountNumber;
		output += "\n\tInterest earned ytd: $" + this.goldInterestAmount;
		output += "\n\tBalance: $" + this.accountBalance + "\n";
		output += "\t\tTransactions\n";
		for (String e: gold) {
			output += "\t\t" + e + "\n";
		}
		output += "\n=============================================\n";
		return output;
	}
}
