// Theral and Jeremiah
// group work for Homework 2
package Homework;

public class Homework2Lib {
	   // this method sums the major diagonal elements of a 2 dimensional array 
	   public double sumDiagArray(double[][] myArray) {
		   double total = 0.0;
	   
		   for (int x = 0; x < myArray.length; x++) {
			   for (int y = 0; y < myArray[x].length; y++) {
				   if (x==y) {
					   total += myArray[x][y];
				   }
			   }
		   }
		   return total;
	   }
	   		// this method displays the sum of each column
		  public double sumColumn(double [][] myArray, int columnIndex){
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
