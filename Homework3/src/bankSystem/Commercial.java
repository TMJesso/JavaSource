/* 
 * IUK
 * Professor: Dr. Awny Alnusair
 * Group: Theral Jessop, Jeremiah McKinney
 * Course: INFO 211
 * Date: March 12, 2015
 * Homework 3:
 * 
 */
package bankSystem;
// commercial customer extend the customer class 
// adding credit rating, contact person, contact person phone
public class Commercial extends Customer {
	protected String creditRating;
	protected String contactPerson;
	protected String contactPersonPhone;
	
	/** constructor for commercial customer
	 * 
	 * @param name
	 * @param address
	 * @param phone
	 * @param creditRating
	 * @param contactPerson
	 * @param contactPersonPhone
	 */
	public Commercial(String name, String address, String phone, String creditRating, String contactPerson, String contactPersonPhone) {
		super(name, address, phone);
		this.creditRating = creditRating;
		this.contactPerson = contactPerson;
		this.contactPersonPhone = contactPersonPhone;
	}
	
	// get
	
	/** get Credit Rating
	 * <p>Example: AAA, BBB, AAa
	 * 
	 * @return creditRating
	 */
	public String getCreditRating() {
		return this.creditRating;
	}
	
	/** get Contact Person
	 * 
	 * @return contactPerson
	 */
	public String getContactPerson() {
		return this.contactPerson;
	}
	
	/** get Contact Person Phone
	 * 
	 * @return contactPersonPhone
	 */
	public String getContactPersonPhone() {
		return this.contactPersonPhone;
	}
	
	// set
	
	/** set Credit Rating
	 * 
	 * @param creditRating
	 */
	public void setCreditRating(String creditRating) {
		this.creditRating = creditRating;
	}
	
	/** set Contact Person
	 * 
	 * @param contactPerson
	 */
	public void setContactPerson(String contactPerson) {
		this.contactPerson = contactPerson;
	}
	
	/** set Contact Person Phone
	 * 
	 * @param contactPersonPhone
	 */
	public void setContactPersonPhone(String contactPersonPhone) {
		this.contactPersonPhone = contactPersonPhone;
	}
	
	/** display the commercial information in a string to return to the user
	 * 
	 */
	public String toString() {
		String message =  "Name | address | phone\n\t  " + this.name + " | " + this.address + " | " + this.phone + "\n\n";
		message += "\t   Credit Rating: " +  this.creditRating;
		message += "\n\t  Contact Person: " + this.contactPerson;
		message += "\n\t   Contact Phone: " + this.contactPersonPhone;
		return message;
	}

}
