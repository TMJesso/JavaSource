package myPracticePackage;
import javax.swing.*;
public class EvenlyDivisible {

	public static void main(String[] args) {
		CheckNumber evenDivisible = new CheckNumber();
		int num1 = 0;
		int num2 = 0;
		num1 = evenDivisible.getNumber("Enter first integer");
		num2 = evenDivisible.getNumber("Enter second integer");
		if  (evenDivisible.isDivisible(num1, num2)) {
			JOptionPane.showMessageDialog(null, num1 + " is evenly divisble by " + num2);
		} else {
			JOptionPane.showMessageDialog(null, num1 + " is NOT evely divisible by " + num2);
		}
	}

}

class CheckNumber {
	
	public boolean isDivisible(int num1, int num2) {
		if (num1 % num2 == 0) {
			return true;
		} else {
			return false;
		}
	}
	
	public int getNumber(String message) {
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


}
