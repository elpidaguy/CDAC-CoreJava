package utils;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

import com.app.core.Employee;

public class CollectionUtils 
{

	
	public static List<Employee> populateList()
	{
			List<Employee> emplist=new ArrayList<>();
			emplist=Arrays.asList(
					new Employee(101,"Kaustubh",10000,LocalDate.parse("2019-08-07")),
					new Employee(102,"Gurdeep",8000,LocalDate.parse("2018-09-09")),
					new Employee(103,"Rahul",3500,LocalDate.parse("2019-10-10")),
					new Employee(104,"Jason",6400,LocalDate.parse("2015-09-06")),
					new Employee(105,"Todd",9800,LocalDate.parse("2019-05-05")),
					new Employee(106,"John",11900,LocalDate.parse("2018-06-04")),
					new Employee(107,"Linda",23000,LocalDate.parse("2017-04-03"))
					);
			return emplist;
	}
	
	public synchronized static List<Employee> getSortedList(String sortedby,List<Employee> emplist)
	{
		Collections.sort(emplist,new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				// TODO Auto-generated method stub
				
					if(sortedby.equals("Name"))
				        return  ((String)o1.getName()).compareTo((String)o2.getName());
					else if (sortedby.equals("Salary"))
						return ((Double)o1.getSalary()).compareTo((Double)o2.getSalary());
					else
						return o1.getHireDate().compareTo(o2.getHireDate());
						
				
			
			}
		});
		return emplist;
	}
	
	
	
}
