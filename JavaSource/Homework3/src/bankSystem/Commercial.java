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

public class Commercial extends Customer {
	protected String creditRating;
	protected String contactPerson;
	protected String contactPersonPhone;
	
	public Commercial(String name, String address, String phone, String creditRating, String contactPerson, String contactPersonPhone) {
		super(name, address, phone);
		this.creditRating = creditRating;
		this.contactPerson = contactPerson;
		this.contactPersonPhone = contactPersonPhone;
	}
	
	public String toString() {
		String message =  "Name | address | phone\n\t  " + this.name + " | " + this.address + " | " + this.phone + "\n\n";
		message += "\t   Credit Rating: " +  this.creditRating;
		message += "\n\t  Contact Person: " + this.contactPerson;
		message += "\n\t   Contact Phone: " + this.contactPersonPhone;
		return message;
	}

}
