package exam1;
import examLib.MyExamLib;
public class DoubleNumbers {

	public static void main(String[] args) {
		MyExamLib genDblNum = new MyExamLib();
		double[] myArray = { 1.8, 2.5, 3.6, 1.25, 0.25, 56.3};
		
		System.out.println("The sum of the array is " + genDblNum.arrayTotal(myArray));
		System.out.println("The maximum element is " + genDblNum.arrayMaximum(myArray));
		myArray = genDblNum.initializeArray(myArray);
		System.out.println("The sum of the array is " + genDblNum.arrayTotal(myArray));
		
	}

}
