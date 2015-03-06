//----------------------------------------------------------------------
// The GradeBook class
//
// A gradebook must have a "course name".
//----------------------------------------------------------------------
package reWorkGradeBook;
import java.util.Scanner;

public class GradeBook
{
   private String courseName;

   // constructor initializes courseName
   public GradeBook( String name )
   {
      courseName = name;
   }

   public void setCourseName( String name )
   {
      courseName = name;
   }

   public String getCourseName()
   {
      return courseName;
   }

   public void displayMessage()
   {

      System.out.printf( "Welcome to the grade book for\n%s!\n\n",
         getCourseName() );
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
      int max; // maximum grade entered
      int howMany; // number of grades being entered

      // initialization phase
      total = 0;
      gradeCounter = 1;
      max = 0;
      System.out.print("How many grades do you have? ");
      howMany = input.nextInt();
      // processing phase
      while ( gradeCounter <= howMany ) // loop 5 times
      {
         System.out.print( "Enter grade " + gradeCounter + ": " ); // prompt
         grade = input.nextInt(); // read grade from user
         total = total + grade; // add grade to total
         if (grade > max) {
        	 max = grade;
         }
         gradeCounter = gradeCounter + 1; // increment counter by 1
      }

      // termination phase
      average = total / howMany;

      System.out.printf( "\nTotal of all 5 grades is %d\n", total );
      System.out.printf( "Class average is %d\n", average );
      System.out.printf( "Maximum grade is %d\n", max);

   } // end method determineClassAverage

} // end class GradeBook

