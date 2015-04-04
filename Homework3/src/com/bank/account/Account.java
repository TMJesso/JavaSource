/*
 * Account.java
 * 
 * This is a super class for other accounts
 * to inherit.  A generic account cannot be 
 * created and is therefore abstract. Also, if we want
 * to force future functionality to be implemented
 * by different account types, abstract will allow for this.
 *
 * @author AMA
 * @since 3/10/2014
 * @version 1.0
*/
package com.bank.account;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import com.bank.customer.*;
import com.bank.*;

public abstract class Account {
    
    // All accounts will have the following attributes
    // Declaring these protected allows for subclass access
    protected long accountNumber;
    protected double balance;
    protected Calendar dateOpened;
    protected Customer customer;  // Used to tie the account to a customer
    protected Branch branch; // Used to tie the account to a branch
    
   /**
    *
    * Account constructor requiring five 
    * attributes to create.  Subclasses will be forced to call
    * this constructor and set these required values.
    *
    * @param accountNumber long the checking account number
    * @param balance double the balance
    * @param dateOpened Calendar the date the account was opened
    * @param customerID long unique identifier of the customer
    * @param branchID long unique identifier of the branch
    */
    public Account(long accountNumber, double balance, Calendar dateOpened, Customer customer, Branch branch){
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.dateOpened = dateOpened;
        this.customer = customer;
        this.branch = branch;
    }
    
   /**
    *
    * makeDeposit is used to add funds to an account
    * Note this method assumes valid data.
    *
    * @param depositAmount double the amount to add to the account
    */
    public void makeDeposit(double depositAmount) {
        balance += depositAmount;
    }
            
   /**
    *
    * makeWithdrawal is used to withdraw funds from an account
    * Note this method assumes valid data.
    * Assumes no further action if there is an overdraft
    * 
    * @param withdrawalAmount double the amount to remove from the account
    */       
    public void makeWithdrawal(double withdrawalAmount) {
        balance -= withdrawalAmount;
    }
    
    public long getAccountNumber(){
        return accountNumber;
    }
    
    public void setAccountNumber(long accountNumber){
        this.accountNumber = accountNumber;
    }
    
    public double getBalance(){
        return balance;
    }
    
    public void setBalance(double balance){
        this.balance = balance;
    }
    
    public Calendar getDateOpened(){
        return dateOpened;
    }
    
    public void setDateOpened(Calendar dateOpened){
        this.dateOpened = dateOpened;
    }
    
    public Customer getCustomer(){
        return customer;
    }
    
    public void setCustomer(Customer customer){
        this.customer = customer;
    }
    
    public Branch getBranch(){
        return branch;
    }
    
    public void setBranch(Branch branch){
        this.branch = branch;
    }
    
   /**
    *
    * String representation of this object
    * 
    * @returns String attributes represented as a String
    */       
    @Override
    public String toString() {
    	
    	DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
    	
        return "Account Number: " + accountNumber +
               "\nBalance: " + balance + 
               "\nDate Opened: " + dateFormat.format(dateOpened.getTime()) +
               "\nCustomer Information: \n" + customer.toString() +
               "\nBranch Information: \n" + branch.toString();
    }
}
