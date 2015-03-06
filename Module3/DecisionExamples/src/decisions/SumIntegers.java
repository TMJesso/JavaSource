package decisions;
import javax.swing.*;
public class SumIntegers {

	public static void main(String[] args) {
		boolean loop=true;
		String input="";
		int numbers=0;
		
		while (loop) {
			input=JOptionPane.showInputDialog("Enter a number or * to exit");
			if (input.equals("*")) {
				loop = false;
			} else {
				numbers+=Integer.parseInt(input);
			}
		}
		JOptionPane.showMessageDialog(null, "The sume of the numbers entered is: "+numbers);
	}

}
