package geoMetricShapes;

/** abstract shape
 * 
 * @author Theral Jessop<br>
 * Mar 25, 2015<br>
 * Shape.java<br>
 *
 */
public abstract class Shape {
	String color;
	Point point;
	
	/** shape constructor
	 * 
	 * @param color
	 * @param point
	 */
	Shape(String color, Point point) {
		this.color = color;
		this.point = point;
	}
	
	/** abstract get area
	 * 
	 * @return
	 */
	public abstract double getArea();
	
	// get
	
	/** get Color
	 * 
	 * @return color
	 */
	public String getColor() {
		return this.color;
	}
	
	/** get Point
	 * 
	 * @return point
	 */
	public Point getPoint() {
		return this.point;
	}
	
	
	// set
	
	/** set color
	 * 
	 * @param color
	 */
	public void setColor(String color) {
		this.color = color;
	}
	
	/** set Point
	 * 
	 * @param point
	 */
	public void setPoint(Point point) {
		this.point = point;
	}
}


