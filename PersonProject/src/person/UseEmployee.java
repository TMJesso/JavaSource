package person;
import java.util.ArrayList;

public class UseEmployee {

	public static void main(String[] args) {
		
		
		Country usa = new Country ("United States of America", "North America", 320000000);
		Country jordan = new Country ("Jordan", "Asia", 7000000);
		//create persons
		Person fred = new Person("Fred", "1100 West Street", 23, usa, usa);
		Person bob = new SalaryBasedEmployee("Bob", "1010 East Street", 27, jordan, usa, "DW23426", 60000.00);
		
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
		
		//If your dealing with collections likes the array list you can always use the for-each loop as follows:
		
		for (Person p: myPeople){
			System.out.println(p);
			System.out.println("\nCountry of Birth:");
			System.out.println(p.getCountryBirth());
		}
		
		
		

	}

}
















