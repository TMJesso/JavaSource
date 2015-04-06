/*
 * IUK
 * Professor: Dr. Awny Alnusair
 *  Name: Theral Jessop
 * Course: INFO 211
 * Date: January 29, 2015
 * Quiz 1:
 * Problem 3:
 * 
 * Description:
 * A mail-order house sells five products whose retail prices are as follows:
 * Product 1: $2.98
 * Product 2: $4.50
 * Product 3: $9.98
 * Product 4: $4.49
 * Product 5: $6.87
 * Write a java application that reads a series of pairs of numbers as follows:
 * 
 * a) product number
 * b) quantity sold
 * 
 * Your program should use a decision structure (if or switch statements) to determine 
 * the retail price for each product. It should calculate and display the total retail 
 * value of all products sold. You should be able to use some technique we learned in 
 * class to determine when program should stop looping and then display the final results.
 * 
 * 
 * 
 * 
 */
package quiz1;
	// load package to display dialog boxes
	import javax.swing.*;
public class Problem3 {
	public static void main(String[] args) {
		// declare variables
		boolean loop=true;
		final double PROD1=2.98, PROD2=4.50, PROD3=9.98, PROD4=4.49, PROD5=6.87;
		System.out.println("Product choices\n");
		System.out.printf("%-11s%-10.2f","Product 1: $",PROD1);
		System.out.printf("\n%-11s%-10.2f","Product 2: $",PROD2);
		System.out.printf("\n%-11s%-10.2f","Product 3: $",PROD3);
		System.out.printf("\n%-11s%-10.2f","Product 4: $",PROD4);
		System.out.printf("\n%-11s%-10.2f","Product 5: $",PROD5);
		double product1=0.00, product2=0.00, product3=0.00, product4=0.00, product5=0.00;
		int prodNumber=0, qty=0;
		// as long as the user does not enter 0 keep getting products
		while (loop) {
			try {
				prodNumber=Integer.parseInt(JOptionPane.showInputDialog("Enter product # (1 - 5) (0 to stop):"));
				if (prodNumber==0) {
					loop=false;
					continue;
				}
				qty=Integer.parseInt(JOptionPane.showInputDialog("Enter quantity for Product # " + prodNumber + ":"));
			} catch (NumberFormatException|NullPointerException e) {
				JOptionPane.showMessageDialog(null, "Invalid entry!");
				continue;
			}
			switch (prodNumber) {
				case 1: product1 += qty * PROD1;break;
				case 2: product2 += qty * PROD2;break;
				case 3: product3 += qty * PROD3;break;
				case 4: product4 += qty * PROD4;break;
				case 5: product5 += qty * PROD5;break;
				// user entered invalid product number
				default: JOptionPane.showMessageDialog(null, "Invalid product number entered! (1 - 5) ONLY!");break;
			}
		}
		if (product1 > 0 || product2 > 0 || product3 > 0 || product4 > 0|| product5 > 0) {
			JOptionPane.showMessageDialog(null, "Product 1: $" + product1 + "\nProduct 2: $" + product2 + "\nProduct 3: $" + product3 + "\nProduct 4: $" + product4 + "\nProduct 5: $" + product5);
		}
	}
}
