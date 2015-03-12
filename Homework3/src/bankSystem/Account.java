package bankSystem;

public abstract class Account {
	protected String accountNumber;
	protected double balance;
	protected java.util.Date dateOpened;
	
	// branch name
	Bank branch;
	
	protected Account(String account, Double balance, Bank branch) {
		this.accountNumber = account;
		this.balance = balance;
		this.dateOpened = new java.util.Date();
		this.branch = branch;
	}
	
	protected abstract double makeDeposit(double amount);
	
	protected abstract double makeWithdrawal(double amount);
	
	
}
