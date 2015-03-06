package arrayPractice;

import javax.swing.*;
import java.util.*;

public class MathSkills {
	
	// global variables
	private Random randGen = new Random();
	Scanner input = new Scanner(System.in);
	private int answer, firstNumber, secondNumber;
	private String choice;
	
	// A method that will generate a random question and display it on the screen or redisplay
	// the old question by accepting true or false as the variable passed into the method
	public int generateQuestion(boolean right, int menu, int digits, int rndChoice) {
		// generate two random single-digit integer number only if a correct answer was entered
		if (right) {
			firstNumber = genRandomNumber(digits);
			secondNumber = genRandomNumber(1, digits);
			
		} 
		switch (menu) {
			case 1: answer = firstNumber + secondNumber;choice = " + ";break;
			case 2: checkOrder(); answer = firstNumber - secondNumber;choice = " - ";break;
			case 3: answer = firstNumber * secondNumber;choice = " x ";break;
			case 4: answer = firstNumber / secondNumber; choice = " / ";break;
			case 5:	rndChoice = validateNumber(right, rndChoice, 4);
				switch (rndChoice) {
				case 1: answer = firstNumber + secondNumber;choice = " + ";break;
				case 2:checkOrder(); answer = firstNumber - secondNumber;choice = " - ";break;

				case 3: answer = firstNumber * secondNumber;choice = " x ";break;
				case 4: answer = firstNumber / secondNumber; choice = " / ";break;
				}break;
		}

		dispMessage(true, "What is " + firstNumber + choice + secondNumber + " ?");
		return rndChoice;
	}
	
	// This method will determine if the user enters a correct answer or not and return if it was true
	// or false 
	public boolean checkAnswer(int userResponse) {
		if (userResponse == answer) {
			dispMessage(true, generateCorrectMessage());
			if (choice.equals(" / ")) {
				int remainder = firstNumber % secondNumber, remainAnswer=0;
				if (remainder != 0) {
					boolean looping = true;
					while (looping) {
						remainAnswer = getInteger("What is the remainder from dividing " + firstNumber + " by " + secondNumber);
						if (remainder == remainAnswer) {
							dispMessage(true, generateCorrectMessage());
							looping = false;
							continue;
						} else {
							dispMessage(true, generateIncorrectMessage());
						}
					}
				}
			}
			return true;
		} else {
			dispMessage(true, generateIncorrectMessage());
			return false;
		}
	}
	
	// the following method will be called if the user enters a correct answer to generate and returns
	// a message for the user
	public String generateCorrectMessage() {
		switch (genRandomNumber(3)) {
		case 0: return "Excellent Work!";
		case 1: return "Great!";
		case 2: return "Excellent, keep up the good work!";
		case 3: return "Good Job!";
		default: return "";
		}
	}
	
	// the following method will be called if the user enters a incorrect answer to generate and returns
	// a incorrect message for the user
	public String generateIncorrectMessage() {
		switch (genRandomNumber(3)) {
		case 0: return "Not quite right!";
		case 1: return "Try again!";
		case 2: return "Keep practicing!";
		case 3: return "Nice Try!";
		default: return "";
		}
	}
	// generates a random number based upon the criteria that the user specifies by digits
	// makes the random number generator very portable between this and other methods
	public int genRandomNumber(int digits) {
		return randGen.nextInt(digits+1);
	}
	
	public int genRandomNumber (int minimum, int maximum) {
		int newRandom = 0;
		newRandom = randGen.nextInt(maximum+1 );
		while (newRandom < minimum) {
			newRandom = randGen.nextInt(maximum+1 );
		}
		return newRandom;
		
	}
	// get integer from user for how many digits to use and check to see if the there are any errors
	// very portable as it will display a customizable message to be displayed from the main method
	public int getInteger(String message) {
		boolean loop = true;
		int num1 = 0;
		while (loop) {
			try {
				dispMessage(false, message);
				num1 = input.nextInt();
				loop = false;
				continue;
			} catch (InputMismatchException|IndexOutOfBoundsException|IllegalArgumentException e) {
				JOptionPane.showMessageDialog(null, "Invalid Entry!");
				continue;
			}
		}
		return num1;
		
	}
	
	// displays a message in the console with either a new line or not
	public void dispMessage(boolean newLine, String message) {
		if (newLine) {
			System.out.println(message + " ");
		} else {
			System.out.print(message + " ");
		}
	}
	
	// if dividing or subtracting, the second number cannot be larger than the first number
	public void checkOrder() {
		if ((firstNumber > secondNumber) && choice.equals(" / ")) {
			int temp = firstNumber;
			firstNumber = secondNumber;
			secondNumber = temp;
		} else if ((secondNumber == 0) && choice.equals(" / ")) {
			int temp = firstNumber;
			firstNumber = secondNumber;
			secondNumber = temp;
		} else if (firstNumber < secondNumber) {
			int temp = firstNumber;
			firstNumber = secondNumber;
			secondNumber = temp;
		}
	}
	
	// If dividing, second number cannot be 0
	public int validateNumber(boolean right, int num,int digits) {
		// if answer was right then generate new number otherwise leave as is
		if (right) {
			num = genRandomNumber(1, digits);
		}
		while (num == 0) {
			num = genRandomNumber(1, digits);
		}
		return num;
	}
	
	// calculate the answer
	public void calcAnswer() {
		try {
			answer = firstNumber / secondNumber;
		} catch ( ArithmeticException e ) {
			answer = secondNumber / firstNumber;
			System.out.println(firstNumber + " firstnumber! " + secondNumber + " secondnumber! Divide by zero Error\n" + " " + choice);
			
		}
	}
}
