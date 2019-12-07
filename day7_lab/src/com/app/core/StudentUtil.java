package com.app.core;

import cust_excs.StudentHandlingException;

public class StudentUtil {

	static int counter;
	
	static {
		counter = 3;
	}
	
	public static void addStudent(Student s, Student[] colg) throws StudentHandlingException
	{
		
		if(counter < colg.length)
		{
			for(Student stud: colg)
			{
				if(stud != null && stud.equals(s))
				{
					throw new StudentHandlingException("PRN ALREADY EXISTS");
				}
			}
			
		//	validateName(s);
			//validateEmail(s);
			//validateCourse(s);
			
			colg[counter++] = s;
		}
		else
		{
			throw new StudentHandlingException("No more Seats Available");
			//System.out.println("No more Seats Available");
		}
	}
	
	public static void display(Student[] colg)
	{
		for(Student stud: colg)
		{
			System.out.println(stud);
		}
	}


}
