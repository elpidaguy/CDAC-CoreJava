package com.intrfce.computable;

public class ComputableUtil {
	
	public static int counter;
		
		public static void addShape(Point p, Point shapes[])
		{
			if(counter < shapes.length)
				shapes[counter++]=p;
			else
				System.out.println("Array is full!");
		}
		
		public static void display(Point shapes[])
		{
			for(Point sh: shapes)
			{
				if(sh instanceof Circle)
				{
					System.out.println(sh);
					System.out.println("Area of Circle is: "+ ((Circle)sh).calcArea()); //down casting kr liya hai
					System.out.println("Perimiter of Circle is: "+((Circle) sh).calcPeri());
					((Circle) sh).drawArc();
				}
				else
				{
					System.out.println(sh);
					System.out.println("Area of Rectangle is: "+((Rectangle)sh).calcArea());	//phirse kiya
					System.out.println("Perimiter of Rectangle is: "+((Rectangle) sh).calcPeri());
					((Rectangle) sh).diagonals();
				}
			}
		}
	}
