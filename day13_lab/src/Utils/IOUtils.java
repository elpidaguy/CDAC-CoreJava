package Utils;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.List;

import threadDepartment.Employee;

public class IOUtils {
	
	public static void writeFile(List<Employee> listEmp, String fname)
	{
		try(PrintWriter os = new PrintWriter(new FileWriter(fname))) {
			
			for(Employee e : listEmp)
				os.println(e);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
