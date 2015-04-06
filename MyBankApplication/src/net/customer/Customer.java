package net.customer;

public class Customer {
	private String customerID;
	private String customerName;
	
	public Customer(String customerID, String customerName) {
		this.customerID = customerID;
		this.customerName = customerName;
	}
	
	// get 
	
	public String getCustomerID() {
		return this.customerID;
	}
	
	public String getCustumerName() {
		return this.customerName;
	}
	
	// set
	
	public void setCustomerID(String customerID) {
		this.customerID = customerID;
	}
	
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String toString() {
		return "ID : Name\n" + this.customerID + " : " + this.customerName;
	}
}
