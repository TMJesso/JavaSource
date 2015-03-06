package employeeData;

public class UseEmployee {

	public static void main(String[] args) {
		// Create some employee objects:
		
		//(Step 1) Declare the object:
		Employee emp1, emp2, emp3; // declare the variables
		//(Step 2): instantiate the object you just defined:
		emp1 = new Employee(); // invoking the default constructor
		//emp1: is a reference variable
		emp2 = new Employee ("Brandon", "123490", 90000.25, "Howard"); // invoking non-default constructor
		// emp3
		emp3 = new Employee("George", "155326", 95256.36, "Marion");
		
		//System.out.println(emp1.displayMessage());
		//System.out.println(emp2.displayMessage());
		
		emp1.setEmpName("Justin");
		emp1.setEmpID("235655");
		emp1.setEmpSalary(105365.35);
		emp1.setEmpCounty("Hamilton");
		
		System.out.println("First Print");
		System.out.println("Employee 1\n" + emp1 + "\n");
		System.out.println("Employee 2\n" + emp2 + "\n");
		System.out.println("Employee 3\n" + emp3 + "\n");
		
		emp1.adjustSalary(10, true);
		emp2.adjustSalary(5, false);
		
		System.out.println("After salary adjustment");
		System.out.println("Employee 1\n" + emp1 + "\n");
		System.out.println("Employee 2\n" + emp2 + "\n");
		System.out.println("Employee 3\n" + emp3 + "\n");
		
		emp1.calculateTravelAssistance();
		emp2.calculateTravelAssistance();
		emp3.calculateTravelAssistance();

		System.out.println("After calculating the travel assistance");
		System.out.println("Employee 1\n" + emp1 + "\n");
		System.out.println("Employee 2\n" + emp2 + "\n");
		System.out.println("Employee 3\n" + emp3 + "\n");

		//Employee 1 now is Justin. We know his salary - 
		
		//Write a statement to display only the name of employee 2:
	}

}
