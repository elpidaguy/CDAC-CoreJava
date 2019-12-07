package tester;

import static utils.CollectionUtils.Display;
import static utils.CollectionUtils.DisplayCourseWise;
import static utils.CollectionUtils.DisplayDateCourseWise;
import static utils.CollectionUtils.addStudent;
import static utils.CollectionUtils.cancelAdmission;
import static utils.CollectionUtils.getStudentDetails;
import static utils.CollectionUtils.populateStudents;
import static utils.CollectionUtils.showTopper;
import static utils.CollectionUtils.sortByDOBMarks;
import static utils.CollectionUtils.sortByPRN;
import static utils.CollectionUtils.updateMarks;
import static utils.ValidationRules.validateCourse;
import static utils.ValidationRules.validateDate;
import static utils.ValidationRules.validateEmail;
import static utils.ValidationRules.validateName;

import java.util.ArrayList;
import java.util.Scanner;

import com.app.core.Student;

public class TestCollectionHM {


	public static void main(String[] args) {

		ArrayList<Student> colgList = new ArrayList<>();
		colgList = populateStudents();

		boolean flag = false;

		int ch;
		try (Scanner sc = new Scanner(System.in)) {
			while (!flag) {
				System.out.println("COLLEGE");
				System.out.println("1.Add Student");
				System.out.println("2.Display All Students");
				System.out.println("3.Get Student Detail");
				System.out.println("4.Update Marks");
				System.out.println("5.Cancel Admission");
				System.out.println("6.Display Course Wise");
				System.out.println("7.Display PRN and NAME , enrolled date and course wise");
				System.out.println("8.Sort Student PRN wise");
				System.out.println("9.Sort Student dob and marks wise");
				System.out.println("10.Get Topper");
				System.out.println("99.Exit");
				System.out.println("Please Enter Choice: ");
				try {
					ch = sc.nextInt();
					switch (ch) {
					case 1: {
						System.out.println("Enter PRN, Name, Email, Marks, Course, Joining Date");
						addStudent(new Student(sc.next(), validateName(sc.next()), validateEmail(sc.next()), sc.next(),validateCourse(sc.next()), validateDate(sc.next())), colgList);
					}
						break;
					case 2: {
						System.out.println("Student Data is: ");
						Display(colgList);
					}
						break;
					case 3: {
						System.out.println("Enter PRN Number: ");
						getStudentDetails(sc.next(),colgList);
					}
						break;
					case 4: {
						System.out.println("Enter PRN Number and New Marks ");
						updateMarks(sc.next(),sc.next(),colgList);
					}
						break;
					case 5: {
						System.out.println("Enter PRN you want to cancel admission of: ");
						cancelAdmission(sc.next(),colgList);
					}
						break;
					case 6: {
						System.out.println("Enter Course Name: ");
						DisplayCourseWise(validateCourse(sc.next()),colgList);
					}
						break;
					case 7: {
						System.out.println("Enter Date of Birth and Course Name: ");
						DisplayDateCourseWise(validateDate(sc.next()),validateCourse(sc.next()),colgList);
					}
						break;
					case 8: {
						sortByPRN(colgList);
					}
						break;
					case 9: {
						sortByDOBMarks(colgList);
					}
						break;
					case 10: {
						showTopper(colgList);
					}
						break;
					case 99: {
						flag = true;
					}
						break;
					}
				} catch (Exception e) {
					sc.nextLine();
					//e.printStackTrace();
					// flag = true;
					System.out.println(e.getMessage());
				}
			}
		} catch (Exception e) {

			System.out.println(e.getMessage());
		}
	}

}
