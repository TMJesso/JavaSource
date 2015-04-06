import javax.swing.JOptionPane;


public class TrueorFalse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// (1) Declare Variables
		
		int num1, num2, num3, maxNumber;
		
		// (2) Get numbers from user
		
		num1 = Integer.parseInt(JOptionPane.showInputDialog("Enter first Number"));
		num2 = Integer.parseInt(JOptionPane.showInputDialog("Enter second number"));
		num3 = Integer.parseInt(JOptionPane.showInputDialog("Enter third number"));
		
		maxNumber = num1;
		
		// (3) Processing
		if(num2 > maxNumber ) {
			maxNumber = num2;
			} if(num3 > maxNumber) {
				maxNumber = num3;
		}
		// (4) Display max
		JOptionPane.showMessageDialog(null, "The Balance is " + maxNumber);
		

	}
}


			
			
		/*	
*			
			
			
			
			num1 > num3) {;
		}
		}
			maxNumber = num1;
		} else {
			if(num2 > num1 & num2 > num3){;
				maxNumber = num2;
			} else {
				maxNumber = num3;
			}
	}
		

}
*/