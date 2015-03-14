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

public class Savings extends Account {
	protected double interestRate;
	
	/** interest rate in % form: example 7.5, 12.3
	 * <p>
	 * rate is also an annual rate
	 * 
	 * @param account
	 * @param balance
	 * @param rate
	 * @param branch
	 * @param customer
	 * 
	 */
	protected Savings(String account, Double balance, double rate, Branch branch, Customer customer) {
		super(account, balance, branch, customer);
		this.interestRate = rate;
	}

	/** make deposit
	 * 
	 * @param amount
	 * return message
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
	 * return message
	 */
	protected String makeWithdrawal(double amount) {
		if ((this.balance - amount) >= 0 ) {
			this.balance = this.balance - amount;
		} else {
			String message = "=========================================================\n";
			message += "Thank you for using " + this.branch;
			message += "\nAccount #: " + this.accountNumber;
			message += "\nNot enough funds in Savings account for your request";
			message += "\n\nYour current balance is: $" + this.balance;
			message += "\n=========================================================\n";
			return message;
		}
		String message = "=========================================================\n";
		message += "Thank you for using " + this.branch;
		message += "\nAccount #: " + this.accountNumber;
		message += "\nWithdrawing $" + amount;
		message += "\n\nYour new balance is: $" + this.balance;
		message += "\n=========================================================\n";
		return message;
	}
	
	/** calculate compound interest for one month
	 * from the annual rate 
	 * 
	 * @return
	 */
	public String calculateInterest() {
		String message = "";
		if( this.balance <= 0) {
			message = "Interest not calculated.\nSavings account has a balance of $" + this.balance;
		} else {
			// calculate interest for 1 year compounded monthly7
			// I = P x (1 + r/n)^(n x t)
			double rate = this.interestRate / 100;
			double years = 1;
			double numTimes = 1/12.0;
			double interest = this.balance * Math.pow(1 + (rate / numTimes), (numTimes * years));
			this.balance = ((Math.floor(interest*100))/100);
			message = "=========================================================\n";
			message += "Account #: " + this.accountNumber;
			message += "\nInterest calculated and applied!\nNew balance is: $" + this.balance;
			message += "\n=========================================================\n";

		}
		return message;
	}
	
	/** get current interest rate
	 * 
	 * @return interestRate
	 */
	public double getInterestRate() {
		return this.interestRate;
	}
	
	/** set interest rate
	 * 
	 * @param interestRate
	 */
	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

	/** display the savings account information
	 * 
	 * @return message
	 */
	public String toString() {
		String message = "=========================================================\n";
		message += "Savings Account\n";
		message += "------------------------------------------------------------------------\n";
		message += "Customer: " + this.customer;
		message += "\n------------------------------------------------------------------------";
		message += "\nBranch: " + this.branch;
		message += "\n------------------------------------------------------------------------";
		message += "\nAccount #: " + this.accountNumber;
		message += "\nBalance: $" + this.balance;
		message += "\n------------------------------------------------------------------------";
		message += "\nAnnual interest rate: " + this.interestRate + "%";
		message += "\nOpened date: " + this.dateOpened;
		message += "\n=========================================================\n";
		return message;
	}
}
