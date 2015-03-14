/* 
 * IUK
 * Professor: Dr. Awny Alnusair
 * Group: Theral Jessop, Jeremiah McKinney, Ian Holtson
 * Course: INFO 211
 * Date: March 12, 2015
 * Homework 3:
 * 
 * Description:
 * Bank system that has a Branch with Savings and Checking accounts for Personal and Commercial customers.
 * 
 * Each account type can make deposits and withdrawals with checking having a minimum balance
 * 
 * Each withdrawal cannot go below the balance and the checking withdrawal cannot below the minimum balance
 * 
 * 
 * 
 * 
 */




package bankSystem;


public class Bank {

	public static void main(String[] args) {
		Branch kokomoBranch = new Branch("Kokomo Branch", "North Side");
		Customer newCust = new Personal("", "", "", "", "");
		Customer newCust1 = new Commercial("", "", "", 1.0, "", "");
		//String name, String address, String phone, double creditRating, String contactPerson, String contactPersonPhone
		Checking newCheck = new Checking("", 0.00, "", 5.00, kokomoBranch, newCust);
		Savings newSavings = new Savings("", 0.0, 12.5, kokomoBranch, newCust1);
		//String account, Double balance, String checkStyle, double minimumBalance, Branch branch, Customer customer
		
		//Savings newAccount = new Savings("SE22355", 100.00, 12.5, kokomoBranch, newCust[0]);
	}

}
