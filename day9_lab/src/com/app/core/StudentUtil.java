package com.app.core;

import java.util.ArrayList;

import cust_excs.StudentHandlingException;

public class StudentUtil {
	
	public static void addStudent(Student s, ArrayList<Student> colg) throws StudentHandlingException
	{

			for(Student stud: colg)
			{
				if(stud != null && stud.equals(s))
				{
					throw new StudentHandlingException("PRN ALREADY EXISTS");
				}
			}
			
			colg.add(s);
	}
	
	public static void display(ArrayList<Student> colg)
	{
		for(Student stud: colg)
		{
			System.out.println(stud);
		}
	}


}
