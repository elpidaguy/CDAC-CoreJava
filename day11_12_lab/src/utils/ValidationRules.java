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

import com.app.core.CustomerType;

import cust_excs.CustomerHandlingException;

public class ValidationRules {

	public static int minLengh, maxLenght;
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
		maxLenght = 20;
	}
	
	public static String validateEmail(String s) throws CustomerHandlingException
	{
		
		if(s.length() < minLengh || s.length() > maxLenght)
		{
			throw new CustomerHandlingException("Length of Email should be between 4 to 20");
		}
		
		if(!s.contains("@"))
		{
			throw new CustomerHandlingException("Invalid Email.Email Must contain @");
		}
		
		return s;
	}
	
	public static CustomerType validateCustomerType(String s) throws CustomerHandlingException  {
		
		CustomerType c=null ;
		try
		{
		 c = CustomerType.valueOf(s.toUpperCase());
		}
		catch(Exception e)
		{
			throw new CustomerHandlingException("Customer Type is invalid");
		}
		
		return c;
		
	}
	
	public static Date validateDate(String s) throws CustomerHandlingException,ParseException
	{
		Date d = sdf.parse(s);
		
		if (d.after(endDate))
			throw new CustomerHandlingException("Invalid date.Can't be after 31 Dec 2019.");
		return d;
	}

}
