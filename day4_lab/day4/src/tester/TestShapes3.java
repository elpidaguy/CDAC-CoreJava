package tester;
import shapes.Shape;
import static shapes.ShapeFactory.generateShape;

public class TestShapes3 {

	public static void main(String[] args) {
		for(int i=0;i<10;i++) {
			Shape s=generateShape();
			System.out.println(s+" area ="+s.area());
		}

	}

}
