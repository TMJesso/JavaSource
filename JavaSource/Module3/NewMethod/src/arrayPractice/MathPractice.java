package arrayPractice;
public class MathPractice {

	public static void main(String[] args) {
		MathSkills ms = new MathSkills();
		int answer, digits = 0, numRight = 0, numWrong = 0, menu = 0, whichChoice = 0;
		boolean loop = true, right = true, loopMenu = true;
		// how high does the user want in the multiplication table
		menu = ms.getInteger("1. Addition\n2. Subtraction\n3. Multiplication\n4. Division\n5. Randomly select\n6. Exit\n\nChoose 1 - 6");
		while (loopMenu) {
			if (menu < 1 || menu > 6) {
				ms.dispMessage(true, "You have entered an invalid choice!");
				menu = ms.getInteger("Choose 1 - 6 please!");
			} else {
				if(menu == 6) {
					loopMenu=false;
					loop = false;
					continue;
				} else {
					loopMenu = false;
					digits = ms.getInteger("Enter 9 for numbers 1 - 9\nEnter 12 for numbers 1 - 12, etc.");
					continue;
				}
			}
		}
		while (loop) {
			whichChoice = ms.generateQuestion(right, menu, digits, whichChoice);
			answer = ms.getInteger("Enter your answer (-1 to exit the program)");
			// is the user exiting or check input and redisplay if incorrect answer entered
			if (answer == -1) {
				loop = false;
				continue;
			} else {
				// was the right answer entered?
				right = ms.checkAnswer(answer);
				if (right) {
					numRight++;
				}
				while (!right) {
					// redisplay the question again and get users answer
					numWrong++;
					whichChoice = ms.generateQuestion(right, menu, digits, whichChoice);
					answer = ms.getInteger("Re-enter your answer");
					right = ms.checkAnswer(answer);
				}
			}
		}
		if (numRight > 0 && numWrong > 0) {
			ms.dispMessage(true, "You got " + numRight + " answers right!\nYou got " + numWrong + " answers wrong!");
		}
	}

}
