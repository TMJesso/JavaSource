package net.bank;

import java.util.*;

//import net.UniqueFactory.BankUtilities;
import net.accounts.*;
import net.customer.Customer;

public class Banker {
	private ArrayList<Account> accounts;

	
	private static Banker banker;


	public Banker() {
		 accounts = new ArrayList<Account>();
	}

	public static void main(String[] args) {

		boolean finished = false;
		while (finished == false) {
			// Display Menu and Get user input
			int inputInt = 0;
			while (inputInt == 0) {
				inputInt = displayMenuAndGetInput();

				// if the input is out of range
				if ((inputInt < 1) || (inputInt > 10)) {
					System.out.println("\nThe input is out of range!");
					System.out.println();
					inputInt = 0;
				}
			} //end while

			// switch to correspondence function
			switch (inputInt)
			{
				case 1:
					// Create a Checking account
					banker.createCheckingAccount(new Customer(getString("Enter Customer ID"), getString("Enter Customer Name")), getString("Enter Account Number"), getDouble("Enter balance of account"));
					break;
				case 2:
					// Create a Gold account
					break;
				case 3:
					// Create a Regular account
					break;
				case 4:
					// Deposit
					break;
				case 5:
					// Withdraw
					break;
				case 6:
					// Display account information
					break;
				case 7:
					// Remove an account
					break;
				case 8:
					// Calculate EOM
					break;
				case 9:
					// Display Bank statistics
					break;

				case 10:
					// Exit
					finished = true;
					break;
				default:
					// Option not found
					System.out.println("Invalid Input!");
					System.out.println("");
					break;
			} // end switch
		} // end while
		
	}
	
	
	public static int displayMenuAndGetInput() {
		int inputInt ;

		// Menu Display
		System.out.println("");
		System.out.println("     Banker Menu");
		System.out.println(" =====================");
		System.out.println(" 1. Create a Checking account");
		System.out.println(" 2. Create a Gold account");
		System.out.println(" 3. Create a Regular account");
		System.out.println(" 4. Deposit");
		System.out.println(" 5. Withdraw");
		System.out.println(" 6. Display account information");
		System.out.println(" 7. Remove an account");
		System.out.println(" 8. Calculate EOM");
		System.out.println(" 9. Display Bank statistics");
		System.out.println("10.  Exit");
		System.out.println("");

		// Get the input from the user
		System.out.print("Please input your choice (1-4): ");

		@SuppressWarnings("resource")
		Scanner input = new Scanner( System.in );

		inputInt = input.nextInt();

		return inputInt;
	}
	
	@SuppressWarnings("resource")
	public static String getString(String message) {
		String output;
		Scanner input = new Scanner(System.in);
		System.out.println(message);
		output = input.nextLine();
		return output;
	}
	
	@SuppressWarnings("resource")
	public static double getDouble(String message) {
		double output;
		Scanner input = new Scanner(System.in);
		System.out.println(message);
		output = input.nextDouble();
		return output;
	}
	
	// remove before turning in
	public void exampleCode() {
		banker = new Banker();
		// ArrayList<String> acctNumbers = new ArrayList<>();
		// banker.createUniqueAccountNumbers(banker.acctNumbers);
		ArrayList<Customer> customer = new ArrayList<>();
		customer.add(new Customer("Cust1", "Theral"));
		customer.add(new Customer("Cust2", "Awny"));
		//banker.addAccount(new Checking(banker.createUniqueAccountNumbers(banker.acctNumbers), 1000.0, customer.get(0)));
		//banker.addAccount(new Gold(banker.createUniqueAccountNumbers(banker.acctNumbers), 2000.0, customer.get(1)));	
	}
	
	public void addAccount(Account account) {
		this.accounts.add(account);
	}

	public void removeAccount(Account account) {
		this.accounts.remove(account);
	}
	
//	public void addCustomer(Customer customer) {
//		this.customers.add(customer);
//	}
	
//	public void removeCustomer(Customer customer) {
//		this.customers.remove(customer);
//	}
	
	public void calculateEOM() {
		for (Account acctNum: accounts) {
			System.out.print(acctNum.eomCalculations());
		}
	}
	
	public double getBankTotal() {
		double bankTotal = 0.0;
		for (Account acctNum: accounts) {
			bankTotal += acctNum.getAccountBalance();
		}
		return bankTotal;
	}
	
	public void getTotalEachAccountType() {
		double gold = 0.0, check = 0.0, regular = 0.0;
		for (Account acct: accounts) {
			if (acct instanceof Checking) {
				check += acct.getAccountBalance();
			}
			if (acct instanceof Gold) {
				gold += acct.getAccountBalance();
			}
			if (acct instanceof Regular) {
				regular += acct.getAccountBalance();
			}
		}
		System.out.println("Checking account totals: $" + check);
		System.out.println("Gold account totals: $" + gold);
		System.out.println("Regular account total: $"+ regular);
	}
	
	/*
	public String createCustomer(String id, String name) {
		String output = "";
		Customer newCust = new Customer(id, name);
		banker.addCustomer(newCust);
		output += "\nNew Customer created successfully!\n";
		return output;
	}
	*/
	
	public String createCheckingAccount(Customer c, String accountNumber, double balance) {
		String output = "";
		Account newAccount = new Checking(accountNumber, balance, c);
		banker.addAccount(newAccount);
		output += "\nChecking account created successfully!\n";
		return output;
	}
	
	public String createGoldAccount(Customer c, String accountNumber, double balance) {
		String output = "";
		Account newAccount = new Gold(accountNumber, balance, c);
		banker.addAccount(newAccount);
		output += "\nGold account successfully created!\n";
		return output;
	}
	
	public String createRegularAccount(Customer c, String accountNumber, double balance) {
		String output = "";
		Account newAccount = new Regular(accountNumber, balance, c);
		banker.addAccount(newAccount);
		output += "\nGold account successfully created!\n";
		return output;
	}
	
	
/*	public String createUniqueAccountNumbers(ArrayList<String> acctNumbers) {
		BankUtilities bu = new BankUtilities();
		String newNumber = bu.generateUniqueAcctNumber();
		while (acctNumbers.contains(newNumber)) {
			newNumber = bu.generateUniqueAcctNumber();
		}
		acctNumbers.add(newNumber);
		this.acctNumbers = acctNumbers;
		return newNumber;
	}
*/
}
