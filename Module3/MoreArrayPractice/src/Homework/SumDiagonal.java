// Theral and Jeremiah
// group work for Homework 2

package Homework;

import java.util.Scanner;

public class SumDiagonal {

	public static void main(String[] args) {
		double[][] myArray = new double[4][4];
		Homework2Lib pl = new Homework2Lib();
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a 4-by-4 matrix row by row");
		for (int x = 0; x < myArray.length; x++) {
			System.out.print("Row #" + (x + 1) + " ");
			for (int y = 0; y < myArray[x].length; y++) {
				myArray[x][y] = input.nextDouble();
			}
		}
		input.close();
		System.out.println("The sum of the elements in the major diagonal is " + pl.sumDiagArray(myArray));
	}

}
