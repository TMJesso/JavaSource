package geoMetricShapes;

/** square extends twoDimension
 * 
 * @author Theral Jessop<br>
 * Mar 25, 2015<br>
 * Square.java<br>
 *
 */
public class Square extends TwoDimension {
	
	/** square constructor
	 * 
	 * @param dim1
	 * @param dim2
	 * @param color
	 * @param point
	 */
	public Square(double dim1, double dim2, String color, Point point) {
		super(dim1, dim2, color, point);
	}

	/** get area for square
	 * 
	 * @return area
	 */
	public double getArea() {
		return this.dimension1 * this.dimension2;
	}
	
	/** display square information
	 * 
	 * @return square
	 */
	public String toString() {
		String message = "\nSquare\n==============================\n";
		message += "Color: " + this.color;
		message += "\nLength: " + this.dimension1;
		message += "\nWidth: " + this.dimension2;
		message += "\nPoints: " + this.point;
		message += "\nArea :" + this.getArea();
		return message;
	}

}
