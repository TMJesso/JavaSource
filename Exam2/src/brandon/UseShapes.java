//Author: Brandon McIntosh
//Exam Two
package brandon;
import java.util.ArrayList;


public class UseShapes {

	public static void main(String[] args) {
		
		Point center = new Point (0,0);
		Point one = new Point (5,5);
		Point two = new Point (-5,5);
		Point three = new Point (-5,-5);
		Point four = new Point (5,-5);
		
		
		Shape shapeOne = new Circle("Red", center, 6.0, 6.0);
		Shape shapeTwo = new Cube("Blue", one, 3.0, 3.0, 3.0);
		Shape shapeThree = new Square("Yellow", two, 7.0, 7.0);
		Shape shapeFour = new Circle("Blue", three, 2.0, 2.0);
		Shape shapeFive = new Cube("Orange", four, 3.5, 3.5, 3.5);
		
		//Creating an array list of the shapes
		
		ArrayList<Shape> shapes = new ArrayList<Shape>();
		shapes.add(shapeOne);
		shapes.add(shapeTwo);
		shapes.add(shapeThree);
		shapes.add(shapeFour);
		shapes.add(shapeFive);
		
		//scans shapes and outputs object information as well as area and volume
		for (Shape s: shapes) {
			System.out.println(s);
			
		}
	}

}
