import javax.swing.JOptionPane;

/*
 * Author: Theral Jessop
 * Date: March 26, 2014
 * Description:
 * Create a program that takes input from the user, radius, as an integer.  The radius must be between the values of 1 - 15.
 * If the user enters a wrong value for the radius, your program will display a message and quits.  If the value is within range, the program displays and prints the circle's diameter, circumference and area.
 * 
 * Diameter = 2 * radius
 * Circumference = 2 * II * radius
 * Area = II * radius * radius
 * 
 * 
 * 
 * Variables:
 * diameter      ** calculated variable
 * circumference ** calculated variable
 * area          ** calculated variable
 * radius        ** integer from user
 * pie           ** 3.14159
 * 
 * 
 * 
 * 
 */
public class Circle {

	public static void main(String[] args) {
		// declare variables
		double diameter = 0.00;
		double circumference =  0.00;
		double area = 0.00;
		double radius= 0.00;
		double pie = 3.14159;
		
		// get radius from user
		for (int m_go = 1; m_go > 0;) { // if the user enters a number that is not between 1 and 15 it will display a message and quit
			radius = Float.parseFloat(JOptionPane.showInputDialog("Enter the radius of the circle (must be between 1 and 15)"));
			if (radius > 0) {
				if (radius < 16) {
					// process calculations
						diameter = 2 * radius;
						circumference = 2 * pie * radius;
						area = pie * radius * radius;
						m_go = 0;  // user entered a correct value between 1 and 15
				
					// display results back to the user
						JOptionPane.showMessageDialog(null, "Diameter is "+diameter+"\nArea is "+area+"\nCircumference is "+circumference);
						
				} else {
					JOptionPane.showMessageDialog(null, "Sorry radius entered is not correct.  Must be between 1 and 15!");
					m_go = 0;	
				}
			}
		}
		
		
		
		
		

	}

}
