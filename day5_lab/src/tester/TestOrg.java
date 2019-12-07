package tester;

import java.util.Scanner;
import com.org.*;

public class TestOrg {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Total Employee No: ");
		int empCount = sc.nextInt();
		Employee org[] = new Employee[empCount];
		
		boolean flag = false;
		
		while(!flag)
		{
			System.out.println("Organisation");
			System.out.println("1.Hire Manager");
			System.out.println("2.Hire Worker");
			System.out.println("3.Display All");
			System.out.println("4.Search Employee");
			System.out.println("5.Salary Increament");
			System.out.println("6.Get Salary - instanceOf");
			System.out.println("7.Exit");
			System.out.println("Enter your Choice: ");
			
			switch(sc.nextInt())
			{
			case 1:{
				System.out.println("Please Enter Manager Details: ");
				EmpUtil.addEmployee(new Manager(sc.next(),sc.next(),sc.next(),sc.nextDouble(),sc.nextDouble()), org);
			}break;
			case 2:{
				System.out.println("Please Enter Worker Details: ");
				EmpUtil.addEmployee(new Worker(sc.next(),sc.next(),sc.next(),sc.nextDouble(),sc.nextDouble(),sc.nextDouble()), org);
			}break;
			case 3:{
				for(Employee e: org)
				{
					System.out.println(e.toString());
					System.out.println("");
					System.out.println("Net Salary is: " + e.computeNetSalary());
					System.out.println("");
				}
			}break;
			case 4:{
				System.out.println("Enter Employee ID");
				Employee e = EmpUtil.searchEmployee(sc.nextInt(),org);
				if(e == null)
				{
					System.out.println("Invalid EMP ID");
				}
				else
				{
					System.out.println(e.toString());
				}
			}break;
			case 5:{
				System.out.println("Enter Employee ID");
				Employee e = EmpUtil.searchEmployee(sc.nextInt(),org);
				if(e == null)
				{
					System.out.println("Invalid EMP ID");
				}
				else
				{
					System.out.println("Enter Inc Amount: ");
					e.setBasic(sc.nextInt());
					System.out.println("Updated: ");
					System.out.println(e.toString());
//					System.out.println("Incremented Sal for emp"+ e.id +" is: "+ e.getBasic());
				}
			}break;
			case 6:{
					System.out.println("Enter Employee ID");
					for(Employee e: org)
					{
						if(e instanceof Manager)
						{
							System.out.println(e.computeNetSalary());
						}
						else
						{
							System.out.println(e.computeNetSalary());
						}
					}
			}break;
			case 7:{
				flag = true;
			}break;
			}
		}
		
		sc.close();

	}

}
