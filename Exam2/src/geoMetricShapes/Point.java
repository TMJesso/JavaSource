package geoMetricShapes;

/** Point (x, y)
 * 
 * @author Theral Jessop<br>
 * Mar 25, 2015<br>
 * Point.java<br>
 *
 */
public class Point {
	int xCoord;
	int yCoord;
	
	/** point constructor
	 * 
	 * @param x
	 * @param y
	 */
	public Point(int x, int y) {
		this.xCoord = x;
		this.yCoord = y;
	}
	
	// get
	
	/** get X Coordinate
	 * 
	 * @return xCoord
	 */
	public int getXCoordinante() {
		return this.xCoord;
	}
	
	/** get Y Coordinate
	 * 
	 * @return yCoord
	 */
	public int getYCoordinante() {
		return this.yCoord;
	}
	
	// set
	
	/** set X Coordinate
	 * 
	 * @param xCoord
	 */
	public void setXCoordinate(int xCoord) {
		this.xCoord = xCoord;
	}
	
	/** set y coordinate
	 * 
	 * @param yCoord
	 */
	public void setYCoordinate(int yCoord) {
		this.yCoord = yCoord;
	}
	
	/** display point information
	 * 
	 * @return point
	 */
	public String toString() {
		String message = "";
		message += "(x, y) : (" + this.xCoord + ", " + this.yCoord + ")";
		return message;
	}

}
