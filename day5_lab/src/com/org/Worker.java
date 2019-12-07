package com.org;

public class Worker extends Employee {

	private double hoursWorked,hourlyRate;
	public Worker(String name, String email, String deptId, double basic,double hoursWorked, double hourlyRate) {
		super(name, email, deptId, basic);
		this.hourlyRate = hourlyRate;
		this.hoursWorked = hoursWorked;
	}
	
	@Override
	public String toString()
	{
		return super.toString()+", Hourly Rate: "+hourlyRate+", Hours Worked: "+hoursWorked;
	}
	
	@Override
	public double computeNetSalary()
	{
		System.out.println("Net salary for Worker is: ");
		return super.basic+(hoursWorked*hourlyRate);
	}
	
	public double getHourlyRate()
	{
		return hourlyRate;
	}
	
	public double getBasic()
	{
		return super.basic;
	}
	
	public void setBasic(double inc)
	{
		super.setBasic(inc);
	}

}
