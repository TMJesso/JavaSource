package gradeBookData;

import java.util.*;

import javax.swing.*;

public class GradeLib {
	
	/** convert a string to an integer */
	public int intString(String convertStr) {
		boolean isOk = true;
		int num1 = 0;
		while (isOk) {
			try {
				num1 = Integer.parseInt(convertStr);
				isOk = false;
				continue;
			} catch (NumberFormatException|NullPointerException|IndexOutOfBoundsException e) {
				JOptionPane.showMessageDialog(null, "Invalid integer reached!");
				continue;
			}
		}
		return num1;
	}

	/** get number from user */
	public String getString(String message) {
		String userInput = "";
		boolean isOk = true;
		while (isOk) {
			try {
				userInput = JOptionPane.showInputDialog(message);
				userInput.charAt(0);
				isOk = false;
			} catch (NullPointerException|IndexOutOfBoundsException e) {
				JOptionPane.showMessageDialog(null, "Null String Encountered!");
				continue;
			}
		}
		return userInput;
	}
	
	/** get string input using the Scanner class */
	public String getScanner(String message) {
		Scanner input = new Scanner(System.in);
		String userInput = "";
		boolean isOk = true;
		while (isOk) {
			try {
				System.out.print(message);
				userInput = input.nextLine();
				isOk = false;
			} catch (NullPointerException|IndexOutOfBoundsException e) {
				System.out.println("Null String Encountered!");
			}
		}
		input.close();
		return userInput;
	}
	
	/** get integer input using the Scanner class */
	public int getScanInt(String message) throws InputMismatchException {
		Scanner input = new Scanner(System.in);
		int num1 = 1;
		boolean isOk = true;
		while (isOk) {
			try {
				System.out.print(message);
				num1 = input.nextInt();
				isOk = false;
			} catch (NoSuchElementException | IllegalStateException e) {
				System.out.println("Invalid integer detected! Please try again...");
			}
		}
		input.close();
		return num1;
	}
	
	public String createNewCourse() {
		String name = getScanner("Enter the new course name ");
		return name;
	}


}
