/*
3 Write a TestStudents class in "com.tester" package

Accept how many students to enroll in the class ,  from user.

 Accept student details(w/o gpa) , using loop.
Accept student scores & compute GPAs , using loop
Display name of student having highest GPA.
*/

package com.tester;

import java.util.Scanner;

import com.cdac.core.*;

class TestStudent
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int studNo;
        System.out.println("Enter Number of Student: ");
        studNo = sc.nextInt();

        Student stud[] = new Student[studNo];

        for(int i=0;i<stud.length;i++)
        {
            System.out.println("Enter Student Name, Email, Age:");
            stud[i] = new Student(sc.next(), sc.next(),sc.nextInt());
            System.out.println("Enter Quiz , Test, Assignment Score for GPA: ");
            stud[i].computeGPA(sc.nextDouble(),sc.nextDouble(),sc.nextDouble());
        }

        for(Student s: stud)
        {
            System.out.println(s.getDetails());
        }

        Student studMax=null;
        double maxGPA = 0;
        for(Student s: stud)
        {
            if(s.getGpa() > maxGPA)
            {
                maxGPA = s.getGpa();
                studMax = s;
            }
        }

        System.out.println(studMax.getDetails());

        

    }
}