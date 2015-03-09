package chapter11;
import java.util.*;
public class TestArrayList {
	public static void main(String[] args) {
		// create a list to store cites
		ArrayList<String> cityList = new ArrayList<>();
		
		// add some cities in the list
		cityList.add("London");
		// cityList now contains [London]
		cityList.add("Denver");
		// cityList now contains [London, Denver]
		cityList.add("Paris");
		// cityList now contains [London, Denver, Paris]
		cityList.add("Miami");
		// cityList now contains [London, Denver, Paris, Miami]
		cityList.add("Seoul");
		// contains [London, Denver, Paris, Miami, Seoul]
		cityList.add("Tokyo");
		// contains [London, Denver, Paris, Miami, Seoul, Tokyo]
		
		System.out.println("List size? " + cityList.size());
		System.out.println("Is Miama in the list? " + cityList.contains("Miami"));
		System.out.println("The location of Denver in the list? " + cityList.indexOf("Denver"));
		System.out.println("Is the list empty? " + cityList.isEmpty());
		
		// insert a new city at index 2
		cityList.add(2, "Xian");
		// contains [London, Denver, Xian, Paris, Miami, Seoul, Tokyo]
		
		// remove a city from the list
		cityList.remove("Miami");
		// contains [London, Denver, Xian, Paris, Seoul, Tokyo]
		
		// remove a city at index 1
		cityList.remove(1);
		// contains [London, Xian, Paris, Seoul, Tokyo]
		
		// display the contents in the list
		System.out.println(cityList.toString());
		
		// display the contents in the list in reverse order
		for (int i = cityList.size() - 1; i >= 0; i--) {
			System.out.print(cityList.get(i) + " ");
		}
		System.out.println();
		
		// create a list to store two circles
		ArrayList<CircleFromSimpleGeometricObject> list = new ArrayList<>();
		
		// add two circles
		list.add(new CircleFromSimpleGeometricObject(2));
		list.add(new CircleFromSimpleGeometricObject(3));
		
		// display the area of the first circle in the list
		System.out.println("The area of the circle? " + list.get(0).getArea());
	}

}
