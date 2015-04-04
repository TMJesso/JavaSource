//Author: Brandon McIntosh
//Exam Two
package brandon;
public class Circle extends TwoDimShape {
	
	//no properties	
	
	//operations
	
	//constructor	
	public Circle(String shapeColor, Point grid, double TwoDimX, double TwoDimY) {
		super(shapeColor, grid, TwoDimX, TwoDimY);
	}
	
	//calculates the area of a circle (pi * radius * radius)
	public double calculateArea() {
		return 3.1415926535 * this.TwoDimX * this.TwoDimX;
	}
	
	//toString
	public String toString() {
		String output = super.toString();
		output += "\nShape: Circle" + "\nRadius: " + this.TwoDimX + "\nArea: " + this.calculateArea();				
		return output;
	}
	
	
}
