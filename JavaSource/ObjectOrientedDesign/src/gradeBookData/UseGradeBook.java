package gradeBookData;

public class UseGradeBook {
	public static void main(String[] args) {
		GradeLib lib = new gradeBookData.GradeLib();
		GradeBook[] newCourse = new GradeBook[4];
		//for (int x = 0; x < newCourse.length; x++) {
			//newCourse[x] = new GradeBook();
		//}
		
		int menuItem = 0, currentPos = 0;
		String message = "Choose from the following options:\n\n", getMenu = "";
		message	+= "1 - Create the defualt Java GradeBook:\n";
		message	+= "2 - Create a new GradeBook:\n";
		message += "3 - Display the welcome message:\n";
		message += "4 - Calculate the class average and the maximum grade\n";
		message += "5 - Quit\n\n";
		message += "Enter your choice: ";
		while (menuItem < 5) {
			getMenu = lib.getString(message);
			menuItem = lib.intString(getMenu);
			currentPos = menuItem - 1;
			if (menuItem == 1) { // create the default Java GradeBook
				newCourse[currentPos]  = new GradeBook();
			} else if (menuItem == 2) { // create a new GradeBook
				newCourse[currentPos] = new GradeBook();
				newCourse[currentPos].setCourseName(lib.createNewCourse());
				menuItem = 0;
			} else if (menuItem == 3) { // display the welcome message
				newCourse[currentPos] = new GradeBook();
				newCourse[currentPos].setCourseName(lib.createNewCourse());
				newCourse[currentPos].displayMessage();
			} else if (menuItem == 4) { // calculate the class average and the maximum grade
				System.out.println(currentPos);
				newCourse[currentPos] = new GradeBook();
				newCourse[currentPos].setCourseName(lib.createNewCourse());
				
				newCourse[currentPos].setNumberOfStudents(lib.getScanInt("How many students do you have grades for? "));
				newCourse[currentPos].determineClassAverage();
			} else if (menuItem == 5) { // quit
				 continue;
			} else {
				System.out.println("Invalid menu choice! Please choose 1 - 5!");
				menuItem = 0;
			}
		}
	}
	


}
