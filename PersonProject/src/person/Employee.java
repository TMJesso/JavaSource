package person;

public abstract class Employee extends Person {
	// instance variables
	protected String employeeID;
	
	public Employee(String name, String address, int age, Country birth, Country residence, String employeeID) {
		super (name, address, age, birth, residence);
		this.employeeID = employeeID;
	}
	
	// instance methods
	protected abstract double calculatePay();
	
}
