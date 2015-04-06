/*
 * Author    : Theral Jessop
 * For       : INFO 211
 * Professor : Dr. Awny Alnusair
 * 
 * Description
 * Create the owner information and the owner does not have to own a car
 * but the information needs to remain if he did own a car but later sold it
 * 
 * 
 * 
 */
package carOwner;
public class Owner {
	private String ownerName;
	private String ownerAddress;
	
	/** default constructor */
	public Owner() {
		this.ownerName = "";
		this.ownerAddress = "";
	}
	
	/** non-default constructor */
	public Owner(String name, String address) {
		this.ownerName = name;
		this.ownerAddress = address;
	}
	
	/** set owners name 
	 * 
	 * @param name
	 * */
	public void setOwnerName(String name) {
		this.ownerName = name;
	}
	
	/** set owners address
	 * 
	 * 
	 * @param address
	 */
	public void setOwnerAddress(String address) {
		this.ownerAddress = address;
	}
	
	/** set make of cars owned
	 * 
	 * @param make
	 */
	
	/** get owners name
	 * 
	 * @return name
	 */
	public String getOwnerName() {
		return this.ownerName;
	}
	
	/** get owners address
	 * 
	 * @return address
	 */
	public String getOwnerAddress() {
		return this.ownerAddress;
	}
	
	
	/** display the owner information */
	public String toString() {
		String owner = "\nOwner Name and Address\n------------------------------------------\n" + 
				this.ownerName + 
				" " + this.ownerAddress + 
				"\n==========================================";
		
		return owner;
	}
	
}

