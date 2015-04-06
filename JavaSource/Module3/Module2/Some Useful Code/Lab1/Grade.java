/*
 * name: Theral Jessop
 * Description:
 * Write a program that reads a grade value and print on the screen diferent messages based on this grade value:
 * if grade is greator than 100 or less than 0, print “Invalid Grade”
 * if the grade between 65 and 100 print “Pass”
 * if the grade is between 0 and 64 print “Fail”
 * Q3:
 * 
 * 
 * 
 */




package Lab1;
import javax.swing.*;

public class Grade {

	public static void main(String[] args) {
		int grade=0;
		grade=Integer.parseInt(JOptionPane.showInputDialog("Please enter the grade value"));
		if (grade>100 || grade<0) {
			JOptionPane.showMessageDialog(null, "Invalid Grade");
		} else if (grade>=65) {
			JOptionPane.showMessageDialog(null, "Pass");
		} else {
			JOptionPane.showMessageDialog(null, "Fail");
		}
		

	}

}
