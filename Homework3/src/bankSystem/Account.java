/* 
 * IUK
 * Professor: Dr. Awny Alnusair
 * Group: Theral Jessop, Jeremiah McKinney
 * Course: INFO 211
 * Date: March 12, 2015
 * Homework 3:
 * 
 */
package bankSystem;
// account class used to create savings and checking accounts
public abstract class Account {
	protected String accountNumber;
	protected double balance;
	protected java.util.Date dateOpened;
	
	// customer information
	Customer customer;
	// branch information
	Branch branch;
	
	/** constructor for account. Use saving or checking account to create new accounts
	 * 
	 * @param account
	 * @param balance
	 * @param branch
	 * @param customer
	 */
	protected Account(String account, Double balance, Branch branch, Customer customer) {
		this.accountNumber = account;
		this.balance = balance;
		this.dateOpened = new java.util.Date();
		this.branch = branch;
		this.customer = customer;
	}
	
	// get
	
	/** get Customer
	 * 
	 * @return customer
	 */
	public Customer getCustomer() {
		return this.customer;
	}
	
	/** get Branch
	 * 
	 * @return branch
	 */
	public Branch getBranch() {
		return this.branch;
	}
	
	/** get Account Number
	 * 
	 * @return accountNumber
	 */
	public String getAccountNumber() {
		return this.accountNumber;
	}
	
	/** get Balance
	 * 
	 * @return balance
	 */
	public double getBalance() {
		return this.balance;
	}
	
	/** get Date Account Opened
	 * 
	 * @return dateOpened
	 */
	public java.util.Date getDateOpened() {
		return this.dateOpened;
	}
	
	// set
	
	/** set Customer
	 * <p>Customer can be either personal or commercial
	 * 
	 * @param customer
	 */
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	/** set Branch
	 * 
	 * @param branch
	 */
	public void setBranch(Branch branch) {
		this.branch = branch;
	}
	
	/** set Date Opened
	 * <p>new java.util.Date()
	 * <p>is the proper syntax
	 * 
	 * @param dateOpened
	 */
	public void setDateOpened(java.util.Date dateOpened) {
		this.dateOpened = dateOpened;
	}
	
	/** set Account Number
	 * 
	 * @param accountNumber
	 */
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	/** set Balance
	 * <p>This can only be done within the Banking package
	 * 
	 * @param balance
	 */
	protected void setBalance(double balance) {
		if (balance < 0) {
			balance = 0;
		}
		this.balance = balance;
	}
	// make deposit will be used by savings and checking accounts to validate deposits
	protected abstract String makeDeposit(double amount);
	
	// make withdrawals will be used by savings and checking accounts to validate withdrawals
	protected abstract String makeWithdrawal(double amount);
	
	
}
