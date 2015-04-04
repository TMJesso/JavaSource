package theral;

public class Square extends TwoDimension {
	public Square(double dim1, double dim2, String color, Point point) {
		super(dim1, dim2, color, point);
	}

	@Override
	public double getArea() {
		return this.dimension1 * this.dimension2;
	}

	public String toString() {
		String message = "\nSquare\n----------------------------\n";
		message += "Color: " + this.color;
		message += "\nLength: " + this.dimension1;
		message += "\nWidth: " + this.dimension2;
		message += "\nPoints: " + this.point;
		message += "\nArea: " + this.getArea();
		return message;
	}

}
