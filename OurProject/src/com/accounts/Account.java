package com.accounts;

import com.customer.Customer;
import com.transaction.Transaction;

public abstract class Account {
	protected String accountNumber;
	protected double balance;
	protected int numberOfTransactions;
	
	protected Customer customer;
	
	public Account(String accountNumber, double balance, Customer customer) {
		this.accountNumber = accountNumber;
		this.numberOfTransactions = 0;
		this.balance = balance;
		this.customer = customer;
	}
	
	
	// get
	
	public String getAccountNumber() {
		return this.accountNumber;
	}
	
	public double getBalance() {
		return this.balance;
	}
	
	public Customer getCustomer() {
		return this.customer;
	}
	
	public int getNumberOfTransactions() {
		return this.numberOfTransactions;
	}

	
	// set
	
	protected void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	protected void setBalance(double balance) {
		this.balance = balance;
	}
	
	protected void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	// additional methods
	
	@SuppressWarnings("unused")
	private String resetNumberOfTransactions() {
		this.numberOfTransactions = 0;
		return "Number of transactions successfully reset";
	}
	
	protected void addTransaction(double amount, String description) {
		new Transaction(description, amount);
	}

	// abstract methods
	
	public abstract String deposit(double amount);
	
	public abstract String withdrawal(double amount);
}
