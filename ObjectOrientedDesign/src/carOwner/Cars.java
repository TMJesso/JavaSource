/*
 * Author    : Theral Jessop
 * For       : INFO 211
 * Professor : Dr. Awny Alnusair
 * 
 * Description
 * Create the owner information and the owner does not have to own a car
 * but the information needs to remain if he did own a car but later sold it
 * 
 * 
 * 
 */
package carOwner;

//import java.util.*;

public class Cars {
	private String make;
	private String[] model = new String[100];
	private int[] year = new int[100];
	private double[] price = new double[100];
	private int numberOfModels;
	
	// note aggregation relationship
	private Owner[] name = new Owner[100];
	
	/** default constructor
	 * 
	 */
	public Cars() {
		this.make = "";
	}
	
	/** non-default constructor
	 * 
	 * @param make
	 */
	public Cars(String make) {
		this.make = make;
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
	public String[] getCarModel() {
		return this.model;
	}
	
	/** get car years
	 * 
	 * @return year
	 */
	public int[] getCarYear() {
		return this.year;
	}
	
	/** get car prices
	 * 
	 * @return price
	 */
	public double[] getCarPrice() {
		return this.price;
	}
	
	/** get car owners
	 * 
	 * @return name
	 */
	public Owner[] getCarOwner() {
		return this.name;
	}
	/** get the number of models for this make
	 * 
	 * @return numberOfModels
	 */
	public int getNumberOfModels() {
		return this.numberOfModels;
	}
	
	
	
	/** add model, year, and price for each make
	 * increment the number of models for this make
	 * 
	 * @param model
	 * @param year
	 * @param price
	 */
	public void addModel(String model, int year, double price, Owner name) {
		this.model[this.numberOfModels] = model;
		this.year[this.numberOfModels] = year;
		this.price[this.numberOfModels] = price;
		this.name[this.numberOfModels] = name;
		this.numberOfModels++;
	}
	
	public String changeOwnership(String model, int year,  Owner name, Owner newName) {
		if (this.numberOfModels == 0) { // no models added
			return "No models for " + this.getCarMake();
		}
		for (int x = 0; x < this.numberOfModels;x++) {
			if (this.model[x] == model) {
				if (this.year[x] == year) {
					if (this.name[x] == name) {
						this.name[x] = newName; // validate the model, year and previous owner before changing ownership
					}
				}
			}
		}
		return "Ownership has changed\n" + this.make + " " + model + " "+ year + " " + newName;
	}
	
	public String toString() {
		String output = "\nCars's Information:" +
						"\nMake: " + this.make +
						"\nModel: "  + this.model +
						"\nYear: " + this.year + 
						"\nPrice: " + this.price;
		return output;
	}


}
