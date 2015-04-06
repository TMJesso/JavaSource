//Introduction to using Java Arrays & passing Arrays to methods

/*
An Array is a simple data structure that defines an indexed collection of fixed number
of homogeneous data elements.

The size of a regular array is fixed and can't be increased to accommodate new elements.

Arrays in Java are objects.

*/

public class Example1Arrays
{
	public static void main (String args[])
	{
		System.out.println ("==============================================================");
		final int arrSize = 10; // constant, arrSize++; not allowed
		int[] arr = new int[arrSize];  //All initialized to zeros
		System.out.println (arr[9]);
		arr[1] = 5;
		System.out.println (arr[1]);
		//*******************************************************
		int arr1 [] = { 10,20,30,40,50}; // Construct and initialize the array in one statement
		System.out.println (arr1[4]); 
		//*******************************************************
		//The following declares an array of Objects constructed to hold three elements
		Object[] objArray = { null, null, null};
		System.out.println ("The length of the array is " + objArray.length );
		System.out.println ();
		//*******************************************************
        double [] trialArray = {23.5,12.0,45};

        for (int j = 0; j < trialArray.length; ++j)
            System.out.println(trialArray[j]);
		System.out.println("the minimum value in the array is " + findMinimum(trialArray));
		System.out.println();

		//look how you can use this kind of anonymous arrays
		System.out.println("The min. value in the array is " + findMinimum(new double[] {3,4,5}));

	}// -------- End of Main -------


    public static double findMinimum(double[] valArray)
	{
        double minValue = valArray[0];
        for (int i = 0; i < valArray.length; ++i)
            minValue = Math.min(minValue, valArray[i]);
        return minValue;
	}

}//-------- End of class Example1Arrays ---------

/*
 Passing by value vs by reference:
 In Java: Primitive data types are always passed by value. You cant pass them by reference.
 Objects are not passed to methods, references of the objects gets passed by value
 Arrays are Objects and they follow the same passing principles for objects in Java. This improves the performance
 by eliminating the overhead of copying large amounts of data especially for large arrays.
*/


