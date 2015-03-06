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

import java.io.InputStream;
import java.util.Scanner;

public class Cars {
	private String make;
	private String model;
	private int year;
	private double price;
	
	// note compolate relationship
	private Owner name;
	
	/** default constructor */
	public Cars() {
		this.make = "New Make";
		this.model = "New Model";
		this.year = 2015;
		this.price = 25000.00;
		//this.name = this.getOwnerName();
	}
	
	public Cars(String make, String model, int year, double price, String owner) {
		Scanner input = new Scanner(System.in);
		this.make = make;
		this.model = model;
		this.year = year;
		this.price = price;
		if (owner.isEmpty()) {
			System.out.print("Please enter the owner of this car ");
			//this.owner = input.nextLine();
			
		} else {
			//this.owner = owner;
		}
		input.close();
	}
	
	public String getCarMake() {
		return this.make;
	}
	
	public String getCarModel() {
		return this.model;
	}

	//public Cars getCarName() {
		//Cars make = new Cars(getCarMake());
		//return make;
		
		
		
	//}
}
