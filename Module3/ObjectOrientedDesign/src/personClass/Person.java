package personClass;

public class Person {
	private String name;
	private String address;
	private int age;
	
	public Person(String name, String address, int age) {
		this.name = name;
		this.address = address;
		if (age < 0) {
			age = 0;
		}
		this.age = age;
	}
	
	/** set person name */
	public void setName(String name) {
		this.name = name;
	}
	
	/** set address of person */
	public void setAddress(String address) {
		this.address = address;
	}
	
	/** set age of person */
	public void setAge(int age) {
		if (age < 0) {
			age = 0;
		}
		this.age = age;
	}
	
	/** return the name of the person */
	public String getName() {
		return this.name;
	}
	
	/** return the address of the person */
	public String getAddress() {
		return this.address;
	}
	
	/** return the age of the person */
	public int getAge() {
		return this.age;
	}
	
	public void displayPerson() {
		System.out.println("\n\nName:\t\t"+ getName());
		System.out.println("Address:\t" + getAddress());
		System.out.println("Age:\t\t" + getAge() + "\n\n");

	}
	
	
}
