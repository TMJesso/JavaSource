package chapter13;

public class Circle extends GeometricObject {
	private double radius;
	
	/** default constructor */
	public Circle() {
	}

	/** non-defualt constructor
	 * create a circle only
	 * 
	 * @param radius
	 */
	public Circle(double radius) {
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
	public Circle(double radius, String color, boolean filled) {
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
