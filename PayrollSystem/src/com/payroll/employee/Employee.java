package com.payroll.employee;

/** employee abstract class
 * 
 * @author Theral Jessop<br>
 * Mar 28, 2015<br>
 * Employee.java<br>
 *
 */
public abstract class Employee {
	String ssn, name, address, location, phone, maritalStatus, payPeriod, position, department;
	int dependents;
	java.util.Date hireDate, terminationDate;
	double taxDeduction, groupInsurance, ytdBonus, ytdTaxableAmount, ytdFIT, ytdSIT, ytdCIT, ytdOASDI, ytdHI;
	boolean active;
	
	
	/** constructor for Employee
	 * 
	 * @param ssn String can only be created using the constructor
	 * @param name String holds the name of the employee
	 * @param address String holds the address of the employee
	 * @param location String holds the city, state and zip
	 * @param phone String and will be formated to (xxx) xxx-xxx unless otherwise formated
	 * @param maritalStatus String (default single), married, widow(er), divorced, separated
	 * @param dependents integer number of dependents (default 0)
	 * @param payPeriod String (default weekly), biweekly, bimonthly, monthly, quarterly, annually
	 * @param position String position the employee holds
	 * @param department String department employee belongs to
	 * @param hireDate java.util.Date hireDate (default todays date)
	 * @param active boolean is active employee
	 * @param taxDeduction double an additional amount employee wants deducted from each pay period
	 * @param groupInsurance double company sponsored health insurance
	 * @param ytdBonus double YTD bonuses
	 * @param ytdTaxableAmount double YTD taxable amount which can be different than gross amount
	 * @param ytdFIT double YTD Federal Income Tax
	 * @param ytdSIT double YTD State Income Tax
	 * @param ytdCIT double YTD City Income Tax (also listed as local on some documents)
	 * @param ytdOASDI double YTD Social Security Tax
	 * @param ytdHI double YTD Medicare Tax
	 * @param taxFiles TaxFiles get tax files to be used
	 * 
	 */
	Employee(String ssn, String name, String address, String location, String phone, String maritalStatus, 
			int dependents, String payPeriod, String position, String department, java.util.Date hireDate,
			boolean active, double taxDeduction, double groupInsurance, double ytdBonus, 
			double ytdTaxableAmount, double ytdFIT,	double ytdSIT, double ytdCIT, double ytdOASDI, 
			double ytdHI) {
		
		this.ssn = ssn;
		this.name = name;
		this.address = address;
		this.location = location;
		setPhone(phone); // validate phone
		updateMaritalStatus(maritalStatus); // validate marital status
		updateDependents(dependents); // validate dependents
		updatePayPeriod(payPeriod); // validate pay periods
		updatePosition(position); // validate position
		this.department = department;
		this.hireDate = hireDate;
		this.terminationDate = null; // creating a new employee means they have not been terminated
		this.active = active;
		this.taxDeduction = taxDeduction;
		this.groupInsurance = groupInsurance;
		this.ytdBonus = ytdBonus;
		this.ytdTaxableAmount = ytdTaxableAmount;
		this.ytdFIT = ytdFIT;
		this.ytdSIT = ytdSIT;
		this.ytdCIT = ytdCIT;
		this.ytdOASDI = ytdOASDI;
		this.ytdHI = ytdHI;
		
	}
	
	// get
	
	/** get name
	 * 
	 * @return name String employee name
	 */
	protected String getName() {
		return this.name;
	}
	
	/** get address
	 * 
	 * @return address String physical or mailing address
	 */
	protected String getAddress() {
		return this.address;
	}
	
	/** get location
	 * 
	 * @return location String city, state zip
	 */
	protected String getLocation() {
		return this.location;
	}
	
	/** get phone
	 * 
	 * @return phone String preferred phone
	 */
	protected String getPhone() {
		return this.phone;
	}
	
	/** get marital status
	 * 
	 * @return maritalStatus String single, married, divorced, widow, widower, separated
	 */
	protected String getMaritalStatus() {
		return this.maritalStatus;
	}
	
	/** getDependents
	 * 
	 * @return dependents integer number of dependents employee claims
	 */
	protected int getDependents() {
		return this.dependents;
	}
	
	/** get pay period
	 * 
	 * @return payPeriod String weekly, biweekly, bimonthly, monthly, quarterly, semi-annually, annually
	 */
	protected String getPayPeriod() {
		return this.payPeriod;
	}
	
	/** get group insurance
	 * 
	 * @return groupInsurance double amount of the group insurance employee is charged annually
	 */
	protected double getGroupInsurance() {
		return this.groupInsurance;
	}
	
	/** get position
	 * 
	 * @return position String position held by the employee 
	 */
	protected String getPosition() {
		return this.position;
	}
	
	/** get department
	 * 
	 * @return department String department employee belongs to
	 */
	protected String getDepartment() {
		return this.department;
	}
	
	/** get active<br><br>
	 * is the employee an active employee<br>
	 * 
	 * @return active boolean true or false
	 */
	protected boolean getActive() {
		return this.active;
	}
	
	/** get hire date
	 * 
	 * @return hireDate java.util.Date the date the employee was hired
	 */
	protected java.util.Date getHireDate() {
		return this.hireDate;
	}
	
	/** get termination date
	 * 
	 * @return terminationDate java.util.Date date employee was terminated
	 * 
	 */
	protected java.util.Date getTerminaitonDate() {
		return this.terminationDate;
	}
	

	// set
	
