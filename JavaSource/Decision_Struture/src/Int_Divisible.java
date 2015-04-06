
import javax.swing.JOptionPane;

/*
 * Author: Theral Jessop
 * Date: March 4, 2014
 * Description:
 * Write a program that asks the user to enter two integer values.
 * Test these two numbers to determine whether the first is evenly divisible by the second
 * and then display an appropriate message at the terminal.
 * 
 * Variables:
 * intValue1
 * intValue2
 * evenDivisible
 * comPare
 * 
 * 
 * 
 * 
 * 
 * 
 */
public class Int_Divisible {

	public static void main(String[] args) {
		// declare variables
		
		float intValue1 = 0, intValue2 = 0, evenDivisible = 0, comPare = 0;
		
		// get user input in intValue1 and intValue2
		intValue1 = Integer.parseInt(JOptionPane.showInputDialog("Enter first integer"));
		intValue2 = Integer.parseInt(JOptionPane.showInputDialog("Enter second integer"));
		
		// processing: Determine if the first integer is divisible by the second
		
			// first some error checking: is the second number 0 (cannot divide by 0)
			if (intValue2 == 0 ) {
				JOptionPane.showMessageDialog(null, "Invalid entry!  You CANNOT divide by 0.");
			} else {
				
			
				evenDivisible = intValue1/intValue2;
				comPare = Math.round(evenDivisible);
			
				if( comPare < evenDivisible || comPare > evenDivisible) {
					JOptionPane.showMessageDialog(null, "The two integers " + intValue1 + " and "+ intValue2 + " are NOT evenly divisible");
				}
				if (comPare == evenDivisible) {
					JOptionPane.showMessageDialog(null, "The two integers " + intValue1 + " and "+ intValue2 + " ARE evenly divisisble");
				}
			
			
			// for debugging only
			// JOptionPane.showMessageDialog(null, "evenDivisible is "+ evenDivisible +". comPare is "+ comPare+".");
			}

	}


}

