package bank.accounts;

import bank.customer.Customer;

public abstract class Account {
	private String accountNumber;
	private double accountBalance;
	
	private Customer customer;
	
	public Account(String accountNumber, double accountBalance, Customer customer){
		this.accountNumber = accountNumber;
		this.accountBalance = accountBalance;
		this.customer = customer;
	}
	
	// get
	
	/**
	 * @return the accountNumber
	 */
	public String getAccountNumber() {
		return accountNumber;
	}
	
	/**
	 * @return the accountBalance
	 */
	public double getAccountBalance() {
		return accountBalance;
	}
	
	/**
	 * @return the customer
	 */
	public Customer getCustomer() {
		return customer;
	}
	
	// set 
	
	/**
	 * @param accountNumber the accountNumber to set
	 */
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	/**
	 * @param accountBalance the accountBalance to set
	 */
	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}
	
	/**
	 * @param customer the customer to set
	 */
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	// abstract methods
	
	abstract public String makeDeposit(double amount);
	
	abstract public String makeWithdrawal(double amount);
	
}
