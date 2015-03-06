package practiceMethods;

public class MyInClassPractice {

	public static void main(String[] args) {
		MyFuntionalMathOps mfmo = new MyFuntionalMathOps();
		mfmo.startExecuting();
	}
}
//  ------------------------------------------------------------
class MyFuntionalMathOps {
	// create a method that will act as a main method:
	public void startExecuting() {
		System.out.println(findMax(20f, 30f));
		System.out.println(findMax(20, 30));
		System.out.println(findMax(20, 40, 10));
		testingSomeStringMethods("This is a test");
	}
	public float findMax(float num1, float num2) {
		float max = num1;
		if (num2 > max) {
			max = num2;
		}
		return max;
	}

	public int findMax(int num1, int num2) {
		int max = num1;
		if (num2 > max) {
			max = num2;
		}
		return max;
	}
	// find the maximum of three numbers
	// method overloading: the number of parameters and/or the data type
	// of parameters must be different for correct overloading
	public int findMax(int num1, int num2, int num3) {
		return findMax(findMax(num1, num2),num3);
	}
	public void testingSomeStringMethods(String value) {
		// testing the valuOf method
		System.out.println(String.valueOf(value));
		// testing the charAt method
		System.out.println(value.charAt(3));
	}

}