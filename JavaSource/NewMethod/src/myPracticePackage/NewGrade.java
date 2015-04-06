package myPracticePackage;
import javax.swing.*;
public class NewGrade {

	public static void main(String[] args) {
		Grade askGrade = new Grade();
		JOptionPane.showMessageDialog(null, askGrade.isGradeOk(102));
	}

}
class Grade {
	
	public String isGradeOk(int grade) {
		if (grade >= 65 && grade <= 100) {
			return "Congratulations! You have passed the class";
		} else if (grade >= 0 && grade <= 64) {
			return "You have failed the class";
		} else {
			return "Invalid Grade";
		}
	}
	
	public String isGradeOk(double grade) {
		if (grade >= 97.0 && grade <= 100) {
			return "Your grade is: A+";
		} else if (grade >= 93.0 && grade < 97.0) {
			return "Your grade is: A";
		} else if (grade >= 90.0 && grade < 93.0) {
			return "Your grade is: A-";
		} else if (grade >= 87.0 && grade < 90.0) {
			return "Your grade is: B+";
		} else if (grade >= 83.0 && grade < 87.0) {
			return "Your grade is: B";
		} else if (grade >= 80.0 && grade < 83.0) {
			return "Your grade is: B-";
		} else if (grade >= 77.0 && grade < 80.0) {
			return "Your grade is: C+";
		} else if (grade >= 73.0 && grade < 77.0) {
			return "Your grade is: C";
		} else if (grade >= 70.0 && grade < 73.0) {
			return "Your grade is: C-";
		} else if (grade >= 67.0 && grade < 70.0) {
			return "Your grade is: D+";
		} else if (grade >= 63.0 && grade < 67.0) {
			return "Your grade is: D";
		} else if (grade >= 60.0 && grade < 63.0) {
			return "Your grade is: D-";
		} else if (grade >= 0.0 && grade < 60.0) {
			return "Your grade is: F";
		} else {
			return "Invalid Entry";
		}
	}
}