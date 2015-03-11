package in_classPerson;

public final class HourlyBasedEmployee extends Employee {
	// instance variables
	private double wagePerHour;
	private double numberHours;
	
	public HourlyBasedEmployee(String name, String address, int age, Country birth, Country residence, String employeeID, double wagePerHour, double numberHours) {
		super (name, address, age, birth, residence, employeeID);
		this.wagePerHour = wagePerHour;
		this.numberHours = numberHours;
	}

	
	protected double calculatePay() {
		if (numberHours <= 40 ) {
			return numberHours * wagePerHour;
		} else {
			return (40 * wagePerHour) + ((numberHours - 40) * (wagePerHour * 2));
		}
			
	}

}
