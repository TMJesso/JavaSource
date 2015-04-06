package carOwner;
import java.util.*;
public class UseCar {

	public static void main(String[] args) {
		Owner[] owner = new Owner[4];
		owner[0] = new Owner("Theral Jessop", "1711 1/2 North Webster");
		owner[1] = new Owner("Ian Holston", "953 N McCann");
		owner[2] = new Owner("No Owner Name", "No owner address");
		owner[3] = new Owner("New Owner", "New Address");
		
		Cars[] car = new Cars[7];
		car[0] = new Cars("Chevrolet");
		car[1] = new Cars("Dodge");
		car[2] = new Cars("Toyota");
		car[3] = new Cars("KIA");
		car[4] = new Cars("Saturn");
		car[5] = new Cars("Ford");
		car[6] = new Cars("Nissan");
		
		car[0].addModel("Geo Prism", 1996, 1892.32, owner[0]); // Chevrolet owner Theral
		car[0].addModel("Cavelier", 2003, 9365.45, owner[1]);
		car[1].addModel("Caravan", 1996, 13954.32, owner[0]);
		car[1].addModel("Avenger", 2015, 15954.32, owner[1]);
	
		ArrayList<Cars> cars = new ArrayList<Cars>();
		for (int x = 0; x < car.length; x++) { // add the cars to the arraylist
			cars.add(car[x]);
		}
		
		for (Cars c: cars) {
			System.out.println(c);
		}
	}

}
