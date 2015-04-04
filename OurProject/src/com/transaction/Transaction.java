package com.transaction;

import java.util.ArrayList;
import java.util.Calendar;

import com.accounts.Account;

public class Transaction {
	protected Account account;
	protected ArrayList<String> transaction;
	
	public Transaction(Account account) {
		this.account = account;
		this.transaction = new ArrayList<String>();
	}
	
	public Transaction(String transactionDescription, double transactionAmount) {
		this.transaction.add(transactionDescription + " " + transactionAmount + " " + generateUniqueTransNumber());
	}
	
	private int generateUniqueTransNumber() {
	       return (int) Calendar.getInstance().getTimeInMillis();

	}
	
}
