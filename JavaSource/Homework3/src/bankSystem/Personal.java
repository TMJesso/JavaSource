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

public class Personal extends Customer {
	protected String homePhone;
	protected String workPhone;
	
	public Personal(String name, String address, String phone, String homePhone, String workPhone) {
		super(name, address, phone);
		this.homePhone = homePhone;
		this.workPhone = workPhone;
	}
	
	public String toString(){
		String message = "Name | address | phone\n\t  " + this.name + " | " + this.address + " | " + this.phone + "\n\n";
		message += "\t  Home Phone: " + this.homePhone + " | Work phone: " + this.workPhone;
		return message;
	}

}
