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
// abstract customer class used to define the personal and commercial classes
public abstract class Customer {
	protected String name;
	protected String address;
	protected String phone;
	
	/** constructor for customer which is used to create the personal and commercial customers
	 * use personal or commercial constructors to create specific customers
	 * 
	 * @param name
	 * @param address
	 * @param phone
	 */
	protected Customer(String name, String address, String phone) {
		this.name = name;
		this.address = address;
		this.phone = phone;
		
	}
	
	// get
	
	/** get Name
	 * 
	 * @return name
	 */
	public String getName() {
		return this.name;
	}
	
	/** get Address
	 * 
	 * @return address
	 */
	public String getAddress() {
		return this.address;
	}
	
	/** get Phone
	 * 
	 * @return phone
	 */
	public String getPhone() {
		return this.phone;
	}
	
	// set
	
	/** set Name
	 * 
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/** set Address
	 * 
	 * @param address
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	
	/** set Phone
	 * 
	 * @param phone
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
}
