package myPerson;
public class Country {
	private String countryName;
	private String continent;
	private int population;
	
	//Constructors: one default and another non-default constructor
	public Country() {
		this.countryName = "";
		this.continent = "";
		this.population = 0;
	}
	public Country(String countryName, String continent, int population) {
		this.countryName = countryName;
		this.continent = continent;
		this.population = population;
	}
	//set Methods:
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	
	//get Methods
	public String getCountryName() {
		return this.countryName;
	}
	
	//toString method:
	public String toString() {
		String output =	" Country Name: " + this.countryName +
				"\nContinent: "  + this.continent +
				"\nPopulation: " + this.population;
		return output;
	}
	
}
