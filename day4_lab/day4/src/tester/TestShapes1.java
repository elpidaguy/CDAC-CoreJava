package tester;

import shapes.Shape;

public class TestShapes1 {

	public static void main(String[] args) {
		Shape s=new Shape(10, 20);
		System.out.println(s);//javac will look in Shape for toString
		Object ref=s;
		System.out.println(ref);//javac will look in Object class for toString

	}

}
