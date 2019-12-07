package threadDepartment;

import java.util.List;

public class Department {
	private String deptid, deptname;
	private List<Employee> emps;
	
	public Department(String deptid, String deptname, List<Employee> emps) {
		super();
		this.deptid = deptid;
		this.deptname = deptname;
		this.emps = emps;
	}

	@Override
	public String toString() {
		return "Department [deptid=" + deptid + ", deptname=" + deptname + ", emps=" + emps + "]";
	}

	public List<Employee> getEmps() {
		return emps;
	}
	
}
