/*
 * Name: Theral Jessop
 * Class: INFO 211
 * Professor: Dr. Awny Alnusair
 * Notes:
 * 
 * I added some error checking for the number of students in a course
 * I determined that the grades would be equal to the number of students in the course
 * and therefore added a field to the GradBook class numberOfStudents
 * 
 * When the course is created it is also created with the number of students in it
 * and the default is set to blank string for the name and 0 for the number of students
 * 
 * Otherwise the course name is set when the course is created along with the number of students
 * who are in the course
 * 
 * 
 * Additional Notes:
 * 
 * I would like to modify this a little more and make it so I can choose which course to
 * get grades for and also to add a course name and number of students for the course that is created
 * using the default GradeBook.  This could be added at a future time
 * 
 */

package newGradeBook;
import java.util.*;
import javax.swing.*;
public class UseGradeBook {
	static Scanner userInput = new Scanner(System.in);
	public static void main(String[] args) {
		// declare an object array
		GradeBook[] myGB = new GradeBook[4];
		// declare variables to be used 
		int menuChoice = 0, menuPos = 0, howMany = 0;
		// generate the menu
		String dispMenu = "Choose from the following options:\n\n";
		dispMenu += "1- Create the default Java GradeBook:\n";
		dispMenu += "2- Create a new GradeBook:\n";
		dispMenu += "3- Display The welcome Message:\n";
		dispMenu += "4- Calculate the class average and the maximum grade\n";
		dispMenu += "5- Quit\n\n";
		dispMenu += "Enter your choice: ";
		// loop until user enters 5 to exit and display error message if choice entered is outside the acceptable range
		while (menuChoice < 5) {
			System.out.print(dispMenu);
			menuChoice = userInput.nextInt();
			menuPos = menuChoice - 1;
			if (menuChoice == 1) { // create the default java GradeBook
				myGB[menuPos] = new GradeBook();
			} else if (menuChoice == 2) { // create a new GradeBook
				howMany = createNewCourse();
				myGB[menuPos] = new GradeBook("Java Programming", howMany);
			} else if (menuChoice == 3) { // display the welcome message
				howMany = createNewCourse();
				myGB[menuPos] = new GradeBook("Data Structures", howMany);
				myGB[menuPos].displayMessage();
			} else if (menuChoice == 4) { // calculate the class average and the maximum grade
				howMany = createNewCourse();
				myGB[menuPos] = new GradeBook("Data Organization", howMany);
				myGB[menuPos].determineClassAverage();
			} else if (menuChoice == 5) { // quit
				System.out.println("\n\nThank you for using GradeBook\nPlease return soon!!");
				continue;
			} else { // display error message and allow the user to try again
				JOptionPane.showMessageDialog(null, "You have entered an invalid menu choice! Enter 1 - 5 only");
				menuChoice = 0;
			}
		}
	}
	
	/** method to choose how many students are in a new course */
	public static int createNewCourse() {
		boolean isOk = true;
		int howMany = 6;
		while (isOk) {
			System.out.print("How many students are in the class? ");
			howMany = userInput.nextInt();
			if (howMany > 35) {
				JOptionPane.showMessageDialog(null, "Number of students is higher than the acceptable range of 35\nPlease enter the number of students that are \nbelow or equal to 35");
			} else if (howMany < 6) {
				JOptionPane.showMessageDialog(null, "Number of students for this class cannot be less than 6\nPlease enter the number of students that are greater than or equal to 6");
			} else {
				isOk = false;
			}
		}
		return howMany;
	}
}
	

