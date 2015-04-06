package objFromBook;

public class TestCircleWithStaticMembers {
	/** main method */
	public static void main(String[] args) {
		System.out.println("Before creating objects");
		System.out.println("The number of objects is " +
		CircleWithStaticMembers.numberOfObjects);
		
		// create c1
		CircleWithStaticMembers c1 = new CircleWithStaticMembers();
		
		// display c1 before c2 is created
		System.out.println("\nAfter creating c1");
		System.out.println("c1: radius (" + c1.radius + ") and number of Circle objects (" + CircleWithStaticMembers.numberOfObjects + ")");
		
		// create c2
		CircleWithStaticMembers c2 = new CircleWithStaticMembers(5);
		
		// modify c1
		c1.radius = 9;
		
		// display c1 and c2 after c2 was created
		System.out.println("\nAfter creating c2 and modifying c1");
		System.out.println("c1: radius (" + c1.radius + ") and number of Circle objects (" + CircleWithStaticMembers.numberOfObjects + ")");
		System.out.println("c2: radius (" + c2.radius + ") and number of Circle objects (" + CircleWithStaticMembers.numberOfObjects + ")");
	}
}
