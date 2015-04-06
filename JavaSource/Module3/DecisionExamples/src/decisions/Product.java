package decisions;
	import javax.swing.*;
	
public class Product {

	public static void main(String[] args) {
		double product1=0.0, product2=0.0, product3=0.0, product4=0.0,product5=0.0, qty=0.0;
		int prodNumber=0;
		boolean loop=true;
		
		while (loop) {
			try {
				prodNumber=Integer.parseInt(JOptionPane.showInputDialog("Enter product number (1 - 5)  (0 to stop):"));
			}
			catch (NumberFormatException|NullPointerException e)
			{
				JOptionPane.showMessageDialog(null, "The entry was not a product number");
				continue;
			}
			if (prodNumber==0) {
				loop=false;
				continue;
			}
			qty=Double.parseDouble(JOptionPane.showInputDialog("Enter quantity sold:"));
			switch (prodNumber) {
				case 1: product1 += (Math.round(((2.98*qty)*100)))/100;break;
				case 2: product2+= (Math.round(((4.5*qty)*100)))/100;break;
				case 3: product3+= (Math.round(((9.98*qty)*100)))/100;break;
				case 4: product4+= (Math.round(((4.49*qty)*100)))/100;break;
				case 5: product5+= (Math.round(((6.87*qty)*100)))/100;break;
				default: JOptionPane.showMessageDialog(null, "Invalid Entry! (1 - 5) ONLY");
			}	
		}
		JOptionPane.showMessageDialog(null, "Product 1: $"+product1+"\nProduct 2: $"+product2+"\nProduct 3: $"+product3+"\nProduct 4: $"+product4+"\nProduct 5: $"+product5);
		
	}

}
