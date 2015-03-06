package objFromBook;

public class SimpleCircle {
		/** main method */
	public static void main(String[] args) {
		// create a circle with radius 1
		SimpleCircle circle1 = new SimpleCircle();
		System.out.println("The area of the circle of radius " + circle1.radius + " is " + circle1.getArea());
		
		// create a circle with radius 25
		SimpleCircle circle2 = new SimpleCircle(25);
		System.out.println("The area of the circle of radius " + circle2.radius + " is " + circle2.getArea());
	
		// create a circle with radius 125
		SimpleCircle circle3 = new SimpleCircle(125);
		System.out.println("The area of the circle of radius " + circle3.radius + " is " + circle3.getArea());
		
		// modify circle radius
		circle2.radius = 100;
		System.out.println("The area of the circle of radius " + circle2.radius + " is " + circle2.getArea());

	}

	double radius;
	
	/** construct a circle with radius 1 */
	SimpleCircle() {
		this.radius = 1;
	}
	
	/** construct a circle with a specified radius */
	SimpleCircle(double newRadius) {
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
