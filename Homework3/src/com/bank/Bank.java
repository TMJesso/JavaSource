/*
 * Bank.java
 * 
 * Runs the Bank program. Interacts with a 
 * user to create customers and accounts
 *
 * @author AMA
 * @since 3/10/2014
 * @version 1.0
*/
package com.bank;

import java.util.*;


import com.bank.account.*;
import com.bank.customer.*;
import com.bank.utils.*;


public class Bank {

	//Create an ArrayList to hold all bank accounts
	private List<Account> accounts;

	private static Bank bank;

  	/**
   	* Constructor: Creates a new bank with no accounts.
   	*/
  	public Bank()
  	{
		accounts = new ArrayList<Account>();
  	}
  	
  //--------------------------------------------------------------------------------------------

  	public static void main(String[] args)
  	{
  		bank = new Bank();
  		Customer commercial1 = new CommercialCustomer("Awny", "Carmel, IN","312-209-2956", 890,"312-209-2956","312-209-2956");
  		Branch branch1 = new Branch(UniqueIDFactory.generateUniqueID(), "Chicago", "401 S State", "312-903030");
  		
  		bank.createCheckingAccount(commercial1, branch1);
  		System.out.println(bank.getTotalBalance());
  		
  		bank.totalsOfEachAccountType();
  	}
  	
  //--------------------------------------------------------------------------------------------
    /**
     * Adds a new account to the bank.
     *
     * @param newAccount a new account
     */
    public void addAccount(Account newAccount)
    {
      accounts.add(newAccount);
    }
    /**
     * Removes an account from the bank.
     *
     * @param account the account to remove
     */
    public void removeAccount(Account account)
    {
      this.accounts.remove(account);
    }

     /**
        Gets the sum of the balances of all accounts in this bank.
        @return the sum of the balances
     */
     public double getTotalBalance()
     {
        double total = 0;
        for (Account a : accounts)
        {
           total = total + a.getBalance();
        }
        return total;
     }
     
 	public void createCheckingAccount(Customer c, Branch b)
 	{
        Calendar dateOpened = Calendar.getInstance(); 
        Account newAccount = new CheckingAccount(UniqueIDFactory.generateUniqueID(), 120, dateOpened,"Some Style", 100, c, b);
 	    System.out.println(newAccount);
        bank.addAccount(newAccount);
 	    System.out.println("\nAccount created successfully!\n");
 	}
 
 	//*********************************************************************
 	
		public void totalsOfEachAccountType()
		{

			double totalChecking = 0, totalSavings = 0;

	    	for (Account current : this.accounts)
	    	{
	    		if (current instanceof CheckingAccount) 
	      		{
					//ca = (CheckingAccount) current;
	        		totalChecking += current.getBalance();
				}
				else 
				{
					totalSavings += current.getBalance();
					
				}

	    		System.out.println("\nTotal in all Checking Accounts: " + totalChecking);
	    		System.out.println("\nTotal in all Savings Accounts: " + totalSavings);

		}
	}


}