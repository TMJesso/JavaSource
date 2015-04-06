package person;

public final class SalaryBasedEmployee extends Employee {
	// instance variables
	private double annualWage;
	
	public SalaryBasedEmployee(String name, String address, int age, Country birth, Country residence, String employeeID, double annualWage) {
		super (name, address, age, birth, residence, employeeID);
		this.annualWage = annualWage;
	}

	
	protected double calculatePay() {
		return annualWage / 52; // weekly pay
	}
	
	public String toString() {
		String output = super.toString();
		output += "\n This is a salary-based employee\n";
		output += "Employee ID is " + this.employeeID;
		output += "\nEmployee Weekly Salary: " + this.calculatePay();
		return output;
	}

}
