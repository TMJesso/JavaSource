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
		String message = " Home Phone: " + this.homePhone + " Work phone: " + this.workPhone;
		return message;
	}

}
