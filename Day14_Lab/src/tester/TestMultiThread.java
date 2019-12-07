package tester;

import static utils.CollectionUtils.populateList;

import java.util.List;
import static utils.CollectionUtils.*;

import com.app.core.Employee;

import handlers.EmpHandler;
public class TestMultiThread {

	public static void main(String[] args) throws InterruptedException {
		
		List<Employee> emplist=populateList();
		
		EmpHandler byName=new EmpHandler(emplist, "ByNameSort.txt","Name");
		Thread t1=new Thread(byName,"byNameSortThread");
		
		EmpHandler bySalary=new EmpHandler(emplist, "BySalarySort.txt","Salary");
		Thread t2=new Thread(bySalary,"bySalarySortThread");
		
		EmpHandler byDate=new EmpHandler(emplist, "ByDateSort.txt","Date");
		Thread t3=new Thread(byDate,"byDateSortThread");
		
		System.out.println("Writing data to file");
		t1.start();
		t2.start();
		t3.start();
	
		t1.join();
		t2.join();
		t3.join();
		System.out.println("Writing done");
		
		

	}

}
