package objFromBook;

public class TestSimpleCircle {
	/** main method */
	public static void main(String[] args) {
		// create a circle with radius 1
		OSimpleCircle circle1 = new OSimpleCircle();
		System.out.println("The area of the circle of radius " + circle1.radius + " is " + circle1.getArea());
		
		// create a circle with radius 25
		OSimpleCircle circle2 = new OSimpleCircle(25);
		System.out.println("The area of the circle of radius " + circle2.radius + " is " + circle2.getArea());
		
		// create a circle with radius 125
		OSimpleCircle circle3 = new OSimpleCircle(125);
		System.out.println("The area of the circle of radius " + circle3.radius + " is " + circle3.getArea());
		
		// modify circle radius
		circle2.radius = 100; // or circle2.setRadius(100)
		System.out.println("The area of the circle of radius " + circle2.radius + " is " + circle2.getArea());
	}
}

// define the circle class with two constructors
class OSimpleCircle {
	double radius;
	
	/** Construct a circle with radius 1 */
	OSimpleCircle() {
		radius = 1;
	}
	
	/** construct a circle with a specified radius */
	OSimpleCircle(double newRadius) {
		this.radius = newRadius;
	}
	
	/** return the area of this circle */
	double getArea() {
		return this.radius * this.radius * Math.PI;
	}
	
	/** return the perimeter of this circle */
	double getPerimeter() {
		return 2 * this.radius * Math.PI;
	}
	
	/** set a new radius for this circle */
	void setRadius(double newRadius) {
		this.radius = newRadius;
	}
	
}
