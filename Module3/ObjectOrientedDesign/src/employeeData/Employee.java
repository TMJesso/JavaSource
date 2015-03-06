package employeeData;

public class Employee {
	
	//properties / instance variables / data members
	private String empName;
	private String empID;
	private double empSalary;
	private String empCounty;
	
	//constructor method: special method for creating objects of the class
	//constructor: has same name as the class name. Also has no return type. Constructor method is public.
	//You can add as many constructors as you wish.
	//Default constructor
	public Employee() {
		//this: keyword that refers to the current object
		this.empName = "";
		this.empID = "";
		this.empSalary = 0.0;
		this.empCounty = "";
	}
	
	//Non-default constructor
	public Employee(String empName, String empID, double empSalary, String empCounty) {
		this.empName = empName;
		this.empID = empID;
		this.empSalary = empSalary;
		this.empCounty = empCounty;
	}
	
	//Set/get methods:
	//set name
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	
	//set ID
	public void setEmpID(String empID) {
		this.empID = empID;
	}
	
	//set Salary
	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}
	
	// set County
	public void setEmpCounty(String empCounty) {
		this.empCounty = empCounty;
	}
	
	//get name
	public String getEmpName() {
		return this.empName;
	}
	
	//get ID
	public String getEmpID() {
		return this.empID;
	}
	
	//get Salary
	public double getEmpSalary() {
		return this.empSalary;
	}
	
	// get County
	public String getEmpCounty() {
		return this.empCounty;
	}
	
	//display the object values:
	// toString is a val-returning method (returns a String)
	public String toString() {
		String message ="";
		message = "\nEmployee Name:    " + this.empName;
		message += "\nEmployee ID:     " + this.empID;
		message += "\nEmployee Salary: " + this.empSalary;
		message += "\nEmployee County: " + this.empCounty;
		
		return message;
	}
	
	
	//Add another method to the employee class, named adjustSalary that would accept a percentage
	// value and adjust the salary of a given employee object accordingly
	// make sure to go to the employee class and make use of this method
	// increase emp1's salary by 10% and decrease emp2 by 5%
	public void adjustSalary(double percent, boolean increase) {
		if(percent > 0) {
			percent = percent/100;
		}
		if (increase) {
			this.empSalary += (Math.floor((((this.empSalary * percent)*100))))/100;
		} else {
			this.empSalary -= (Math.floor((((this.empSalary * percent)*100))))/100;
		}
	}
	
	public void calculateTravelAssistance() {
		if(this.getEmpCounty() == "Howard" ){ 
			this.setEmpSalary(this.getEmpSalary() + 50.00);
		} else {
			this.setEmpSalary(this.getEmpSalary() + 150.00);
		}
	}
}
