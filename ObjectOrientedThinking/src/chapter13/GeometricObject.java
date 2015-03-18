package chapter13;

public abstract class GeometricObject {
	private String color = "white";
	private boolean filled;
	private java.util.Date dateCreated;
	
	/** construct a default geometric object
	 * 
	 */
	protected GeometricObject() {
		dateCreated = new java.util.Date();
	}
	
	/** construct a geometric object with color and filled value
	 * 
	 * @param color
	 * @param filled
	 */
	protected GeometricObject(String color, boolean filled) {
		dateCreated = new java.util.Date();
		this.color = color;
		this.filled = filled;
	}
	
	/** return color
	 * 
	 * @return
	 */
	public String getColer() {
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
	 * the get method is named isFilled
	 * 
	 * @return
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
	 * @return
	 */
	public java.util.Date getDateCreated() {
		return dateCreated;
	}
	
	@Override
	public String toString() {
		return "created on " + dateCreated + "\ncolor: " + color + " and filled: " + filled;
	}
	
	/** abstract method getArea
	 * 
	 * @return
	 */
	public abstract double getArea();
	
	/** abstract method getPerimeter
	 * 
	 * @return
	 */
	public abstract double getPerimeter();
}
