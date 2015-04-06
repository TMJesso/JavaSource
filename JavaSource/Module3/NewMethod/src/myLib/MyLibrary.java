package myLib;

import javax.swing.*;
import java.math.*;
public class MyLibrary {

	public int getInteger(String message) {
		boolean loop = true;
		int num1 = 0;
		while (loop) {
			try {
				num1 = Integer.parseInt(JOptionPane.showInputDialog(message));
				loop = false;
				continue;
			} catch (NumberFormatException|NullPointerException|IndexOutOfBoundsException e) {
				JOptionPane.showMessageDialog(null, "Invalid Entry!");
				continue;
			}
		}
		return num1;
	}

	public double getDouble(String message) {
		boolean loop = true;
		double num1 = 0;
		while (loop) {
			try {
				num1 = Double.parseDouble(JOptionPane.showInputDialog(message));
				loop = false;
				continue;
			} catch (NumberFormatException|NullPointerException|IndexOutOfBoundsException e) {
				JOptionPane.showMessageDialog(null, "Invalid Entry!");
				continue;
			}
		}
		return num1;
	}
	
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
	
	
	public void sayOutput(String message) {
		JOptionPane.showMessageDialog(null, message);
	}
	
	public void sayOutput(JTextArea outputArea) {
		JOptionPane.showMessageDialog(null, outputArea);
	}

	
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

	public double dblString(String input) {
		boolean loop = true;
		double num1 = 0.0;
		while (loop) {
			try {
				num1 = Double.parseDouble(input);
				loop = false;
				continue;
			} catch (NumberFormatException|NullPointerException|IndexOutOfBoundsException e) {
				JOptionPane.showMessageDialog(null, "Invalid double reached!");
				continue;
			}
		}
		return num1;
	}
	
	public String factor(String output, int num) {
		BigInteger factors = BigInteger.ONE;
		//int x=Integer.parseInt(JOptionPane.showInputDialog("Please enter a number to get Factorial"));
		for (int n=num; n >= 1; n--) {
			factors=factors.multiply(new BigInteger(n + ""));
		}
		output = "\t" + factors;
		factors = BigInteger.ONE;
		return output;
	}

	public String smallFactor(String output, int num) {
		int factors = 1;
		for (int x=1; x<=num; x++) {
		//int x=Integer.parseInt(JOptionPane.showInputDialog("Please enter a number to get Factorial"));
			for (int n=x; n>=1; n--) {
				factors*=n;
			}
			output += "\t" + x + "\t" + factors + "\n";
			factors=1;
		}
		return output;
	}
	
	public void dispHist(int[] num, int count) {
		String hist = "";
		for (int x=0; x <= count; x++) {
			for (int y = 1; y <= num[x]; y++) {
				hist+="*";
			}
			hist+="\n";
		}
		sayOutput(hist);
	}
	
	public String intWord(int num, String output) {
		switch (num) {
		case 48: output+="Zero";break;
		case 49: output+="One";break;
		case 50: output+="Two";break;
		case 51: output+="Three";break;
		case 52: output+="Four";break;
		case 53: output+="Five";break;
		case 54: output+="Six";break;
		case 55: output+="Seven";break;
		case 56: output+="Eight";break;
		case 57: output+="Nine";break;
		}
		return output;
	}
	
	public String checkInt(String output, String input) {
		int getNumber = 0;
		for (int x=0;x<input.length();x++) {
			try {
				// validate number
				getNumber=input.charAt(x);
			} catch (NumberFormatException|NullPointerException|IndexOutOfBoundsException e) {
				// display error message
				JOptionPane.showMessageDialog(null, "Extreme Error!");
				continue;
			}
			// get phonetics and add it to the output string
			output = intWord(getNumber, output)+"\n";
		}
		return output;
	}

	
}
