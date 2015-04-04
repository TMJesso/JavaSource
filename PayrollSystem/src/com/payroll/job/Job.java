package com.payroll.job;

/** Job class<br><br>
 * 
 * @author Theral Jessop<br>
 * Mar 28, 2015<br>
 * Job.java<br>
 *
 */
public class Job {
	String name;
	String description;
	java.util.Date startDate;
	java.util.Date finishDate;
	double penalty;
	double budget;
	double accrued; // amount of expenses accrued while completing this job.
					// If accrue is greater than budget then it went over budget
					// If accrue is equal then it was on budget
					// if accrue is less than budget then it was under budget
	java.util.Date jobCreatedDate;
	
	/** job constructor<br><br>
	 * this assumes that if this is a new Job then there are no accrued expenses<br>
	 * for this job<br><br>
	 * to add accrued expenses for a job that is just created in the system<br>
	 * but has existed, use the setAccrued method<br>
	 * 
	 * @param name String name of job
	 * @param description String a general description of the job with enough detail that it can be used to complete the job
	 * @param startDate java.util.Date date the job starts. this could be a date different than the creation date
	 * @param finishDate java.util.Date date the job must be finished on time
	 * @param penalty double amount of penalty that will be applied per day upon finishDate expiration
	 * @param budget double dollar amount set for the complete of this job
	 * @param jobCreatedDate java.util.Date the date the job was created and can only be set by the constructor
	 * 
	 */
	Job(String name, String description, java.util.Date startDate, java.util.Date finishDate, 
			double penalty, double budget) { 
		this.name = name;
		this.description = description;
		this.startDate = startDate;
		this.finishDate = finishDate;
		this.budget = budget;
		this.penalty = penalty;
		this.accrued = 0.00;
		this.jobCreatedDate = new java.util.Date();
	}
	
	// get
	
	public String getName() {
		return this.name;
	}
	
	public String getDescription() {
		return this.description;
	}
	
	public java.util.Date getStartDate() {
		return this.startDate;
	}
	
	public java.util.Date getFinishDate() {
		return this.finishDate;
	}
	
	public double getBudget() {
		return this.budget;
	}
	
	public double getPenalty() {
		return this.penalty;
	}
	
	public double getAccrued() {
		return this.accrued;
	}
	
	public java.util.Date getJobCreatedDate() {
		return this.jobCreatedDate;
	}
	
	
	//set
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public void setStartDate(java.util.Date startDate) {
		this.startDate = startDate;
	}
	
	public void setFinishDate(java.util.Date finishDate) {
		this.finishDate = finishDate;
	}
	
	public void setPenalty(double penalty) {
		this.penalty = penalty;
	}
	
	public void setBudget(double budget) {
		this.budget = budget;
	}
	
	public void setAccrued(double accrued) {
		this.accrued = accrued;
	}
	
	/** display job information in a nicely formated manner
	 * 
	 * return message String 
	 */
	public String toString() {
		String message = "\n---------------------------------------\nJob Information Created: " + this.jobCreatedDate + "\n";
		message += "\t" + this.name + "\n";
		message += "\t" + this.description + "\n";
		message += "\tStart: " + this.startDate + " Finish: " + this.finishDate + " Penalty: " + this.penalty + "\n";
		message += "\tBudget: " + this.budget + " Expenses to Date: " + this.accrued + "\n";
		message += "---------------------------------------\n";
		return message;
	}
}
