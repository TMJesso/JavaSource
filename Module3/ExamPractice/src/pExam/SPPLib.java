package pExam;

import javax.swing.*;

public class SPPLib {

	// method to get a number from the user and make sure it is a number then return the number to the calling method
	// accepts a string message to display to the user to make completely customizable
	public String getString(String message) {
		String input = "";
		boolean strCheck = true;
		while (strCheck) {
			try {
				input = JOptionPane.showInputDialog(message);
				input.charAt(0);
				strCheck = false;
			} catch (NullPointerException|IndexOutOfBoundsException e) {
				JOptionPane.showMessageDialog(null, "Null String Encountered!");
				continue;
			}
		}
		return input;
	}

	// convert a string to an integer
	public int intString(String input) {
		int num1 = 0;
		try {
			num1 = Integer.parseInt(input);
		} catch (NumberFormatException|NullPointerException|IndexOutOfBoundsException e) {
			sayOutput("Invalid integer reached!");
		}

		return num1;
		}

	// convert a string to a double
	public double dblString(String input) {
		double num1 = 0.0;
		try {
			num1 = Double.parseDouble(input);
		} catch (NumberFormatException|NullPointerException e) {
			sayOutput("Invalid number reached!");
		}

		return num1;
		}

	// display custom message to the user
	public void sayOutput(String message) {
		JOptionPane.showMessageDialog(null, message);
	}
	
	// display custom message using JTextArea 
	public void sayOutput(JTextArea outputArea) {
		JOptionPane.showMessageDialog(null, outputArea);
	}

	// add number received to the previous sum and return the new number
	public int sumInt(String message) {
		boolean untilExit = true, chkValid = true;
		int total = 0;
		String checkInput = "";
		while (untilExit) {
			chkValid = true;
			checkInput = getString(message);
			if (checkInput.equals("*")) {
				untilExit = false;
				continue;
			} else {
				for (int x = 0; x < checkInput.length(); x++) {
					if (checkInput.charAt(x) > 57 || checkInput.charAt(x) < 47) {
						sayOutput("Invalid input detected");
						chkValid = false;
						break;
					}
				}
				if (chkValid) {
					total += intString(checkInput);
				}
			}
		}
		if (total > 0) {
			return total;
		} else {
			return 0;
		}
	}
	
	// ask the user for the service provided and when display the total when they exit
	public int getService(String message) {
		boolean untilExit = true;
		int srvcNumber = 0, total = 0;
		String checkInput = "";
		while (untilExit) {
			checkInput = getString(message);
			if (checkInput.equals("*")) {
				untilExit = false;
				continue;
			}  else {
				srvcNumber = intString(checkInput);
				switch (srvcNumber) {
					case 1: total+=100; break;
					case 2: total+=200; break;
					case 3: total+=300; break;
					case 4: total+=400; break;
					default: sayOutput("Invalid service number entered!"); break;
				}
			}
		}
		return total;
	}
	
	// ask the user for the product numbers and the quantities for each product and total each product
	// Separately then display each product and its total
	public void getProduct(String message) {
		boolean untilExit = true, chkValid = false;
		int srvcNumber = 0;
		double qty = 0.0,  tServ1 = 0.0, tServ2 = 0.0, tServ3 = 0.0, tServ4 = 0.0, tServ5 = 0.0;
		String checkInput = "";
		while (untilExit) {
			checkInput = getString(message);
			if (checkInput.equals("*")) {
				untilExit = false;
				continue;
			} else {
				srvcNumber = intString(checkInput);
				qty = dblString(getString("How many?"));
				switch (srvcNumber) {
				case 1: tServ1 += ((Math.floor(((qty * 2.98)*100)))/100); chkValid = true; break;
				case 2: tServ2 += ((Math.floor(((qty * 4.50)*100)))/100); chkValid = true; break;
				case 3: tServ3 += ((Math.floor(((qty * 9.98)*100)))/100); chkValid = true; break;
				case 4: tServ4 += ((Math.floor(((qty * 4.49)*100)))/100); chkValid = true; break;
				case 5: tServ5 += ((Math.floor(((qty * 6.87)*100)))/100); chkValid = true; break;
				default: sayOutput("Invalid service number entered!"); break;
				}
			}
		}
		if (chkValid) {
			sayOutput("Product 1: $" + tServ1 + "\nProduct 2: $" + tServ2 + "\nProduct 3: $" + tServ3 + "\nProduct 4: $" + tServ4 + "\nProduct 5: $" + tServ5);
		}
	}
	
	// generate the factors for n numbers
	public String smallFactor(String output, int num) {
		int factors = 1;
		for (int x=1; x<=num; x++) {
			for (int n=x; n>=1; n--) {
				factors*=n;
			}
			output += "\t" + x + "\t" + factors + "\n";
			factors=1;
		}
		return output;
	}
	
	public boolean getFactor(String message) {
		JTextArea outputArea = new JTextArea(10,25);
		boolean notExiting = true;
		int num = 0;
		String output = "\tx\tx!\n", wantExit = "";
		while (notExiting) {
			wantExit = getString(message);
			if (wantExit.equals("*")) {
				return false;
			}
			num = intString(wantExit);
			if (num > 10 || num < 1) {
				sayOutput("Invalid factor entered");
			} else {
				notExiting = false;
				output = smallFactor(output, num);
			}
		}
		outputArea.setText(output);
		sayOutput(outputArea);
		return true;
	}
	
}
