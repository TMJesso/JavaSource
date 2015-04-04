package theral;
import java.util.*;
public class UseShapes {

	public static void main(String[] args) {
		Point[] point = new Point[5];
		point[0] = new Point(5,6);
		point[1] = new Point(8,12);

		Shape[] circle = new Circle[2];
		Shape[] square = new Square[1];
		Shape[] cube = new Cube[2];

		circle[0] = new Circle(5, "White", point[0]);
		cube[0] = new Cube(12, 12, 12, "Gold", point[1]);
		square[0] = new Square(20, 12, "Red", point[0]);
		circle[1] = new Circle(12, "Blue", point[1]);
		cube[1] = new Cube(5,4,3,"Tan", point[0]);
		ArrayList<Shape> shapes = new ArrayList<Shape>();
		shapes.add(circle[0]);
		shapes.add(cube[0]);
		shapes.add(square[0]);
		shapes.add(circle[1]);
		shapes.add(cube[1]);
		displayResults(shapes);
	}

	public static void displayResults(ArrayList<Shape> shape) {
		for (Shape e: shape) {
			System.out.println(e.toString());
		}
	}
}
