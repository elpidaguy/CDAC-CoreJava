//2. After completing 1st part , add more validation rules
//(In utils packge, add a class ValidationRules & add static methods)
//2.1 student name must be min 4 chars & max 10 chars long
//(validateName method)
//
//2.2 student email must be min 4 chars & max 10 chars long & must contain @ char. (Hint : use contains method of String class)
//(validateEmail method)
//
//2.3 valid course names are -- dac/dmc/dbdac/dai
//Do proper exception handling & complete the assignment.
//(Hint : In tester , u must call all these validation rules , before admitting a new student)


package utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.app.core.CourseTypes;

import cust_excs.StudentHandlingException;

public class ValidationRules {

	public static int minLengh, maxLenght;
	public static String course[] = {"DAC","DMC","DBDA","DAI"};
	public static SimpleDateFormat sdf;
	public static Date endDate;
	static
	{
		sdf = new SimpleDateFormat("dd-MM-yyyy");
		try {
			endDate = sdf.parse("31-12-2019");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		minLengh = 4;
		maxLenght = 10;
	}
	
	//With returning string 
	public static String validateName(String s) throws StudentHandlingException
	{
		if(s.length() < 4 || s.length() > 10)
		{
			throw new StudentHandlingException("Length of Name should be between 4 to 10");
		}
		return s;		
	}
	
	public static String validateEmail(String s) throws StudentHandlingException
	{
		
		if(s.length() < 4 || s.length() > 10)
		{
			throw new StudentHandlingException("Length of Email should be between 4 to 10");
		}
		
		if(!s.contains("@"))
		{
			throw new StudentHandlingException("Invalid Email.Email Must contain @");
		}
		
		return s;
	}
	
	//without enum - only wioth string 
//	public static String validateCourse(String s) throws StudentHandlingException
//	{
//		boolean isValid = false;
//		for(String c: course)
//		{
//			if(s.equals(c))
//			{
//				isValid = true;
//			}
//		}
//		if(!isValid)
//		{
//			throw new StudentHandlingException("Course Name is Invalid.");
//		}
//		
//		return s;
//	}
	
	public static CourseTypes validateCourse(String s) throws StudentHandlingException  {
		
		CourseTypes c=null ;
		try
		{
		 c = CourseTypes.valueOf(s.toUpperCase());
		}
		catch(Exception e)
		{
			throw new StudentHandlingException("Course is invalid");
		}
		
		return c;
		
	}
	
	public static Date validateDate(String s) throws StudentHandlingException,ParseException
	{
		Date d = sdf.parse(s);
		
		if (d.after(endDate))
			throw new StudentHandlingException("Invalid date.Can't be after 31 Dec 2019.");
		return d;
	}

//without returning String
//	public static void validateName(Student s) throws StudentHandlingException
//	{
//		if(s.getName().length() < 4 || s.getName().length() > 10)
//		{
//			throw new StudentHandlingException("Length of Name should be between 4 to 10");
//		}			
//	}
	
//	public static void validateEmail(Student s) throws StudentHandlingException
//	{
//		
//		if(s.getEmail().length() < 4 || s.getEmail().length() > 10)
//		{
//			throw new StudentHandlingException("Length of Email should be between 4 to 10");
//		}
//		
//		if(!s.getEmail().contains("@"))
//		{
//			throw new StudentHandlingException("Invalid Email.Email Must contain @");
//		}
//	}
//	
//	public static void validateCourse(Student s) throws StudentHandlingException
//	{
//		boolean isValid = false;
//		for(String c: course)
//		{
//			if(s.getCourse().equals(c))
//			{
//				isValid = true;
//			}
//		}
//		if(!isValid)
//		{
//			throw new StudentHandlingException("Course Name is Invalid.");
//		}
//	}

}
