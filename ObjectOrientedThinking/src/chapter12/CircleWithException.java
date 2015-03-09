package chapter12;
public class CircleWithException {
	/** the radius of the circle */
	private double radius;
	
	/** the number of the objects created */
	private static int numberOfObjects = 0;
	
	/** construct a circle with radius of 1 */
	public CircleWithException() {
		this(1.0);
	}
	
	/** construct a circle with a specified radius 
	 * 
	 * @param newRadius
	 */
	public CircleWithException(double newRadius) {
		setRadius(newRadius);
		numberOfObjects++;
	}
	
	/** return radius
	 * 
	 * @return radius
	 */
	public double getRadius() {
		return radius;
	}
	
	/** set a new radius
	 * 
	 * @param newRadius
	 * @throws IllegalArgumentException
	 */
	public void setRadius(double newRadius) throws IllegalArgumentException {
		if (newRadius >= 1) {
			radius = newRadius;
		} else {
			throw new IllegalArgumentException("Radius cannot be negative or zero");
		}
	}
	
	/** return the number of objects
	 * 
	 * @return numberOfObjects
	 */
	public static int getNumberOfObjects() {
		return numberOfObjects;
	}
	
	/** return the area of this circle
	 * 
	 * @return radius * radius * pi
	 */
	public double findArea() {
		return radius * radius * 3.14159;
	}
}
