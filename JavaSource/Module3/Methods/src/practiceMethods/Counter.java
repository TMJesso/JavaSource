package practiceMethods;

public class Counter {

	public static void main(String[] args) {
		/*
		 * int counter=1;
		 
		System.out.println("While");
		while (counter<=100) {
			System.out.println(counter);
			counter++;
		}
		counter=1;
		System.out.println("Do While");
		do {
			System.out.println(counter);
			counter++;
		} while (counter <= 100);
		
		System.out.println("For");
		for (int x=1; x<=100; x++) {
			System.out.println(x);
		}
		
		int x;
		for (x=0, System.out.print("Hello"); x<=100; x++) {
			
		}
		*/
		final int NUM=20; int value=0;
		for (int x=2,y=3; x<=4;x++,y--) {
			value+=NUM;
			System.out.println(value+"  "+y);
		}
	}
}
