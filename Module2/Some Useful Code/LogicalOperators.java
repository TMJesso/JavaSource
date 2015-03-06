// Logical operators.

import javax.swing.*;

public class LogicalOperators {

   public static void main( String args[] )
   {
      // create JTextArea to display results
      JTextArea outputArea = new JTextArea( 17, 20 );

      // attach JTextArea to a JScrollPane so user can scroll results
      JScrollPane scroller = new JScrollPane( outputArea );

      // create truth table for && (conditional AND) operator
      String output = "Conditional AND (&&)" + "\nfalse && false: " + 
    		  ( false && false ) + "\nfalse && true: " + ( false && true ) + 
    		  "\ntrue && false: " + ( true && false ) + "\ntrue && true: " + ( true && true );

      // create truth table for || (conditional OR) operator
      output += "\n\nConditional OR (||)" +
         "\nfalse || false: " + ( false || false ) +
         "\nfalse || true: " + ( false || true ) +
         "\ntrue || false: " + ( true || false ) +
         "\ntrue || true: " + ( true || true );


/*
difference betwenn && and &: They are identical with one exception: & evaluates
both of its operands - no short-circuit evaluation). This is important if the
right operand modifies a variable for example:
ex: age == 20 & ++num >= 60
- Same applies to boolean logical OR . i.e |

*/


      // create truth table for & (boolean logical AND) operator
      output += "\n\nBoolean logical AND (&)" +
         "\nfalse & false: " + ( false & false ) +
         "\nfalse & true: " + ( false & true ) +
         "\ntrue & false: " + ( true & false ) +
         "\ntrue & true: " + ( true & true );

      // create truth table for | (boolean logical inclusive OR) operator
      output += "\n\nBoolean logical inclusive OR (|)" +
         "\nfalse | false: " + ( false | false ) +
         "\nfalse | true: " + ( false | true ) +
         "\ntrue | false: " + ( true | false ) +
         "\ntrue | true: " + ( true | true );

      // create truth table for ^ (boolean logical exclusive OR) operator
      output += "\n\nBoolean logical exclusive OR (^)" +
         "\nfalse ^ false: " + ( false ^ false ) +
         "\nfalse ^ true: " + ( false ^ true ) +
         "\ntrue ^ false: " + ( true ^ false ) +
         "\ntrue ^ true: " + ( true ^ true );

      // create truth table for ! (logical negation) operator
      output += "\n\nLogical NOT (!)" +
         "\n!false: " + ( !false ) +
         "\n!true: " + ( !true );

      outputArea.setText( output );  // place results in JTextArea

      JOptionPane.showMessageDialog( null, scroller,
         "Truth Tables", JOptionPane.INFORMATION_MESSAGE );

      System.exit( 0 );  // terminate application

   } // end main

} // end class LogicalOperators


/**************************************************************************
 * (C) Copyright Deitel & Associates, Inc. and               *
 * Prentice Hall. All Rights Reserved.                                    *
 *                                                                        *
 * DISCLAIMER: The authors and publisher of this book have used their     *
 * best efforts in preparing the book. These efforts include the          *
 * development, research, and testing of the theories and programs        *
 * to determine their effectiveness. The authors and publisher make       *
 * no warranty of any kind, expressed or implied, with regard to these    *
 * programs or to the documentation contained in these books. The authors *
 * and publisher shall not be liable in any event for incidental or       *
 * consequential damages in connection with, or arising out of, the       *
 * furnishing, performance, or use of these programs.                     *
 *************************************************************************/
