package com.org;

public class EmpUtil {

public static int counter;
	

	public static void addEmployee(Employee E,Employee org[])
	{
		if(counter < org.length)
			org[counter++]=E;
		else
			System.out.println("No Vacancies as of now!");
	}
	
	public static Employee searchEmployee(int eid, Employee org[])
	{
		Employee found = null;
		if(org.length > 0)
		{
			for(Employee e: org)
			{
				if(eid == e.id)
				{
					found = e;
					break;
				}
			}
		}
		return found;
	}

}