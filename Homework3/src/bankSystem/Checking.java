package bankSystem;

public class Checking extends Account {
	protected String checkStyle;
	protected double minimumBalance;
	
	public Checking(String account, Double balance, String checkStyle, double minimumBalance, Branch branch, Customer customer) {
		super(account, balance, branch, customer);
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
		String message = "Thank you for using " + this.branch;
		message += "Your new balance is: $" + this.balance;
		return message;
	}

	/** make withdrawal
	 * 
	 * @param amount
	 * return balance
	 */
	protected String makeWithdrawal(double amount) {
		if(this.balance > this.minimumBalance) {
			if ((this.balance - amount) >= this.minimumBalance) {
				this.balance = this.balance - amount;
			} else {
				String message = "Thank you for using " + this.branch;
				message += "\n$" + amount + " exceeds minimum balance!\nCannot withdraw";
				return message;
			}
		} else {
			String message = "Thank you for using " + this.branch;
			message += "\nMinimum balance has been reached and no withraws are allowed!";
			message += "\nYour current balance is: $" + this.balance;
			return message;
		}
		String message = "Thank you for using " + this.branch;
		message += "Your new balance is: $" + this.balance;
		return message;
	}
	
	public String toString() {
		String message = "";
		message += "Checking Account\n";
		message += "-------------------------------\n";
		message += "Customer: " + this.customer;
		message += "\nBranch: " + this.branch;
		message += "\nAccount #: " + this.accountNumber;
		message += "\nCheck Style: " + this.checkStyle;
		message += "\nMinimum Balance: $" + this.minimumBalance;
		message += "\nBalance: $" + this.balance;
		message += "\nOpened date: " + this.dateOpened;
		message += "\n=========================================================\n\n";
		return message;
	}


}
