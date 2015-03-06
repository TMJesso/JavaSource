
/* 
 * IUK
 * Professor: Dr. Awny Alnusair
 * Name: Theral Jessop
 * Course: INFO 211
 * Date: January 23, 2015
 * Homework 1:
 * Problem 2:
 * Description:
 * Write a program that prompts the user to enter a temperature between -58°F and 41°F and a wind speed greater than or equal to
 * 2 and display the wind-chill temperature.
 * 
 * formula:
 * windFactor = (wind^0.16)
 * windChill = 35.74 + 0.6215(temp) - 35.75(windFactor) + 0.4275(temp)(windFactor)
 * 
 * variables:
 * wind								(double)
 * windFactor=Math.pow(wind,0.16)	(double)
 * temp								(double)
 * windChill						(double)
 * 
 * entryCheck						(boolean)
 * 
 */ 

// import necessary packages in order to use
package homework1;

// import JOptionPane class
import javax.swing.*;

public class WindChill {

	public static void main(String[] args) {
		// declare variables for use
		double wind=0.0, windFactor=0.0, temp=0.0, windChill=0.0;
		boolean entryCheck=true;
		// get wind speed from user
		while (entryCheck) {
			try
			{
				wind=Double.parseDouble(JOptionPane.showInputDialog("Enter the wind speed in miles per hour: (>=2)"));
			}
			catch (NumberFormatException|NullPointerException e)
			{
				// invalid entry was detected
				JOptionPane.showMessageDialog(null, "Invalid Entry!");
				continue;
			}
			// is wind speed less than 2 mph
			if (wind<2) {
				// invalid wind speed detected
				JOptionPane.showMessageDialog(null, "Wind speed cannot be less than 2");
			} else {
				// exit loop
				entryCheck=false;
			}
		}
		// calculate wind factor
		windFactor=Math.pow(wind, 0.16);
		// reset loop status
		entryCheck=true;
		// get temperature from user
		while (entryCheck) {
			try
			{
				temp=Double.parseDouble(JOptionPane.showInputDialog("Enter the Fahrenheit temperature\n\nBetween -58°F and 41°F:"));
			}
			catch (NumberFormatException|NullPointerException e)
			{
				// invalid entry was detected
				JOptionPane.showMessageDialog(null, "Invalid Entry!");
				continue;
			}
			// is temp less than -58° or temp > 41°
			if (temp<-58 || temp>41) {
				// invalid wind speed detected
					JOptionPane.showMessageDialog(null, "Temperature must be between -58°F and 41°F");
			} else {
				// exit loop
				entryCheck=false;
			
			}
		}
		// calculate the windchil
		windChill = (Math.floor(((35.74 + 0.6215*temp - 35.75*windFactor + 0.4275*temp*windFactor)*100000)))/100000;
		// display the results on the console
		System.out.println("With the temperature of "+temp);
		System.out.println("and a wind speed of "+wind+" mph,");
		System.out.println("the Wind Chill index is: "+windChill);
	}

}
