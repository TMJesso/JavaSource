//Author: Brandon McIntosh
//Exam Two
package brandon;
public abstract class Shape {
	//properties
	protected String shapeColor;
	
	//aggregated properties
	protected Point grid;

	
	//operations
	
	//abstract area calculation method
	public abstract double calculateArea();
	
	
	//default constructor
	public Shape() {
		this.shapeColor = "";
		this.grid = null;
	}
	
	//non-default constructor
	public Shape(String shapeColor, Point grid) {
		this.shapeColor = shapeColor;
		this.grid = grid;
	}
	
	
	//sets and gets
	public String getShapeColor() {
		return shapeColor;
	}

	public void setShapeColor(String shapeColor) {
		this.shapeColor = shapeColor;
	}

	public Point getGrid() {
		return grid;
	}

	public void setGrid(Point grid) {
		this.grid = grid;
	}

	//toString
	public String toString() {
		String output = "\nShape Information:" + grid.toString() +		
						"\nColor: " + this.shapeColor;
		return output;
	}
	
	
	
}
