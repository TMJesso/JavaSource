//Formatting output program and the conditional operator
import java.util.Calendar;
import java.text.*;
import java.math.*;

public class TestingFormatting extends Object
{
	//extends Object is optional, every clas extends the Object class by default.

   // main method begins execution of Java application
   public static void main( String args[] )
   {
      System.out.println( "My name is Awny");
      System.out.println( "Welcome to\nINFO 211");
	  System.out.println();

      /*
      Displaying text with printf
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

	  //Using the conditional operator
	  System.out.println("\n\nThe Conditional Operator ?:");
	  boolean leapYear = false;
	  int february = leapYear ? 29:28;
	  System.out.println (february);
	  february = true?false?false?5:10:20:30;
	  //february = (true?(false?(false?5:10):20):30) = 20
	  System.out.println (february);
      System.out.println ();

	  //Displaying numbers with decimal places (rounding to two decimal places):
      double dblNumber = 1.236567;
      DecimalFormat df = new DecimalFormat("#.##");
      System.out.println(df.format(dblNumber));

      //To truncate:
      BigDecimal myNumber = new BigDecimal("1.236567");
	  myNumber = myNumber.setScale(2, BigDecimal.ROUND_DOWN);
      System.out.println (myNumber.doubleValue());
   } // end method main

} // end class TestingFormatting

