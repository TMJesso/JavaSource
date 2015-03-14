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
	
}
