package practiceLibrary;

public class Lab4Lib {
	   public void buildOutput( int array[][] )
	   {
	      // loop through array's rows
	      for ( int row = 0; row < array.length; row++ ) {

	         // loop through columns of current row
	         for ( int column = 0; column < array[row].length; column++ ) {
				 System.out.print( array[ row ][ column ] + "  " );
			 }
			 System.out.println( "\n" );
	      }
	   } // end method buildOutput

	   	// this method returns the total of all the values in an array passed to the method
	   public int getSum(int myArray[][]) {
		   int total = 0;
		   // loop through the array's rows
		   for (int x = 0; x < myArray.length; x++ ) {
			   // loop through the columns of the current row
			   for (int y = 0; y < myArray[x].length; y++) {
				   total+= myArray[x][y];
			   }
		   }
		   return total;
	   }
	   
	   // this method returns the average of all the values in an array passed to the method
	   public double getAverage(int myArray[][]) {
		  double average = 0.0;
		  average = getSum(myArray)/(((myArray.length-1)*1.0) * ((myArray[(myArray.length-1)].length-1)));
		  return average; 
	   }
	   
	   // this method returns the smallest value in the first row of a 2D array
	   public int getSmallestInFirstRow(int myArray[][]) {
		   int num = myArray[0][0];
		   // loop through the first row only and get the smallest value in the array
		   for (int x = 1; x < myArray[0].length; x++) {
			   if (num > myArray[0][x]) {
				   num = myArray[0][x];
			   }
		   }   
		   return num;
	   }
	   
	   
	// this method initializes the array to number 5 when the row value equals the columns value, otherwise it initializes it to zero
	   public void initializeArray(int myArray[][]) {
		   for (int x = 0; x < myArray.length; x++) {
			   for (int y = 0; y < myArray[x].length; y++) {
				   if (x==y) {
					   myArray[x][y] = 5;
				   } else
					   myArray[x][y] = 0;
			   }
		   }
	   }
	   
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
