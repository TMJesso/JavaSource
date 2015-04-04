//Author: Brandon McIntosh
//Exam Two
package brandon;
public class Point {

	//properties
	private int pointXCoord;
	private int pointYCoord;

	
	//operations
	
	
	//default constructor
	public Point() {
		this.pointXCoord = 0;
		this.pointYCoord = 0;
	}
	
	
	//non default constructor
	public Point(int pointXCoord, int pointYCoord) {
		this.pointXCoord = pointXCoord;
		this.pointYCoord = pointYCoord;
	}
	
	//sets and gets
	public int getPointXCoord() {
		return pointXCoord;
	}
	public void setPointXCoord(int pointXCoord) {
		this.pointXCoord = pointXCoord;
	}
	public int getPointYCoord() {
		return pointYCoord;
	}
	public void setPointYCoord(int pointYCoord) {
		this.pointYCoord = pointYCoord;
	}
	
	//toString
	public String toString() {
		String output = "\nPointed : (" + this.pointXCoord + "," + this.pointYCoord + ")";

		return output;
	}

}
