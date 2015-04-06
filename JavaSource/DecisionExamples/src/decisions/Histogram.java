package decisions;
	import javax.swing.*;

// import java.util.*;
public class Histogram {

	public static void main(String[] args) {
		int[] num={0,0,0,0,0};
		String display="";
		boolean loop=true;
		for (int x=0;x<=4;x++) {
			loop=true;
			while (loop) {
				try
				{
					num[x]=Integer.parseInt(JOptionPane.showInputDialog("Enter Number for "+x+" (NOT 0):"));
					if (num[x]==0) {
						JOptionPane.showMessageDialog(null, "Number CANNOT be 0! Please try again.");
						continue;
					} else {
						loop=false;	
					}
				}
				catch (NumberFormatException|NullPointerException e)
				{
					JOptionPane.showMessageDialog(null, "Invalid Entry! Try Again");
					continue;
				}
			}
		}
		for (int y = 0; y<=4; y++) {
			display="";
			for (int s=1; s<=num[y];s++) {
				display+="*";
			}
			System.out.println(display);
		}	
			System.out.println("Press any key to continue . . . ");
	}

}
