/*
 * Name: Theral Jessop
 * Course: INFO 211
 * Date: January 16, 2015
 * Program Description:
 * 
 * Write a program that reads in the Radius of a circle and prints the Circle’s Diameter and Area.
 * 
 * The math. Formulas are as follows:
 * 
 * Diameter = Radius * 2
 * 
 * Area = PI * Radius * Radius
 * 
 * Given that, PI is a constant and its approximate value is 3.14159
 * 
 * 
 */


// import necessary packages in order to use
// classe(s): JOptionPane
package mySamplePackage;
import javax.swing.*;

public class Diameter {

	public static void main(String[] args) {
		// declare variables
		double diameter, radius, area;
		// set pi
		final double pi = 3.14159;
		// get radius from user
		radius = Double.parseDouble(JOptionPane.showInputDialog("What is the radius of the circle?"));
		// calculate diameter
		diameter = radius*2.0;
		// calculate area
		area = (Math.floor(((pi * radius * radius)*1000)))/1000;
		// show user the results
		JOptionPane.showMessageDialog(null,"Diameter is "+diameter+"\n\nArea is "+area);
		
		

	}

}
