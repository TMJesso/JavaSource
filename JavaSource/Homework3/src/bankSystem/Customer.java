/* 
 * IUK
 * Professor: Dr. Awny Alnusair
 * Group: Theral Jessop, Jeremiah McKinney, Ian Holtson
 * Course: INFO 211
 * Date: March 12, 2015
 * Homework 3:
 * 
 */
package bankSystem;

public abstract class Customer {
	protected String name;
	protected String address;
	protected String phone;
	
	
	protected Customer(String name, String address, String phone) {
		this.name = name;
		this.address = address;
		this.phone = phone;
		
	}
	
//	public String toString() {
//		String message = this.name + ", " + this.address + " " + this.phone + " | ";
//		return message;
//	}
	
}
