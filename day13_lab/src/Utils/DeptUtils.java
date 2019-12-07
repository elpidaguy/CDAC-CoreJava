package Utils;

import static java.time.LocalDate.parse;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

import threadDepartment.Department;
import threadDepartment.Employee;

public class DeptUtils {
	
	public static HashMap<String, Department> populateDept()
	{
		HashMap<String, Department> newMap = new HashMap<>();
		List<Employee> empList = Arrays.asList(new Employee("1", "jason", "25000", parse("2019-06-23")),
				new Employee("2", "john", "15000", parse("2018-07-24")),
				new Employee("3", "jane", "10000", parse("2017-02-06")));
		
		newMap.put("1", new Department("1", "HR",empList));
		
		
		List<Employee> empList2 = Arrays.asList(new Employee("4", "tom", "20000", parse("2015-06-12")),
				new Employee("5", "rob", "15000", parse("2018-12-24")),
				new Employee("6", "bob", "25000", parse("2017-08-06")));
		
		newMap.put("2", new Department("2", "Sales",empList2));
		
		
		List<Employee> empList3 = Arrays.asList(new Employee("7", "clint", "10000", parse("2012-06-23")),
				new Employee("8", "steve", "45000", parse("2013-05-03")),
				new Employee("9", "mike", "25000", parse("2019-11-06")));

		newMap.put("3", new Department("3", "RND", empList3));
		
		return newMap;
	}
	
	public static List<Employee> sortBySalary(List<Employee> listEmp)
	{
		
		Collections.sort(listEmp, new Comparator<Employee>() {

			@Override
			public int compare(Employee e1, Employee e2) {
				return e1.getSal().compareTo(e2.getSal());
			}
			
		});
		
		return listEmp;
		
	}

}
