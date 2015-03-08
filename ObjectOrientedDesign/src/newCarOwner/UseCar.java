/*
 * Author    : Theral Jessop
 * For       : INFO 211
 * Professor : Dr. Awny Alnusair
 * 
 * Description
 * The owner must be created before the car is created because
 * every vehicle created must have a owner
 * There can be owners that have no cars and if a car is sold
 * the old owner can be left without a car but the car must have an owner
 * 
 * If a car is removed, the owner can remain but has no car
 * 
 * 
 * 
 * 
 */

package newCarOwner;
import java.util.*;

public class UseCar {
	public static void main(String[] args) {
		// create owners
		Owner[] owner = new Owner[10];
		// pulled names and address from random generator on web
		owner[0] = new Owner("Michael L. Comeau", "199 Surrey Lane");
		owner[1] = new Owner("Dora L. Webb", "781 River Street");
		owner[2] = new Owner("Beulah J. Benson", "778 3rd Street");
		owner[3] = new Owner("Natalia M. Taylor", "922 Summit Street");
		owner[4] = new Owner("Lindsay J. Brower", "903 10th Street");
		owner[5] = new Owner("Charles M. Leclair", "513 8th Avenue"); // does not own a car yet
		owner[6] = new Owner("Diana J. Torres", "342 Ivy Court"); // does not own a car yet
		owner[7] = new Owner("Robert D. Swisher", "817 Riverside Drive"); // does not own a car yet
		owner[8] = new Owner("Louis M. Childers", "622 Walnut Avenue"); // does not own a car yet
		owner[9] = new Owner("Charles D. Carter", "55 Bridle Lane"); // does not own a car yet
		
		// create cars
		Cars[] car = new Cars[35];
		// pulled models from respective web sites
		// manually changed each owner picking the first five as the default owners
		// reserving the other five for random insertion through the changeOwner method on Cars
		// with this sampling it should give a great breakdown as who owns a car
		car[0] = new Cars("Chevrolet", "Geo Prizm", 1996, 1892.32, owner[0]);
		car[1] = new Cars("Chevrolet", "Cavelier", 2003, 9365.45, owner[1]);
		car[2] = new Cars("Chevrolet", "Aveo", 2003, 9365.45, owner[2]);
		car[3] = new Cars("Chevrolet", "Celta", 2003, 9365.45, owner[3]);
		car[4] = new Cars("Chevrolet", "Lova", 2003, 9365.45, owner[4]);
		car[5] = new Cars("Dodge", "Caravan", 1996, 13954.32, owner[0]);
		car[6] = new Cars("Dodge", "Avenger", 2015, 15954.32, owner[1]);
		car[7] = new Cars("Dodge", "Challenger", 2015, 15954.32, owner[2]);
		car[8] = new Cars("Dodge", "Charger", 2015, 15954.32, owner[3]);
		car[9] = new Cars("Dodge", "Viper", 2015, 15954.32, owner[4]);
		car[10] = new Cars("Toyota", "Camry", 2003, 9365.45, owner[4]);
		car[11] = new Cars("Toyota", "Corolla", 2003, 9365.45, owner[3]);
		car[12] = new Cars("Toyota", "Highlander", 2003, 9365.45, owner[2]);
		car[13] = new Cars("Toyota", "RAV4", 2003, 9365.45, owner[1]);
		car[14] = new Cars("Toyota", "Sequoia", 2003, 9365.45, owner[0]);
		car[15] = new Cars("Kia", "Sorento", 2003, 9365.45, owner[2]);
		car[16] = new Cars("Kia", "Cadenza", 2003, 9365.45, owner[1]);
		car[17] = new Cars("Kia", "Rio", 2003, 9365.45, owner[0]);
		car[18] = new Cars("Kia", "Soul", 2003, 9365.45, owner[4]);
		car[19] = new Cars("Kia", "Forte", 2003, 9365.45, owner[3]);
		car[20] = new Cars("Saturn", "Curve", 2003, 9365.45, owner[3]);
		car[21] = new Cars("Saturn", "Relay", 2003, 9365.45, owner[2]);
		car[22] = new Cars("Saturn", "Vue", 2003, 9365.45, owner[0]);
		car[23] = new Cars("Saturn", "Outlook", 2003, 9365.45, owner[4]);
		car[24] = new Cars("Saturn", "Ion", 2003, 9365.45, owner[1]);
		car[25] = new Cars("Ford", "Pinto", 1975, 1365.45, owner[4]);
		car[26] = new Cars("Ford", "Fusion", 2006, 9365.45, owner[4]);
		car[27] = new Cars("Ford", "F-150", 2003, 9365.45, owner[3]);
		car[28] = new Cars("Ford", "Mustang", 2003, 9365.45, owner[2]);
		car[29] = new Cars("Ford", "Cougar", 2000, 9365.45, owner[1]);
		car[30] = new Cars("Nissan", "Almera", 2003, 9365.45, owner[0]);
		car[31] = new Cars("Nissan", "Altima", 2003, 9365.45, owner[0]);
		car[32] = new Cars("Nissan", "Maxima", 2003, 9365.45, owner[1]);
		car[33] = new Cars("Nissan", "Pulsar", 2003, 9365.45, owner[2]);
		car[34] = new Cars("Nissan", "Rogue", 2008, 9365.45, owner[4]);
		
		// loop the the cars and add them to the ArrayList
		ArrayList<Cars> myCars = new ArrayList<Cars>();
		for (int x = 0; x < car.length; x++) {
			myCars.add(car[x]);
		}
		// display all cars and their owners
		for (Cars c: myCars) {
			System.out.print(c);
			System.out.print(c.getCarOwner());
		}
		// create Continue message ability
		Scanner input= new Scanner(System.in);
		
		// display name of the owner who has no car
		hasNoCar(car, owner);
		System.out.println("Press Enter to continue...");
		input.nextLine();

		
		// change car ownership
		changeCarOwnership(car, owner);
		System.out.println("Press Enter to continue...");
		input.nextLine();
		input.close();
		// after change of ownership
		// re display name of the owner who has no car
		hasNoCar(car, owner);
		
		
	}
	
