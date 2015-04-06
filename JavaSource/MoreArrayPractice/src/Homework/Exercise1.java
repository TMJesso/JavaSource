// Theral and Jeremiah
// group work for Homework 2
package Homework;
import java.util.*;

public class Exercise1 {
	
	public static void main(String[] args) {
		Homework2Lib pl = new Homework2Lib();
		double[][] myArray = new double[3][4];
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a 3-by-4 matrix row by row");
		for (int x = 0; x < myArray.length; x++) {
			System.out.print("Row #" + (x + 1) + " ");
			for (int y = 0; y < myArray[x].length; y++) {
				myArray[x][y] = input.nextDouble();
			}
		}
		input.close();
		for (int x = 0; x < myArray[myArray.length-1].length; x++) {
			System.out.println("Sum of elements at column " + x + " is " + pl.sumColumn(myArray, x));
		}
 	}
	  
}

	  