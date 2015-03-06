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
	private Cars[] cars = new Cars[100];
	private int numberOfCars;
	
	
	
	/** default constructor */
	public Owner() {
		this.ownerName = "";
		this.ownerAddress = "";
		this.numberOfCars = 0;
		//this.cars[this.numberOfCars] = Cars;
	}
	
	/** non-default constructor */
	public Owner(String name, String address, Cars make) {
		this.ownerName = name;
		this.ownerAddress = address;
		this.cars[this.numberOfCars] = make;
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
		String owner = "\nOwner name:   " + this.ownerName
				+ "\nOwner Address: " + this.ownerAddress
				+ "\n";
		
		return owner;
	}
	
}

