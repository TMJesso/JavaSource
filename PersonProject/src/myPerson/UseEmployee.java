package myPerson;

import java.util.ArrayList;

public class UseEmployee {

	public static void main(String[] args) {
		
		
		Country usa = new Country ("United States of America", "North America", 320000000);
		Country jordan = new Country ("Jordan", "Asia", 7000000);
/*		String[] name;
		{
			name = new String[5];
			name[0] = "Fred";
			name[1] = "Tom";
			name[2] = "Bob";
			name[3] = "George";
			name[4] = "Sarah";
			
		}
		String[] address;
		{
			address = new String[5];
			address[0] = "123 Oxford Lane";
			address[1] = "456 Oxford Lane";
			address[2] = "789 Oxford Circle";
			address[3] = "321 Ford of Ox";
			address[4] = "654 Circle of the Xo";
		}
		String city;
		String state;
		String zip;
		String phone;
		int age;
		Country birth;
		Country residence;
		java.util.Date created;
		int birthMonth;
		int birthDay;
		int birthYear;
		String employeeID; 
		String employeeSOC;
		int monthHire;
		int dayHire;
		int yearHire;
		double annualWage;
		int dependents;
		int maritalStatus;
		double taxableWages;
*/
		//create persons
		//                                   (name  , address           , city          , state, zip    , phone           , age, birth , residence, created               , birthMonth, birthDay, birthYear, employeeID, employeeSOC  , monthHire, dayHire, yearHire, annualWage, dependents, maritalStatus, taxableWages)		
		Person fred = new SalaryBasedEmployee("Fred", "1100 West Street", "Detroit"     , "MI" , "48636", "(264) 662-2254", 23 , usa   , usa      , (new java.util.Date()), 5         , 27      , 1965     , "OX55456" , "123-45-6789", 03       , 11     , 2015    , 92000.00  , 1         , 1            , 0.0         );
		Person bob =  new SalaryBasedEmployee("Bob" , "1010 East Street", "Indianapolis", "IN" , "46992", "(317) 323-1234", 27 , jordan, usa      , (new java.util.Date()), 8         , 22      , 1985     , "DW23426" , "123-45-6789", 03       , 11     , 2015    , 60000.00  , 2         , 2            , 0.0         );
		Person george =  new SalaryBasedEmployee("George" , "1010 East Street", "Indianapolis", "IN" , "46992", "(317) 323-1234", 27 , jordan, usa      , (new java.util.Date()), 8         , 22      , 1985     , "DW23426" , "123-45-6789", 03       , 11     , 2015    , 60000.00  , 2         , 2            , 0.0         );
		
		//ARRAY VS ARRAYLIST
		//ARRAY : ARE STATIC IN SOME WAY (WHEN CREATED YOU MUST PROVIDE THE SIZE OF IT)
		//ARRAYLIST: YOU DON'T HAVE TO PROVIDE AN INITIAL SIZE OF THE ARRAY (IT IS DYNAMIC)
		//ARRAYLIST IS PART OF WHAT SO CALLED THE JAVA COLLECTIONS FRAMEWORK
		//ARRAYLIST STORES ONLY OBJECTS BUT NO PRIMITIVE TYPES SUCH AS INT OR FLOAT
		//(WRAPPER CLASSES) TO CONVERT NUMBERS INTO OBJECTS AND STORE THEM IN ARRAYLISTS
		//EXAMPLE OF WRAPPER CLASSES INCLUDE: Integer, Float, etc.
		
		//Creating an ArrayList of Persons:
		
		ArrayList<Person> myPeople = new ArrayList<Person>();
		myPeople.add(fred);
		myPeople.add(bob);
		myPeople.add(george);
		
		//If your dealing with collections likes the array list you can always use the for-each loop as follows:
		 System.out.println("City, State Zip        ".length());
		for (Person p: myPeople){                 //"
			System.out.println(p);
			System.out.print("\nBirth");
			System.out.print(p.getCountryBirth());
		}
		
		
		

	}

}
















