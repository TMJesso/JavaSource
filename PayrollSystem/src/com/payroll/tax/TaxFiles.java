package com.payroll.tax;

public class TaxFiles {
	String fileName;
	String payPeriod;
	String status;
	
	TaxFiles(String fileName, String payPeriod, String status) {
		this.fileName = fileName;
		this.payPeriod = payPeriod;
		this.status = status;
	}
	
	// get
	
	public String getFileName() {
		return this.fileName;
	}
	
	public String getPayPeriod() {
		return this.payPeriod;
	}
	
	public String getStatus() {
		return this.status;
	}
	
	
	// set
	
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	
	public void setPayPeriod(String payPeriod) {
		this.payPeriod = payPeriod;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}
	
	public String toString() {
		boolean debug = false;
		return (debug ? this.fileName + " " + this.payPeriod + " " + this.status : this.payPeriod + " " + this.status);
	}
}
