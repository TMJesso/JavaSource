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
		
		System.out.print("Enter a name for the first person: ");
		String name = input.nextLine();
		System.out.print("Enter the address for the first person: ");
		String address = input.nextLine();
		System.out.print("Enter the age for the first person: ");
		int age = input.nextInt();
		input.nextLine();
		Person person1 = new Person(name, address, age);
		System.out.print("Enter a name for the second person: ");
		name = input.nextLine();
		System.out.print("Enter the address for the second person: ");
		address = input.nextLine();
		System.out.print("Enter the age for the second person: ");
		age = input.nextInt();
		input.nextLine();
		Person person2 = new Person(name, address, age);
		System.out.print("Increase the age by how many? ");
		int increaseAge = input.nextInt();
		
		
		person1.displayPerson();
		person2.displayPerson();
		
		person1.setAge(person1.getAge() + increaseAge);
		person2.setAge(person2.getAge() + increaseAge);
	
		person1.displayPerson();
		person2.displayPerson();
	}

}
