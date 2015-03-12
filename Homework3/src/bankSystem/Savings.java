package bankSystem;

public class Savings extends Account {
	protected double interestRate;
	
	/** interest rate in % form: example 7.5, 12.3
	 * <p>
	 * rate is also an annual rate
	 * 
	 * @param account
	 * @param balance
	 * @param branch
	 * @param rate
	 */
	protected Savings(String account, Double balance, Bank branch, double rate) {
		super(account, balance, branch);
		this.interestRate = rate;
	}

	/** make deposit
	 * 
	 * @param amount
	 * return balance
	 */
	protected double makeDeposit(double amount) {
		this.balance = this.balance + amount;
		return this.balance;
	}

	/** make withdrawal
	 * 
	 * @param amount
	 * return balance
	 */
	protected double makeWithdrawal(double amount) {
		this.balance = this.balance - amount;
		return this.balance;
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
		double numTimes = 12.0;
		double interest = this.balance * Math.pow(1 + (rate / numTimes), (numTimes * years));
		
		
		return interest;
	}
}
