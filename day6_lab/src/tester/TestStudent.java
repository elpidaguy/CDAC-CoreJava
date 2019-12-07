//
//1.2 Create a Tester class with main.
//Create Scanner , within  try-with-resources.
//
//Create hard-coded sample data with Student[] , with 3 students, with prns 
//dac-001,dac-002,dac-003 (Don't create it with dynamic array!!!)
//
//Prompt user , to accept new student's  details.
//If student with same prn already exists , throw custom exception(showing err mesg : dup prn!!!!) , otherwise--add the details in array & give success message.
//Display array contents , using for-each.

package tester;

import java.util.Scanner;

import com.app.core.Student;
import static com.app.core.StudentUtil.*;

public class TestStudent {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in))
		{
			System.out.println("Enter Strength of Colg: ");
			Student colg[] = new Student[sc.nextInt()];
				
			colg[0] = new Student("dac-001","Kaustubh","kaj@gmail.com","100","DAC");
			colg[1] = new Student("dac-002","Gurdeeep","kaur@gmail.com","101","DAC");
			colg[2] = new Student("dac-003","Ram","ram@gmail.com","220020","DAC");
			
			boolean flag = false;
			
			while(!flag)
			{
				System.out.println("COLLEGE");
				System.out.println("1.Add Student");
				System.out.println("2.Display All Students");
				System.out.println("3.NA");
				System.out.println("4.Exit");
				System.out.println("Please Enter Choice: ");
				
				switch(sc.nextInt())
				{
					case 1:{
						System.out.println("Enter PRN, Name, Email, Marks, Course");
						try {
							addStudent(new Student(sc.next(),sc.next(),sc.next(),sc.next(),sc.next()),colg);
						}catch (Exception e) {
							System.out.println(e.getMessage());
						}
					}break;
					case 2:{
						System.out.println("Student Data is: ");
						display(colg);
					}break;
					case 3:{}break;
					case 4:{
						flag = true;
					}break;
				}
			}
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}

}
