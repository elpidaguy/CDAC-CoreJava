/**
 * 
 */
package com.org;

/**
 * @author dac
 *
 */
public class Manager extends Employee {

	private double perfBonus;
	public Manager(String name, String email, String deptId, double basic, double perfBonus) {
		super(name, email, deptId, basic);
		this.perfBonus = perfBonus;
	}
	
	@Override
	public String toString()
	{
		return super.toString()+", Perf Bonus: "+perfBonus;
	}
	
	@Override
	public double computeNetSalary()
	{
		System.out.println("Net salary for Manager is: ");
		return super.basic+perfBonus;
	}
	
	public double getPerfBonus()
	{
		return perfBonus;
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
