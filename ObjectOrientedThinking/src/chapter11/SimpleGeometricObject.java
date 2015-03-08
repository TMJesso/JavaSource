package chapter11;

public class SimpleGeometricObject {
	private String color = "white";
	private boolean filled;
	private java.util.Date dateCreated;
	
	/** construct a default geometric object */
	public SimpleGeometricObject() {
		dateCreated = new java.util.Date();
	}
	
	/** construct a geometric object with the specified color
	 * and filled value
	 * 
	 * @param color
	 * @param filled
	 */
	public SimpleGeometricObject(String color, boolean filled) {
		dateCreated = new java.util.Date();
		this.color = color;
		this.filled = filled;
	}
	
	/** return color
	 * 
	 * @return color
	 */
	public String getColor() {
		return color;
	}
	
	/** set a new color
	 * 
	 * @param color
	 */
	public void setColor(String color) {
		this.color = color;
	}
	
	/** return filled. Since filled is boolean,
	 * its getter method is named isFilled
	 * 
	 * @return filled
	 */
	public boolean isFilled() {
		return filled;
	}
	
	/** set a new filled
	 * 
	 * @param filled
	 */
	public void setFilled(boolean filled) {
		this.filled = filled;
	}
	
	/** get dateCreated
	 * 
	 * @return dateCreated
	 */
	public java.util.Date getDateCreated() {
		return dateCreated;
	}
	
	public String toString() {
		String message = "created on " + 
				dateCreated + "\ncolor: " + 
				color + " and filled: " + 
				filled;
		return message;
	}
}
