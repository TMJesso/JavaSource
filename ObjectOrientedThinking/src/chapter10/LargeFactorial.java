package chapter10;
import java.math.*;
public class LargeFactorial {

	public static void main(String[] args) {
		for (int x = 100; x > 0; x--) {
					System.out.println(x + "! is " + factorial(x));

		}
	}

	public static BigInteger factorial(long n) {
		BigInteger result = BigInteger.ONE;
		for (int i = 1; i <= n; i++) {
			result = result.multiply(new BigInteger(i + ""));
		}
		return result;
	}
}