	/** generate a random number greater than 5 if true
	 * and less than 5 if false
	 * @param above
	 * @return num
	 */
	public static int getRandomNumber(boolean above) {
		Random rnd = new Random();
		int num = rnd.nextInt(10);
		if (above) {
			while (num < 5) {
				num = rnd.nextInt(10);
			}
		} else {
			while (num > 5) {
				num = rnd.nextInt(10);
			}

		}
			return num;
	}
	
	/** randomly choose from the owners who don't own a car 
	 * and give them a car from one of the owners who do.
	 * This still allows for owners to NOT own a car
	 * 
	 * @param car
	 * @param owner
	 */
	public static void changeCarOwnership(Cars[] car, Owner[] owner) {
		// cars change ownership
		int count = 0;
		for (int c = getRandomNumber(false); c < car.length; c+=4) {
			System.out.print(car[c].changeOwnership(owner[getRandomNumber(true)], (Math.floor(((((getRandomNumber(false) * 500)) *100)) /100))));
			count++;
		}
		System.out.println("\n"+ count + " car ownerships changed");
	}
	
	/** calculate and display the owners who don't own a car
	 * or if all owners own one display a message accordingly
	 * 
	 * @param car
	 * @param owner
	 */
	public static void hasNoCar(Cars[] car, Owner[] owner) {
		// determine how many cars have the same owner
		int[] elements = new int[35];
		for (int x = 0; x < car.length; x++) {
			for (int y = 0; y < owner.length; y++) {
				if (car[x].getCarOwner() == (owner[y])) {
					elements[x] = y;
					y = 35;
					continue;
				} else {
					elements[x] = 500;
				}
			}
		}
		// count the number of cars each owner has
		System.out.println();
		int counter = 0;
		int[] howMany = new int[10];
		for (int y = 0; y < owner.length;y++) {
			for (int x = 0; x < elements.length; x++) {
				if (elements[x] == y) {
					counter++;
				}
			}
			howMany[y] = counter;
			counter = 0;
		}
		// loop through the number of owners who own cars to see how many are
		// the same and display the names of those who's number is 0
		// 0 means they own no cars
		
		boolean allOwned = true;
		for (int x = 0; x < howMany.length; x++) {
			if (howMany[x] > 0) {
				continue;
			} else {
				allOwned = false;
				System.out.println("Owns no cars! " + owner[x]);
			}
		}
		if (allOwned) {
			System.out.println("All owners own at least one car!");
		}

	}

}
