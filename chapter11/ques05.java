package chapter11;
/**
 * @author Arshdeep Kapoor
 * 
 */
public class ques05 {
	public static void main(String[] args) {
		Course course1 = new Course("Data Programming");
		Course course2 = new Course("Mobile app development");

		course1.addStudent("Mandar Oak");
		course1.addStudent("Adarsh Parashivamurthy");
		course1.addStudent("Ramandeep Singh");

		course2.addStudent("Shobhit Gupta");
		course2.addStudent("Arshdeep kapoor");

		System.out.println("Number of students in course1: "
			+ course1.getNumberOfStudents());
		String[] students = course1.getStudents();
		for (int i = 0; i < course1.getNumberOfStudents(); i++)
			System.out.print(students[i] + ", ");

		System.out.println();
		System.out.print("Number of students in course2: "
			+ course2.getNumberOfStudents());
	}
}
