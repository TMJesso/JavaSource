package practiceMethods;

public class PrimeNumberMethod {
	public static void main(String[] args) {
		System.out.println("The first 50 prime numbers are \n");
		printPrimeNumbers(50);
	}

	public static void printPrimeNumbers(int numberOfPrimes) {
		final int NUMBER_OF_PRIMES_PER_LINE = 10; // display 10 per line
		int count = 0; // count the number of prime numbers
		int number = 2; // a number to be tested for primeness
		
		// repeatedly find prime numbers
		while (count < numberOfPrimes) {
			// print the prime number and increase the count
			if (isPrime(number)) {
				count++; // increase the count
				if (count % NUMBER_OF_PRIMES_PER_LINE == 0) {
					// print the number and advance to the new line
					System.out.printf("%-5s\n", number);
				} else {
					System.out.printf("%-5s", number);
				}
			}
			// check whether the next number is prime
			number++;
		}
	}
	/** check whether number is prime */
	public static boolean isPrime(int number) {
		for (int divisor = 2; divisor <= number / 2; divisor++) {
			if (number % divisor == 0) { // if true, number is not prime
				return false; // number is not a prime
			}
		}
		return true; // number is prime
	}
}
