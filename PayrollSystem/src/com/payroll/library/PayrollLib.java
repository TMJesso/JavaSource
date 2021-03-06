package com.payroll.library;
import java.io.*;

import javax.swing.*;

import java.util.*;

public class PayrollLib {

	/** display the results of a integer, two-dimensional array in the form of a matrix */
	public void buildOutput( int array[][], String message ) {
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
	public void buildOutput( double array[][], String message) {
		// loop through array's rows
		System.out.println(message);
		for ( int row = 0; row < array.length; row++ ) {
			System.out.print(row + "# ");
			// loop through columns of current row
			for ( int column = 0; column < array[row].length; column++ ) {
				System.out.print( column + " : " + array[ row ][ column ] + "    " );
			}
			System.out.println( "\n" );
		}
	} // end method buildOutput

	/** get an integer using JOptionPane dialog box */
	public int getInteger(String message) {
		boolean loop = true;
		int num1 = 0;
		while (loop) {
			try {
				num1 = Integer.parseInt(JOptionPane.showInputDialog(message));
				loop = false;
				continue;
			} catch (NumberFormatException|NullPointerException|IndexOutOfBoundsException e) {
				JOptionPane.showMessageDialog(null, "Invalid Entry!");
				continue;
			}
		}
		return num1;
	}

	/** get a double using a JOptionPane dialog box */
	public double getDouble(String message) {
		boolean loop = true;
		double num1 = 0;
		while (loop) {
			try {
				num1 = Double.parseDouble(JOptionPane.showInputDialog(message));
				loop = false;
				continue;
			} catch (NumberFormatException|NullPointerException|IndexOutOfBoundsException e) {
				JOptionPane.showMessageDialog(null, "Invalid Entry!");
				continue;
			}
		}
		return num1;
	}
	
	/** get a string using a JOptionPane dialog box 
	 * 
	 * @param message display a message to the user while asking for input
	 * 
	 * */
	public String getString(String message) {
		String input = "";
		boolean loop = true;
		while (loop) {
			try {
				input = JOptionPane.showInputDialog(message);
				input.charAt(0);
				loop = false;
			} catch (NullPointerException|IndexOutOfBoundsException e) {
				JOptionPane.showMessageDialog(null, "Null String Encountered!");
				continue;
			}
		}
		return input;
	}
	
	
	/** display a message 
	 * 0 - using the JOptionPane dialog box
	 * 1 - using the System.out method
	 * 2 - using both JOptionPane and System.out
	 * 
	 * @param message String that will be displayed to user
	 * @param num integer number between 0 and 2 inclusive for the above list
	 * 
	*/
	public void sayOutput(String message, int num) {
		switch (num) {
		case 0: JOptionPane.showMessageDialog(null, message);break;
		case 1: System.out.println(message);break;
		case 2: JOptionPane.showMessageDialog(null, message);System.out.println(message);break;
		}
	}
	
	/** display a output message from JTextArea using JOptionPane dialog box */
	public void sayOutput(JTextArea outputArea) {
		JOptionPane.showMessageDialog(null, outputArea);
	}

	/** convert a string to an integer */
	public int intString(String input) {
		boolean loop = true;
		int num1 = 0;
		while (loop) {
			try {
				num1 = Integer.parseInt(input);
				loop = false;
				continue;
			} catch (NumberFormatException|NullPointerException|IndexOutOfBoundsException e) {
				JOptionPane.showMessageDialog(null, "Invalid integer reached!");
				continue;
			}
		}
		return num1;
	}

	/** convert a string to a double */
	public double dblString(String input) {
		boolean loop = true;
		double num1 = 0.0;
		while (loop) {
			try {
				input = input.trim();
				num1 = Double.parseDouble(input);
				loop = false;
				continue;
			} catch (NumberFormatException|NullPointerException|IndexOutOfBoundsException e) {
				JOptionPane.showMessageDialog(null, "Invalid double reached!");
				continue;
			}
		}
		return num1;
	}

	
	/** add the numbers to the array */
	private double[][] procArray(double[][] a, String quote, int line, int nextOne) {
		int x = 0;
		boolean percent = false, debug = true;
		while (x < quote.length()) {
			switch (quote.charAt(x)) {
				case 34: quote = quote.substring(x+1, quote.lastIndexOf("\""));break; // double quote
				case 36: quote = quote.substring(x+1, quote.length());break; // $
				case 37: quote = quote.substring(0, quote.indexOf("%"));percent = true;break; // %
				case 45: quote = quote.substring(quote.lastIndexOf("-"), quote.length());break; // -
			}
			if (debug) {
				sayOutput(quote + " : After Switch", 1);
			}
			if (x >= quote.length()) {
				continue;
			}
			if ((quote.charAt(x) == 44) && (x == 0 )) { // comma
				if (quote.lastIndexOf(",") < 0) {
					quote = quote.substring(x+1, quote.length());
				} else {
					quote = quote.substring(x+1,quote.lastIndexOf(","));
				}
			} else if ((quote.charAt(x) == 44) && (x == (quote.length()-1))) {
				quote = quote.substring(0, x);
			}
			x++;
		}
		if (debug) {
			sayOutput(quote + " : After comma", 1);
		}
		if (quote.equals("0.00") || quote.equals("--") || quote.equals("-")) {
			a[line][nextOne] = 0.00;
		} else {
			if (percent) {
				a[line][nextOne] = (dblString(quote)/100);
			} else {
				a[line][nextOne] = dblString(quote);
			}
		}
		return a;
	}
	
	/** parse the full array and make it either 
	* single or married depending on the users preference
	*/
	public double[][] reLoadPercent(double[][] a, double[][] b, String toWhat) {
		boolean debug = false;
		if (toWhat.equalsIgnoreCase("single")) {
			for (int x = 0; x < a.length; x++) {
				for (int y = 0; y < a[x].length; y++) {
					if (debug) {
						System.out.println("x: " + x + " | y: " + y);
					}
					a[x][y] = b[x][y];
				}
				
			}
		} else if (toWhat.equalsIgnoreCase("married")) {
			for (int w = 0; w < a.length; w++) {
				for (int z = 0; z < a[w].length; z++) {
					a[w][z] = b[w][z+5];
				}
			}
		}
		return a;
	}
	
	/** shrink the original array to the usable information
	* so it can be parsed into separate arrays
	*/
	public double[][] shrinkArray(double[][] a) {
		double[][] newArray = new double[a.length][10];
		int index = 2;
		for (int x = 0; x < newArray.length; x++) {
			index = 2;
			for (int y = 0; y < newArray[x].length; y++) {
				newArray[x][y] = a[x][index];
				if (index== 9) {
					index+=3;
				} else if (index == 2 || index == 12) {
					index++;
				} else {
					index+=2;
				}
			}
		}
		return newArray;
	}
	
	
	/** write wage bracket data to file
	 * 
	 * @param a integer two-dimensional array
	 * @param filename String to hold the location of the files
	 * 
	 */
	public void writeWageBracket(int[][] a, String filename) {
		/** write percentage data do file */
		try {
			PrintWriter output = new PrintWriter(filename);
			for (int x = 0; x < a.length; x++) {
				for (int y = 0; y < a[x].length; y++) {
					if (y == a[x].length-1) {
						output.print(a[x][y]);
					} else {
						output.print(a[x][y] + ",");
					}
				}
				if (x < a.length-1) {
					output.println();
				}
			}
			output.close();
		} catch (Exception e) {
			sayOutput("A write error occured!", 0);
			
		}
	}
	
	
	/** process the allTaxCode into the single or married wage bracket files
	 * <p>
	 * pass the array in the following order:<p>
	 * @param a integer two-dimensional array that holds allTaxCode
	 * @param b integer two-dimensional array that holds singleRate or marriedRate 
	 * 
	*/
	public int[][] processWageBracket(int[][] a, int[][] b) {
		
		for (int x = 0; x < b.length;x++) {
			for (int y = 0; y < b[x].length;y++) {
				if (y < 2) {
					b[x][y] = a[x][y+2];
				} else {
					b[x][y] = a[x][y+3];
				}
			}
		}
		return b;
	}

	
	/** write percentage data to file
	 * 
	 * @param a integer two-dimensional array 
	 * @param filename String holds the location of the file to be written to
	 * 
	 */
	public void writePercent(double[][] a, String filename) {
		
		try {
			PrintWriter output = new PrintWriter(filename);
			for (int x = 0; x < a.length; x++) {
				for (int y = 0; y < a[x].length; y++) {
					if (y == a[x].length-1) {
						output.print(a[x][y]);
					} else {
						output.print(a[x][y] + ",");
					}
				}
				if (x < a.length-1) {
					output.println();
				}
			}
			output.close();
		} catch (Exception e) {
			sayOutput("A write error occured!", 0);
			
		}
	}
	
	/** get data for wage bracket table
	 * 
	 * @param filename String holds the location of the file to be read
	 * @param a integer two-dimensional array
	 * @return a
	 * @throws FileNotFoundException
	 * 
	 */
	public int[][] loadWageBracket(String filename, int[][] a) throws FileNotFoundException {
		boolean debug = false;
		Scanner input = new Scanner(new File(filename));
		String getLine = "", quote = "";
		int row = 0, col = 0;
		while (input.hasNext()) {
			getLine = input.nextLine();
			for (int x = 0; x < getLine.length(); x++) {
				while (getLine.charAt(x) == 44) { // comma
					a[row][col] = 0;
					col++;
					x++;
					continue;
				}
				if (getLine.charAt(x) == 36) { // $
					x++;
					if (getLine.indexOf(",", x) >= 0) {
						quote = getLine.substring(x,getLine.indexOf(",", x));
						x = getLine.indexOf(",",x);
					} else {
						quote = getLine.substring(x,getLine.length());
						x = getLine.length();
					}
				} else {
					if (getLine.indexOf(",", x) >= 0) {
						quote = getLine.substring(x,getLine.indexOf(",", x));
						x = getLine.indexOf(",",x);
					} else {
						quote = getLine.substring(x,getLine.length());
						x = getLine.length();
					}
				}
				quote = quote.trim();
				if (debug) {
					sayOutput("Quote: " + quote + "\nRow: " + row + "\nCol: " + col,1);
				}
				if (quote.isEmpty()) {
					a[row][col] = 0;
					col++;
					continue;
				} else {
					a[row][col] = intString(quote);
					col++;
					continue;
				}
			}
			row++;
			col = 0;
		}
		input.close();
		return a;
	}
	
	/* build the data files for single and married percentage 
	 * this is to be kept for my personal reference
	 * 
	public void createPercentFiles() throws FileNotFoundException  {
		boolean debug = false;
		PayrollLib gt = new PayrollLib();
		double[][] allTaxCode = new double[7][22];
		double[][] singleRate = new double[7][5];
		double[][] marriedRate = new double[7][5];
		double[][] shrinkMyArray = new double[7][10];
		String filename = "f:\\Programming\\Payroll\\weeklySingleMarriedPercentage.csv";
		allTaxCode = gt.loadPercent(filename, allTaxCode);
		shrinkMyArray = gt.shrinkArray(allTaxCode);
		// parse the single rate
		singleRate = gt.reLoadPercent(singleRate, shrinkMyArray, "single");
		// parse the married rate
		marriedRate = gt.reLoadPercent(marriedRate, shrinkMyArray, "married");
			
		String newName = "f:\\Programming\\Payroll\\weeklySinglePercentage.dat";
		gt.writePercent(singleRate, newName);
		newName = "f:\\Programming\\Payroll\\weeklyMarriedPercentage.dat";
		gt.writePercent(marriedRate, newName);
		if (debug) {
			gt.buildOutput(shrinkMyArray,"This is the shrunk array");
			gt.buildOutput(singleRate, "Single Rate");
			gt.buildOutput(marriedRate, "Married Rate");
		
		}

	}
	 */	
	
	
	/** how many rows do I need for the array from the file for the initialization of the array 
	 * @param filename to be scanned
	 * */
	public int getNumberofRows(String filename) throws FileNotFoundException {
		int rows = 0;
		Scanner input = new Scanner(new File(filename));
		// as long as there is a line to read, loop
		while (input.hasNext()) {
			// count how many lines are able to be read
			input.nextLine();
			rows++;
		}
		input.close();
		return rows;
	}
	
	
	/** how many columns are in the file for the initialization of the array 
	 * 
	 * @param filename holds the location of the file to be read
	 * @return (column) integer representing the number of columns in the array
	 * @throws FileNotFoundException
	 */
	public int getNumberofColumns(String filename) throws FileNotFoundException {
		int column = 0;
		String getLine = "";
		Scanner input = new Scanner(new File(filename));
		// get one line
		getLine = input.nextLine();
		// loop through the line and find all the commas
		// which indicate a new column
		for (int x = 0; x < getLine.length(); x++) {
			if (getLine.charAt(x) == 44) {
				column++;
			}
		}
		input.close();
		// for the array it needs to be one number higher then the actual number of columns
		column++;
		return column;
	}
	
	
	/** file io to read from a CSV file
	 * 
	 * @param filename holds the location of the file to be read
	 * @throws FileNotFoundException
	 * 
	 */
	public void newloadPercent(String filename) throws FileNotFoundException {
		// declare arrays to be used to create the necessary files
		double[][] a = new double[7][22];
		double[][] singleRate = new double[7][5];
		double[][] marriedRate = new double[7][5];
		double[][] shrinkMyArray = new double[7][10];
		// declare whether I am in debug mode or not
		boolean debug = true;
		// declare filenames to be used for the singles and married
		String newSingleFile = "", newMarriedFile = "";
		// establish connection with the file
		Scanner input = new Scanner(new File(filename));
		// declare the line and the column strings to parse them
		String getLine = "", quote = "";
		// declare what row and column i am on and parsing to put into the a array
		int row = 0, col = 0;
		// as long as there is a line to read from the file
		while (input.hasNext()) {
			// get the line
			getLine = input.nextLine();
			// what heading am I on and set the appropriate file names
			// reset the row and col values to 0 then loop again
			switch (getLine) {
				case "Weekly": row = 0; col = 0; newSingleFile = "Payroll/tax/weeklySinglePercent.dat";newMarriedFile = "Payroll/tax/weeklyMarriedPercent.dat";continue;
				case "Biweekly": row = 0; col = 0; newSingleFile = "Payroll/tax/biweeklySinglePercent.dat";newMarriedFile = "Payroll/tax/biweeklyMarriedPercent.dat";continue;
				case "Semimonthly": row = 0; col = 0; newSingleFile = "Payroll/tax/semimonthlySinglePercent.dat";newMarriedFile = "Payroll/tax/semimonthlyMarriedPercent.dat";continue;
				case "Monthly": row = 0; col = 0; newSingleFile = "Payroll/tax/monthlySinglePercent.dat";newMarriedFile = "Payroll/tax/monthlyMarriedPercent.dat";continue;
				case "Quarterly": row = 0; col = 0; newSingleFile = "Payroll/tax/quarterlySinglePercent.dat";newMarriedFile = "Payroll/tax/quarterlyMarriedPercent.dat";continue;
				case "Semiannual": row = 0; col = 0; newSingleFile = "Payroll/tax/semiannualSinglePercent.dat";newMarriedFile = "Payroll/tax/semiannualMarriedPercent.dat";continue;
				case "Annual": row = 0; col = 0; newSingleFile = "Payroll/tax/annualSinglePercent.dat";newMarriedFile = "Payroll/tax/annualMarriedPercent.dat";continue;
				case "Daily": row = 0; col = 0; newSingleFile = "Payroll/tax/dailySinglePercent.dat";newMarriedFile = "Payroll/tax/dailyMarriedPercent.dat";continue;
			}
			
			if (debug) {
				// show what the line says
				sayOutput(getLine + " : Read Next Line from file", 1);
			}
			
			// parse the line
			for (int x = 0; x < getLine.length(); x++) {
				if (debug) {
					sayOutput("Row: " + row + " Col: " + col, 1);
				}
				if (getLine.charAt(x) == 44) { // comma
					// if it is a comman then increase the column and get the next character
					col++;
					continue;
				} else if (getLine.charAt(x) == 34) { // double quote
					// if the character is a double quote then increase the pointer to the next character
					// put the contents that are between the double quotes into the QUOTES variable
					// remove any commas from the quote then send the the array to be parsed and cleaned
					// up and set to a double value and return the contents and step the line parser
					// forward the number of times as needed
					x++;
					quote = getLine.substring(x, getLine.indexOf("\"", x));
					quote = quote.trim();
					if (quote.indexOf(",") >= 0) {
						quote = quote.substring(0, quote.indexOf(",")) + quote.substring(quote.indexOf(",")+1, quote.length());
					}
					a = procArray(a, quote, row, col);
					x = getLine.indexOf("\"", x);
				} else {
					// it wasn't a double quote or a comma so get the contents between the commas
					quote = getLine.substring(x, getLine.indexOf(",", x));
					quote = quote.trim();
					// check to see if the contents is "plus"
					if ((quote.equalsIgnoreCase("plus"))) {
						col++;
						x = getLine.indexOf(",", x);
						continue;
					}
				}
				// send it to be parsed and cleaned and converted to a double value and return
				// the results then increase the line parser the number of times as needed
				a = procArray(a, quote, row, col);
				col++;
				x = getLine.indexOf(",", x);
			}
			row++;
			col = 0;
			// convert and write the information into the appropriate files
			if (row == 7) { // send the contents to the appropriate file
				// get rid of all unused elements
				shrinkMyArray = shrinkArray(a);
				// separate the singles
				singleRate = reLoadPercent(singleRate, shrinkMyArray, "single");
				// separate the married
				marriedRate = reLoadPercent(marriedRate, shrinkMyArray, "married");
				// write the singles file
				writePercent(singleRate, newSingleFile);
				// write the married file
				writePercent(marriedRate, newMarriedFile);
				
				// reset the array
				for (int x = 0; x < a.length; x++) {
					for (int y = 0; y < a[x].length; y++) {
						a[x][y] = 0;
					}
				}
			}
		}
		// close the input channel
		input.close();
	}
	
	/** get file names<br><br>
	 * 	0 = "weeklySinglePercent.dat"<br>
	 *	1 = "weeklyMarriedPercent.dat"<br>
	 *	2 = "weeklySingleWageBracket.dat"<br>
	 *	3 = "weeklyMarriedWageBracket.dat"<br>
	 *	4 = "biweeklySinglePercent.dat"<br>
	 *	5 = "biweeklyMarriedPercent.dat"<br>
	 *	6 = "biWeeklySingleWageBracket.dat"<br>
	 *	7 = "biWeeklyMarriedWageBracket.dat"<br>
	 *	8 = "semimonthlySinglePercent.dat"<br>
	 *	9 = "semimonthlyMarriedPercent.dat"<br>
	 *	10 = "semiMonthlySingleWageBracket.dat"<br>
	 *	11 = "semiMonthlyMarriedWageBracket.dat"<br>
	 *	12 = "monthlySinglePercent.dat"<br>
	 *	13 = "monthlyMarriedPercent.dat"<br>
	 *	14 = "monthlySingleWageBracket.dat"<br>
	 *	15 = "monthlyMarriedWageBracket.dat"<br>
	 *	16 = "quarterlySinglePercent.dat"<br>
	 *	17 = "quarterlyMarriedPercent.dat"<br>
	 *	18 = "semiannualSinglePercent.dat"<br>
	 *	19 = "semiannualMarriedPercent.dat"<br>
	 *	20 = "annualSinglePercent.dat"<br>
	 *	21 = "annualMarriedPercent.dat"<br>
	 *	22 = "dailySinglePercent.dat"<br>
	 *	23 = "dailyMarriedPercent.dat"<br>
	 *	24 = "dailySingleWageBracket.dat"<br>
	 *	25 = "dailyMarriedWageBracket.dat"

	 * @param index
	 * 
	 * @return fileName String path and the name of the file
	 */
	public String getFileName(int index) {
		String[] fileName = new String[26];
		fileName[0] = "Payroll/tax/weeklySinglePercent.dat";
		fileName[1] = "Payroll/tax/weeklyMarriedPercent.dat";
		fileName[2] = "Payroll/tax/weeklySingleWageBracket.dat";
		fileName[3] = "Payroll/tax/weeklyMarriedWageBracket.dat";
		fileName[4] = "Payroll/tax/biweeklySinglePercent.dat";
		fileName[5] = "Payroll/tax/biweeklyMarriedPercent.dat";
		fileName[6] = "Payroll/tax/biWeeklySingleWageBracket.dat";
		fileName[7] = "Payroll/tax/biWeeklyMarriedWageBracket.dat";
		fileName[8] = "Payroll/tax/semimonthlySinglePercent.dat";
		fileName[9] = "Payroll/tax/semimonthlyMarriedPercent.dat";
		fileName[10] = "Payroll/tax/semiMonthlySingleWageBracket.dat";
		fileName[11] = "Payroll/tax/semiMonthlyMarriedWageBracket.dat";
		fileName[12] = "Payroll/tax/monthlySinglePercent.dat";
		fileName[13] = "Payroll/tax/monthlyMarriedPercent.dat";
		fileName[14] = "Payroll/tax/monthlySingleWageBracket.dat";
		fileName[15] = "Payroll/tax/monthlyMarriedWageBracket.dat";
		fileName[16] = "Payroll/tax/quarterlySinglePercent.dat";
		fileName[17] = "Payroll/tax/quarterlyMarriedPercent.dat";
		fileName[18] = "Payroll/tax/semiannualSinglePercent.dat";
		fileName[19] = "Payroll/tax/semiannualMarriedPercent.dat";
		fileName[20] = "Payroll/tax/annualSinglePercent.dat";
		fileName[21] = "Payroll/tax/annualMarriedPercent.dat";
		fileName[22] = "Payroll/tax/dailySinglePercent.dat";
		fileName[23] = "Payroll/tax/dailyMarriedPercent.dat";
		fileName[24] = "Payroll/tax/dailySingleWageBracket.dat";
		fileName[25] = "Payroll/tax/dailyMarriedWageBracket.dat";
		
		return fileName[index];
		
	}
	
	public int getIndex(String maritalStatus, String payPeriod, int dependents, int index) {
		switch (maritalStatus) {
			case "single": switch (payPeriod) {
				case "weekly": switch (dependents) {
					case 0: case 1: case 2: case 3: case 4: case 5: case 6: case 7: case 8: case 9: case 10: index = 2; break;
					case 11: case 12: case 13: case 14: case 15: case 16: case 17: case 18: case 19: case 20: index = 0; break;
					}
				
				case "biweekly": switch (dependents) {
					case 0: case 1: case 2: case 3: case 4: case 5: case 6: case 7: case 8: case 9: case 10: index = 6; break;
					case 11: case 12: case 13: case 14: case 15: case 16: case 17: case 18: case 19: case 20: index = 4; break;
					}
				case "bimonthly": switch (dependents) {
					case 0: case 1: case 2: case 3: case 4: case 5: case 6: case 7: case 8: case 9: case 10: index = 10; break;
					case 11: case 12: case 13: case 14: case 15: case 16: case 17: case 18: case 19: case 20: index = 8; break;
					}
				case "monthly": switch (dependents) {
					case 0: case 1: case 2: case 3: case 4: case 5: case 6: case 7: case 8: case 9: case 10: index = 14; break;
					case 11: case 12: case 13: case 14: case 15: case 16: case 17: case 18: case 19: case 20: index = 12; break;
					}
				case "quarterly": index = 16; break;
				case "semi-annually": index = 18; break;
				case "annually": index = 20; break;
				case "daily":switch (dependents) {
				case 0: case 1: case 2: case 3: case 4: case 5: case 6: case 7: case 8: case 9: case 10: index = 24; break;
				case 11: case 12: case 13: case 14: case 15: case 16: case 17: case 18: case 19: case 20: index = 22; break;
				}
			}
			
			case "married":switch (payPeriod) {
				case "weekly": switch (dependents) {
				case 0: case 1: case 2: case 3: case 4: case 5: case 6: case 7: case 8: case 9: case 10: index = 3; break;
				case 11: case 12: case 13: case 14: case 15: case 16: case 17: case 18: case 19: case 20: index = 1; break;
				}
		
				case "biweekly": switch (dependents) {
					case 0: case 1: case 2: case 3: case 4: case 5: case 6: case 7: case 8: case 9: case 10: index = 7; break;
					case 11: case 12: case 13: case 14: case 15: case 16: case 17: case 18: case 19: case 20: index = 5; break;
					}
				case "bimonthly": switch (dependents) {
					case 0: case 1: case 2: case 3: case 4: case 5: case 6: case 7: case 8: case 9: case 10: index = 11; break;
					case 11: case 12: case 13: case 14: case 15: case 16: case 17: case 18: case 19: case 20: index = 9; break;
					}
				case "monthly": switch (dependents) {
					case 0: case 1: case 2: case 3: case 4: case 5: case 6: case 7: case 8: case 9: case 10: index = 15; break;
					case 11: case 12: case 13: case 14: case 15: case 16: case 17: case 18: case 19: case 20: index = 13; break;
					}
				case "quarterly": index = 17; break;
				case "semi-annually": index = 19; break;
				case "annually": index = 21; break;
				case "daily": switch (dependents) {
				case 0: case 1: case 2: case 3: case 4: case 5: case 6: case 7: case 8: case 9: case 10: index = 25; break;
				case 11: case 12: case 13: case 14: case 15: case 16: case 17: case 18: case 19: case 20: index = 23; break;
				}
			}
		}
		return index;
	}



}
