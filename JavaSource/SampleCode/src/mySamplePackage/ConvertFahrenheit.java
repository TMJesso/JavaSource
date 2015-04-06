/*
* Name: Theral Jessop
* Course: INFO 211
* Date: January 16, 2015
* Program Description:
* Write a program that takes any Fahrenheit temperature and convert it to its Celsius
* equivalent. Your program should print both of the temperatures on the output screen.
* 
* The formula to convert a Fahrenheit temperature to its Celsius equivalent is:
* 
* C = ( 5/9 ) * ( F-32 )
* 
*/

// import necessary packages in order to use
// classe(s): JOptionPane
package mySamplePackage;
import javax.swing.*;


public class ConvertFahrenheit {

	public static void main(String[] args) {
		// define variables
		double cTemp, fTemp;
		// get users fahrenheit temperature
		fTemp = Float.parseFloat(JOptionPane.showInputDialog(null, "Please enter the fahrenheit temperature:"));
		// process, calculate the celcius conversion
		cTemp = (Math.floor(((5.0/9.0)*(fTemp-32.0))*100))/100;
		// display the results
		JOptionPane.showMessageDialog(null, fTemp+" Fahrenheit converted to "+cTemp+" Celsius");
		
	}

}
