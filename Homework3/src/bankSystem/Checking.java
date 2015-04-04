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

// checking class extends account class with the deposit and withdraw methods defined here
public class Checking extends Account {
	// checking class adds check style and minimum balance
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
	
	// get
	
	/** get Check Style
	 * 
	 * @return checkStyle
	 */
	public String getCheckStyle() {
		return this.checkStyle;
	}
	
	/** get Minimum Balance
	 * 
	 * @return minimumBalance
	 */
	public double getMinimumBalance() {
		return this.minimumBalance;
	}
	
	// set

	/** set Check Style
	 * <p>Example: NASCAR, Rivers, Rocky Mountains
	 * 
	 * @param checkStyle
	 */
	public void setCheckStyle(String checkStyle) {
		this.checkStyle = checkStyle;
	}
	
	/** set Minimum Balance
	 * 
	 * @param minimumBalance
	 */
	public void setMinimumBalance(double minimumBalance) {
		if (minimumBalance < 5) {
			System.out.println("Minimum balance cannot be less than $5.00");
		} else {
			this.minimumBalance = minimumBalance;
		}
	}
	
	/** make deposit
	 * 
	 * @param amount
	 * return balance
	 */
	public String makeDeposit(double amount) {
		String message = "=========================================================\n";
		if (amount < 0) {
			message += "Invalid deposit amount\n";
		} else {
			this.balance = this.balance + amount;
			message += "Thank you for using " + this.branch;
			message += "\nAccount #: " + this.accountNumber;
			message += "\nDepositing $" + amount;
			message += "\n\nYour new balance is: $" + this.balance;
		}
		message += "\n=========================================================\n";
		return message;
	}

	/** make withdrawal checking to make sure there are enough available funds
	 * before completing the transaction. Display appropriate error message if
	 * funds drops below minimum balance. Also check to see if the account
	 * is equal to the minimum balance and display an appropriate error message
	 * 
	 * 
	 * @param amount
	 * return balance
	 */
	public String makeWithdrawal(double amount) {
		String message = "";
		if (amount <= 0) { // amount must be positive
			message = "=========================================================\n";
			message += "Invalid withdrawal amount!\n";
			message += "=========================================================\n";
			return message;
		} else if (this.balance > this.minimumBalance) {
			if ((this.balance - amount) >= this.minimumBalance) { // is there enough funds available
				this.balance = this.balance - amount;
			} else { // not enough $ to make the withdrawal
				message = "=========================================================\n";
				message += "Thank you for using " + this.branch;
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
	
	/** display checking account information in a string to return to the user
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
