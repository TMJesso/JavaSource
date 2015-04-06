package net.accounts;

import net.UniqueFactory.BankUtilities;
import net.customer.Customer;

import java.util.*;

public class Checking extends Account {
	private double checkingTransactionFee;
	private double checkingTransactionFeeAmount;
	private int numberOfTransactions;
	private ArrayList<String> checkTrans;

	public Checking(String accountNumber, double accountBalance, Customer customer) {
		super(accountNumber, accountBalance, customer);
		this.checkingTransactionFee = 3.00;
		this.checkingTransactionFeeAmount = 0.0;
		this.numberOfTransactions = 0;
		this.checkTrans = new ArrayList<>();
	}

	// get
	
	public double getCheckingTransactionFee() {
		return this.checkingTransactionFee;
	}
	
	public double getCheckingTransactionFeeAmount() {
		return this.checkingTransactionFeeAmount;
	}
	
	public int getNumberOfTransactions() {
		return this.numberOfTransactions;
	}
	
	public String getCheckingTransactions() {
		String output = "";
		for (String e: checkTrans) {
			output +="\t\t" + e + "\n";
		}
		return output;
	}
	
		
	// set
	
	protected String setCheckingTransactionFee(double fee) {
		String output = "";
		if (fee < 0.0) {
			output += "Invalid Transaction Fee! Setting to the default of $3.00";
			fee = 3.0;
		} else {
			output += "Transaction fee successfully updated!";
		}
		this.checkingTransactionFee = fee;
		return output;
	}
	
	private void resetNumberOfTransactions() {
		this.numberOfTransactions = 0;
		this.checkingTransactionFeeAmount = 0.0;
	}
	
	// required methods
	
	public String makeDeposit(double amount) {
		String output = "";
		if (amount < 0.0) {
			output += "Invalid deposit amount. Deposit was unsuccessful!";
			return output;
		} else {
			this.numberOfTransactions++;
			if (this.numberOfTransactions > 2) {
				this.checkingTransactionFeeAmount += this.checkingTransactionFee;
			}
			this.setAccountBalance(this.getAccountBalance() + amount);
			output += "Deposit successfully applied!";
			this.addTransaction("Checking Deposit", amount);
		}
		return output;
	}


	public String makeWithdrawal(double amount) {
		String output = "";
		if (amount < 0.0) {
			output += "Invalid withdrawal amount. Withdrawal was unsuccessful!";
			return output;
		} else {
			this.numberOfTransactions++;
			if (this.numberOfTransactions > 2) {
				this.checkingTransactionFeeAmount += this.checkingTransactionFee;
			}
			if (this.getAccountBalance() < amount) {
				output += "Unable to withdraw the amount specified.\nWithdrawing available funds!";
				amount = this.getAccountBalance();
			}
			this.setAccountBalance(this.getAccountBalance() - amount);
			output += "\nWithdrawal was successful!";
		}
		return output;
	}


	@SuppressWarnings("resource")
	public String eomCalculations() {
		Scanner input = new Scanner(System.in);
		System.out.println("EOM Calculations: All transactions, fees will be cleared. Are you sure? (y/n)");
		String eomAnswer = input.nextLine();
		if (eomAnswer.equalsIgnoreCase("n")) {
			return "Canceled End-Of-Month calculations";
		}
		String output = "";
		// validate that the transaction fee and the calculated fee are the same and then
		// it can be confidently applied to the balance
		// remembering that the first 2 transactions are free
		if (this.checkingTransactionFeeAmount == ((this.numberOfTransactions - 2) * this.checkingTransactionFee)){
			output += "Applying transaction fees to account\n";
			if (this.getAccountBalance() >= this.checkingTransactionFeeAmount) {
				output += "Successfully applied transaction fees to account!\n";
				this.setAccountBalance(this.getAccountBalance() - this.checkingTransactionFeeAmount);
			} else {
				output += "Insufficient funds. Terminating end of month calculations!";
				return output;
			}
		}
		output += "\nEnd-of-month calculations complete! Reseting monthly values";
		// reset the number of transactions and clear the transaction listed
		// and set the fee amount for the month to 0.0
		this.resetNumberOfTransactions();
		output += "\nSuccessfully reset all monthly values";
		return output;
	}

	public void addTransaction(String description, double amount) {
		BankUtilities gt = new BankUtilities();
		this.checkTrans.add(gt.generateDate() + "\t" + description + "\t$" + amount + "\t" + gt.generateUniqueTransNumber());
	}

	public String toString() {
		String output = "\n===========================================\n";
		output += "Checking Account Info";
		output += "\nCustomer: " + this.getCustomer();
		output += "\n---------------------------\n";
		output += "\tAccount Balance: $" + this.getAccountBalance();
		output += "\n--------------------------------------------------\n";
		output += "\t\tTransactions " + this.checkTrans.size() + "\n";
		output += this.getCheckingTransactions();
		output += "\n===========================================\n";
		
		return output;
	}
}
