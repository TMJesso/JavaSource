import javax.swing.JOptionPane;

/*
 * Name: Theral Jessop
 * Date: Feb 26, 2014
 * Program: Display the day of the month based upon whether it is :
 * 1-10		"It is Day <day entered>, It is early in the month"
 * 11-20	"It is Day <day entered>, It is the middle of the month"
 * 21-31	"It is Day <day entered>, It is the end of the month"
 * 
 */
public class Day {

	public static void main(String[] args) {
		// Declare variables
		int day;
		String userMessage = null;
		
		// Get user input, Ask for the day of the current month
		// grade = Float.parseFloat(JOptionPane.showInputDialog("Enter a grade score"));
		
		day = Integer.parseInt(JOptionPane.showInputDialog("Enter the day of the current month"));
				
		// Processing
		if (day > 0) {
			if(day < 11) {
				userMessage = "It is Day "+day+". It is early in the month";
				
				}
			}
		if (day > 10) {
			if(day < 21) {
				userMessage = "It is Day "+day+". It is the middle of the month";
			
				}
			}
		if (day > 20) {
			if (day < 32) {
				userMessage = "It is Day "+day+". It is the end of the month";
						
				}
			}
		if (day < 1) {
			userMessage = "You have entered an invalid day for the current month";
			}
		if (day > 31) {
			userMessage = "You have entered an invalid day for the current month";
		}
		
	
		
		// Display output
		// JOptionPane.showMessageDialog(null,  "Too Bad ~~ You failed the course");
		JOptionPane.showMessageDialog(null, userMessage);
		
		
		}
	}


