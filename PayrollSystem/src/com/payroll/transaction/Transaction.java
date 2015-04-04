package com.payroll.transaction;

import java.util.Calendar;

/** transaction<br><br>
 * generate unique transaction numbers and assign the current date<br>
 * 
 * 
 * @author Theral Jessop<br>
 * Mar 28, 2015<br>
 * Transaction.java<br>
 *
 */
public class Transaction {
	String number;
	java.util.Date transactDate;
	
	/** default constructor<br><br>
	 * generates unique transaction number from generateUniqueTrans() method<br>
	 * assigns the current date as the transaction date<br>
	 * 
	 */
	Transaction() {
		this.number = generateUniqueTrans();
		this.transactDate = new java.util.Date();
		
	}
	
	// get
	
	/** get transaction number
	 * 
	 * @return number
	 */
 	public String getTransactionNumber() {
 		return this.number;
 	}
 	
 	/** get transaction date
 	 * 
 	 * @return transactDate
 	 */
 	public java.util.Date getTransactionDate() {
 		return this.transactDate;
 	}
	
	//set
	
 	/** set transaction number<br><br>
 	 * generates a unique transaction number using the generateUniqueTrans() method
 	 * 
 	 * 
 	 */
 	public void setTransactionNumber() {
 		this.number = generateUniqueTrans();
 	}
 	
 	/** set transaction date<br><br>
 	 * sets the transaction date automatically using java.util.Date()
 	 * 
 	 */
 	public void setTransactionDate() {
 		this.transactDate = new java.util.Date();
 	}
	
	
	// generate unique transaction number
 	
 	/** generate unique transaction number
 	 * 
 	 * @return number as a string to the calling field
 	 * 
 	 */
   public static String generateUniqueTrans(){
        
        return Calendar.getInstance().getTimeInMillis() + "";
        
    }
   
   /** display transaction information<br><br>
    * display transaction number and date
    * 
    * 
    */
   public String toString() {
	   String message = "Transaction\nNumber\t\tDate\n" + this.number;
	   message += " " + this.transactDate;
	   return message;
   }
	
}
