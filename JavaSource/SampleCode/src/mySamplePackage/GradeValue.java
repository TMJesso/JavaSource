/* 
 * Name: Theral Jessop
 * Course: INFO 211
 * Date: January 21, 2015
 * Description:
 * Write a program that reads a grade value and print on the screen diferent messages based on this
 * grade value:
 * 
 * if grade is greator than 100 or less than 0, print “Invalid Grade”
 * if the grade between 65 and 100 print “Pass”
 * if the grade is between 0 and 64 print “Fail”
 * 
 * variables:
 * notNumber   (boolean)
 * grade       (int)
 * 
 * 
 */ 

// import necessary packages in order to use

package mySamplePackage;

//import for JOptionPane class
import javax.swing.*;

public class GradeValue {

	public static void main(String[] args) {
		int grade=0;
		boolean notNumber=false;
		
		while(!notNumber) {
			try
			{
				grade=Integer.parseInt(JOptionPane.showInputDialog("Please enter the Grade value"));
				notNumber=true;
			}
			catch (NumberFormatException e)
			{
				JOptionPane.showMessageDialog(null, "Invalid grade value entered!");
			}
		}
		if (grade>100 || grade<0) {
				JOptionPane.showMessageDialog(null, "Invalid Grade value");
		}
		if (grade>=65) {
			if (grade<=100) {
				JOptionPane.showMessageDialog(null, "Pass");
			}
		}
		if (grade>=0) {
			if (grade<=64) {
				JOptionPane.showMessageDialog(null, "Fail");
			}
		}
	}
}
