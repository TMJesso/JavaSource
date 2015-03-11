/*
 * Author: Theral Jessop
 * Course: INFO 211
 * Professor: Dr. Awny Alnusair
 * 
 * Description:
 * this is a sub and the final class of Employee.
 * hourly based employee 
 * 
 * 
 */



package myPerson;

public final class HourlyBasedEmployee extends Employee {
	// instance variables
	private double wagePerHour;
	private double overTimeWagePerHour;
	private double regHours;
	private double overTimeHours;
	
	/** hourly based employee constructor
	 * there is no default constructor because if there is an employee created
	 * they will have the information available to create it without making a blank employee
	 * 
	 * @param name
	 * @param address
	 * @param city
	 * @param state
	 * @param zip
	 * @param phone
	 * @param age
	 * @param birth
	 * @param residence
	 * @param created
	 * @param employeeID
	 * @param employeeSOC
	 * @param monthHire
	 * @param dayHire
	 * @param yearHire
	 * @param wagePerHour
	 * @param numberHours
	 * @param overTimeFactor
	 */
	public HourlyBasedEmployee(String name, String address, String city, String state, String zip, String phone, int age, Country birth, Country residence, java.util.Date created, int birthMonth, int birthDay, int birthYear, String employeeID, String employeeSOC, int monthHire, int dayHire, int yearHire, double wagePerHour, double totalHours, double overTimeFactor) {
		super (name, address, city, state, zip, phone, age, birth, residence, created, birthMonth, birthDay, birthYear,  employeeID, employeeSOC, monthHire, dayHire, yearHire);
		this.wagePerHour = wagePerHour;
		this.overTimeWagePerHour = this.wagePerHour * overTimeFactor;
		if (totalHours <= 40) {
			this.regHours = totalHours;
			this.overTimeHours = 0;
		} else {
			this.regHours = 40;
			this.overTimeHours = totalHours - this.regHours;
		}
	}

	
	protected double calculateTotalPay() {
			return (calculateRegPay()) + (calculateOverTimePay());
			
	}
	

	private double calculateRegPay() {
			return regHours * wagePerHour;
	}
	
	private double calculateOverTimePay() {
		return this.overTimeHours * this.overTimeWagePerHour;
	}
	
	
	
	/** hourly based employee constructor
	 * there is no default constructor because if there is an employee created
	 * they will have the information available to create it without making a blank employee
	 * 
	 * 
	 * 
	 * @param name
	 * @param address
	 * @param age
	 * @param birth
	 * @param residence
	 * @param employeeID
	 * @param wagePerHour
	 * @param numberHours
	 * @param overTimeFactor
	 */


}
