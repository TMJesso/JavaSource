package lab1;

import javax.swing.*;
import java.io.*;
import java.util.*;

public class ReadAsArray {
   	public int[] readLines(String filename, int[] myArray) throws IOException {
   	    
        //text file read
        FileReader fileReader = new FileReader(filename);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        List<String> lines = new ArrayList<String>();
        String line = null;
        while ((line = bufferedReader.readLine()) != null) {
            lines.add(line);
        }
        bufferedReader.close();
       for (int x = 0; x < myArray.length; x++) {
       myArray[x] = ((CharSequence) lines).charAt(x);
        }
       return myArray;
	}
   	
   	public int[] readFile(String filename, int[] myArray) throws IOException {	
   	java.io.File file = new java.io.File(filename);
   		Scanner input = new Scanner (file);
    	int counter = 0;
   		while (input.hasNext()) {
   			myArray[counter] = Integer.parseInt(input.nextLine());
   			//System.out.println("The line is " + input.nextLine() + " counter is: " + counter);
   			counter++;
   		}
   		input.close();
   		return myArray;
   	}

   	//binary search logic
	public int binarySearch(int key, int[] myArray) {
		int low = 0;
		int high = myArray.length - 1;
		         
		while(high >= low) {
			int middle = (low + high) / 2;
			if (key < myArray[middle]) {
				high = middle -1;
			} else if (key == myArray[middle]) {
				return middle;
			} else {
				low = middle + 1;
			}
		}
		return -low- 1;
	}
	//input retrieval
	public int askUser(String retrieve) {
		int num =Integer.parseInt(JOptionPane.showInputDialog(retrieve));
		return num;
	}
}
