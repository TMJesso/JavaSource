// My Second Java Program
import java.util.Calendar;
import javax.swing.JOptionPane;
/* Example1.java
----------------------------------------------------------------------------
Subject: Example that shows I/O Syntax in Java
----------------------------------------------------------------------------
*/
public class Example2
{

   // main method begins the execution of a Java program
   public static void main( String args[] )
   {
      System.out.println( "Java is Great!");
      System.out.println( "Welcome to\nINFO 211");
	  System.out.println();

	  JOptionPane.showMessageDialog(null, "Welcome to INFO 211", "Welcome!", JOptionPane.INFORMATION_MESSAGE);

      /*
      Displaying text with printf:used to display formatted data.
      */
      System.out.printf( "%s\n%s\n", "Welcome to", "Java Programming!" );
	  //%s\n%s\n": format specifier, begin with percentage sign followd by the
	  //type of the output (s for string), it prints two strings each of which
	  //is followed by a new line char

	  System.out.printf( "%d\n",12); //displays Decimal
	  System.out.printf( "%x\n",12); //displays Hexdecimal
	  System.out.printf( "%e\n",12.123456789654); //displays floating point #s in expo. notation

	  //Printing date and time:

	  Calendar dt = Calendar.getInstance();
	  System.out.printf( "%tc\n",dt);


   } // end method main

} // end class

