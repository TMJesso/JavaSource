//----------------------------------------------------------------------------
// ITDArrayStringLog.java         by Dale/Joyce/Weems                Chapter 2
//
// Interactive Test Driver for the ArrayStringLog class
//----------------------------------------------------------------------------
package mylab7;
import java.util.*;

/** ITDArrayListStringLog<br>
 * This is the ArrayList test driver application<br>
 * adapted from ArrayStringListLog by Dale/Joyce/Weems<br>
 * 
 * @author Theral Jessop<br>
 * Mar 30, 2015<br>
 * ITDArrayListStringLog.java<br>
 *
 */
public class ITDArrayListStringLog
{
  @SuppressWarnings({ "resource", "unused" })
public static void main(String[] args)
  {
    LinkedStringLog test = new LinkedStringLog("Testing");
    Scanner conIn = new Scanner(System.in);

    String skip;       // skip end of line after reading an integer
    boolean keepGoing; // flag for "choose operation" loop
    int constructor;   // indicates user's choice of constructor
    int operation;     // indicates user's choice of operation

    // Handle test name
    System.out.println("What is the name of this test?");
    String testName = conIn.nextLine();
    System.out.println("\nThis is test " + testName + "\n");

    // Handle constructor
    System.out.println("Choose a constructor:");
    System.out.println("1: LinkedStringLog()");
    System.out.println("2: LinkedStringLog(String name)");
    if (conIn.hasNextInt())
      constructor = conIn.nextInt();
    else
    {
      System.out.println("Error: you must enter an integer.");
      System.out.println("Terminating test.");
      return;
    }
    skip = conIn.nextLine();

    switch (constructor)
    {
      case 1:
        test = new LinkedStringLog();
        break;

      case 2:
        test = new LinkedStringLog(testName);
        break;

      default:
        System.out.println("Error in constructor choice. Terminating test.");
        return;
    }

    // Handle test cases
    keepGoing = true;
    while (keepGoing)
    {
      System.out.println("\nChoose an operation:");
      System.out.println("1: insert(String element)");
      System.out.println("2: clear()");
      System.out.println("3: contains(String element)");
      System.out.println("4: isFull()");
      System.out.println("5: isEmpty()");
      System.out.println("6: howMany(String element)");
      System.out.println("7: uniqInsert(String element)");
      System.out.println("8: size()");
      System.out.println("9: getName()");
      System.out.println("10: show contents");
      System.out.println("11: stop Testing");
      if (conIn.hasNextInt())
        operation = conIn.nextInt();
      else
      {
        System.out.println("Error: you must enter an integer.");
        System.out.println("Terminating test.");
        return;
      }
      skip = conIn.nextLine();

      switch (operation)
      {
        case 1:  // insert
	        System.out.println("Enter string to insert:");
	        String insertString = conIn.nextLine();
	        test.insert(insertString);
	        break;

        case 2:  // clear
	        test.clear();
	        break;

        case 3:  // contains
	        System.out.println("Enter string to search for:");
	        String searchString = conIn.nextLine();
	        System.out.println("Result: " + test.contains(searchString));
	        break;

        case 4:  // isFull
	        System.out.println("Result: " + test.isFull());
	        break;

        case 5: // isEmpty
        	System.out.println("Result: " + test.isEmpty());
        	break;
        	
        case 6: // howMany
            System.out.println("Enter string to search for:");
            String howManyString = conIn.nextLine();
            System.out.println("Result: " + test.howMany(howManyString) + " found");
       		break;
       		
        case 7: // uniqInsert
        	System.out.println("Enter string to insert:");
        	String uniqString = conIn.nextLine();
        	System.out.println("Result: " + test.uniqInsert(uniqString));
        	break;
        	
        case 8:  // size
	        System.out.println("Result: " + test.size());
	        break;

        case 9:  // getName
	        System.out.println("Result: " + test.getName());
	        break;

        case 10:  // show contents
	        System.out.println(test.log);
	        break;

        case 11:  // stop testing
	        keepGoing = false;
	        break;

        default:
	        System.out.println("Error in operation choice. Terminating test.");
	        return;
      }
    }
  System.out.println("End of Interactive Test Driver");
  }
}