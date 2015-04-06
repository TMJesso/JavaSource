package net.accounts;

import net.customer.Customer;

public abstract class Account {
	private String accountNumber;
	private double accountBalance;
	
	private Customer customer;
	
	public Account(String accountNumber, double accountBalance, Customer customer) {
		this.accountNumber = accountNumber;
		this.accountBalance = accountBalance;
		this.customer = customer;
	}
	
	// get
	
	public String getAccountNumber() {
		return this.accountNumber;
	}
	
	public double getAccountBalance() {
		return this.accountBalance;
	}
	
	public Customer getCustomer() {
		return this.customer;
	}
	
	// set
	
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	protected void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}
	
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	// abstract methods
	
	public abstract String makeDeposit(double amount);
	
	public abstract String makeWithdrawal(double amount);
	
	public abstract String eomCalculations();
	
	public abstract void addTransaction(String description, double amount);
	
}
