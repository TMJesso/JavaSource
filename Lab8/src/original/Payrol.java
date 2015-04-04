/*
 * Payrol.java
 * Interacts with the user to create employees ...
 *
 * @author
 * @since
 * @version 1.0
*/

package original;
import java.util.ArrayList;

public class Payrol {
	//Create an array list of accounts

	public static void main(String[] args) {
		ActualPayrol somePayrol  = new ActualPayrol();
		somePayrol.doPayrol();

	}
}
//-----------------------------------------------------
class ActualPayrol {
	ArrayList<Employee> employees = new ArrayList<Employee>();

	public void doPayrol() {
		//Write your client code here ....

	}

	//Add a method that adds an employee to the array list
	//Add a method that removes an employee from the array list
	//Add a method that creates a Salaried Employee and adds it to the arraylist
	//Add a method that creates an Hourly Employee and adds it to the list
	//In doPayrol(), invoke each of the above methods twice (effectively creating four employees)
	//Display all employees currently in the array list

	/*
	 Add a method that would search for all salaried employees in the array list and give them all 10% raise.
	 Note: you should use instanceof operator.

	 Call this method from doPayrol()
	*/



}