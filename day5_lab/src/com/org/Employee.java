package com.org;

public abstract class Employee {

	protected int id;
	static int count;
	private String Name, email, deptId;
	protected double basic;
	
	static {
		count = 100;
	}
	
	public Employee(String name, String email, String deptId, double basic) {
		id = count++;
		Name = name;
		this.email = email;
		this.deptId = deptId;
		this.basic = basic;
	}
	
	@Override
	public String toString()
	{
		System.out.println("Employee Details Are: ");
		return "ID: "+id+", Name: "+Name+", Email: "+email+", DeptId: "+deptId+", Basic Sal: "+basic;
	}
	
	public abstract double computeNetSalary();
	
	public double getBasic()
	{
		return basic;
	}
	
	public void setBasic(double inc)
	{
		basic = basic+inc;
	}

}
