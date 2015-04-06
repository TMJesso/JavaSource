/* 
 * Name: Theral Jessop
 * Course: INFO 211
 * Date: January 16, 2015
 * Description:
 * Write an application program to find the average velocity of any particle. Let the user
 * specify the time interval parameters and the points
 * 
 * The formula for the average velocity of an object traveling on a line between points X1
 * and X2 in the time interval T1 and T2 is:
 * 
 * Average Velocity = ( X2-X1) / (T2-T1)
 * 
 * 
 * 
 */ 

// import necessary packages in order to use
// classe(s): JOptionPane

 
package mySamplePackage;
	
import javax.swing.*;

public class AverageVelocity {
	

	public static void main(String[] args) {
		// Initialize input variables and calculated variables
		double t1, t2, x1, x2, averageVelocity;
				
		//get user input
		t1 = Double.parseDouble(JOptionPane.showInputDialog(null,"Please enter time 1"));
		t2 = Double.parseDouble(JOptionPane.showInputDialog(null,"Please enter time 2"));
		x1 = Double.parseDouble(JOptionPane.showInputDialog(null,"Please enter Point 1"));
		x2 = Double.parseDouble(JOptionPane.showInputDialog(null,"Please enter Point 2"));
		//calculate average velocity
		averageVelocity=(Math.floor(((x2-x1)/(t2-t1))*1000))/1000;
		// display the results
		JOptionPane.showMessageDialog(null, "Average Velocity is: " + averageVelocity);
		
	}

}
