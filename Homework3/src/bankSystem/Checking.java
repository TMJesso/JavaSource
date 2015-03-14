/* 
 * IUK
 * Professor: Dr. Awny Alnusair
 * Group: Theral Jessop, Jeremiah McKinney, Ian Holtson
 * Course: INFO 211
 * Date: March 12, 2015
 * Homework 3:
 * 
 */
package bankSystem;

public class Checking extends Account {
	protected String checkStyle;
	protected double minimumBalance;
	
	/** create a checking account
	 * 
	 * @param account
	 * @param balance
	 * @param checkStyle
	 * @param minimumBalance
	 * @param branch
	 * @param customer
	 */
	public Checking(String account, Double balance, String checkStyle, double minimumBalance, Branch branch, Customer customer) {
		super(account, balance, branch, customer);
		// make sure the balance meets the minimum balance requirement
		if (balance < minimumBalance) {
			this.balance = minimumBalance;
		}
		this.checkStyle = checkStyle;
		this.minimumBalance = minimumBalance;
	}

	/** make deposit
	 * 
	 * @param amount
	 * return balance
	 */
	protected String makeDeposit(double amount) {
		this.balance = this.balance + amount;
		String message = "=========================================================\n";
		message += "Thank you for using " + this.branch;
		message += "\nAccount #: " + this.accountNumber;
		message += "\nDepositing $" + amount;
		message += "\n\nYour new balance is: $" + this.balance;
		message += "\n=========================================================\n";

		return message;
	}

	/** make withdrawal
	 * 
	 * @param amount
	 * return balance
	 */
	protected String makeWithdrawal(double amount) {
		String message = "";
		if(this.balance > this.minimumBalance) {
			if ((this.balance - amount) >= this.minimumBalance) {
				this.balance = this.balance - amount;
			} else { // not enough $ to make the withdrawal
				message = "=========================================================\n";
				message = "Thank you for using " + this.branch;
				message += "\nAccount #: " + this.accountNumber;
				message += "\n$" + amount + " exceeds minimum balance!";
				message += "\n\nCannot withdraw any funds at this time!\n";
				message += "=========================================================\n";
				return message;
			}
		} else { // minimum balance reached
			message = "=========================================================\n";
			message += "Thank you for using " + this.branch;
			message += "\nAccount #: " + this.accountNumber;
			message += "\nMinimum balance has been reached";
			message += "\nNo withrawals are allowed at this time!";
			message += "\n\nYour current balance is: $" + this.balance;
			message += "\n=========================================================\n";
			return message;
		} // otherwise
		message = "=========================================================\n";
		message += "Thank you for using " + this.branch;
		message += "\nAccount #: " + this.accountNumber;
		message += "\nWithdrawing $" + amount;
		message += "\n\nYour new balance is: $" + this.balance;
		message += "\n=========================================================\n";
		return message;
	}
	
	/** display checking account information
	 * 
	 * 
	 * @return message
	 */
	public String toString() {
		String message = "=========================================================\n";
		message += "Checking Account\n";
		message += "------------------------------------------------------------------------\n";
		message += "Customer: " + this.customer;
		message += "\n------------------------------------------------------------------------";
		message += "\nBranch: " + this.branch;
		message += "\n------------------------------------------------------------------------";
		message += "\nAccount #: " + this.accountNumber + " Balance: $" + this.balance;;
		message += "\n------------------------------------------------------------------------";
		message += "\nCheck Style: " + this.checkStyle;
		message += "\nMinimum Balance: $" + this.minimumBalance;
		message += "\nOpened date: " + this.dateOpened;
		message += "\n------------------------------------------------------------------------";
		message += "\n=========================================================\n";
		return message;
	}


}
