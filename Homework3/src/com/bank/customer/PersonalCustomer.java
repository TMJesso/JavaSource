/*
 * PersonalCustomer.java
 * 
 * A specialized customer representing a personal
 * customer
 *
 * @author AMA
 * @since 3/11/2014
 * @version 1.0
*/
package com.bank.customer;

public class PersonalCustomer extends Customer{

    // PersonalCustomer will have the following attributes
    // Declaring these private secures the attributes
    private String homePhone, workPhone;
    
    /**
    *
    * Personal customer constructor requiring five
    * attributes to create
    *
    * @param name String the customer name
    * @param address String the customer address
    * @param phone String the customer phone
    * @param homePhone String the customer home phone
    * @param workPhone String the customer work phone 
    */
    public PersonalCustomer(String name, String address, String phone,
            String homePhone, String workPhone){
        // Call superclass constructor
        super(name, address, phone);
        this.homePhone = homePhone;
        this.workPhone = workPhone;
    }
    
     public String getHomePhone(){
        return homePhone;
    }
    
    public void setHomePhone(String homePhone){
        this.homePhone = homePhone;
    }
    
     public String getWorkPhone(){
        return workPhone;
    }
    
    public void setWorkPhone(String workPhone){
        this.workPhone = workPhone;
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
               "\nHome Phone: " + homePhone +
               "\nWork Phone: " + workPhone;
    }
}
