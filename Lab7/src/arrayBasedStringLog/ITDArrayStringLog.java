//----------------------------------------------------------------------------
// ITDArrayStringLog.java         by Dale/Joyce/Weems                Chapter 2
//
// Interactive Test Driver for the ArrayStringLog class
//----------------------------------------------------------------------------
package arrayBasedStringLog;
import java.util.*;
//import arrayBasedStringLog.*;

public class ITDArrayStringLog
{
  public static void main(String[] args)
  {
    ArrayStringLog test = new ArrayStringLog("Testing");
    ArrayList<ArrayStringLog> test1 = new ArrayList<ArrayStringLog>();
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
    System.out.println("1: ArrayStringLog(String name)");
    System.out.println("2: ArrayStringLog(String name, int maxSize)");
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
        test = new ArrayStringLog(testName);
        break;

      case 2:
        System.out.println("Enter a maximum size:");
        int maxSize;
        if (conIn.hasNextInt())
          maxSize = conIn.nextInt();
        else
        {
          System.out.println("Error: you must enter an integer.");
          System.out.println("Terminating test.");
          return;
        }
        skip = conIn.nextLine();
        test = new ArrayStringLog(testName, maxSize);
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
      System.out.println("2: uniqInsert(String element)");
      System.out.println("3: clear()");
      System.out.println("4: contains(String element)");
      System.out.println("5: howMany(String element)");
      System.out.println("6: isFull()");
      System.out.println("7: isEmpty()");
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
        
        case 2:  // insert unique
        System.out.println("Enter string to insert:");
        String uniqString = conIn.nextLine();
        System.out.println("Result: " + (test.uniqInsert(uniqString)? "Inserted" : "Failed"));
        break;

        case 3:  // clear
        test.clear();
        break;

        case 4:  // contains
        System.out.println("Enter string to search for:");
        String searchString = conIn.nextLine();
        System.out.println("Result: " + (test.contains(searchString)? "Yes" : "No"));
        break;
        
        case 5: // howMany
        System.out.println("Enter string to search for:");
        String countString = conIn.nextLine();
        System.out.println("Result: " + test.howMany(countString) + " found!");
        break;

        case 6:  // isFull
        System.out.println("Result: " + (test.isFull()? "Full" : "Not Full"));
        break;
        
        case 7:  // isEmpty
        System.out.println("Result: " + (test.isEmpty()? "Empty" : "Not Empty"));
        break;

        case 8:  // size
        System.out.println("Result: " + test.size());
        break;

        case 9:  // getName
        System.out.println("Result: " + test.getName());
        break;

        case 10:  // show contents
        System.out.println(test);
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