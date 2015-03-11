package myPerson;

public abstract class Employee extends Person {
	// instance variables
	protected String employeeID;
	protected String employeeSOC;
	protected int monthHire;
	protected int dayHire;
	protected int yearHire;
	
	
	public Employee(String name, String address, String city, String state, String zip, String phone, int age, Country birth, Country residence, java.util.Date created, int birthMonth, int birthDay, int birthYear, String employeeID, String employeeSOC, int monthHire, int dayHire, int yearHire) {
		super (name, address, city, state, zip, phone, created, birthMonth, birthDay, birthYear, age, birth, residence);
		this.employeeID = employeeID;
		this.employeeSOC = employeeSOC;
		this.monthHire = monthHire;
		this.dayHire = dayHire;
		this.yearHire = yearHire;
	}
	
	// instance methods
	protected abstract double calculateTotalPay();
	
	
}
