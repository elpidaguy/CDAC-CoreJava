package utils;

import static utils.ValidationRules.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;

import com.app.core.CourseTypes;
import com.app.core.Student;

import cust_excs.StudentHandlingException;

public class CollectionUtils {

	public static HashMap<String, Student> populateStudents() {

		HashMap<String, Student> colgMap = new HashMap<>();
		ArrayList<Student> colg = new ArrayList<Student>();

		try {
			colg.add(new Student("dac-001", "Kaustubh", "kaj@gmail.com", "45", validateCourse("DAC"), sdf.parse("11-06-2010")));
			colg.add(new Student("dac-002", "Gurdeeep", "kaur@gmail.com", "56", validateCourse("DAC"), sdf.parse("13-07-2010")));
			colg.add(new Student("dac-003", "Ram", "ram@gmail.com", "98", validateCourse("DAC"), sdf.parse("09-08-2010")));
			colg.add(new Student("dac-004", "Jason", "jason@gmail.com", "87", validateCourse("DAC"), sdf.parse("11-06-2010")));

			for (Student s : colg) {
				colgMap.put(s.getPrn(), s);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return colgMap;
	}

	public static void Display(HashMap<String,Student> colgMap) {

		for (Student s : colgMap.values())
			System.out.println(s);
	}
	
	public static void getStudentDetails(String prn, HashMap<String,Student> colgMap) throws StudentHandlingException
	{
		if(colgMap.get(prn) == null)
		{
			throw new StudentHandlingException("Invalid PRN");
		}
		System.out.println(colgMap.get(prn));
	}
	
	public static void updateMarks(String prn,String newMarks, HashMap<String,Student> colgMap) throws StudentHandlingException
	{
		Student s=colgMap.get(prn);
		if(s == null)
		{
			throw new StudentHandlingException("Invalid PRN");
		}
		else
		{
			s.setMarks(newMarks);
		}	
		System.out.println("Updated: "+colgMap.get(prn));
	}
	
	public static void cancelAdmission(String prn, HashMap<String,Student> colgMap) throws StudentHandlingException
	{
		Student s=colgMap.get(prn);
		if(s == null)
		{
			throw new StudentHandlingException("Invalid PRN");
		}
		System.out.println("Removed: "+colgMap.remove(prn));
	}
	
	public static void addStudent(Student s, HashMap<String,Student> colgMap) throws StudentHandlingException
	{

			if(colgMap.containsKey(s.getPrn()))
			{
				throw new StudentHandlingException("PRN ALREADY EXISTS");
			}
			
			colgMap.put(s.getPrn(),s);
	}

	public static void DisplayCourseWise(CourseTypes course,HashMap<String,Student> colgMap) throws StudentHandlingException {
		ArrayList<Student> courseWise =  new ArrayList<Student>();
		
		for(Student s : colgMap.values())
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
	
	public static void DisplayDateCourseWise(Date date, CourseTypes course, HashMap<String,Student> colgMap) throws StudentHandlingException {
		ArrayList<Student> newStudentList = new ArrayList<>();
		
		for(Student s : colgMap.values())
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
	
	public static void sortByPRN(HashMap<String,Student> colgMap) throws StudentHandlingException
	{
		ArrayList<Student> newStudentList = new ArrayList<>(colgMap.values());
		
		Collections.sort(newStudentList);
		
		for(Student s : newStudentList)
		{
				System.out.println(s);
		}

	}
	
	public static void sortByDOBMarks(HashMap<String,Student> colgMap) throws StudentHandlingException
	{
		ArrayList<Student> newStudentList = new ArrayList<>(colgMap.values());
		
		Collections.sort(newStudentList, new Comparator<Student>() {
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
		
		for(Student s : newStudentList)
		{
				System.out.println(s);
		}
	}
	
	public static void showTopper(HashMap<String,Student> colgMap) throws StudentHandlingException
	{
		ArrayList<Student> newStudentList = new ArrayList<>(colgMap.values());
		
		Collections.sort(newStudentList, new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				/*
				 * int a1=Integer.parseInt(o1.getMarks()); int
				 * a2=Integer.parseInt(o2.getMarks()); Integer c1=new Integer(a1); Integer
				 * c2=new Integer(a2); return c2.compareTo(c1);
				 */
				return o2.getMarks().compareTo(o1.getMarks());
			}
		});
		
//		for(Student s : newStudentList)
//		{
//				System.out.println(s);
//		}
		
		System.out.println(newStudentList.get(0));
	}
}
