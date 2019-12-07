/*
2. Solve this.
Create java application for the following.
Create Student class in a package "com.cdac.core" 
2.1 Every student must have   --- id(int) --if possible system generated(clue : use static id counter), name (String), email(String), age(int), gpa (double)

2.2 Add suitable parameterized constructor.
Don't accept gpa in constructor , since it has to be computed.

2.3 Add a method getDetails to  fetch complete student details
(ret type -- String)

2.4  Add computeGPA method in Student class
Accept 3 scores for quiz , test & assignments
GPA should be computed on 20 % of quiz score, 50% of test score & 30% of assignment score.

3 Write a TestStudents class in "com.tester" package

Accept how many students to enroll in the class ,  from user.

 Accept student details(w/o gpa) , using loop.
Accept student scores & compute GPAs , using loop
Display name of student having highest GPA.
*/

package com.cdac.core;

public class Student{

    private static int count = 1;
    private int id;
    private String name,email;
    private int age;
    private double gpa;

    public Student(String name, String email, int age)
    {
        id = count++;
        this.name = name;
        this.email = email;
        this.age = age;
    }

    public String getDetails()
    {
        return "ID: "+id+" ,Name: "+name+" ,Email: "+email+" ,Age: "+age+" ,GPA: "+gpa;
    }

    public void computeGPA(double quiz, double test, double assign)
    {
        gpa = ((quiz*0.2)+(test*0.5)+(assign*0.3));
    }

    public double getGpa()
    {
        return gpa;
    }
}