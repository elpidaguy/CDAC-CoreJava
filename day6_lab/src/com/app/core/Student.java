/*
 * It has --prn(String),name,email,marks,course
Provide constructor & toString
Student's identity is : prn no
(Meaning 2 students are same iff their prn nos are same)
Override equals method correctly.
 */
package com.app.core;

public class Student {

	String prn,name,email,marks,course;
	
	public Student(String prn, String name, String email, String marks, String course) {
		
		this.prn = prn;
		this.name = name;
		this.email = email;
		this.marks = marks;
		this.course = course;	
	}
	
	public String getName()
	{
		return name;
	}
	
	public String getEmail()
	{
		return email;
	}
	
	public String getCourse()
	{
		return course;
	}
	
	@Override
	public String toString()
	{
		return "PRN: "+prn+", Name: "+name+", Email: "+email+", Marks: "+marks+", Course: "+course;
	}
	
	@Override
	public boolean equals(Object o)
	{
		if(o instanceof Student)
		{
			return prn.equals(((Student)o).prn);
		}
		return false;
	}

}
