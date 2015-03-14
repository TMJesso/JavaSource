package bankSystem;

public class Commercial extends Customer {
	protected double creditRating;
	protected String contactPerson;
	protected String contactPersonPhone;
	
	public Commercial(String name, String address, String phone, double creditRating, String contactPerson, String contactPersonPhone) {
		super(name, address, phone);
		this.creditRating = creditRating;
		this.contactPerson = contactPerson;
		this.contactPersonPhone = contactPersonPhone;
	}
	
	public String toString() {
		String message = "Credit Rating: " + this.creditRating + " Contact Person, phone: " + this.contactPerson + ", " + this.contactPersonPhone;
		return message;
	}

}
