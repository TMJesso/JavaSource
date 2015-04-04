/*
 * Customer.java
 * 
 * This is a super class for other customers
 * to inherit.  A generic customer cannot be 
 * created and is therefore abstract. Also, if we want
 * to force future functionality to be implemented
 * by different customer types, abstract will allow for this.
 *
 * @author AMA
 * @since 3/11/2014
 * @version 1.0
*/
package com.bank.customer;

public abstract class Customer {

    // All customers will have the following attributes
    // Declaring these protected allows for subclass access
    protected String name, address, phone;
    
    /**
    *
    * Customer constructor requiring four
    * attributes to create
    *
    * @param name String the customer name
    * @param address String the customer address
    * * @param address String the customer phone
    */
    public Customer(String name, String address, String phone){
        this.name = name;
        this.address = address;
        this.phone = phone;
    }
    
    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public String getAddress(){
        return address;
    }
    
    public void setAddress(String address){
        this.address = address;
    }
    public String getPhone(){
        return phone;
    }
    
    public void setPhone(String phone){
        this.address = phone;
    }
    
   /**
    *
    * String representation of this object
    * 
    * @returns String attributes represented as a String
    */       
    @Override
    public String toString() {
        return "Name: " + name +
               "\nAddress: " + address + 
               "\nPhone: " + phone ;
    }
}
