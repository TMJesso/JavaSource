import javax.swing.JOptionPane;

/*
 * Name: Theral Jessop
 * Date: Feb 26, 2014
 * 
 */
public class Grading {

	public static void main(String[] args) {
		// Declaring variables:
		float grade;
		//Get input
		grade = Float.parseFloat(JOptionPane.showInputDialog("Enter a grade score"));
		
		//Processing:
		if (grade > 100 || grade < 0) {
			JOptionPane.showMessageDialog(null, "Wrong input ~~ invalid grade entered");
			
		}
		else if (grade >= 65 && grade <= 100) {
			JOptionPane.showMessageDialog(null, "Great ~~ You passed the course");
			
		}
		else {
			JOptionPane.showMessageDialog(null,  "Too Bad ~~ You failed the course");
		}

	}

}
