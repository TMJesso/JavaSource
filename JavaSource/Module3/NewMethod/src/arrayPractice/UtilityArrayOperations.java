package arrayPractice;

public class UtilityArrayOperations {
	public static void main(String[] args) {
		// create an array and exercise the utility operations in the
		// ArrayUtilityMethods
		ArrayUtilityMethods myMethods = new ArrayUtilityMethods();
		double[] trialArray = {3.0, 4.0, 5.5, 1.0, 3.2};
		
		myMethods.displayArray(trialArray);
		System.out.println(myMethods.findSum(trialArray) + " is the sum of the array");
		myMethods.sortArray(trialArray);
		myMethods.searchItem(trialArray, 5.5);

	}
}


class ArrayUtilityMethods {
	// this class will have multiple operations that deal with arrays:
	
	
	// Method 1 will find the sum of all elements in an double array
	public double findSum(double[] valArray) {
		double sumValue = 0.0;
		for (double elements: valArray) {
			sumValue+=elements;
		}
		return sumValue;
	}
	// Method 2 will search the array for a given item and display a message (found / not found)
	public void searchItem(double[] valArray, double searchFor) {
		boolean found = false;
		for (double elements: valArray) {
			if (searchFor == elements) {
				System.out.println("\n" + searchFor + " has been found in the array");
				found = true;
				break;
			}
		}
		if (!found) {
			System.out.println("\n" + searchFor + " was not found!");
		}
	}
	// Method 3: will sort the array and display the array elements sorted in ascending order
	public void sortArray(double[] valArray) {
		for (int x = 0; x < valArray.length; x++) {
			double currentMin = valArray[x];
			int currentMinIndex = x;
			for (int y = x + 1; y < valArray.length; y++) {
				if (currentMin > valArray[y]) {
					currentMin = valArray[y];
					currentMinIndex = y;
				}
			}
			if (currentMinIndex != x) {
				valArray[currentMinIndex] = valArray[x];
				valArray[x] = currentMin;
			}
		}
		displayArray(valArray);
	}
	// Method 4 will display the content of the array in a nicely formated manner
	public void displayArray(double[] valArray) {
		for (double elements: valArray) {
			System.out.println("The contents of the array is: " + elements);
		}
	}

	
	
	
}