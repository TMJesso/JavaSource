package com.bank;

import java.util.ArrayList;

import com.accounts.*;
import com.customer.*;


public class Bank {

	public static void main(String[] args) {
		ArrayList<Customer> customers = new ArrayList<>();
		ArrayList<Account> accounts = new ArrayList<>();
		addCustomers(customers, "num1", "Theral");
		addAccounts(accounts, "ACCT1", 1000.0, customers.get(0));
		
		
	}
	
	
	public static void addCustomers(ArrayList<Customer> customers, String customerID, String customerName) {
		customers.add(new Customer(customerID, customerName));
	}
	
	public static void addAccounts(ArrayList<Account> accounts, String accountNumber, double accountBalance, Customer customer) {
		accounts.add(new Checking(accountNumber, accountBalance, customer));
	}
	

}
