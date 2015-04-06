package newPerson;

public class TestCourse {

	public static void main(String[] args) {
		Course course1 = new Course("Data Structures");
		Course course2 = new Course("Database Systems");
		Course course3 = new Course("Empty Class");
		
		course1.addStudent("Peter Jones");
		course1.addStudent("Kim Smith");
		course1.addStudent("Anne Kennedy");
		
		course2.addStudent("Peter Jones");
		course2.addStudent("Steve Smith");
		
		course3.addStudent("Theral Jessop");
		
		System.out.println("Number of students in " + course1.getCourseName() + ": " + course1.getNumberOfStudents());
		System.out.println(course1.getCourseName() + "\nStudents\n==============================");
		String[] students = course1.getStudents();
		for (int i = 0; i < course1.getNumberOfStudents(); i++) {
			if (i==course1.getNumberOfStudents()-1) {
				System.out.print(students[i]+".\n------------------------------\n\n");
			} else {
				System.out.print(students[i]+", ");
			}
		}
		
		System.out.println("Number of students in " + course2.getCourseName() + ": " + course2.getNumberOfStudents());
		System.out.println(course2.getCourseName() + "\nStudents\n==============================");
		String[] students2 = course2.getStudents();
		for (int i = 0; i < course2.getNumberOfStudents(); i++) {
			if (i==course2.getNumberOfStudents()-1) {
				System.out.print(students2[i] + ".\n------------------------------\n\n");
			} else {
				System.out.print(students2[i] + ", ");
			}
		}
		System.out.println("Number of students in " + course3.getCourseName() + ": " + course3.getNumberOfStudents());
		System.out.println(course3.getCourseName() + "\nStudents\n==============================");
		String[] students3 = course3.getStudents();
		for (int i = 0; i < course3.getNumberOfStudents(); i++) {
			if (i==course3.getNumberOfStudents()-1) {
				System.out.print(students3[i] + ".\n------------------------------\n\n");
			} else {
				System.out.print(students3[i] + ", ");
			}
		}
	
		
	}

}
