
package decisions;
	import javax.swing.*;
 
public class Services {

	public static void main(String[] args) {
		int srvNumber=0;
		boolean loop=true;
		int amount=0;
		System.out.println("Service 1: $100");
		System.out.println("Service 2: $200");
		System.out.println("Service 3: $300");
		System.out.println("Service 4: $400");
		while (loop) {
			try 
			{
				srvNumber=Integer.parseInt(JOptionPane.showInputDialog("Enter Service number (1 - 4)  (0 to stop)"));
			}
			catch (NumberFormatException|NullPointerException e)
			{
				JOptionPane.showMessageDialog(null, "Not one of the service numbers!");
				continue;
			}
			if (srvNumber==0) {
				System.out.println("The total charge is: $"+amount);
				loop=false;
				continue;
			}
			switch (srvNumber) {
				case 1: amount+=100; break;
				case 2: amount+=200; break;
				case 3: amount+=300; break;
				case 4: amount+=400; break;
				default : JOptionPane.showMessageDialog(null, "Invalid input! (1 - 4) ONLY"); break;
			}
		}
	}

}
