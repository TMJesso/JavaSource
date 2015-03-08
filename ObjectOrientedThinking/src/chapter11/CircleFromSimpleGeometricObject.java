package chapter11;

public class CircleFromSimpleGeometricObject extends SimpleGeometricObject {
	private double radius;
	
	/** default constructor */
	public CircleFromSimpleGeometricObject() {
	}

	/** non-defualt constructor
	 * create a circle only
	 * 
	 * @param radius
	 */
	public CircleFromSimpleGeometricObject(double radius) {
		this.radius = radius;
	}
	
	/** non-default constructor
	 * create a circle and set its color and
	 * choose whether it is filled or not
	 * 
	 * @param radius
	 * @param color
	 * @param filled
	 */
	public CircleFromSimpleGeometricObject(double radius, String color, boolean filled) {
		this.radius = radius;
		setColor(color);
		setFilled(filled);
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
	 * @param radius
	 */
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	/** return area
	 * 
	 * @return area
	 */
	public double getArea() {
		return radius * radius * Math.PI;
	}
	
	/** return diameter
	 * 
	 * @return diameter
	 */
	public double getDiameter() {
		return 2 * radius;
	}
	
	/** return perimeter
	 * 
	 * @return perimeter
	 */
	public double getPerimeter() {
		return 2 * radius * Math.PI;
	}
	
	/** print the circle info */
	public void printCircle() {
		System.out.println("The circle is created " + getDateCreated() + 
				" and the radius is " + radius) ;
	}
	
	public String toString() {
		return super.toString() + "\nradius is " + radius;
	}
}
