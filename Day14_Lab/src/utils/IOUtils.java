package utils;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.List;

import com.app.core.Employee;

public class IOUtils
{

	
	public static void writeDataToFile(List<Employee> emplist,String filename)
	{
		try( PrintWriter out=new PrintWriter(new FileWriter(filename)))
		{
			for(Employee e: emplist)
			{
				out.println(e);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
