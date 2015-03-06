import javax.swing.JOptionPane;


public class SumNumbers {

	public static void main(String[] args) {
		// declare variables;
		
		int number=0;
		int total=0;
		
		while (number >= 0) {
			total = total + number;
			number = Integer.parseInt(JOptionPane.showInputDialog(("Enter a positive number or a negative number to end the program")));
			// display the sum of all numbers
			// Display the sum of even numbers
			// Display the sum of odd numbers
		}
		JOptionPane.showMessageDialog(null, "The suum of the number is " + total);

	}

}
