/*
 * Name: Theral Jessop
 * Course: INFO 211
 * Instructor: Dr. Awny Alnusair
 * 
 */
package personClass;
import java.util.*;

public class UsePerson {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//NewCountry usa = new NewCountry("United States of American", "North America", 320000000);
		//NewCountry jordon = new NewCountry("Jordan", "Asia", 7000000);
		
		System.out.print("Enter a name for the first person: ");
		String name = input.nextLine();
		System.out.print("Enter the address for the first person: ");
		String address = input.nextLine();
		System.out.print("Enter the age for the first person: ");
		int age = input.nextInt();
		input.nextLine();
		//Person person1 = new Person(name, address, age, usa, usa);
		System.out.print("Enter a name for the second person: ");
		name = input.nextLine();
		System.out.print("Enter the address for the second person: ");
		address = input.nextLine();
		System.out.print("Enter the age for the second person: ");
		age = input.nextInt();
		input.nextLine();
		//Person person2 = new Person(name, address, age, jordon, usa);
		System.out.print("Increase the age by how many? ");
		int increaseAge = input.nextInt();
		
		
		//person1.toString();
		//person2.toString();
		
		//person1.setAge(person1.getAge() + increaseAge);
		//person2.setAge(person2.getAge() + increaseAge);
	
		//person1.toString();
		//person2.toString();
		
		
		//ARRAY vs ARRAYLIST
		//Array: are static in some way (when created you must provide the size of it)
		//ArrayList: you don't have to provide an initial size of the array (it is dynamic)
		//ArrayList is part of what so called the java collection framework
		//ArrayList stores only objects but no  primitive types such as int or float
		// example of wrapper classes include: Integer, Float, Double, etc.
		
		//{Wrapper classes} to convert numbers into objects and store them in arrayLists
		
		
		// creating an arraylist of persons
		ArrayList<Person> myPeople = new ArrayList<Person>();
		//myPeople.add(person1);
		//myPeople.add(person2);
		
		// if your dealing with 
		
		for (Person p: myPeople) {
			System.out.println(p);
			System.out.println("\nCountry of Birth");
			//System.out.println(p.getCountryBirth());
		}
	}

}


