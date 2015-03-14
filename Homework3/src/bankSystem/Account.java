package bankSystem;

public abstract class Account {
	protected String accountNumber;
	protected double balance;
	protected java.util.Date dateOpened;
	
	// customer information
	Customer customer;
	// branch information
	Branch branch;
	
	protected Account(String account, Double balance, Branch branch, Customer customer) {
		this.accountNumber = account;
		this.balance = balance;
		this.dateOpened = new java.util.Date();
		this.branch = branch;
		this.customer = customer;
	}
	
	protected abstract String makeDeposit(double amount);
	
	protected abstract String makeWithdrawal(double amount);
	
	
}
