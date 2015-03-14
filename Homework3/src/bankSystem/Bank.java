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

import java.util.ArrayList;


public class Bank {

	public static void main(String[] args) {
		boolean debug = false;
		Branch[] indianaStateBank = new Branch[2];
		indianaStateBank[0] = new Branch("Chicago Branch", "South Chicago");
		indianaStateBank[1] = new Branch("Kokomo Branch", "North Side");
		
		/*
		 * Personal(name, address, phone, homePhone, workPhone)
		 * Commercial(name, address, phone, creditRating, contactPerson, contactPersonPhone)
		 * Savings(account, balance, rate, branch, customer)
		 * Checking(account, balance, checkStyle, minimumBalance, branch, customer)
		 */
		ArrayList<Account> account = new ArrayList<Account>(); 
		
		//Step 3 - requirements
		
		// (a)
		if (debug)
			System.out.println("(a) Create commercial checking account and add to arraylist");
		account.add(new Checking("CK23564", 5.00, "Rocky Mountains", 5.00, indianaStateBank[0], new Commercial("Joiner & Joiner, LLP", "3083 Spring Street, Springfield, IL 62701", "(217) 782-6327", "AAA", "Timothy D. Ball", "(205) 324-7812")));
		
		// (b)
		if (debug)
			System.out.println("(b) Display information");
		System.out.print(account.get(0).toString());
		
		// (c)
		if (debug)
			System.out.println("(c) Make deposit and re-display information");
		System.out.print(account.get(0).makeDeposit(100.00));
		System.out.print(account.get(0).toString());

		// (d)
		if (debug)
			System.out.println("(d) Create personal savings account");
		account.add(new  Savings("SV23564", 100.0, 10.0, indianaStateBank[0],  new Personal("Stacey A. Gage", "3801 College Street, Atlanta, GA 30318", "(404) 408-8541", "(404) 408-8451", "(404) 408-1845")));
		
		// (e)
		if (debug)
			System.out.println("(e) Display information");
		System.out.print(account.get(1).toString());
		
		// (f)
		if (debug)
			System.out.println("(f) Make deposit, calculate interest and re-display information");
		System.out.print(account.get(1).makeDeposit(100.00));
		System.out.print(((Savings) account.get(1)).calculateInterest());
		System.out.print((account.get(1)).toString());

		// (g)
			// add new savings account for Kokomo Branch
			// 0 balance
			// 3% interest Rate
			// personal account
		
			if (debug)
				System.out.println("(g) Create personal saving account");
			account.add(new Savings("SVK7896", 0.00, 3.0, indianaStateBank[1], new Personal("Joseph M. Anderson", "2069 West Drive, Kokomo, IN 46903", "(765) 475-0095", "(765) 475-9632", "(765) 476-1184")));
			// display the information
			System.out.print(account.get(2).toString());
			// try to withdraw 25.00
			System.out.print(account.get(2).makeWithdrawal(25.00));
			// try to deposit 25.00
			System.out.print(account.get(2).makeDeposit(25.00));
			// try to withdraw 25.00 again
			System.out.print(account.get(2).makeWithdrawal(25.00));
			
			// add new checking account for Kokomo Branch
			// try adding with 0 balance
			// customer wants NASCAR style checks
			// minimum balance requirement of 25.00
			// personal account
			if (debug)
				System.out.println("(h) Create personal checking account");
			account.add(new Checking("CK23564", 0.00, "Nascar", 25.00, indianaStateBank[1], new Personal("Blanca P. Joiner", "3083 Spring Street, Kokomo, IN 46901", "(765) 598-3550", "(765) 598-3505", "(765) 598-5503")));
			// display the information and check if the minimum balance was automatically changed to the minimum balance
			System.out.print(account.get(3).toString());
			//  try to withdraw 25.00
			System.out.print(account.get(3).makeWithdrawal(25.00));
			// try to make deposit of 5.00
			System.out.print(account.get(3).makeDeposit(5.00));
			// try to withdraw 25.00 again
			System.out.print(account.get(3).makeWithdrawal(25.00));
			// try to make deposit of 30.00
			System.out.print(account.get(3).makeDeposit(30.00));
			
			// add new savings account for Kokomo Branch
			// 105.35 balance
			// interest rate of 8.25%
			// commercial account
			/*
			*  * Savings(account, balance, rate, branch, customer)											 Commercial(name, address, phone, creditRating, contactPerson, contactPersonPhone)
			*/
			if (debug)
				System.out.println("(i) Create commercial savings account");
			account.add(new Savings("SVK48321", 105.35, 8.25, indianaStateBank[1], new Commercial("", "3808 Rhapsody Street, Kokomo, IN 46902", "(765) 315-2588", "AA", "(765) 315-8258", "(765) 315-8582")));
			// try to depoist 200.00
			System.out.print(account.get(4).makeDeposit(200.00));
			

			
			
			
			
			
			
			
		/*	
			
			
		
		
		System.out.print(account.get(1).toString());
		System.out.print(account.get(1).makeWithdrawal(25.00));
		System.out.print(account.get(1).makeDeposit(100.00));
		System.out.print(account.get(1).makeWithdrawal(25.00));

		
		
		
		account.add(new  Savings("SV23564", 1000.0, 12.5, indianaStateBank[0],  new Personal("Stacey A. Gage", "3801 College Street, Atlanta, GA 30318", "(404) 408-8541", "(404) 408-8451", "(404) 408-1845")));
		System.out.print(account.get(0).toString());
		System.out.print(((Savings) account.get(0)).calculateInterest());
		System.out.print(account.get(0).makeWithdrawal(25.00));
		System.out.print(account.get(0).makeDeposit(100.00));
		
		account.add(new Checking("CK23564", 5.00, "Rocky Mountains", 5.00, indianaStateBank[0], new Commercial("Blanca P. Joiner", "3083 Spring Street, Springfield, IL 62701", "(217) 782-6327", "AA", "Timothy D. Ball", "(205) 324-7812")));
		System.out.print(account.get(1).toString());
		System.out.print(account.get(1).makeWithdrawal(25.00));
		System.out.print(account.get(1).makeDeposit(100.00));
		System.out.print(account.get(1).makeWithdrawal(25.00));
		
		
		*/
		
	}

}
