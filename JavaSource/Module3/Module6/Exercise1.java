// Jeremiah and Theral
import java.util.*;
public class Exercise1 {
	
	public static void main(String[] args) {
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
			System.out.println("Sum of elements at column " + x + " is " + sumColumn(myArray, x));
		}
 	}
	  
	  public static double sumColumn(double [][] myArray, int columnIndex){
			 double total = 0.0;
			   // loop through the array's rows
			   //for (int x = 0; x < myArray.length; x++ ) {
				   // loop through the columns of the current row
				   for (int y = 0; y < myArray.length; y++) {
					   total+= myArray[y][columnIndex];
				   }
			   return total;
	}  
}

	  