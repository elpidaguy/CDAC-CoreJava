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

import com.app.core.Student;

import cust_excs.StudentHandlingException;

public class ValidationRules {

	public static int minLengh, maxLenght;
	public static String course[] = {"DAC","DMC","DBDA","DAI"};
	
	static
	{
		minLengh = 4;
		maxLenght = 10;
	}
	
	public static void validateName(Student s) throws StudentHandlingException
	{
		if(s.getName().length() < 4 || s.getName().length() > 10)
		{
			throw new StudentHandlingException("Length of Name should be between 4 to 10");
		}
			
	}
	
	public static void validateEmail(Student s) throws StudentHandlingException
	{
		
		if(s.getEmail().length() < 4 || s.getEmail().length() > 10)
		{
			throw new StudentHandlingException("Length of Email should be between 4 to 10");
		}
		
		if(!s.getEmail().contains("@"))
		{
			throw new StudentHandlingException("Invalid Email.Email Must contain @");
		}
	}
	
	public static void validateCourse(Student s) throws StudentHandlingException
	{
		boolean isValid = false;
		for(String c: course)
		{
			if(s.getCourse().equals(c))
			{
				isValid = true;
			}
		}
		if(!isValid)
		{
			throw new StudentHandlingException("Course Name is Invalid.");
		}
	}

}
