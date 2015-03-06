package morePractice;
//2-Dimensional Arrays - Simple example
//A 2-D Array is simply an Array of Arrays

public class Example2DimArrays {

		public static void main (String args[])
		{

		  int[][] arrayNumbers = new int[2][3];// array with 2 rows and 3 columns
		  //first row
		  arrayNumbers[0][0] = 10;
		  arrayNumbers[0][1] = 20;
		  arrayNumbers[0][2] = 45;
		  //second row
		  arrayNumbers[1][0] = 11;
		  arrayNumbers[1][1] = 15;
		  arrayNumbers[1][2] = 17;

		  System.out.println( "Values in arrayNumbers by row are\n" );
	      buildOutput( arrayNumbers );

		  int[][] array1 =
		  {
				  { 1, 2, 3 },
				  { 4, 5, 6 }
		  };

	      int array2[][] = {
	    		  { 1, 2 },
	    		  { 3 }, //The rest will not be initialized to zero!
	    		  { 4, 5, 6 }
	      };
	      int[][] array3 = new int[3][3];

	    //System.out.println(array2[0][2]);//index out of bound
	    //System.out.println(array2[1][1]);//index out of bound
	      System.out.println(array2[0][1]);//2
	      System.out.println(array3[2][2]);//displays zero
	      System.out.println(array1.length);//2
	      System.out.println(array2.length);//3
	      System.out.println(array3.length);//3
	      System.out.println(array2[1].length);//prints 1: length of second row

	      System.out.println( "Values in array1 by row are\n" );
	      buildOutput( array1 );

	     System.out.println( "\nValues in array2 by row are\n" );
	     buildOutput( array2 );

	      System.out.println( "\nValues in array3 by row are\n" );
	      buildOutput( array3 );

		}// -------- End of Main -------


	   public static void buildOutput( int array[][] )
	   {
	      // loop through array's rows
	      for ( int row = 0; row < array.length; row++ ) {

	         // loop through columns of current row
	         for ( int column = 0; column < array[row].length; column++ ) {
				 System.out.println( array[ row ][ column ] + "  " );
			 }
			 System.out.println( "\n" );
	      }
	   } // end method buildOutput
	}
