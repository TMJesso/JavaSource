package objFromBook;

public class CircleWithPrivateDataFields {
	/** the radius of the circle */
	private double radius = 1;
	
	/** the number of objects created */
	private static int numberOfObjects = 0;
	
	/** construct a circle with radius 1 */
	public CircleWithPrivateDataFields() {
		numberOfObjects++;
	}
	
	/** construct a circle with a specified radius */
	public CircleWithPrivateDataFields(double newRadius) {
		this.radius = newRadius;
		numberOfObjects++;
	}
	
	/** return radius */
	public double getRadius() {
		return this.radius;
	}
	
	/** set a new radius */
	public void setRadius(double newRadius) {
		this.radius = (newRadius >= 0) ? newRadius : 0;
	}
	
	/** return numberOfObjects */
	public static int getNumberOfObjects() {
		return numberOfObjects;
	}
	
	/** return the area of this circle */
	public double getArea() {
		return this.radius * this.radius * Math.PI;
	}
	
}
