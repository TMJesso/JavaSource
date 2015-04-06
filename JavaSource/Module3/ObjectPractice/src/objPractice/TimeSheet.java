package objPractice;

public class TimeSheet {
	private String empID;
	private double regHours;
	private double overTimeHours;

	/** default constructor */
	public TimeSheet() {
		this.empID = "";
		this.regHours = 0.0;
		this.overTimeHours = 0.0;
	}
	
	/** non-default constructor */
	public TimeSheet(String empID, double regHours, double overTimeHours) {
		this.empID = empID;
		this.regHours = regHours;
		this.overTimeHours = overTimeHours;
	}
	
	/*
	 ***********************************
	 * 								   *
	 *       // get / set methods      *
	 *        						   *
	 ***********************************
	 */
	// set methods
	
	/** set EmpID */
	public void setEmpID(String empID) {
		this.empID = empID;
	}
	
	/** set Regular Hours worked */
	public void setRegHours(double regHours) {
		this.regHours = regHours;
	}
	
	/** set Over Time Hours worked */
	public void setOverTimeHours(double overTimeHours) {
		this.overTimeHours = overTimeHours;
	}
	
	// get methods
	/** get EmpID */
	public String getEmpID() {
		return this.empID;
	}
	
	/** get regular hours */
	public double getRegHours() {
		return this.regHours;
	}
	
	/** get over time hours worked */
	public double getOverTimeHours() {
		return this.overTimeHours;
	}
	
}
