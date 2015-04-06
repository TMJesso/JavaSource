// Theral and Jeremiah
package morePractice;
import practiceLibrary.Lab4Lib;

public class Lab4 {

	public static void main(String[] args) {
		Lab4Lib ap = new practiceLibrary.Lab4Lib();
		int[][] myArray = new int[5][5];
		// initial array values
		// first row
		  myArray[0][0] = 10;
		  myArray[0][1] = 20;
		  myArray[0][2] = 45;
		  myArray[0][3] = 60;
		  myArray[0][4] = 75;
		  //second row
		  myArray[1][0] = 15;
		  myArray[1][1] = 25;
		  myArray[1][2] = 40;
		  myArray[1][3] = 65;
		  myArray[1][4] = 70;
		  // third row
		  myArray[2][0] = 1;
		  myArray[2][1] = 2;
		  myArray[2][2] = 4;
		  myArray[2][3] = 6;
		  myArray[2][4] = 7;
		  //fourth row
		  myArray[3][0] = 5;
		  myArray[3][1] = 12;
		  myArray[3][2] = 4;
		  myArray[3][3] = 12;
		  myArray[3][4] = 9;
		  // fifth row
		  myArray[4][0] = 5;
		  myArray[4][1] = 10;
		  myArray[4][2] = 15;
		  myArray[4][3] = 20;
		  myArray[4][4] = 25;
		  
		  // display the array in matrix form
		  ap.buildOutput(myArray, "Original Array");
		  System.out.println("The sum of the array is " + ap.getSum(myArray) + "\n");
		  System.out.println("The average of the array is " + ap.getAverage(myArray) + "\n");
		  System.out.println("The smallest value of the first row in the array is " + ap.getSmallestInFirstRow(myArray));
		  ap.initializeArray(myArray);
		  ap.buildOutput(myArray, "After Initialization");

		
	}

}
