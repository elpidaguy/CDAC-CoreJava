package com.intrfce.computable;

public class Circle extends Point implements Computable {

	private double radius;
	
	public Circle(double x, double y, double radius) {
		super(x,y);
		this.radius = radius;
	}

	@Override
	public double calcArea() {
		return pi*(radius*radius);
	}

	@Override
	public double calcPeri() {
		return 2*pi*radius;
	}
	
	@Override
	public String toString()
	{
		return "X: "+x+", Y: "+y+", Radius: "+radius;
	}
	
	public void drawArc()
	{ 
		System.out.println("Drawing an Arc");
	}

}
