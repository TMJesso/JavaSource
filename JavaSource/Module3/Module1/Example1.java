import javax.swing.*;
import java.util.Scanner;
/* Example1.java
----------------------------------------------------------------------------
Subject: Example that shows I/O Syntax in Java
----------------------------------------------------------------------------
*/
public class Example1
{

   public static void main( String args[] )
   {
	  //Declare some variables:
	  String firstName, lastName;
	  int number1, number2;

	  //Get the input using InputDialog
	  firstName = JOptionPane.showInputDialog("Enter first name");
	  number1 = Integer.parseInt(JOptionPane.showInputDialog("Enter 1st number"));
	  //parseInt, parseFloat, parseDouble

	  //Get the rest of the input using command line:
	  Scanner input = new Scanner (System.in);

	  System.out.println("Enter your last name:");
	  lastName = input.nextLine();
	  System.out.println("Enter the second number:");
	  number2 = input.nextInt();
	  //nextDouble, nextFloat, nextByte, etc

	  input.close();

	  //Using the Math classes
	  System.out.println(Math.pow(number1, number2));

	  System.out.println("Good bye " + firstName + " " + lastName);
	  JOptionPane.showMessageDialog(null, "Good bye " + firstName + " " + lastName);

   } // end method main

} // end class Example1









