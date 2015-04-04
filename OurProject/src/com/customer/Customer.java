package com.customer;

public class Customer {
	protected String customerID;
	protected String customerName;
	
	public Customer (String customerID, String customerName) {
		this.customerID = customerID;
		this.customerName = customerName;
	}
	
	// get
	
	public String getCustomerID() {
		return this.customerID;
	}
	
	public String getCustomerName() {
		return this.customerName;
	}
	
	// set
	
	protected void setCustomerID(String customerID) {
		this.customerID = customerID;
	}
	
	protected void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
	public String toString() {
		String output = this.customerID + " : " + this.customerName;
		return output;
	}
}
