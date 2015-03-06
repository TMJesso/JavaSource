/*
 * Name: Theral Jessop
 * Course: INFO 211
 * Date: January 16, 2015
 * Program Description:
 * 
 * The number of calories burned per hour by bicycling, jogging, and swimming is 200,
 * 475, and 275, respectively. A person loses 1 pound of weight for each 3500 calories
 * burned. Write a program that allows the user to input the number of hours spent at each
 * activity and then calculates the number of pounds worked off.
 * 
 * bicylcling = 200		hoursbiking
 * jogging = 475		hoursJog
 * swimming	= 275		hoursSwim
 * rate = 1/3500        1 pound lost for every 3500 calories burned
 * 
 */


// import necessary packages in order to use
// classe(s): JOptionPane
package mySamplePackage;
import javax.swing.*;

public class CaloriesBurned {

	public static void main(String[] args) {
		// define the variables
		double bicycling, jogging, swimming, hoursBike, hoursJog, hoursSwim, pounds, rate, bikeCB, jogCB, swimCB;
		// set constants
		bicycling = 200.0;
		jogging = 475.0;
		swimming = 275.0;
		// calculate the rate
		rate = (Math.floor(((1.0/3500.0)*10000)))/10000;
		// get user input
		// biking hours
		hoursBike = Double.parseDouble(JOptionPane.showInputDialog("How many hours did you Bike"));
		// jogging hours
		hoursJog = Double.parseDouble(JOptionPane.showInputDialog("How many hours did you Jog"));
		// swimming hours
		hoursSwim = Double.parseDouble(JOptionPane.showInputDialog("How many hours did you Swim"));
		// calculate calories burned with each activity
		// calories burned biking
		bikeCB = (bicycling * hoursBike);
		jogCB = (jogging * hoursJog);
		swimCB = (swimming * hoursSwim);
		// calculate the pounds lost by adding all the calories burned, multiplying by the rate
		pounds = (Math.floor((((bikeCB + jogCB + swimCB) * rate)*1000)))/1000;
		// show the user how many pounds they lost
		JOptionPane.showMessageDialog(null, "You burned "+bikeCB+" calories biking\nYou burned "+jogCB+" calories jogging\nYou burned "+swimCB+" calories swimming\nTotal calories burned is "+(bikeCB+jogCB+swimCB)+"\n\nYou lost "+pounds+" pounds");
			
	}

}
