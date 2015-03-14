/* 
 * IUK
 * Professor: Dr. Awny Alnusair
 * Group: Theral Jessop, Jeremiah McKinney, Ian Holtson
 * Course: INFO 211
 * Date: March 12, 2015
 * Homework 3:
 * 
 */
package bankSystem;

public class Branch {
	protected String branchName;
	protected String branchAddress;
	

	
	protected Branch(String name, String address) {
		this.branchName = name;
		this.branchAddress = address;
	}
	
	public String toString() {
		String message = this.branchName + ", " + this.branchAddress;
		return message;
	}
	

}
