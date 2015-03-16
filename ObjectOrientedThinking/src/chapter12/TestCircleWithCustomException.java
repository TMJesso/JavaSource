package chapter12;

public class TestCircleWithCustomException {

	public static void main(String[] args) {
		try {
			System.out.println("Area of circle 1 is: " + new CircleWithCustomException(5).findArea());
			System.out.println("Area of circle 2 is: " + new CircleWithCustomException(15).findArea());
			System.out.println("Area of circle 3 is: " + new CircleWithCustomException(3).findArea());
			System.out.println("Area of circle 4 is: " + new CircleWithCustomException(6).findArea());
			System.out.println("Area of circle 5 is: " + new CircleWithCustomException(2).findArea());
			System.out.println("Area of circle 6 is: " + new CircleWithCustomException(-3).findArea());
		} catch (InvalidRadiusException ex) {
			System.out.println(ex);
		}
		System.out.println("Number of objects created: " + CircleWithCustomException.getNumberOfObjects());
	}
}
 class CircleWithCustomException {
		
	private double radius;
	
	private  static int numberOfObjects = 0;
	
	public CircleWithCustomException() throws InvalidRadiusException {
		this(1.0);
	}
	
	public CircleWithCustomException(double newRadius) throws InvalidRadiusException {
		setRadius(newRadius);
		numberOfObjects++;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public void setRadius(double newRadius) throws InvalidRadiusException {
		if (newRadius >= 0) {
			radius = newRadius;
		} else {
			throw new InvalidRadiusException(newRadius);
		}
	}
	
	public static int getNumberOfObjects() {
		return numberOfObjects;
	}
	
	public double findArea() {
		return radius * radius * 3.14159;
	}
}


