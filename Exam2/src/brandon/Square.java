//Author: Brandon McIntosh
//Exam Two
package brandon;
public class Square extends TwoDimShape {
	
	//no properties	
	
	//operations
	
	//constructor	
	public Square(String shapeColor, Point grid, double TwoDimX, double TwoDimY) {
		super(shapeColor, grid, TwoDimX, TwoDimY);
	}
	
	//calculates the area of a square(side * side)
	public double calculateArea() {
		return this.TwoDimX * this.TwoDimY;
	}
	
	//toString
	public String toString() {
		String output = super.toString();
		output += "\nShape: Square" + "\nLength: " + this.TwoDimX + "\nWidth: " + this.TwoDimY + "\nArea: " + this.calculateArea();				
		return output;
	}
	
}