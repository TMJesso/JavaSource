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
	 * return balance
	 */
	protected String makeDeposit(double amount) {
		this.balance = this.balance + amount;
		String message = "Thank you for using " + this.branch;
		message += "\nYour new balance is: $" + this.balance;
		return message;
	}

	/** make withdrawal
	 * 
	 * @param amount
	 * return balance
	 */
	protected String makeWithdrawal(double amount) {
		if ((this.balance - amount) >= this.balance ) {
			this.balance = this.balance - amount;
		} else {
			String message = "Thank you for using " + this.branch;
			message += "\nNot enough funds in Savings account for your request";
			message += "Your current balance is: $" + this.balance;
			return message;
		}
		String message = "Thank you for using " + this.branch;
		message += "Your new balance is: $" + this.balance;
		return message;
	}
	
	/** calculate compound interest for one month
	 * from the annual rate and change it from % to decimal
	 * 
	 * @return
	 */
	protected double calculateInterest() {
		// calculate interest for 1 year compounded monthly7
		// I = P x (1 + r/n)^(n x t)
		double rate = this.interestRate / 100;
		double years = 1;
		double numTimes = 1/12.0;
		double interest = this.balance * Math.pow(1 + (rate / numTimes), (numTimes * years));
		return interest;
	}
	

	public String toString() {
		String message = "";
		message += "Savings Account\n";
		message += "-------------------------------\n";
		message += "Customer: " + this.customer;
		message += "\nBranch: " + this.branch;
		message += "\nAccount #: " + this.accountNumber;
		message += "\nBalance: $" + this.balance;
		message += "\nAnnual interest rate: " + this.interestRate + "%";
		message += "\nOpened date: " + this.dateOpened;
		message += "\n=========================================================\n\n";
		return message;
	}
}
