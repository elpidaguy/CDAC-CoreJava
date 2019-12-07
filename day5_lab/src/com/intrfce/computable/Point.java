package com.intrfce.computable;

public class Point {

	protected double x,y;
	
	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	@Override
	public String toString()
	{
		return "X: "+x+", Y: "+y;
	}

}