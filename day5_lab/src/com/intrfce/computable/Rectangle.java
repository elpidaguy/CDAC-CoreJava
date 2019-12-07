package com.intrfce.computable;

public class Rectangle extends Point implements Computable {
	
	private double width,height;

	public Rectangle(double x, double y, double width, double height) {
		super(x,y);
		this.width = width;
		this.height = height;
	}

	@Override
	public double calcArea() {
		return width*height;
	}

	@Override
	public double calcPeri() {
		return 2*(height+width);
	}

	@Override
	public String toString()
	{
		return "X: "+x+", Y: "+y+", Width: "+width+", Height: "+height;
	}
	
	public void diagonals()
	{
	 System.out.println("diagonals of rectangle are equal in lenth");
	}
}