package objFromBook;

public class CircleWithStaticMembers {
	/** the radius of the circle */
	double radius;
	
	/** the number of objects created */
	static int numberOfObjects = 0;
	
	/** construct a circle with radius 1 */
	CircleWithStaticMembers() {
		this.radius = 1;
		numberOfObjects++;
	}
	
	/** construct a circle with a specified radius */
	CircleWithStaticMembers( double newRadius) {
		this.radius = newRadius;
		numberOfObjects++;
	}
	
	/** return numberOfObjects */
	static int getNumberOfObjects() {
		return numberOfObjects;
	}
	
	/** return the area of this circle */
	double getArea() {
		return this.radius * this.radius * Math.PI;
	}
}
