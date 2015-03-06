/*
 * IUK
 * Professor: Dr. Awny Alnusair
 *  Name: Theral Jessop
 * Course: INFO 211
 * Date: January 29, 2015
 * Quiz 1:
 * Problem 2:
 * 
 * Description:
 * A company provides 4 different services whose costs are as follows:
 * Service 1: $100
 * Service 2: $200
 * Service 3: $300
 * Service 4: $400
 * Write a program that reads the service(s) provided to a particular customer then calculates 
 * and display the total charge of all services provided. You should be able to use some technique 
 * to determine when program should stop looping and then display the final results.
 * 
 * Sample Run:
 * -- Enter Service number (1-4) (0 to stop): 1
 * -- Enter Service number (1-4) (0 to stop): 3
 * -- Enter Service number (1-4) (0 to stop): 0
 * The total charge is $400
 *  
 * 
 * 
 */
package quiz1;
	// load package to display using dialog boxes
	import javax.swing.*;
public class Problem2 {
	public static void main(String[] args) {
		// display menu
		System.out.println("Services available\n\nService 1: $100\nService 2: $200\nService 3: $300\nService 4: $400");
		// declare variables
		int amount=0, service=0;
		boolean loop=true;
		// loop until user enters 0
		while (loop) {
			// validate entry and see if user wants to exit
			try {
				service=Integer.parseInt(JOptionPane.showInputDialog("Enter service number (1 - 4)  (0 to stop): "));
				// user wants to exit
				if (service==0) {
					loop=false;
					continue;
				}
			} catch (NumberFormatException|NullPointerException e) {
				// user did not enter a valid entry
				JOptionPane.showMessageDialog(null, "Invalid entry!");
				continue;
			}
			// service entered and amount added to total
			switch (service) {
				case 1: amount += 100;break;
				case 2: amount += 200;break;
				case 3: amount += 300;break;
				case 4: amount += 400;break;
				// user entered a service number outside the available range
				default: JOptionPane.showMessageDialog(null, "Invalid service number entered! (1 - 4) Only:");break;
			}
		}
		// display results and show total amount owed
		JOptionPane.showMessageDialog(null, "The total charge is $" + amount);
	}
}
