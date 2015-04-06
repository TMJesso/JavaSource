package practiceMethods;
import javax.swing.*;
public class Switch {

	public static void main(String[] args) {
		int monthNumber = Integer.parseInt(JOptionPane.showInputDialog("Enter a month"));
		switch (monthNumber) {
		case 1: case 2: case 12: System.out.println("Winter");break;
		case 3: case 4: case 5: System.out.println("Spring");break;
		case 6: case 7: case 8: System.out.println("Summer");break;
		case 9: case 10: case 11:
			switch (monthNumber) {
			case 9: System.out.println("Ian's Birthday");break;
			case 10: System.out.println("Halloween");break;
			case 11: System.out.println("Thanksgiving");break;
			}
			System.out.println("Fall");break;
			default: System.out.println("Invalid input");break;
		}
	}

}
