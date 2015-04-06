package Fahrenheit;

import javax.swing.JOptionPane;

/*
 * Name: Theral Jessop
 * Course: I 101
 * Date: 2/23/2014
 * Program Description:
 * The formula to convert Fahrenheit temperature to its Celsius equivalent is:
 * C = (5.0/9.0) * ( F-32)
 * 
 */
public class Converter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// (1) Declare Fahrenheit variable and celcius temperature variable
		
		double fTemp1, tCelcius;
		
		// (2) Get Fahrenheit temperature from user
		
		fTemp1 = Float.parseFloat(JOptionPane.showInputDialog("Enter the Fahrenheit Temprature"));
		
		// (3) Do the calculation C = (5.0/9.0) * ( F-32)
		tCelcius = (5.0/9.0) * ( fTemp1-32);
		
		// (4) Display the output
		
		JOptionPane.showMessageDialog(null, "The Celcius tempruture is " + tCelcius);
	}

}
