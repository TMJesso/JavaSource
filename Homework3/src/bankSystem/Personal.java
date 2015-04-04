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
// personal cusomter created from customer class adding home phone and work phone
public class Personal extends Customer {
	protected String homePhone;
	protected String workPhone;
	
	/** constructor for personal customer
	 * 
	 * @param name
	 * @param address
	 * @param phone
	 * @param homePhone
	 * @param workPhone
	 */
	public Personal(String name, String address, String phone, String homePhone, String workPhone) {
		super(name, address, phone);
		this.homePhone = homePhone;
		this.workPhone = workPhone;
	}
	
	// get
	
	/** get Home Phone
	 * 
	 * @return homePhone
	 */
	public String getHomePhone() {
		return this.homePhone;
	}
	
	/** get Work Phone
	 * 
	 * @return workPhone
	 */
	public String getWorkPhone() {
		return this.workPhone;
	}
	
	
	// set
	
	/** set Home Phone
	 * 
	 * @param homePhone
	 */
	public void setHomePhone(String homePhone) {
		this.homePhone = homePhone;
	}
	
	/** set Work Phone
	 * 
	 * @param workPhone
	 */
	public void setWorkPhone(String workPhone) {
		this.workPhone = workPhone;
	}
	
	
	/** display personal customer information in a string to return to the user
	 * 
	 */
	public String toString(){
		String message = "Name | address | phone\n\t  " + this.name + " | " + this.address + " | " + this.phone + "\n\n";
		message += "\t  Home Phone: " + this.homePhone + " | Work phone: " + this.workPhone;
		return message;
	}

}
