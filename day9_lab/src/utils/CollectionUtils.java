package utils;

import static utils.ValidationRules.sdf;
import static utils.ValidationRules.validateCourse;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;

import com.app.core.CourseTypes;
import com.app.core.Student;

import cust_excs.StudentHandlingException;

public class CollectionUtils {

	public static ArrayList<Student> populateStudents() {

//		HashMap<String, Student> colgMap = new HashMap<>();
		ArrayList<Student> colg = new ArrayList<Student>();

		try {
			colg.add(new Student("dac-001", "Kaustubh", "kaj@gmail.com", "45", validateCourse("DAC"), sdf.parse("11-06-2010")));
			colg.add(new Student("dac-002", "Gurdeeep", "kaur@gmail.com", "56", validateCourse("DAC"), sdf.parse("13-07-2010")));
			colg.add(new Student("dac-003", "Ram", "ram@gmail.com", "98", validateCourse("DAC"), sdf.parse("09-08-2010")));
			colg.add(new Student("dac-004", "Jason", "jason@gmail.com", "87", validateCourse("DAC"), sdf.parse("11-06-2010")));

		} catch (Exception e) {
			e.printStackTrace();
		}

		return colg;
	}

	public static void Display(ArrayList<Student> colgList) {

		for (Student s : colgList)
			System.out.println(s);
	}
	
	public static void getStudentDetails(String prn, ArrayList<Student> colgList) throws StudentHandlingException
	{
		for(Student stud: colgList)
		{
			if(stud != null && stud.getPrn().equals(prn))
			{
				System.out.println(stud);
			}
		}
	}
	
	public static void updateMarks(String prn,String newMarks, ArrayList<Student> colgList) throws StudentHandlingException
	{
		
		for(Student stud: colgList)
		{
			if(stud != null && stud.getPrn().equals(prn))
			{
				stud.setMarks(newMarks);
				System.out.println("Updated: "+stud);
			}
		}
	}
	
	public static void cancelAdmission(String prn, ArrayList<Student> colgList) throws StudentHandlingException
	{
		for(Student stud: colgList)
		{
			if(stud != null && stud.getPrn().equals(prn))
			{
				if(colgList.remove(stud))
				System.out.println("Cancelled Admission of: "+prn);
			}
		}
	}
	
	public static void addStudent(Student s, ArrayList<Student> colgList) throws StudentHandlingException
	{
		for(Student stud: colgList)
		{
			if(stud != null && stud.equals(s))
			{
				throw new StudentHandlingException("PRN ALREADY EXISTS");
			}
		}
		
		colgList.add(s);
	}

	public static void DisplayCourseWise(CourseTypes course,ArrayList<Student> colgList) throws StudentHandlingException {
		ArrayList<Student> courseWise =  new ArrayList<Student>();
		
		for(Student s : colgList)
		{
			if(s.getCourse() == course)
			{
				courseWise.add(s);
			}
		}
		
		if(courseWise.size() == 0)
		{
			throw new StudentHandlingException("No Student in course"+ course +"found");
		}
		
		for(Student s2 : courseWise)
		{
			System.out.println(s2);
		}
	}
	
	public static void DisplayDateCourseWise(Date date, CourseTypes course, ArrayList<Student> colgList) throws StudentHandlingException {
		ArrayList<Student> newStudentList = new ArrayList<>();
		
		for(Student s : colgList)
		{
			if( s.getDate().after(date) && s.getCourse() == course)
			{
				newStudentList.add(s);
			}
		}
		
		if(newStudentList.size() == 0)
		{
			throw new StudentHandlingException("No Student found");
		}
		
		for(Student s2 : newStudentList)
		{
			System.out.println(s2);
		}
		
	}
	
	public static void sortByPRN(ArrayList<Student> colgList) throws StudentHandlingException
	{

		Collections.sort(colgList);
		
		for(Student s : colgList)
		{
				System.out.println(s);
		}

	}
	
	public static void sortByDOBMarks(ArrayList<Student> colgList) throws StudentHandlingException
	{
		
		Collections.sort(colgList, new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				int ret = o1.getDate().compareTo(o2.getDate());
				if(ret != 0)
				{
					return ret;
				}
				return ((String) o2.getMarks()).compareTo(o1.getMarks());
			}
		});
		
		for(Student s : colgList)
		{
				System.out.println(s);
		}
	}
	
	public static void showTopper(ArrayList<Student> colgList) throws StudentHandlingException
	{
		
		System.out.println(Collections.max(colgList, new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				return o1.getMarks().compareTo(o2.getMarks());
			}
		}));
		
//		for(Student s : newStudentList)
//		{
//				System.out.println(s);
//		}
	}
}
