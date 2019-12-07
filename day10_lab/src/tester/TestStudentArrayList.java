package tester;

import java.util.ArrayList;
import java.util.Scanner;

import com.app.core.Student;

import static com.app.core.StudentUtil.*;
import static utils.ValidationRules.*;

public class TestStudentArrayList {

	public static void main(String[] args) {

		ArrayList<Student> colg = new ArrayList<Student>();

		try {
			colg.add(new Student("dac-001", "Kaustubh", "kaj@gmail.com", "100", validateCourse("DAC"), sdf.parse("11-06-2010")));
			colg.add(new Student("dac-002", "Gurdeeep", "kaur@gmail.com", "101", validateCourse("DAC"), sdf.parse("13-07-2010")));
			colg.add(new Student("dac-003", "Ram", "ram@gmail.com", "220020", validateCourse("DAC"), sdf.parse("09-08-2010")));
		} catch (Exception e) {
			e.printStackTrace();
		}

		boolean flag = false;

		int ch;
		try (Scanner sc = new Scanner(System.in)) {
			while (!flag) {
				System.out.println("COLLEGE");
				System.out.println("1.Add Student");
				System.out.println("2.Display All Students");
				System.out.println("3.NA");
				System.out.println("4.Exit");
				System.out.println("Please Enter Choice: ");
				try {
					ch = sc.nextInt();
					switch (ch) {
					case 1: {
						System.out.println("Enter PRN, Name, Email, Marks, Course, Joining Date");
						addStudent(new Student(sc.next(), validateName(sc.next()), validateEmail(sc.next()), sc.next(),validateCourse(sc.next()), validateDate(sc.next())), colg);
					}
						break;
					case 2: {
						System.out.println("Student Data is: ");
						display(colg);
					}
						break;
					case 3: {
					}
						break;
					case 4: {
						flag = true;
					}
						break;
					}
				} catch (Exception e) {
					sc.nextLine();
					e.printStackTrace();
					// flag = true;
					// System.out.println(e.getMessage());
				}
			}
		} catch (Exception e) {

			System.out.println(e.getMessage());
		}
	}

}
