package pExam;
public class SPPProblem1 {

	public static void main(String[] args) {
		SPPLib callMethod = new SPPLib();
		int total = 0;
		total = callMethod.sumInt("Enter an integer or * to exit");
		callMethod.sayOutput("The sum of the integers entered is: " + total);
	}

	
}
