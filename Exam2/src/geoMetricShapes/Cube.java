package geoMetricShapes;

/** cube shape 
 * 
 * @author Theral Jessop<br>
 * Mar 25, 2015<br>
 * Cube.java<br>
 *
 */
public class Cube extends ThreeDimension {
	
	/** Cube constructor
	 * 
	 * @param dim1
	 * @param dim2
	 * @param dim3
	 * @param color
	 * @param point
	 */
	public Cube(double dim1, double dim2, double dim3, String color, Point point) {
		super(dim1, dim2, dim3, color, point);
	}

	/** get the area of the cube
	 * 
	 * @return area
	 */
	public double getArea() {
		return (6 * this.dimension1 * this.dimension2);
	}

	/** get the volume of the cube
	 * 
	 * @return volume
	 */
	public double getVolume() {
		return this.dimension1 * this.dimension2 * this.dimension3;
	}
	
	/** display the cube information
	 * 
	 * @return message
	 */
	public String toString() {
		String message = "\nCube\n================================\n";
		message += "Color: " + this.color;
		message += "\nLength: " + this.dimension1;
		message += "\nWidth: " + this.dimension2;
		message += "\nHeight: " + this.dimension3;
		message += "\nPoints: " + this.point;
		message += "\nArea: " + this.getArea();
		message += "\nVolume: " + this.getVolume();
		
		return message;
	}

}
