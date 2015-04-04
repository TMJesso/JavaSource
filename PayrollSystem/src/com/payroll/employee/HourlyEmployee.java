package com.payroll.employee;

import java.util.*;

import javax.swing.JOptionPane;

import com.payroll.job.Job;
import com.payroll.library.PayrollLib;

public class HourlyEmployee extends Employee {
	double hourlyRate;
	double hoursWorked;
	double gross;
	double fit;
	double sit;
	double cit;
	double ssOASDI;
	double ssHI;
	double bonus;
	boolean calculated;
	
	Job job;
	
	public HourlyEmployee(String ssn, String name, String address,
			String location, String phone, String maritalStatus,
			int dependents, String payPeriod, String position,
			String department, Date hireDate, boolean active,
			double taxDeduction, double groupInsurance, double ytdBonus,
			double ytdTaxableAmount, double ytdFIT, double ytdSIT,
			double ytdCIT, double ytdOASDI, double ytdHI, double hourlyRate, double hoursWorked, Job job) {
		super(ssn, name, address, location, phone, maritalStatus, dependents,
				payPeriod, position, department, hireDate, active,
				taxDeduction, groupInsurance, ytdBonus, ytdTaxableAmount,
				ytdFIT, ytdSIT, ytdCIT, ytdOASDI, ytdHI);
		this.hourlyRate = hourlyRate;
		this.hoursWorked = hoursWorked;
		this.calculated = false; // this can only be updated with the calculatePayroll method
		this.job = job;
		
	}
	
	// get
	
	public double getHoursWorked() {
		return this.hoursWorked;
	}
	
	public double getHourlyRate() {
		return this.hourlyRate;
	}
	
	// set
	
	
	public void calculatePayroll() {
		// check to see if the payroll has already been calculated
		if (this.calculated) {
			JOptionPane.showMessageDialog(null, "Payroll has already been calculated!");
		} else {
			if (this.payPeriod.equals("weekly")) {
				if (this.hoursWorked > 40) { // overtime 
					double overtime = this.hoursWorked - 40;
					this.gross = (this.hourlyRate * 40) + (overtime * (this.hourlyRate * 1.5));
				} else {
					this.gross = this.hourlyRate * this.hoursWorked;
				}
			} else if (this.payPeriod.equals("biweekly")) {
				if (this.hoursWorked > 80) { // overtime
					double overtime = this.hoursWorked - 80;
					this.gross = (this.hourlyRate * 80) + (overtime * (this.hourlyRate * 1.5));
				} else {
					this.gross = this.hourlyRate * this.hoursWorked;
				}
				
			} else if (this.payPeriod.equals("bimonthly")) {
				if (this.hoursWorked > 80) { // overtime
					double overtime = this.hoursWorked - 80;
					this.gross = (this.hourlyRate * 80) + (overtime * (this.hourlyRate * 1.5));
				} else {
					this.gross = this.hourlyRate * this.hoursWorked;
				}
				
			} else if (this.payPeriod.equals("monthly")) {
				if (this.hoursWorked > 160) { // overtime
					double overtime = this.hoursWorked - 160;
					this.gross = (this.hourlyRate * 160) + (overtime * (this.hourlyRate * 1.5));
				} else {
					this.gross = this.hourlyRate * this.hoursWorked;
				}
			} else if (this.payPeriod.equals("quarterly")) {
				if (this.hoursWorked > 480) { // overtime
					double overtime = this.hoursWorked - 480;
					this.gross = (this.hourlyRate * 480) + (overtime * (this.hourlyRate * 1.5));
				} else {
					this.gross = this.hourlyRate * this.hoursWorked;
				}
			} else if (this.payPeriod.equals("semi-annually")) {
				if (this.hoursWorked > 960) { // overtime
					double overtime = this.hoursWorked - 960;
					this.gross = (this.hourlyRate * 960) + (overtime * (this.hourlyRate * 1.5));
				} else {
					this.gross = this.hourlyRate * this.hoursWorked;
				}
			} else if (this.payPeriod.equals("annually")) {
				if (this.hoursWorked > 1920) { // overtime
					double overtime = this.hoursWorked - 1920;
					this.gross = (this.hourlyRate * 1920) + (overtime * (this.hourlyRate * 1.5));
				} else {
					this.gross = this.hourlyRate * this.hoursWorked;
				}
			} else if (this.payPeriod.equals("daily")) {
				if (this.hoursWorked > 8) { // overtime
					double overtime = this.hoursWorked - 8;
					this.gross = (this.hourlyRate * 8) + (overtime * (this.hourlyRate * 1.5));
				} else {
					this.gross = this.hourlyRate * this.hoursWorked;
				}
			} // end of gross calculations
			PayrollLib gf = new PayrollLib();
			int index = 0;
			String fileName = "";
			index = gf.getIndex(this.maritalStatus, this.payPeriod, this.dependents, index);
			fileName = gf.getFileName(index);
			
			// I need to create a method to get the tax info from the specified file 
			// so I can calculate the deductions
			
			System.out.print(fileName);
			
			
			
			
			
			
		}
	}

	/** terminate employee<br><br>
	 * use the code below for terminating a employee<br><br>
	 * <strong>System.out.println(terminateEmployee()?  "Complete" : "Error");</strong><br>
	 * 
	 * 
	 * @return results on whether the action was successful
	 */
	public boolean terminateEmployee() {
		this.active = false;
		this.terminationDate = new java.util.Date();
		return true;
	}


	public boolean postEmployeeRecord() {
		
		return false;
	}


	public void updateTaxDeduction() {
		Scanner input = new Scanner(System.in);
		double tmpTaxDeduction = 0.00;
		boolean validateTax = true;
		while (validateTax) {
			System.out.println("Enter amount employee wants to add to tax deduction");
			tmpTaxDeduction = input.nextDouble();
			if (tmpTaxDeduction > (this.hourlyRate * 40 * .05)) { // hourly rate * 40 hour week * 5% allowable deduction
				JOptionPane.showMessageDialog(null, "Amount is greater than allowed amount.\nReseting to maximum allowable amount");
				tmpTaxDeduction = (this.hourlyRate * 40 * .05);
			} else if (tmpTaxDeduction < 0) {
				JOptionPane.showMessageDialog(null, "Amount cannot be negative.\nReseting to 0");
				tmpTaxDeduction = 0;
			}
		}
		this.taxDeduction = tmpTaxDeduction;
		input.close();
	}


	public void applyBonus() {
		Scanner input = new Scanner(System.in);
		double tmpBonus = 0.00;
		boolean validateBonus = true;
		System.out.println("Enter the bonus for\t" + this.name + "\n\t\t\t" + this.address + "\n\t\t\t" + this.location);
		while (validateBonus) {
			tmpBonus = input.nextDouble();
			if (tmpBonus < 0) {
				JOptionPane.showMessageDialog(null, "Invalid entry! Bonus cannot be negative");
			} else {
				validateBonus = false;
			}
		}
		this.bonus = tmpBonus;
		input.close();
	}
}
