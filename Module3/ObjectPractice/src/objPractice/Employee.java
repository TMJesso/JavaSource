package objPractice;

public class Employee {
	// (1)
	// properties / instance variables / data members
	// list them as private to protect them from outside
	// access
	
	/* 1*/private String empLname;
	/* 2*/private String empFname;
	/* 3*/private String empMname;
	/* 4*/private String empID;
	/* 5*/private double empGrossWage; // gross pay based on the pay period and rate
	/* 6*/private String empAddress;
	/* 7*/private String empCity;
	/* 8*/private String empState;
	/* 9*/private String empZip;
	/*10*/private String empHomePhone;
	/*11*/private String empCellPhone;
	/*12*/private int    empExemptions; // # of exemptions claiming on taxes
	/*13*/private String empMarital;
	/*14*/private String empGender;
	/*15*/private double empRate; // per hour, per pay period salary
	/*16*/private String empPayPeriod; // daily, weekly, biweekly, bimonthly, monthly, quarterly, semiannual, annually
	/*17*/private int    empLate; // # of time the employee has been late
	/*18*/private String empHireDate;
	/*19*/private double empVacationDaysEarned;
	/*20*/private String empPosition;
	/*21*/private String empInsurance;
	/*22*/private String empSSN;
	/*23*/private String empDepartment;
	
	
	// constructor method: special method for creating objects of the class
	// constructor: has same name as the class name, also has no return type, its public method
	
	// you can add as many constructors as you wish
	
	// default constructor:
	public Employee() {
		// this is optional in this instance
		/* 1*/ this.empLname = "";
		/* 2*/ this.empMname = "";
		/* 3*/ this.empFname = "";
		/* 4*/ this.empID = "#####";
		/* 5*/ this.empGrossWage = 0.00;
		/* 6*/ this.empSSN = "###-##-####";
		/* 7*/ this.empAddress = "";
		/* 8*/ this.empCity = "";
		/* 9*/ this.empState = "!!";
		/*10*/ this.empZip = "#####";
		/*11*/ this.empHomePhone = "(###) ###-####";
		/*12*/ this.empCellPhone = "(###) ###-####";
		/*13*/ this.empGender = "!";
		/*14*/ this.empExemptions = 0;
		/*15*/ this.empHireDate = "00/00/0000";
		/*16*/ this.empInsurance = "";
		/*17*/ this.empMarital = "";
		/*18*/ this.empVacationDaysEarned = 0.0;
		/*19*/ this.empPosition = "";
		/*20*/ this.empPayPeriod = "";
		/*21*/ this.empDepartment = "";
		/*22*/ this.empRate = 0.0;
		/*23*/ this.empLate = 0;
		
		
	}
	
	// non-default constructor:
	/** first, middle, last, ID, salary, SSN */
	public Employee(String employeeFirstName, String employeeMiddleName,
			String employeeLastName, String empID, double empSalary, String empSSN,
			String empAddress, String empCity, String empState, String empZip, String empHomePhone,
			String empCellPhone, int empExemptions, String empMarital, String empGender,
			double empRate, String empPayPeriod, int empLate, String empHireDate, 
			double empVacationDaysEarned, String empPosition, String empInsurance, 
			String empDepartment) {
		// example of using this or not using this
		this.empFname = employeeFirstName;
		this.empMname = employeeMiddleName;
		this.empLname = employeeLastName;
		this.empID = empID;
		this.empGrossWage = empSalary;
		this.empSSN = empSSN;
		this.empAddress = empAddress;
		this.empCity = empCity;
		this.empState = empState;
		this.empZip = empZip;
		this.empHomePhone = empHomePhone;
		this.empCellPhone = empCellPhone;
		this.empExemptions = empExemptions;
		this.empMarital = empMarital;
		this.empGender = empGender;
		this.empRate = empRate;
		this.empPayPeriod = empPayPeriod;
		this.empLate = empLate;
		this.empHireDate = empHireDate;
		this.empVacationDaysEarned = empVacationDaysEarned;
		this.empPosition = empPosition;
		this.empInsurance = empInsurance;
		this.empDepartment = empDepartment;
	}
	
	// set / get methods
	// set methods
	/** set last, first, middle name, if no middle name, must be a blank string */
	public void setEmpName(String empLastName, String empFirstName, String empMiddleName) {
		this.empLname = empLastName;
		this.empMname = empMiddleName;
		this.empFname = empFirstName;
	}
	
	/** set unique employee id */
	public void setEmpID(String empID) {
		this.empID = empID;
	}
	
	/** set gross wages for this employee */
	public void setEmpSalary(double empSalary) {
		this.empGrossWage = empSalary;
	}
	
	/** set the social security number */
	public void setEmpSSN(String empSSN) {
		this.empSSN = empSSN;
	}
	
