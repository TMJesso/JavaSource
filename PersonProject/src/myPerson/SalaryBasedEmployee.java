package myPerson;

public final class SalaryBasedEmployee extends Employee {
	// instance variables
	private double annualWage;
	private int dependents;
	private int maritalStatus;
	private double taxableWages;
	
	/** salary based employee 
	 * 
	 * 
	 * <p>
	 * maritalStatus: 0=Single, 1=Married, 2=Separated, 3=Legal Separation, 4=Divorced, 5=Widow(er)<p>
	 * taxableWages: Taxable wages could be different and it depends on the employee's pre-tax salary reductions<p>
	 * 		example: Cafeteria plans, flexible spending accounts, Health Savings Accounts, Archer Medical Savings Accounts, Deferred Arrangements, etc.
	 * <p>
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
	 * @param annualWage
	 * @param dependents
	 * @param maritalStatus
	 * @param taxableWages
	 * 
	 * 
	 */
	public SalaryBasedEmployee(String name, String address, String city, String state, String zip, String phone, int age, Country birth, Country residence, java.util.Date created, int birthMonth, int birthDay, int birthYear, String employeeID, String employeeSOC, int monthHire, int dayHire, int yearHire, double annualWage, int dependents, int maritalStatus, double taxableWages) {
		super (name, address, city, state, zip, phone, age, birth, residence, created, birthMonth, birthDay, birthYear,  employeeID, employeeSOC, monthHire, dayHire, yearHire);
		this.annualWage = annualWage;
		this.dependents = dependents;
		this.maritalStatus = maritalStatus;
		if (taxableWages == 0.00) {
			this.taxableWages = calculateTotalPay();
		}
		
	}

	/** calculate total pay for this employee
	 * 
	 * @return weekly pay
	 */
	protected double calculateTotalPay() {
		return (Math.floor((annualWage / 52)*100))/100; // weekly pay
	}
	
	/** display this employee's selected information
	 * 
	 * @return output
	 */
	public String toString() {
		String output = super.toString();
		output += "\n This is a salary-based employee\n";
		output += "Employee ID is " + this.employeeID;
		output += "\nEmployee Gross Weekly Salary: " + this.calculateTotalPay();
		return output;
	}
	
	/** calculate payroll
	 * 		This is dependent on the Payroll class being implemented which
	 * 		is not ready yet but will be by the end of the class
	 * 
	 * @return netIncome
	 */
	private double calculatePayroll() {
		// return the amount of taxes
		double gross = calculateTotalPay();
		double taxable = this.taxableWages;
		double rateOASDI = getOASDIRate();
		double rateHI = getHIRate();
		double stateIncomeTax = getStateIncomeTax();
		double federalIncomeTax = getFederalIncomeTax();
		double cityIncomeTax = getCityIncomeTax();
		double employeeOASDI = taxable * rateOASDI;
		double employeeHI = taxable * rateHI;
		double incomeTax = stateIncomeTax + federalIncomeTax + employeeOASDI + employeeHI + cityIncomeTax;
		double netIncome = gross - incomeTax;
		return netIncome;
	}
	
	/** get the FICA:OASDI rate from the Payroll class
	 * 
	 * @return rate
	 */
	private double getOASDIRate() {
		// get rate from payroll system but for now it returns 6.2%
		// right now it is set to an amount that may or may not be current
		// with the current payroll tax calculations for 2015
		double rate = 6.2;
		
		return rate / 100;
	}
	
	/** get the FICA:HI rate from the Payroll class
	 * 
	 * @return rate
	 */
	private double getHIRate() {
		// get rate from payroll system but for now it returns 1.45%
		// right now it is set to an amount that may or may not be current
		// with the current payroll tax calculations for 2015
		double rate = 1.45;
		return rate / 100;
	}
	
//	/** get the income tax withholding from the Payroll class
//	 * this is a generic form and I may remove it at a later date but for now it stays
//	 * 
//	 * @return income tax to withhold
//	 */
//	private double getIncomeTaxWithholding() {
//		// get the income tax withholding using the information from this employee and the payroll system
//		// right now it is set to an arbitrary amount
//		return 29.00;
//	}
	
	/** get the state income tax withholding from the Payroll class
	 * 
	 * @return state income tax to withhold
	 */
	private double getStateIncomeTax() {
		// get state income tax from payroll system and return the amount
		// right now it is set to an arbitrary amount
		return 12.36;
	}
	
	/** get federal income tax withholding from the Payroll class
	 * 
	 * @return federal income tax to withhold
	 */
	private double getFederalIncomeTax() {
		// get the federal income tax from the payroll system and return the amount
		return 38.46;
	}
	
	/** get city or local income tax withholding from the Payroll class
	 * 
	 * @return federal income tax to withhold
	 */
	private double getCityIncomeTax() {
		// get the city income tax from the payroll system and return the amount
		return 8.46;
	}

	protected String generatePayrollReport() {
		String output = "Employee Name|\t\t|M|\t|D|\t|Earnings\t\t\t\t\t\t\t|Deductions\t\t\t\t\t\t\t|Net Pay\n";
		output += "\t\t\t\t\t\t|Regular\t|Bonus\t|Total\t|OASDI\t|HI\t\t|FIT\t\t|SIT\t\t|CIT\t\t|\n";
		output += super.name + "\t|"+this.maritalStatus+"\t|" + this.dependents + "\t|" + calculateTotalPay() + "\t|" + (calculateTotalPay() - this.taxableWages) + "\t|" + this.taxableWages + "\t|" + (getOASDIRate() * this.taxableWages) + "\t|" + (getHIRate() * this.taxableWages) + "\t|" + getFederalIncomeTax() + "\t|" + getStateIncomeTax() + "\t|" + getCityIncomeTax() + "\t|" + calculatePayroll() + "\n";
		return output;
	}
	
	
	
	/** salary based employee 
	 * 
	 * @param name
	 * @param address
	 * @param age
	 * @param birth
	 * @param residence
	 * @param employeeID
	 * @param annualWage
	 * @param dependents: the number of dependents
	 * @param maritalStatus: 0=Single, 1=Married, 2=Separated, 3=Legal Separation, 4=Divorced, 5=Widow(er)
	 * @param taxableWages: Taxable wages could be different and it depends on the employee's pre-tax salary reductions
	 * 		example: Cafeteria plans, flexible spending accounts, Health Savings Accounts, Archer Medical Savings Accounts, Deferred Arrangements
	 */

}
