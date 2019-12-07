package tester;

import shapes.Circle;
import shapes.Rectangle;
import shapes.Shape;

public class TestShapes2 {

	public static void main(String[] args) {
		Shape[] shapes = { new Circle(10, 20, 6), new Rectangle(20, 40, 13, 7) };
		//display detail n area from for-each loop
		for(Shape s : shapes)
	  	 System.out.println(s+" area "+s.area());
		
	}

}