	/** set the address */
	public void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
	}
	
	/** set the city */
	public void setEmpCity(String empCity) {
		this.empCity = empCity;
	}
	
	/** set the state */
	public void setEmpState(String empState) {
		this.empState = empState;
	}
	
	/** set the zip code */
	public void setEmpZip(String empZip) {
		this.empZip = empZip;
	}
	
	/** set the home phone number example: (999) 999-9999 */
	public void setEmpHomePhone(String empHomePhone) {
		this.empHomePhone = empHomePhone;
	}
	
	/** set the cell phone number example: (999) 999-9999 */
	public void setEmpCellPhone(String empCellPhone) {
		this.empCellPhone = empCellPhone;
	}
	
	/** set the exemptions the employee is claiming on their taxes */
	public void setEmpExemption(int empExemptions) {
		this.empExemptions = empExemptions;
	}
	
	/** set the marital status of the employee example: Single/Married/Separated/Divorced/Widow/Widower/*/
	public void setEmpMarital(String empMarital) {
		this.empMarital = empMarital;
	}
	
	/** set the gender example: F or M or Female or Male*/
	public void setEmpGender(String empGender) {
		this.empGender = empGender;
	}
	
	/** set the rate at which the employee is paid */
	public void setEmpRate(double empRate) {
		this.empRate = empRate;
	}
	
	/** set the type of pay period the employee has example: weekly, biweekly, semimonthly, monthly, quarterly, semiannually, annuually, daily */
	public void setEmpPaPeriod(String empPayPeriod) {
		this.empPayPeriod = empPayPeriod;
	}
	
	/** set how many times the employee has been late this year RESETS annually */
	public void setEmpLate(int empLate) {
		this.empLate = empLate;
	}
	
	/** set the employee's hire in date, this is the day they started working */
	public void setEmpHireDate(String empHireDate) {
		this.empHireDate = empHireDate;
	}
	
	/** set the number of day the employee has accumulated in vacation days earned */
	public void setEmpVacationDaysEarned(double empVacationDaysEarned) {
		this.empVacationDaysEarned = empVacationDaysEarned;
	}
	
	/** set the position the employee holds */
	public void setEmpPosition(String empPosition) {
		this.empPosition = empPosition;
	}
	
	/** set the type of insurance the employee has */
	public void setEmpInsurance(String empInsurance) {
		this.empInsurance = empInsurance;
	}
	
	/** set the department that the employee belongs to */
	public void setEmpDepartment(String empDepartment) {
		this.empDepartment = empDepartment;
	}
	
	// get methods
	public String getEmpName() {
		String message = "";
		message = this.empLname + ", " + this.empFname + " " + this.empMname;
		return message;
	}
	
	public String getEmpID() {
		return this.empID;
	}
	
	public double getEmpSalary() {
		return this.empGrossWage;
	}
	
	/** get the social security number */
	public String getEmpSSN() {
		return this.empSSN;
	}
	
	/** get the address */
	public String getEmpAddress() {
		return this.empAddress;
	}
	
	/** get the city */
	public String setEmpCity() {
		return this.empCity;
	}
	
	/** get the state */
	public String setEmpState() {
		return this.empState;
	}
	
	/** get the zip code */
	public String getEmpZip() {
		return this.empZip;
	}
	
	/** get the home phone number example: (999) 999-9999 */
	public String setEmpHomePhone() {
		return this.empHomePhone;
	}
	
	/** get the cell phone number example: (999) 999-9999 */
	public String getEmpCellPhone() {
		return this.empCellPhone;
	}
	
	/** get the exemptions the employee is claiming on their taxes */
	public int setEmpExemption() {
		return this.empExemptions;
	}
	
	/** get the marital status of the employee example: Single/Married/Separated/Divorced/Widow/Widower/*/
	public String getEmpMarital() {
		return this.empMarital;
	}
	
	/** get the gender example: F or M or Female or Male*/
	public String getEmpGender() {
		return this.empGender;
	}
	
	/** get the rate at which the employee is paid */
	public double setEmpRate() {
		return this.empRate;
	}
	
	/** get the type of pay period the employee has example: weekly, biweekly, semimonthly, monthly, quarterly, semiannually, annuually, daily */
	public String getEmpPaPeriod() {
		return this.empPayPeriod;
	}
	
	/** get how many times the employee has been late this year RESETS annually */
	public int setEmpLate() {
		return this.empLate;
	}
	
	/** get the employee's hire in date, this is the day they started working */
	public String getEmpHireDate() {
		return this.empHireDate;
	}
	
	/** get the number of day the employee has accumulated in vacation days earned */
	public double setEmpVacationDaysEarned() {
		return this.empVacationDaysEarned;
	}
	
	/** get the position the employee holds */
	public String setEmpPosition() {
		return this.empPosition;
	}
	
	/** set the type of insurance the employee has */
	public String setEmpInsurance() {
		return this.empInsurance;
	}
	
	/** get the department that the employee belongs to */
	public String setEmpDepartment() {
		return this.empDepartment;
	}

	// display the object values:
	public String displayEmployee() {
		String message = "";
		message = "\nEmployee Name: " + this.empLname + ", " + this.empFname + " " + this.empMname;
		message += "\nEmployee ID: " + this.empID;
		message += "\nEmployee Wage: " + this.empGrossWage;
		
		return message;
	}
}
