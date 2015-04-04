package theral;

public class Cube extends ThreeDimension {

	public Cube(double dim1, double dim2, double dim3, String color, Point point) {
		super(dim1, dim2, dim3, color, point);
	}

	public double getArea() {
		return (6 * this.dimension1 * this.dimension2);
	}

	@Override
	public double getVolume() {
		return this.dimension1 * this.dimension2 * this.dimension3;
	}

	public String toString() {
		String message = "\nCube\n-------------------------------------\n";
		message += "Color: " + this.color;
		message += "\nLength: " + this.dimension1;
		message += "\nWidth: " + this.dimension2;
		message += "\nHeight: " + this.dimension3;
		message += "\nPoints: " + this.point;
		message += "\nArea: " + this.getArea();
		message += "\nVolume: " + this.getVolume();

		return message;
	}

}
