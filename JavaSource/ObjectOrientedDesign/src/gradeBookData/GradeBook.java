//----------------------------------------------------------------------
// The GradeBook class
//
// A gradebook must have a "course name".
//----------------------------------------------------------------------
package gradeBookData;
import java.util.*;

public class GradeBook {
	
	// protect the course name by making it private
	private String courseName;
	private int numberOfStudents;

	
	// default constructor

	/** set the default constructor */
	public GradeBook() {
		this.courseName = "";
		this.numberOfStudents = 0;
	}
   
	/** constructor initializes courseName and number of students in course */
	public GradeBook( String courseName, int newNumberOfStudents ) {
		this.courseName = courseName;
		this.numberOfStudents = newNumberOfStudents;
	}

	/** set course name */
	public void setCourseName( String name ) {
		this.courseName = name;
	}
	
	/** set number of students */
	public void setNumberOfStudents(int newNumberOfStudents) {
		this.numberOfStudents = newNumberOfStudents;
	}

	/** get course name */
	public String getCourseName() {
		return this.courseName;
	}
	
	/** get number of students */
	public int getNumberOfStudents() {
		return this.numberOfStudents;
	}

	/** display the welcome message */
	public void displayMessage() {
		System.out.printf( "Welcome to the grade book for\n%s!\n\n", this.getCourseName() );
	}

	/** determine class average based on # grades entered by user
	 * * asks the user for # of grades and asks the user for each grade
	 * displays the total and the average */
	public void determineClassAverage() {
		Scanner input = new Scanner(System.in);
		//GradeLib gt = new GradeLib();
		int howManyGrades = input.nextInt();
		//this.setNumberOfStudents(howManyGrades);
		//howManyGrades = this.getNumberOfStudents();
		// create Scanner to obtain input from command window
		int total; // sum of grades entered by user
		int gradeCounter;
		// let the user determine how many grades they have
		// System.out.print("How many students do you have grades for? ");
		int grade; // grade value entered by user
		int average; // average of grades
      
		// initialization phase
		total = 0;
		gradeCounter = 1;
		grade = 1;
		average = 0;

		// processing phase
		while ( gradeCounter <= howManyGrades ) { // loop 5 times
			System.out.print( "Enter grade " + gradeCounter + ": " ); // prompt
			grade = input.nextInt();
			//gt.getScanInt("Enter grade " + gradeCounter + ": ");
			total = total + grade; // add grade to total
			gradeCounter = gradeCounter + 1; // increment counter by 1
		}
		input.close();
		// termination phase
		average = total / howManyGrades;
		//input.close();
		System.out.println( "\nTotal of all " + howManyGrades + " grades is " + total );
		System.out.println( "Class average is " + average );

	} // end method determineClassAverage

	/** create new GradeBook entry by asking the user for the name of the new Course */
} // end class GradeBook

