package objPractice;

public class UseEmployee {

	public static void main(String[] args) {
		// create some employee objects
		
		// (Step 1) declare the object
		Employee emp1; //, emp2;
		
		// (Step 2) instantiate the object you just defined:
		emp1 = new Employee();
		//emp2 = new Employee("Brandon", "Tyke", "Master", "12390", 90000.25, "555-12-3333","This","", "", "", "", 0);
		
		System.out.println(emp1.displayEmployee());
		//System.out.println(emp2.displayEmployee());
		
		emp1.setEmpName("Justin", "Tomlin", "Jacobs");
		emp1.setEmpSalary(105365.35);
		
		System.out.println(emp1.displayEmployee());
		
	}

}
