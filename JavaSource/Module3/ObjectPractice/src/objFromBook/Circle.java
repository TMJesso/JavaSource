package objFromBook;

public class Circle {
	
	/** the radius of this circle */
	double radius = 1;
	
	/** construct a circle object */
	Circle() {
		
	}
	
	/** construct a circle object using user defined values */
	Circle(double newRadius) {
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
	
	/** set new radius for this circle */
	void setRadius(double newRadius) {
		this.radius = newRadius;
	}
	
}
