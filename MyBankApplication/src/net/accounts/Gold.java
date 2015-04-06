package net.accounts;

import net.UniqueFactory.BankUtilities;
import net.customer.Customer;

import java.util.*;

public class Gold extends Account {
	private double goldInterestAmount;
	private double goldInterestRate;
	private ArrayList<String> goldTrans;
	
	public Gold(String accountNumber, double accountBalance, Customer customer) {
		super(accountNumber, accountBalance, customer);
		this.goldInterestAmount = 0.0;
		this.goldInterestRate = 5.0;
		this.goldTrans = new ArrayList<>();
	}
	
	// get
	
	public double getGoldInterestAmount() {
		return this.goldInterestAmount;
	}
	
	public double getGoldInteterstRate() {
		return this.goldInterestRate;
	}
	
	public String getGoldTransaction() {
		String output = "";
		for (String e: goldTrans) {
			output += "\t\t" + e + "\n";
		}
		return output;
	}

	// set 
	
	public String setGoldInterestRate(double rate) {
		String output = "";
		if (rate < 0.0) {
			output += "Invalid rate entered! Reseting to default value of 5.0%\n";
			rate = 5.0; // set to default if negative
		} else if (rate > 0.0 && rate < 1) {
			rate *= 100; // convert from decimal to percent
		}
		output += "Successfully changed the Gold account interest rate from ";
		output += this.goldInterestRate + "% to " + rate + "%\n";
		this.goldInterestRate = rate;
		return output;
	}
	
	// Gold deposit and withdrawal
	
	public String makeDeposit(double amount) {
		String output = "";
		if (amount < 0.0) {
			output += "Invalid deposit amount! Gold depost was unsuccessful!";
			return output;
		}
		this.setAccountBalance(this.getAccountBalance() + amount);
		output += "Deposit was successful!";
		
		return output;
	}

	public String makeWithdrawal(double amount) {
		String output = "";
		if (amount < 0.0) {
			output += "Invalid withdrawal amount! Gold withdrawal was unsuccessful!";
			return output;
		}
		this.setAccountBalance(this.getAccountBalance() - amount);
		output += "Withdrawal was successful!";
		return output;
	}

	public String eomCalculations() {
		String output = "";
		if( this.getAccountBalance() <= 0.0) {
			output = "\nInterest not calculated due to lack of funds.\n";
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
			double interest = (this.getAccountBalance() * Math.pow(1 + (rate / numTimes), (numTimes * years))) - this.getAccountBalance();
			this.goldInterestAmount += ((Math.floor(interest*100.0))/100.0);
			this.setAccountBalance(this.getAccountBalance() + ((Math.floor(interest*100.0))/100.0));
			this.addTransaction("Gold EOM Interest Earned", interest);
			output += "\nInterest calculated and applied! End of Month calculations successfully completed!";
			output += "\nReseting monthly totals\n";
			this.goldInterestAmount = 0.0;
			output += "\nEOM Calculations completed!";
		}
		return output;
	}

	public void addTransaction(String description, double amount) {
		BankUtilities gt = new BankUtilities();
		this.goldTrans.add(gt.generateDate() + "\t" + description + "\t$" + amount + "\t" + gt.generateUniqueTransNumber());
	}
	
	
	public String toString() {
		String output = "\n===========================================\n";
		output += "Gold Account Info";
		output += "\nCustomer: " + this.getCustomer();
		output += "\n---------------------------\n";
		output += "\tAccount Balance: $" + this.getAccountBalance();
		output += "\n--------------------------------------------------\n";
		output += "\t\tTransactions " + this.goldTrans.size() + "\n";
		output += this.getGoldTransaction();
		output += "\n===========================================\n";
		return output;
	}

}
