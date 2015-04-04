/* 
 * IUK
 * Professor: Dr. Awny Alnusair
 * Group: Theral Jessop, Jeremiah McKinney
 * Course: INFO 211
 * Date: March 12, 2015
 * Homework 3:
 * 
 */
package bankSystem;

// branch class
public class Branch {
	// protected branch name and address
	protected String branchName;
	protected String branchAddress;
	
	/** constructor for branch
	 * 
	 * @param name
	 * @param address
	 */
	public Branch(String name, String address) {
		this.branchName = name;
		this.branchAddress = address;
	}
	
	// get
	
	public String getBranchName() {
		return this.branchName;
	}
	
	public String getBranchAddress() {
		return this.branchAddress;
	}
	
	
	
	// set
	
	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}
	
	public void setBranchAddress(String branchAddress) {
		this.branchAddress = branchAddress;
	}
	
	/** display branch information in a string to return to the user
	 * 
	 */
	public String toString() {
		String message = this.branchName + ", " + this.branchAddress;
		return message;
	}
	

}
