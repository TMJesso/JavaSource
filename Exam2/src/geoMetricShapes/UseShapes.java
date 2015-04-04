package geoMetricShapes;
// import for ArrayList
import java.util.*;

/** use the shapes class to create different types of shapes<br><br>
 * What kind of Shapes can you create?<br>
 * Circle<br>
 * Square<br>
 * Cube<br>
 * 
 * @author Theral Jessop<br>
 * Mar 25, 2015<br>
 * UseShapes.java<br>
 * 
 *
 */
public class UseShapes {
	// main method
	public static void main(String[] args) {
		// declare point, shape
		Point[] point = new Point[5];
		Shape[] shape = new Shape[5];
		
		/** prepare points for use
		 * 
		 */
		point = declarePoints(point);
		
		/** create shapes
		 * 
		 */
		shape = designShape(shape, point);
		
		/** create an array of shapes using ArrayList
		 * 
		 */
		ArrayList<Shape> shapes = new ArrayList<Shape>();
		
		/** add the shapes to the ArrayList
		 * 
		 */
		for (int x = 0; x < shape.length; x++) {
			shapes.add(shape[x]);
		}
		
		/** display the results of the list of shapes
		 * 
		 * @param shapes
		 * 
		 */
		displayResults(shapes);
		
	} // end of main method
	
	/** display Results
	 * 
	 * @param shape
	 */
	public static void displayResults(ArrayList<Shape> shape) {
		for (Shape e: shape) {
			System.out.println(e.toString());
		}
		
	}
	
	/** design Shape according to whatever type of shape the user wants
	 * 
	 * @param shape
	 * @param point
	 * @return shape
	 */
	public static Shape[] designShape(Shape[] shape, Point[] point) {
		shape[0] = new Circle(5, "White", point[0]);
		shape[1] = new Cube(12, 12, 12, "Gold", point[1]);
		shape[2] = new Square(20, 12, "Red", point[2]);
		shape[3] = new Circle(12, "Blue", point[3]);
		shape[4] = new Cube(5,4,3,"Tan", point[4]);
		
		return shape;
	}
	
	/** declare Points (x, y)
	 * 
	 * @param point
	 * @return point
	 */
	public static Point[] declarePoints(Point[] point) {
		point[0] = new Point(-5, 6);
		point[1] = new Point(8, -12);
		point[2] = new Point(9, 13);
		point[3] = new Point(-12, -15);
		point[4] = new Point(1, 7);
		return point;
	}


} // end of UseShapes class