package tester;

import static Utils.DeptUtils.populateDept;

import java.util.HashMap;

import Utils.TaskRunner;
import threadDepartment.Department;
public class EmpTester {

	public static void main(String[] args) {
		HashMap<String, Department> empMap = new HashMap<>();
		
		empMap = populateDept();
		
		TaskRunner tr1 = new TaskRunner(empMap,"1");
		Thread t1 = new Thread(tr1);
		
		TaskRunner tr2 = new TaskRunner(empMap,"2");
		Thread t2 = new Thread(tr2);
		
		TaskRunner tr3 = new TaskRunner(empMap,"3");
		Thread t3 = new Thread(tr3);
		
		t1.start();
		t2.start();
		t3.start();
		
	}

}
