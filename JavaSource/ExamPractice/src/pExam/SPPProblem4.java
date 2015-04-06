package pExam;
public class SPPProblem4 {

	public static void main(String[] args) {
		// factor any number between 1 and 10
		SPPLib gf = new SPPLib();
		boolean chkExit = true;
		while (chkExit) {
			chkExit = gf.getFactor("Please enter a number to factor between 1 and 10 (* to exit)");
		}
	}
}
