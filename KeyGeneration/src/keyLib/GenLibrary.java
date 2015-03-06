package keyLib;
import javax.swing.*;
import java.util.*;

public class GenLibrary {
	private Random randGen = new Random();

	// calculate the key
	public double genKey(double a, double b, double c, boolean p) {
		// calculate the key using the values a, b, c and determine if it will
		// generate a positive results or negative results using p
		double results = 0.0;
		if (p) {
			results = (Math.floor(((((b*-1)+(Math.sqrt(Math.pow(b,2)-4*a*c)))/(2 * a))*1000)))/1000;
		} else {
			results = (Math.floor(((((b*-1)-(Math.sqrt(Math.pow(b,2)-4*a*c)))/(2 * a))*1000)))/1000;
		}
		return results;
	}

	// calculate the key 
	public double genKey(double a, double b, double c, int p) {
		// calculate the key using the values a, b, c and determine if it will
		// generate a positive results or negative results using p
		double results = 0.0;
		if (p==1) { // 1 is positive
			results = (Math.floor(((((b*-1)+(Math.sqrt(Math.pow(b,2)-4*a*c)))/(2 * a))*1000)))/1000;
		} else if (p==0) { // 0 is negative
			results = (Math.floor(((((b*-1)-(Math.sqrt(Math.pow(b,2)-4*a*c)))/(2 * a))*1000)))/1000;
		}
		return results;
	}

	// generate a random number
	public int genRandom (int minimum, int maximum) {
		int newRandom = 0;
		newRandom = randGen.nextInt(maximum+1 );
		while (newRandom < minimum) {
			newRandom = randGen.nextInt(maximum+1 );
		}
		return newRandom;
	}
	
	// get string from user in the form of a number
	public String getString(String message) {
		String input = "";
		boolean loop = true;
		while (loop) {
			try {
				input = JOptionPane.showInputDialog(message);
				input.charAt(0);
				loop = false;
			} catch (NullPointerException|IndexOutOfBoundsException e) {
				JOptionPane.showMessageDialog(null, "Null String Encountered!");
				continue;
			}
		}
		return input;
	}

	// convert string to integer
	public int intString(String input) {
		boolean loop = true;
		int num1 = 0;
		while (loop) {
			try {
				num1 = Integer.parseInt(input);
				loop = false;
				continue;
			} catch (NumberFormatException|NullPointerException|IndexOutOfBoundsException e) {
				JOptionPane.showMessageDialog(null, "Invalid integer reached!");
				continue;
			}
		}
		return num1;
	}
	
	// generate the key
	public void calcKey(double[] a, double[] b, double[][] c) {
		for (int x = 0; x < a.length; x++) {
			a[x] = genKey(c[x][0], c[x][1], c[x][2], 1); // 1 is positive
			b[x] = genKey(c[x][0], c[x][1], c[x][2], 0); // 0 is negative
		}

	}

}
