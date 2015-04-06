//Info-Rep Lab1 Binary Search
//Ian Holtson
package lab1;
import lab1.ReadAsArray;


public class BinarySearch {
	public static void main(String[] args) throws Exception {
		int[] myArray = new int [22];
		int num = 0;
		// filename
		String filename = "test.txt";
		// set instance of ReadAsArray
		ReadAsArray bs = new lab1.ReadAsArray();
		// get number from user
		num = bs.askUser("Please enter a number");
		// load array from text file
		myArray = bs.readFile(filename, myArray);
		// see if the number the user entered exists
		num = bs.binarySearch(num, myArray);
		// display results
		System.out.println(num);
		
	}
}
 




