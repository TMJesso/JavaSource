/*
 * CheckingAccount.java
 *
 * A specialized account representing a checking
 * account
 *
 * @author AMA
 * @since 3/10/2014
 * @version 1.0
*/
package com.bank.account;

import java.util.Calendar;
import com.bank.customer.*;
import com.bank.*;

public class CheckingAccount extends Account {

    // CheckingAccount will have the following attributes
    // Declaring these private secures the attributes
    private String checkStyle;
    private double minimumBalance;

    /**
    *
    * Checking account constructor requiring five
    * attributes to create
    *
    * @param accountNumber long the checking account number
    * @param balance double the balance
    * @param dateOpened Calendar the date the account was opened
    * @param checkStyle String the check style
    * @param minimumBalance double minimum balance of the account
    * @param customer long unique identifier of the customer
    * @param branch long unique identifier of the branch
    */
    public CheckingAccount(long accountNumber, double balance, Calendar dateOpened,
            String checkStyle, double minimumBalance, Customer customer, Branch branch){
        // Call superclass constructor
        super(accountNumber, balance, dateOpened, customer, branch);
        this.checkStyle = checkStyle;
        this.minimumBalance = minimumBalance;
    }

    public String getCheckStyle(){
        return checkStyle;
    }

    public void setCheckStyle(String checkStyle){
        this.checkStyle = checkStyle;
    }

    public double getMinimumBalance(){
        return minimumBalance;
    }

    public void setMinimumBalance(double minimumBalance){
        this.minimumBalance = minimumBalance;
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
               "\nCheck Style: " + checkStyle +
               "\nMinimum Balance: " + minimumBalance;
    }

}
