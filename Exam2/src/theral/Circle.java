package theral;

public class Circle extends TwoDimension {
	final double PI = Math.PI;

	public Circle(double dim1, String color, Point point) {
		super(dim1, color, point);
	}

	@Override
	public double getArea() {
		return this.PI * this.dimension1 * this.dimension1;
	}

	public String toString() {
		String message = "\nCircle\n--------------------------------\n";
		message += "Color: " + this.color;
		message += "\nRadius: " + this.dimension1;
		message += "\nArea: " + this.getArea();
		message += "\nPoints: " + this.point;
		return message;
	}

}
