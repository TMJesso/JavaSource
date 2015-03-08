package chapter10;
import java.util.*;
public class PalindromIgnoreNonAlphanumeric {

	public static void main(String[] args) {
		// create scanner
		Scanner input = new Scanner(System.in);
		
		// prompt the user to enter a string
		System.out.print("Enter a string: ");
		String s = input.nextLine();
		
		// display the result
		System.out.println("Ignoring nonalphanumeric characters, \nis " + s + " a palindrome? " + isPalindrome(s));
		input.close();
	}

	/** return true if a string is a palindrome */
	public static boolean isPalindrome(String s) {
		// create a new string by eliminating nonalphanumeric chars
		String s1 = filter(s);
		
		// create a new string that is the reversal os s1
		String s2 = reverse(s1);
		
		// check if the reversal is the same as the original string
		return s2.equals(s1);
	}
	
	public static String filter(String s) {
		// create a string builder
		StringBuilder stringBuilder = new StringBuilder();
		
		// examine each char is the string to skip alphanumeric char
		for (int i = 0; i < s.length(); i++) {
			if (Character.isLetterOrDigit(s.charAt(i))) {
				stringBuilder.append(s.charAt(i));
			}
		}
		
		// return a new filtered string
		return stringBuilder.toString();
	}
	
	/** create a new string by reversing a specified string */
	public static String reverse(String s) {
		StringBuilder stringBuilder = new StringBuilder(s);
		stringBuilder.reverse(); // invoke reverse in StringBuilder
		return stringBuilder.toString();
	}
}
