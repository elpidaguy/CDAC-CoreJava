package Utils;

import static Utils.DeptUtils.sortBySalary;
import static Utils.IOUtils.writeFile;

import java.util.HashMap;

import threadDepartment.Department;

public class TaskRunner implements Runnable {

	private HashMap<String, Department> empMap;
	private String id;
	public TaskRunner(HashMap<String, Department> empMap, String id) {
		this.empMap = empMap;
		this.id = id;
	}
	
	@Override
	public void run() {
		writeFile(sortBySalary(empMap.get(id).getEmps()), id);
	}
	
	

}
