package shapes;

import java.util.Random;

public class ShapeFactory {
	private static Random r;
	static {
		r = new Random();
	}

	// add a static method to return random shape
	public static Shape generateShape() {
		int randomNum = r.nextInt(2);
		switch (randomNum) {
		case 0:
			return new Circle(1, 2, 10);

		case 1:
			return new Rectangle(20, 45, 12, 10);
		default:
			return null;
		}
	}
}
