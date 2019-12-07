/*
 * It has --prn(String),name,email,marks,course
Provide constructor & toString
Student's identity is : prn no
(Meaning 2 students are same iff their prn nos are same)
Override equals method correctly.
 */
package com.app.core;

import static utils.ValidationRules.*;
import java.util.Date;

public class Student {

	private String prn,name,email,marks,course;
	private Date dob;
	
	public Student(String prn, String name, String email, String marks, String course, Date dob) {
		
		this.prn = prn;
		this.name = name;
		this.email = email;
		this.marks = marks;
		this.course = course;
		this.dob = dob;
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
	public String toString() {
		return "Student [prn=" + prn + ", name=" + name + ", email=" + email + ", marks=" + marks + ", course=" + course
				+ ", dob=" + sdf.format(dob) + "]";
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
