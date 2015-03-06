package myPracticePackage;

import myLib.MyLibrary;

public class Histogram {

	public static void main(String[] args) {
		MyLibrary accessLib = new myLib.MyLibrary();
		int count=0;
		count = accessLib.getInteger("How many numbers do you have?");
		int[] num = new int[count+1];
		for (int x = 0; x < 5;x++) {
			num[x] = accessLib.getInteger("Enter 5 numbers! " + (x+1) + " of "+count);
		}
		accessLib.dispHist(num, count);
	}

}
