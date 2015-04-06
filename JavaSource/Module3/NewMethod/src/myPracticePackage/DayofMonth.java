package myPracticePackage;
import javax.swing.*;
public class DayofMonth {

	public static void main(String[] args) {
		DayMonth showDay = new DayMonth();
		boolean loop = true;
		int day = 0;
		while (loop) {
			try {
				day = Integer.parseInt(JOptionPane.showInputDialog("What day is it?"));
				loop = false;
			} catch (NumberFormatException|NullPointerException|IndexOutOfBoundsException e) {
				JOptionPane.showMessageDialog(null, "Invalid entry!");
				continue;
			}
		}
		JOptionPane.showMessageDialog(null, showDay.whichDay(day));
	}
	
}

class DayMonth {
	public String whichDay(int day) {
		switch (day) {
			case 1: case 2: case 3: case 4: case 5: case 6: case 7: case 8: case 9: case 10: return "It is Day "	+ day + "\nIt is early in the month";
			case 11: case 12: case 13: case 14: case 15: case 16: case 17: case 18: case 19: case 20: return "It is Day "+ day + "\nIt is the middle of the month";
			case 21: case 22: case 23: case 24: case 25: case 26: case 27: case 28: case 29: case 30: case 31: return "It is Day " + day + "\nIt is the end of the month";
			default: return "Invalid Day Entered";
		}
	}
}
