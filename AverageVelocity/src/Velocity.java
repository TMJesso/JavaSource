import javax.swing.JOptionPane;

/*
 * Name: Theral Jessop
 * Course: I 101
 * Date: 2/19/2014
 * Program Description:
 * The formula for the average velocity of an object traveling on a line between points x1 and x2 in the time interval T1 and T2 is:
 * Average Velocity = (X2-X1) / (T2-T1)
 * 
 * 
 * 
 */
public class Velocity {

	public static void main(String[] args) {
		// (1) Declare your variables
		// variable names have no space, must start with a lower-case letter
		// every statement must end with a semi-colon
		
		float x1, x2, t1, t2, averageVelocity;
		
		// (2) Get the user's input: i.e, x1, t1, x2, t2
		x1 = Float.parseFloat(JOptionPane.showInputDialog("Enter the value of X1"));
		x2 = Float.parseFloat(JOptionPane.showInputDialog("Enter the value of X2"));
		t1 = Float.parseFloat(JOptionPane.showInputDialog("Enter the value of T1"));
		t2 = Float.parseFloat(JOptionPane.showInputDialog("Enter the value of T2"));
		
		// (3) Processing / Calculating
		
		averageVelocity = (x2-x1) / (t2-t1);
		
		// (4) Display the output:
		JOptionPane.showMessageDialog(null, "The average velocity is " + averageVelocity);
	}

}
