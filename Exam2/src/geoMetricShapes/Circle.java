package geoMetricShapes;

/** circle class extends twoDimension
 * 
 * @author Theral Jessop<br>
 * Mar 25, 2015<br>
 * Circle.java<br>
 *
 */
public class Circle extends TwoDimension {
	final double PI = Math.PI;
	
	/** circle constructor
	 * 
	 * @param dim1
	 * @param color
	 * @param point
	 */
	public Circle(double dim1, String color, Point point) {
		super(dim1, color, point);
	}

	/** get area of the circle
	 * 
	 * @return area
	 */
	public double getArea() {
		return this.PI * this.dimension1 * this.dimension1;
	}
	
	/** display circle information
	 * 
	 * @return circle
	 */
	public String toString() {
		String message = "\nCircle\n=============================\n";
		message += "Color: " + this.color;
		message += "\nRadius: " + this.dimension1;
		message += "\nArea: " + this.getArea();
		message += "\nPoints: " + this.point;
		return message;
	}

}
