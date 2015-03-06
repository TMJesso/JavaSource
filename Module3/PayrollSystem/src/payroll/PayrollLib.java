package payroll;
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
	 * @param message: display a message to the user while asking for input
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
	 * 2 - using both JOptionPane and System.out */
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
	
	
	/** write wage bracket data to file */
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
	 * @param: allTaxCode = a
	 * @param: singleRate or marriedRate array = b */
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

	
	/** write percentage data to file */
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
	
	/** get data for wage bracket table */
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
	 * @param filename: filename to be scanned
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
	
	
	/** how many columns are in the file for the initialization of the array */
	public int getNumberofColumns(String filename) throws FileNotFoundException {
		int col = 0;
		String getLine = "";
		Scanner input = new Scanner(new File(filename));
		// get one line
		getLine = input.nextLine();
		// loop through the line and find all the commas
		// which indicate a new column
		for (int x = 0; x < getLine.length(); x++) {
			if (getLine.charAt(x) == 44) {
				col++;
			}
		}
		input.close();
		// for the array it needs to be one number higher then the actual number of columns
		col++;
		return col;
	}
	
	
	/** file io to read from a CSV file 
	 * @throws FileNotFoundException */
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
				case "Weekly": row = 0; col = 0; newSingleFile = "f:\\Programming\\Payroll\\weeklySinglePercent.dat";newMarriedFile = "f:\\Programming\\Payroll\\weeklyMarriedPercent.dat";continue;
				case "Biweekly": row = 0; col = 0; newSingleFile = "f:\\Programming\\Payroll\\biweeklySinglePercent.dat";newMarriedFile = "f:\\Programming\\Payroll\\biweeklyMarriedPercent.dat";continue;
				case "Semimonthly": row = 0; col = 0; newSingleFile = "f:\\Programming\\Payroll\\semimonthlySinglePercent.dat";newMarriedFile = "f:\\Programming\\Payroll\\semimonthlyMarriedPercent.dat";continue;
				case "Monthly": row = 0; col = 0; newSingleFile = "f:\\Programming\\Payroll\\monthlySinglePercent.dat";newMarriedFile = "f:\\Programming\\Payroll\\monthlyMarriedPercent.dat";continue;
				case "Quarterly": row = 0; col = 0; newSingleFile = "f:\\Programming\\Payroll\\quarterlySinglePercent.dat";newMarriedFile = "f:\\Programming\\Payroll\\quarterlyMarriedPercent.dat";continue;
				case "Semiannual": row = 0; col = 0; newSingleFile = "f:\\Programming\\Payroll\\semiannualSinglePercent.dat";newMarriedFile = "f:\\Programming\\Payroll\\semiannualMarriedPercent.dat";continue;
				case "Annual": row = 0; col = 0; newSingleFile = "f:\\Programming\\Payroll\\annualSinglePercent.dat";newMarriedFile = "f:\\Programming\\Payroll\\annualMarriedPercent.dat";continue;
				case "Daily": row = 0; col = 0; newSingleFile = "f:\\Programming\\Payroll\\dailySinglePercent.dat";newMarriedFile = "f:\\Programming\\Payroll\\dailyMarriedPercent.dat";continue;
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

}
