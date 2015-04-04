/*
 * SavingsAccount.java
 * 
 * A specialized account representing a savings
 * account
 *
 * @author AMA
 * @since 3/11/2014
 * @version 1.0
*/
package com.bank.account;

import java.util.Calendar;
import com.bank.customer.*;
import com.bank.*;

public class SavingsAccount extends Account {
    
    // SavingsAccount will have the following attributes
    // Declaring these private secures the attributes
    private double interestRate;  // annual interest rate
    
   /**
    *
    * Savings account constructor requiring four 
    * attributes to create
    *
    * @param accountNumber long the checking account number
    * @param balance double the balance
    * @param dateOpened Calendar the date the account was opened
    * @param interestRate double the rate of this account
    * @param customer long unique identifier of the customer
    * @param branch long unique identifier of the branch
    */
    public SavingsAccount(long accountNumber, double balance, Calendar dateOpened, 
            double interestRate, Customer customer, Branch branch){
        // Call superclass constructor
        super(accountNumber, balance, dateOpened, customer, branch);
        this.interestRate = interestRate;
    }
    
    /**
    *
    * Calculates the amount accrued on the account
    * and returns the amount. Interest rate is calculated
    * using the current balance as the amount over the life of
    * the account.  In the real world this calculation would
    * be far more complicated.
    * 
    * @return BigDecimal amount of interest since the account was opened 
    */
    public double calculateInterest(){
    	final float MILLISECONDS_PER_YEAR = 24*60*60*1000F*365;
        // Get the current date
        Calendar now = Calendar.getInstance();
       
        // Find the total number of years since the account has opened
        float elapsedTimeMillis =now.getTimeInMillis()-dateOpened.getTimeInMillis();

        float elapsedTimeYears = elapsedTimeMillis/(MILLISECONDS_PER_YEAR);
        
        // amount of interest accrued per year for this balance
        double interestPerYear = balance * (interestRate/100);
             
        // multiply the amount per year by the number of years the account has been opened
        return interestPerYear * elapsedTimeYears;
    }
    
    public double getInterestRate(){
        return interestRate;
    }
    
    public void setInterestRate(double interestRate){
        this.interestRate = interestRate;
    }

    /**
    *
    * String representation of this object
    * 
    * @returns String attributes represented as a String
    */       
    @Override
    public String toString() {
        return super.toString() + 
                "\nInterest Rate: " + interestRate;
    }
}
