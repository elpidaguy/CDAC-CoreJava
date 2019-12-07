package threadDepartment;

import java.time.LocalDate;

public class Employee {
	
	private String eid,ename,sal;
	private LocalDate joinDate;

	public Employee(String eid,String ename,String sal,LocalDate joinDate) {
		this.eid = eid;
		this.ename = ename;
		this.sal = sal;
		this.joinDate = joinDate;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", sal=" + sal + ", deptid=" + "joinDate=" + joinDate + "]";
	}

	public String getSal() {
		return sal;
	}

}