	/** set name<br><br>
	 * employee name<br>
	 * 
	 * @param name String name of the employee
	 */
	protected void setName(String name) {
		this.name = name;
	}
	
	/** set address<br><br>
	 * 
	 * 
	 * @param address String physical or mailing address
	 */
	protected void setAddress(String address) {
		this.address = address;
	}
	
	/** set location<br><br>
	 * the location is the city, state zip<br><br>
	 * example:<br>
	 * Indianapolis, IN 46201<br>
	 * 
	 * @param location String
	 */
	protected void setLocation(String location) {
		this.location = location;
	}
	
	/** set phone<br><br>
	 * validate the phone<br>
	 * if the phone is 10 digits then add the () for the area code and - between the prefix and number<br><br>
	 * example:<br>
	 * 5555551234 would be changed to (555) 555-1234<br>
	 * 
	 * @param phone String
	 */
	protected void setPhone(String phone) {
		if (phone.length() == 10) {
			phone = "(" + phone.substring(0, 4) + ") " + phone.substring(4, 7) + "-" + phone.substring(7, phone.length());
		}
		this.phone = phone;
	}
	
	/** set group insurance
	 * 
	 * @param groupInsurance double amount of group insurance employee is charged annually
	 */
	protected void setGroupInsurance(double groupInsurance) {
		this.groupInsurance = groupInsurance;
	}
	
	/** set hire date
	 * 
	 * @param hireDate java.util.Date date employee was hired
	 */
	protected void setHireDate(java.util.Date hireDate) {
		this.hireDate = hireDate;
	}
	
	
	// abstract methods
	
	/** calculate payroll
	 * 
	 * method is defined in child class
	 * 
	 */
	abstract void calculatePayroll();
	
	/** terminate employee<br><br>
	 * when the employee is terminated,<br>
	 * set the termination date,<br>
	 * and change the active status to false<br>
	 * 
	 * @return true or false indicating that the termination was successful or not
	 * 
	 * method is defined in child class
	 */
	abstract boolean terminateEmployee();
	
	/** post employee record<br><br>
	 * this will add the current pay period to the YTD fields in the employee record<br>
	 * 
	 * @return true or false indicating that the post was successful or not
	 * 
	 * method is defined in child class
	 */
	abstract boolean postEmployeeRecord();
	
	/** abstract update tax deduction<br>
	 * if tax deduction is less than 0, set to 0<br>
	 * if tax deduction is greater than 5% of gross pay, set to 5% of gross pay
	 * 
	 * method is defined in child class
	 */
	abstract void updateTaxDeduction();
	
	/** apply bonus<br>
	 * if the bonus being applied is less than 0,<br>
	 * set it to 0
	 * 
	 * method is defined in child class
	 */
	abstract void applyBonus();
	
	// general methods
	
	/** update marital status <br>
	 * validates input
	 * 
	 * @param marital String (default single), married, widow, widower, divorced, separated
	 * 
	*/
	protected void updateMaritalStatus(String marital) {
		marital = marital.toLowerCase(); // make sure the string is consistent
		switch (marital) {
			case "single": break;
			case "married": break;
			case "widow": break;
			case "widower": break;
			case "divorced": break;
			case "separated": break;
			default: marital="single";break;
		}
		this.maritalStatus = marital;
	}
	
	/** update dependents<br>
	 * cannot be a negative number and if it is will be set to 0<br>
	 * cannot be greater than 20 and if it is will be set to 20<br>
	 * 
	 * @param dependents
	 */
	protected void updateDependents(int dependents) {
		if (dependents < 0) {
			dependents = 0;
		} else if (dependents > 20) {
			dependents = 20;
		}
		this.dependents = dependents;
	}
	
	/** update pay period<br><br>
	 * available values are:<br>
	 * weekly<br>
	 * biweekly<br>
	 * bimonthly<br>
	 * monthly<br>
	 * quarterly<br>
	 * semi-annually<br>
	 * annually<br>
	 * daily<br>
	 * 
	 * @param payPeriod
	 */
	protected void updatePayPeriod(String payPeriod) {
		payPeriod = payPeriod.toLowerCase();
		switch (payPeriod) {
		case "weekly": break;
		case "biweekly": break;
		case "bimonthly": break;
		case "monthly": break;
		case "quarterly": break;
		case "semi-annually": break;
		case "annually": break;
		case "daily": break;
		default: payPeriod = "weekly"; break;
		}
		this.payPeriod = payPeriod;
		
	}
	
	/** update position<br><br>
	 * if position is empty then assign "associate" as the position the employee holds<br>
	 * 
	 * @param position
	 */
	protected void updatePosition(String position) {
		if (position.isEmpty()) {
			position = "Associate";
		}
		this.position = position;
	}
	
	/** update department
	 * 
	 * @param department
	 */
	protected void updateDepartment(String department) {
		this.department = department;
	}
	
	protected void applyBonus(double bonus) {
		if (bonus < 0) {
			bonus = 0;
		}
		this.ytdBonus += bonus;
	}
	
	
	public String toString() {
		String message = "\n=============================================";
		message += "Employee Info:\n\t" + this.name + " " + this.address + " " + this.location + "\n";
		message += "\t" + this.phone + " " + this.maritalStatus + " " + "Dependents: " + this.dependents + "\n";
		message += "\tEmployment Info:\n\t\t\t" + this.payPeriod + " " + this.position + " " + this.department + " " + this.hireDate;
		
		
		return message;
	}
	
	
	
}
