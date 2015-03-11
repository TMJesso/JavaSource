package myPerson;
public class Person {
//private instance variables
protected String name;
protected String address;
protected String city;
protected String state;
protected String zip;
protected String phone;
private java.util.Date created;
protected int birthMonth;
protected int birthDay;
protected int birthYear;
protected int age;

//Note the Aggregation relationship below:
protected Country countryOfBirth;
protected Country countryOfResidence;

//constructor takes name address and age
public Person (String name, String address, String city, String state, String zip, String phone, java.util.Date created, int birthMonth, int birthDay, int birthYear, int age, Country countryOfBirth, Country countryOfResidence) {
		//set variables equal to the initial input
		this.name = name;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.phone = phone;
		this.created = new java.util.Date();
		this.birthMonth = birthMonth;
		this.birthDay = birthDay;
		this.birthYear = birthYear;
		this.age = age;
		
		if(age < 0) {
			this.age = 0;
		}
		this.countryOfBirth = countryOfBirth;
		this.countryOfResidence = countryOfResidence;
	
	}
	//set**********************************
	public void setName(String name)
	{
		//reset name to new input
		this.name = name;
	}
	public void setCountryBirth(Country countryBirth){
		this.countryOfBirth = countryBirth;
	}
	//get information
	public String getName()
	{
		System.out.println("The name is " + this.name);
		//returns value as well as prints
		return this.name;
	}
	public Country getCountryBirth() {
		return this.countryOfBirth;
	}
	
	
	public Country getCountryResidence() {
		return this.countryOfResidence;
	}
	
	public java.util.Date getDateCreated() {
		return this.created;
	}
	
	
	//*************************************
	public void setAddress(String address)
	{
		this.address = address;
	}
	
	
	public String getAddress()
	{
		System.out.println(this.name + "'s address is " + this.address);
		//returns value as well as prints
		return this.address;
	}
	//*************************************
	public void setAge(int age)
	{
		if(age < 0)
			this.age = 0;
		else
			this.age = age;
	}
	public int getAge()
	{
		return this.age;
	}
	
	public String toString() {
		String output = "\nPerson's Information\n--------------------------------\n" +
						" Name" + calcSpaces(0) + "|" + " Address" + calcSpaces(1) + "| City, State Zip" + calcSpaces(2) + "| Phone" + calcSpaces(3) + "| Birthday" + calcSpaces(4) + "| Age | \n" + this.name + "\t\t| " + this.address +
							" \t| " + this.city + ", " + this.state + " " + this.zip +
							"\t| " + this.phone + "  | " + getBirthDate() + "\t| " + this.age + "  |";
		return output;
	}
	
	private String calcSpaces(int pos) {
		String tab = "\t\t";
		switch (pos) {
		case 0: tab = "\t\t"; break;
		case 1: tab = "\t\t"; break;
		case 3: tab = "\t\t"; break;
		case 4: tab = "\t\t"; break;
		case 5: tab = "\t\t"; break;
		
		}
		
		return tab;
		
		
	}
	private String getBirthDate() {
		String birthDay = "";
		switch (this.birthMonth) {
			case  1: birthDay += "January";   break; // 31
			case  2: birthDay += "February";  break;              // 28 or 29 on leap year
			case  3: birthDay += "March";     break; // 31
			case  4: birthDay += "April";     break;     // 30
			case  5: birthDay += "May";       break; // 31
			case  6: birthDay += "June";      break;     // 30
			case  7: birthDay += "July";      break; // 31
			case  8: birthDay += "August";    break; // 31
			case  9: birthDay += "September"; break;     // 30
			case 10: birthDay += "October";   break; // 31
			case 11: birthDay += "November";  break;     // 30
			case 12: birthDay += "December";  break; // 31
		}
		
		birthDay += " " + this.birthDay + ", " + this.birthYear;
		return birthDay;
	}


}



















