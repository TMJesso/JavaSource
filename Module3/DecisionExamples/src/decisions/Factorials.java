package decisions;
import javax.swing.*;
public class Factorials {

	public static void main(String[] args) {
		int factors=1;
		String output="x\tx!\n\n" ;
		JTextArea outputArea = new JTextArea(5,10);
		for (int x=1; x<=7; x++) {
		//int x=Integer.parseInt(JOptionPane.showInputDialog("Please enter a number to get Factorial"));
			for (int n=x; n>=1; n--) {
				factors*=n;
			}
			
			output=output+x+"\t" + factors + "\n";
			factors=1;
			
		}
		outputArea.setText(output);
		JOptionPane.showMessageDialog(null, outputArea);
		
	}

}
