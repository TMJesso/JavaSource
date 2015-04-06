package chapter12;

public class InvalidRadiusException extends Exception {
	private double radius;
	
	/** construct an exception
	 * 
	 * @param radius
	 */
	public InvalidRadiusException(double radius) {
		super("Invalid radius " + radius);
		this.radius = radius;
	}
	
	/** return the radius
	 * 
	 * @return
	 */
	public double getRadius() {
		return radius;
	}
}
