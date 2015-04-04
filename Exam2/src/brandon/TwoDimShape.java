//Author: Brandon McIntosh
//Exam Two
package brandon;
public abstract class TwoDimShape extends Shape{
	
	//properties
	protected double TwoDimX;
	protected double TwoDimY;
	
	//operations
	
	//non-default constructor
	public TwoDimShape(String shapeColor, Point grid, double TwoDimX, double TwoDimY) {
		super(shapeColor, grid);
		this.TwoDimX = TwoDimX;
		this.TwoDimY = TwoDimY;
	}
	
	//abstract area calculation method
	public abstract double calculateArea();

	
	//sets and gets
	public double getTwoDimX() {
		return TwoDimX;
	}

	public void setTwoDimX(double twoDimX) {
		TwoDimX = twoDimX;
	}

	public double getTwoDimY() {
		return TwoDimY;
	}

	public void setTwoDimY(double twoDimY) {
		TwoDimY = twoDimY;
	}
	
	//toString
	public String toString() {
		String output = super.toString();
		return output;
	}
	
	
}
