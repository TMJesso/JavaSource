package com.transaction;

import com.accounts.Account;

import java.util.*;

public class Transaction {
	protected Account account;
	protected ArrayList<String> transaction;
	
	public Transaction(Account account) {
		this.account = account;
		this.transaction = new ArrayList<String>();
	}

	public Transaction(String description, double amount) {
		this.transaction.add(generateDate() + "\t" + description + "\t" + amount + "\t" + generateUniqueTransNumber());
	}
	
	protected String eomReset() {
		String output = "Account transaction successfully reset!";
		this.transaction.clear();
		return output;
	}
	
	private int generateUniqueTransNumber() {
		return (int) Calendar.getInstance().getTimeInMillis();
	}
	
	private java.util.Date generateDate() {
		return (new java.util.Date());
	}
	
	public String toString() {
		String output = "\nAccount Info\n______________________________________________\n";
		output += this.account;
		output += "\n______________________________________________\n";
		output += "\tTransaction Info\n______________________________________________\n";
		for (String e: transaction) {
			output += "\t" + e + "\n";
		}
		return output;
	}
}
