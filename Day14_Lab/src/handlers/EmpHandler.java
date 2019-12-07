
package handlers;

import java.util.List;

import com.app.core.Employee;
import static utils.IOUtils.*;
import static utils.CollectionUtils.*;

public class EmpHandler implements Runnable
{
	List<Employee> emplist;
	String filename;
	String sortedBy;
	
	public EmpHandler(List<Employee> emplist, String filename,String sortedBy) {
		super();
		this.emplist = emplist;
		this.filename = filename;
		this.sortedBy=sortedBy;
	}

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+"started");
		synchronized (emplist) {
			writeDataToFile(getSortedList(sortedBy, emplist), filename);
		}
		System.out.println(Thread.currentThread().getName()+"exited");
	}

}
