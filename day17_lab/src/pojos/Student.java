package pojos;

import java.time.LocalDate;

public class Student {
	
	private int id,marks,course_id;
	private String name,email,address;
	LocalDate dob;
	public Student(int id, int marks, int course_id, String name, String email, String address, LocalDate dob) {
		super();
		this.id = id;
		this.marks = marks;
		this.course_id = course_id;
		this.name = name;
		this.email = email;
		this.address = address;
		this.dob = dob;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", marks=" + marks + ", course_id=" + course_id + ", name=" + name + ", email="
				+ email + ", address=" + address + ", dob=" + dob + "]";
	}
	public int getId() {
		return id;
	}
	public int getMarks() {
		return marks;
	}
	public int getCourse_id() {
		return course_id;
	}
	public String getName() {
		return name;
	}
	public String getEmail() {
		return email;
	}
	public String getAddress() {
		return address;
	}
	public LocalDate getDob() {
		return dob;
	}
	
	

}
