package pExam;

public class SPPProblem2 {

	public static void main(String[] args) {
		SPPLib serviceAmount = new SPPLib();
		int total = 0;
		total = serviceAmount.getService("1. Service 1\n2. Service 2\n3. Service 3\n4. Service 4\n\nWhat services were performed for the customer?\n(* to exit ) or 1 - 4");
		serviceAmount.sayOutput("Total of the services provided are $" + total + ".00");
	}

}
