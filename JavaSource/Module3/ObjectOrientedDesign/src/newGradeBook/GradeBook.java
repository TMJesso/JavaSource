//----------------------------------------------------------------------
// The GradeBook class
//
// A gradebook must have a "course name".
//----------------------------------------------------------------------
package newGradeBook;
import java.util.Scanner;

public class GradeBook
{
   private String courseName;
   private int numberOfStudents;
   
   // default constructor for GradeBook
   public GradeBook() {
	   courseName = "course name";
	   numberOfStudents = 0;
   }

   // constructor initializes courseName and number of students (Non-Default)
   public GradeBook( String name, int students )
   {
      courseName = name;
      numberOfStudents = students;
   }

   public void setCourseName( String name )
   {
      courseName = name;
   }

   public String getCourseName()
   {
      return courseName;
   }
   
   public void setNumberOfStudents(int students) {
	   numberOfStudents = students;
   }
   
   public int getNumberOfStudents() {
	   return numberOfStudents;
   }

   public void displayMessage()
   {

      System.out.printf( "Welcome to the grade book for\n%s!\n\n",
         getCourseName(), getNumberOfStudents() );
   }

   // determine class average based on 5 grades entered by user
   public void determineClassAverage()
   {
      // create Scanner to obtain input from command window
      Scanner input = new Scanner( System.in );

      int total; // sum of grades entered by user
      int gradeCounter; // number of the grade to be entered next
      int grade; // grade value entered by user
      int average; // average of grades
      int max;
		int howManyGrades = this.getNumberOfStudents();

      // initialization phase
      total = 0;
      gradeCounter = 1;
      max = 0;

      // processing phase
      System.out.println(this.getCourseName());
      while ( gradeCounter <= howManyGrades ) // loop 5 times
      {
         System.out.print( "Enter grade " + gradeCounter + ": " ); // prompt
         grade = input.nextInt(); // read grade from user
         if (grade > max) {
        	 max = grade;
         }
        	 total = total + grade; // add grade to total
         gradeCounter = gradeCounter + 1; // increment counter by 1
      }

      // termination phase
      average = total / howManyGrades;

      System.out.printf( "\nTotal of all " + howManyGrades + " grades is %d\n", total );
      System.out.printf( "Class average is %d\n", average );
      System.out.printf( "Max grade is %d\n", max);
   } // end method determineClassAverage

} // end class GradeBook

