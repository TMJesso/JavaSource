//Author: Brandon McIntosh
//Exam Two
package brandon;
public class Cube extends ThreeDimShape {
	
	//no properties	
	
	//operations
	
	//constructor	
	public Cube(String shapeColor, Point grid, double ThreeDimX, double ThreeDimY, double ThreeDimZ) {
		super(shapeColor, grid, ThreeDimX, ThreeDimY, ThreeDimZ);
	}
	
	//calculates the area of a cube (6 * side * side)
	public double calculateArea() {
		return this.ThreeDimX * this.ThreeDimX * 6;
	}
	
	//calculates the volume of a cube (side * side * side)
	public double calculateVolume() {
		return this.ThreeDimX * this.ThreeDimY * this.ThreeDimZ; 
	}
	
	//toString
	public String toString() {
		String output = super.toString();
		output += "\nShape: Cube" + "\nLength: " + this.ThreeDimX + "\nWidth: " + this.ThreeDimY + "\nHeight: " + this.ThreeDimZ + "\nArea: " + this.calculateArea() + "\nVolume: " + this.calculateVolume();		
		return output;
	}
}