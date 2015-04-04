/*
 * CommercialCustomer.java
 * 
 * A specialized customer representing a commercial customer
 *
 * @author AMA
 * @since 3/11/2014
 * @version 1.0
*/
package com.bank.customer;

public class CommercialCustomer extends Customer{

    // CommercialCustomer will have the following attributes
    // Declaring these private secures the attributes
    private int creditRating;
    private String contactPerson, contactPersonPhone;
    
    /**
    *
    * Commercial customer constructor requiring seven attributes to create
    *
    * @param name String the customer name
    * @param address String the customer address
    * @param address String the customer address
    * @param creditRating int the customer credit rating
    * @param contactPerson String the account contact person 
    * @param contactPersonPhone String the account contact person phone
    */
    public CommercialCustomer(String name, String address, String phone, 
            int creditRating, String contactPerson, String contactPersonPhone){
        // Call superclass constructor
        super(name, address, phone);
        this.creditRating = creditRating;
        this.contactPerson = contactPerson;
        this.contactPersonPhone = contactPersonPhone;
    }
    
    public String getContactPerson(){
        return contactPerson;
    }
    
    public void setContactPerson(String contactPerson){
        this.contactPerson = contactPerson;
    }
    
    public String getContactPersonPhone(){
        return contactPersonPhone;
    }
    
    public void setContactPersonPhone(String contactPersonPhone){
        this.contactPersonPhone = contactPersonPhone;
    }
    
     public int getCreditRating(){
        return creditRating;
    }
    
    public void setCreditRating(int creditRating){
        this.creditRating = creditRating;
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
               "\nCredit Rating: " + creditRating +
               "\nContact Person: " + contactPerson + 
               "\nContact Person Phone: " + contactPersonPhone;
    }
}
