//Author: Brandon McIntosh
//Exam Two
package brandon;
public abstract class ThreeDimShape extends Shape{
	
	//properties
	protected double ThreeDimX;
	protected double ThreeDimY;
	protected double ThreeDimZ;
	
	//operations
	
	//non-default constructor
	public ThreeDimShape(String shapeColor, Point grid, double ThreeDimX, double ThreeDimY, double ThreeDimZ) {
		super(shapeColor, grid);
		this.ThreeDimX = ThreeDimX;
		this.ThreeDimY = ThreeDimY;
		this.ThreeDimZ = ThreeDimZ;
	}
	
	//abstract area calculation method
	public abstract double calculateArea();
	
	//abstract volume calculation method
	public abstract double calculateVolume();

	
	//sets and gets
	public double getThreeDimX() {
		return ThreeDimX;
	}

	public void setThreeDimX(double threeDimX) {
		ThreeDimX = threeDimX;
	}

	public double getThreeDimY() {
		return ThreeDimY;
	}

	public void setThreeDimY(double threeDimY) {
		ThreeDimY = threeDimY;
	}

	public double getThreeDimZ() {
		return ThreeDimZ;
	}

	public void setThreeDimZ(double threeDimZ) {
		ThreeDimZ = threeDimZ;
	}
	
	//toString
	public String toString() {
		String output = super.toString();
		return output;
	}
	
	
	
	
}