package newPerson;
public class Person {
//private instance variables
private String name;
private String address;
private int age;

//Note the Aggregation relationship below:
private Country countryOfBirth;
private Country countryOfResidence;

//constructor takes name address and age
public Person (String name, String address, int age, Country countryOfBirth, Country countryOfResidence)
{
	//set variables equal to the initial input
	this.name = name;
	this.address = address;
	this.age = age;
	
	if(age < 0)
		this.age = 0;
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
	String output = "\nPerson's Information:" +
					"\nName: " + this.name +
					"\nAge: "  + this.age +
					"\nAddress: " + this.address;
	return output;
}

}



















