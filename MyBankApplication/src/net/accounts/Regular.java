package net.accounts;

import net.UniqueFactory.BankUtilities;
import net.customer.Customer;

import java.util.*;
public class Regular extends Account {
	private double regularInterestRate;
	private double regularInterestAmount;
	private double regularFixedCharge;
	private ArrayList<String> regTrans;
	
	public Regular(String accountNumber, double accountBalance,	Customer customer) {
		super(accountNumber, accountBalance, customer);
		this.regularInterestRate = 6.0;
		this.regularFixedCharge = 10.00;
		this.regularInterestAmount = 0.0;
		this.regTrans = new ArrayList<>();
	}
	
	// get
	
	public double getRegularInterestRate() {
		return this.regularInterestRate;
	}
	
	public double getRegularFixedCharge() {
		return this.regularFixedCharge;
	}
	
	public double getRegularInterestAmount() {
		return this.regularInterestAmount;
	}
	
	public String getRegularTransactions() {
		String output = "";
		for (String e: regTrans) {
			output += "\t\t" + e + "\n";
		}
		return output;
	}
	
	// set
	
	public String setRegularInterestRate(double rate) {
		String output = "\n";
		if (rate < 0.0) {
			output += "Regular: Invalid Interest Rate!\nReseting to default value of 6.0%";
			rate = 6.0;
		} else if (rate > 0.0 && rate < 1) {
			rate *= 100;
		}
		output += "\n\nRegular: Interest rate changed from " + this.regularInterestRate + "%";
		this.regularInterestRate = rate;
		output += " to " + rate + "%\n";
		output += "Regular Interest Rate successfully Changed";
		return output;
	}
	
	public String setRegularFixedCharge(double charge) {
		String output = "";
		if (charge < 0.0) {
			output += "Regular: Invalid Fixed Charge!\nReseting to the default value of $10.00";
			charge = 10.00;
		}
		output += "\n\nRegular: Fixed Charged changed from $" + this.regularFixedCharge;
		this.regularFixedCharge = charge;
		output += " to $" + charge + "\n";
		return output;
	}
	
	
	// deposit and withdrawal

	public String makeDeposit(double amount) {
		String output = "";
		if (amount < 0.0) {
			output += "Regular: Invalid deposit amount! Deposit was unsuccessful!";
			return output;
		}
		this.setAccountBalance(this.getAccountBalance() + amount);
		this.addTransaction("Regular Deposit", amount);
		output += "Regular: Deposit was successful!";
		return output;
	}

	public String makeWithdrawal(double amount) {
		String output = "";
		if (amount < 0.0) {
			output += "Regular: Invalid withdrawal amount! Withdrawal was unsuccessful!\n";
			return output;
		} else if (this.getAccountBalance() < amount) {
			output += "Regular: Insufficient funds avaialble for withdrawal!\nAvailable funds will be withdrawan!\n";
			amount = this.getAccountBalance();
		}
		this.setAccountBalance(this.getAccountBalance() - amount);
		output += "\nWithdraw was successfully completed!";
		return output;
	}

	public String eomCalculations() {
		String output = "";
		if( this.getAccountBalance() <= 0.0) {
			output = "Regular: Interest not calculated due to lack of funds. ";
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
			double interest = (this.getAccountBalance() * Math.pow(1 + (rate / numTimes), (numTimes * years))) - this.getAccountBalance() - this.regularFixedCharge;
			this.regularInterestAmount += ((Math.floor(interest*100.0))/100.0);
			this.setAccountBalance(this.getAccountBalance() + ((Math.floor(interest*100.0))/100.0));
			this.addTransaction("Regular EOM Interest Earned", interest);
			output += "\nInterest calculated and applied! End of Month calculations successfully completed!";
			output += "\nReseting monthly totals!";
			this.regularInterestAmount = 0.0;
			output += "\nEOM calulations complete!";
		}
		return output;
	}

	public void addTransaction(String description, double amount) {
		BankUtilities bu = new BankUtilities();
		this.regTrans.add(bu.generateDate() + " " + description + " " + amount + bu.generateUniqueTransNumber());
	}
	
	public String toString() {
		String output = "\n===========================================\n";
		output += "Regular Account Info";
		output += "\nCustomer: " + this.getCustomer();
		output += "\n---------------------------\n";
		output += "\tAccount Balance: $" + this.getAccountBalance();
		output += "\n--------------------------------------------------\n";
		output += "\t\tTransactions " + this.regTrans.size() + "\n";
		output += this.getRegularTransactions();
		output += "\n===========================================\n";
		return output;

	}

}
