package com.accounts;

import com.customer.Customer;

/** abstract Account class
 * 
 * @author Theral Jessop<br>
 * Apr 4, 2015<br>
 * Account.java<br>
 * @version 1.0
 * Copyright (c) 2015 by Theral Jessop. All rights reserved.<br>
 *
 *
 */
public abstract class Account {
	protected String accountNumber;
	protected double accountBalance;
	protected int numberOfTransactions;
	
	
	protected Customer customer;
	
	Account(String accountNumber, double accountBalance, Customer customer) {
		this.accountNumber = accountNumber;
		this.accountBalance = accountBalance;
		this.customer = customer;
		this.numberOfTransactions = 0;
	}
	
	public String getAccountNumber() {
		return this.accountNumber;
	}
	
	public String getAccountBalance() {
		return "$ " + this.accountBalance;
	}
	
	public String getNumberOfTransactions() {
		return "There are " + this.numberOfTransactions + " for this account";
	}
	
	protected void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	protected void setAccountBalance(double accountBalance) {
		if (this instanceof Gold) {
			this.accountBalance = accountBalance;
			return;
		}
		if (accountBalance < 0) {
			accountBalance = 0.0;
		}
		this.accountBalance = accountBalance;
	}
	
	protected void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	protected String resetNumberOfTransactions() {
		String output = "Number of transactions has been reset!";
		this.numberOfTransactions = 0;
		return output;
	}
	
	
	public abstract String eomCalculations();
	
	public abstract String makeDeposit(double amount);
	
	public abstract String makeWithdrawal(double amount);
	
	public String toString() {
		String output = this.accountNumber;
		return output;
	}
}
