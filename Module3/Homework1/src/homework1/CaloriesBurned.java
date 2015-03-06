/* 
 * IUK
 * Professor: Dr. Awny Alnusair
 * Name: Theral Jessop
 * Course: INFO 211
 * Date: January 22, 2015
 * Homework 1:
 * Problem 1:
 * Description:
 *  The number of calories burned per hour by bicycling, jogging, and swimming is 200, 475, and 275,
 *  respectively. A person loses 1 pound of weight for each 3500 calories burned. Write a program 
 *  that allows the user to input the number of hours spent at each activity and then calculates the
 *  number of pounds worked off. Don’t use dialogs for input/output, use the terminal instead.
 * 
 * 
 * variables:
 * bicycling = 200		(double)
 * jogging   = 475		(double)
 * swimming  = 275		(double)
 * rate      = 1/3500	(double)
 * bikeHours			(double)
 * jogHours				(double)
 * swimHours			(double)
 * pounds				(double)
 * 
 * entryCheck			(boolean)
 * 
 */ 

// import necessary packages in order to use
package homework1;

// import for System and Scanner classes
import java.util.*;

public class CaloriesBurned {

	public static void main(String[] args) {
		// declare variables for use
		// constant values
		final double bicycling=200.0, jogging=475.0, swimming=275.0;
		// calculated values, input values
		double rate=1.0/3500.0, bikeHours=0.0, jogHours=0.0, swimHours=0.0, pounds=0.0;
		boolean entryCheck=true;
		// set up the scanner object
		Scanner input = new Scanner(System.in);
		// get the biking hours from user
		System.out.print("Please enter the hours biking: ");
		// check to see if the hours entered is valid
		while (entryCheck) {
			bikeHours = input.nextDouble();
			// user cannot enter less than 0 hours
			if (bikeHours<0) {
				// error message because user entered a number less than 0
				System.out.println("Invalid Entry! Hours cannot be less than 0");
			} else {
				// exit the loop
				entryCheck=false;
			}
		}
		entryCheck=true;
		// get the jogging hours from user
		System.out.print("Please enter the hours jogging: ");
		// check to see if the hours entered is valid
		while(entryCheck) {
			jogHours = input.nextDouble();
			// user cannot enter less than 0 hours
			if (jogHours<0) {
				// error message because user entered a number less than 0
				System.out.println("Invalid Entry! Hours cannot be less than 0");
			} else {
				// exit the loop
				entryCheck=false;
			}
		}
		entryCheck=true;
		// get the swimming hours from user
		System.out.print("Please enter the hours swimming: ");
		// check to see if the hours entered is valid
		while (entryCheck) {
			swimHours = input.nextDouble();
			// user cannot enter less than 0 hours
			if (swimHours<0) {
				// error message because user entered a number less than 0
				System.out.println("Invalid Entry! Hours cannot be less than 0");
			} else {
				// exit the loop
				entryCheck=false;
			}
		}
		input.close();
		// calculate how many pounds were worked off
		pounds=(Math.floor(((((bikeHours*bicycling)+(jogHours*jogging)+(swimHours*swimming))*rate)*10000)))/10000;
		// display the results to the user
		System.out.println("You have worked off "+pounds+" pounds!");
		

	}

}
