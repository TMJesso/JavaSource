package theral;
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

	public void setYCoordinate(int yCoord) {
		this.yCoord = yCoord;
	}

	public String toString() {
		String message = "";
		message += "(x, y) (" + this.xCoord + ", " + this.yCoord + ")";
		return message;
	}

}
