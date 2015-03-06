package practiceLibrary;
//import java.util.*;
public class Lab4Lib {
	/** display the results of a integer, two-dimensional array in the form of a matrix */
	   public void buildOutput( int array[][], String message )
	   {
	      // loop through array's rows
		   System.out.println(message);
	      for ( int row = 0; row < array.length; row++ ) {

	         // loop through columns of current row
	         for ( int column = 0; column < array[row].length; column++ ) {
				 System.out.print( array[ row ][ column ] + "  " );
			 }
			 System.out.println( "\n" );
	      }
	   } // end method buildOutput

		/** display the results of a double, two-dimensional array in the form of a matrix */
	   public void buildOutput( double array[][], String message)
	   {
	      // loop through array's rows
		   System.out.println(message);
	      for ( int row = 0; row < array.length; row++ ) {

	         // loop through columns of current row
	         for ( int column = 0; column < array[row].length; column++ ) {
				 System.out.print( array[ row ][ column ] + "  " );
			 }
			 System.out.println( "\n" );
	      }
	   } // end method buildOutput


	   	/** this method returns the total of all the values in an array passed to the method */
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
	   
	   /** this method returns the average of all the values in an array passed to the method */
	   public double getAverage(int myArray[][]) {
		  double average = 0.0;
		  average = getSum(myArray)/(((myArray.length-1)*1.0) * ((myArray[(myArray.length-1)].length-1)));
		  return average; 
	   }
	   
	   /** this method returns the smallest value in the first row of a 2D array */
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
	   
	   
	/** this method initializes the array to number 5 when the row value equals the columns value, otherwise it initializes it to zero */
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
	   
	   /** this method sums the major diagonal elements of a 2 dimensional array */
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
	   		/** this method displays the sum of each column */
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
		
		  
		/** read a Sudoku solution from the console */
		public int[][] readASolution() {
			// create a scanner
			//Scanner input = new Scanner(System.in);
			//System.out.println("Enter a Sudoku puzzle solution:");
			int[][] grid = {{5, 3, 4, 6, 7, 8, 9, 1, 2},
					{6, 7, 2, 1, 9, 5, 3, 4, 8},
					{1, 9, 8, 3, 4, 2, 5, 6, 7},
					{8, 5, 9, 7, 6, 1, 4, 2, 3},
					{4, 2, 6, 8, 5, 3, 7, 9, 1},
					{7, 1, 3, 9, 2, 4, 8, 5, 6},
					{9, 6, 1, 5, 3, 7, 2, 8, 4},
					{2, 8, 7, 4, 1, 9, 6, 3, 5},
					{3, 4, 5, 2, 8, 6, 1, 7, 9}};
		//	}
		//	for (int i = 0; i < grid.length; i++) {
		//		for (int j = 0; j < grid[i].length; j++) {
		//			grid[i][j] = input.nextInt();
		//		}
		//	}
		//	input.close();
			return grid;
		}

		/** check whether a solution is valid */
		public boolean isValid(int[][] grid) {
			for (int i = 0; i < grid.length; i++) {
				for (int j = 0; j < grid[i].length; j++) {
					if (grid[i][j] < 1 || grid[i][j] > 9 || !isValid(i, j, grid)) {
						return false;
					}
				}
			}
			return true;
		}
		
		
		/** check whether grid[i][j] is valid in the grid */
		public boolean isValid(int i, int j, int[][] grid) {
			// check whether grid[i][j] is unique in i's row
			for (int column = 0; column < grid[i].length; column++) {
				if (column != j && grid[i][column] == grid[i][j]) {
					return false;
				}
			}
			// check whether grid[i][j] is unique in j's column
			for (int row = 0; row < grid.length; row++) {
				if (row != i && grid[row][j] == grid[i][j]) {
					return false;
				}
			}
			
			// check whether grid[i][j] is unique in the 3 by 3 box
			for (int row = (i / 3) * 3; row < (i / 3) * 3 + 3; row++) {
				for (int col = (j / 3) * 3; col < (j / 3) * 3 + 3; col++) {
					if (row != i && col != j && grid[row][col] == grid[i][j]) {
						return false;
					}
				}
			}
			return true;  // the current value at grid[i][j] is valid
		}
		
		
		/** multiply two matrices together */
		public double[][] multiplyMatrix(double[][] a, double[][] b) {
			int aRow = a.length;
			int bRow = b.length;
			int aCol = a[0].length;
			int bCol = b[0].length;
			for (int row = 0; row < a.length; row++) {
				for (int col = 0; col < a[row].length; col++) {
					aRow = row;
					aCol = col;
				}
			}
			for (int row = 0; row < b.length; row++) {
				for (int col = 0; col < b[row].length; col++) {
					bRow = row;
					bCol = col;
				}
			}
			double [][] c = new double[aRow + 1][aCol + 1];
			if (aRow == bRow && aCol == bCol) {
					for (int row = 0; row < a.length; row++) {
						for (int col = 0; col < a[row].length; col++) {
							c[row][col] = ((Math.floor(((a[row][0] * b[0][col] + a[row][1] * b[1][col] + a[row][2] * b[2][col])*100)))/100);
						}
					}
				}
			return c;
		}
		
		/** add two matrices together */
		public double[][] addMatrix(double[][] a, double[][] b) {
			int aRow = a.length;
			int bRow = b.length;
			int aCol = a[0].length;
			int bCol = b[0].length;
			for (int row = 0; row < a.length; row++) {
				for (int col = 0; col < a[row].length; col++) {
					aRow = row;
					aCol = col;
				}
			}
			for (int row = 0; row < b.length; row++) {
				for (int col = 0; col < b[row].length; col++) {
					bRow = row;
					bCol = col;
				}
			}
			double[][] c = new double[aRow + 1][aCol + 1];
			if (aRow == bRow && aCol == bCol) {
				for (int row = 0; row < a.length; row++) {
					for (int col = 0; col < a[row].length; col++) {
						c[row][col] = ((Math.floor(((a[row][col] + b[row][col])*100)))/100);
					}
				}
			}
			return c;
		}
}
