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

public class Student implements Comparable<Student>{

	private CourseTypes course;
	private String prn,name,email,marks;
	private Date dob;
	
	public Student(String prn, String name, String email, String marks, CourseTypes course, Date dob) {
		
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
	
	public String getMarks() {
		return marks;
	}

	public CourseTypes getCourse()
	{
		return course;
	}
	
	public String getPrn()
	{
		return prn;
	}
	
	public Date getDate()
	{
		return dob;
	}
	
	public void setMarks(String newMarks)
	{
		marks = newMarks;
	}

	@Override
	public String toString() {
		return "Student [prn=" + prn + ", name=" + name + ", email=" + email + ", marks=" + marks + ", course=" + course
				+ ", dob=" + dob + "]";
	}

	@Override
	public int compareTo(Student o) {
		return this.prn.compareTo(o.prn);
	}
	
//	@Override
//	public boolean equals(Object o)
//	{
//		if(o instanceof Student)
//		{
//			return prn.equals(((Student)o).prn);
//		}
//		return false;
//	}

}
