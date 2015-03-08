/*
 * Author    : Theral Jessop
 * For       : INFO 211
 * Professor : Dr. Awny Alnusair
 * 
 * Description
 * Create the car with make, model, year, price and a owner.  Every car must have one owner and this car
 * can be sold to another owner. Don't need to track the change of ownership but need to track who the
 * current owner is if the car was sold
 * 
 * 
 * 
 */
package newCarOwner;

public class Cars {
	// Car fields
	private String make;
	private String model;
	private int year;
	private double price;
	
	// note composition relationship with owners
	private Owner name;
	
	/** default constructor */
	public Cars() {
		this.make = "New Car";
		this.model = "New Model";
		this.year = 2015;
		this.price = 25000.00;
	}
	
	/** non-default constructor 
	 * 
	 * @param make
	 * @param model
	 * @param year
	 * @param price
	 * @param name
	 */
	public Cars(String make, String model, int year, double price, Owner name) {
		this.make = make;
		this.model = model;
		this.year = year;
		this.price = price;
		this.name = name;
	}
	
	// get methods
	/** get car make
	 * 
	 * @return make
	 */
	public String getCarMake() {
		return this.make;
	}
	
	/** get car models
	 * 
	 * @return model
	 */
	public String getCarModel() {
		return this.model;
	}
	
	/** get car years
	 * 
	 * @return year
	 */
	public int getCarYear() {
		return this.year;
	}
	
	/** get car prices
	 * 
	 * @return price
	 */
	public double getCarPrice() {
		return this.price;
	}
	
	/** get car owners
	 * 
	 * @return name
	 */
	public Owner getCarOwner() {
		return this.name;
	}
	
	// set methods
	/** set car make
	 * 
	 * @param make
	 */
	public void setCarMake(String make) {
		this.make = make;
	}
	
	/** set car model
	 * 
	 * @param model
	 */
	public void setCarModel(String model) {
		this.model = model;
	}
	
	/** set car year 
	 * 
	 * @param year
	 */
	public void setCarYear(int year) {
		this.year = year;
	}
	
	/** set car price 
	 * 
	 * @param price
	 */
	public void setCarPrice(double price) {
		this.price = price;
	}
	
	/** set car owner.  There must be a owner for every car
	 * 
	 * @param name
	 */
	public void setCarOwner(Owner name) {
		this.name = name;
	}

	/** change car ownership
	 * 
	 * @param newName
	 * @return message
	 */
	public String changeOwnership(Owner newName, double price) {
		String message = "\nCars's Information\nMake, Model, Year, Price | Original Owner\n" + this.make + ", " + this.model + ", "+ this.year + ", $" + this.price + " " + this.name;
		this.name = newName; // validate the model, year and previous owner before changing ownership
		double difference = this.price;
		if (difference - price < 0) {
			this.price = 0;
		} else {
			this.price = (Math.floor(((difference - price)*100)))/100; // price the car was sold for
		}
		
		difference -= this.price;
		if (difference >= 0) {
			difference = (((Math.floor(((difference)*100)))/100) * -1);
		} else {
			difference = ((Math.floor(((difference)*100)))/100);
		}
		difference = ((Math.floor(((difference)*100)))/100) * -1;
		message += "\nCars's Information\nMake, Model, Year, Price | New Owner\n" + this.make + ", " + this.model + ", "+ this.year + ", $" + this.price + " " + this.name +"\nAdjusted Price: $" + difference + "\n==========================================\n";
		return message;
	}
	
	/** format the values of the car to display
	 * 
	 * @return output
	 */
	public String toString() {
		String output = "\nCar's Information\nMake, Model, Year, Price | Owner" +
						"\n------------------------------------------\n" + this.make +
						", "  + this.model +
						", " + this.year + 
						", $" + this.price;
		return output;
	}


}
