import javax.swing.JOptionPane;

/*
 * Author: Theral Jessop
 * Date: March 4, 2014
 * Description:
 * Write a program that reads a grade value and print on the screen different messages based on this grade value:
 * if grade is greater than 100 or less than 0, print "Invalid Grade"
 * if the grade is between 65 and 100 print "Pass"
 * if the grade is between 0 and 64 print "Fail"
 * 
 * Variables:
 * grade
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */
public class What_Grade {

	public static void main(String[] args) {
		// declare variables
		
		float grade;
		
		// get the grade from the user
		grade = Float.parseFloat(JOptionPane.showInputDialog("What is your grade value?"));
		
		// processing: determine if it is invalid, pass or fail
		if (grade > 100 || grade < 0) {
			JOptionPane.showMessageDialog(null, "Wrong input ~~ invalid grade entered");
		} else if (grade >= 65) {
			if (grade <= 100) {
				JOptionPane.showMessageDialog(null, "Great!! You passed the course!");
			}
		} else if (grade <= 64) {
			if (grade >= 0) {
				JOptionPane.showMessageDialog(null, "Too bad!  You failed the course!");
			}
		}

	}

}
