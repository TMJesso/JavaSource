package com.customer;

/** Customer Class 
 * concrete class
 * 
 * @author Theral Jessop<br>
 * Apr 5, 2015<br>
 * Customer.java<br>
 * Copyright (c) 2015 by Theral Jessop. All rights reserved.<br>
 *
 */
public class Customer {
	protected String customerID;
	protected String customerName;
	
	public Customer(String customerID, String customerName) {
		this.customerID = customerID;
		this.customerName = customerName;
	}
	
	public String getCustomerID() {
		return this.customerID;
	}
	
	public String getCustomerName() {
		return this.customerName;
	}
	
	public void setCustomerID(String customerID) {
		this.customerID = customerID;
	}
	
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
	public String toString() {
		String output =  "ID : Name " + this.customerID + " : " + this.customerName;
		return output;
	}
}
