package shapes;

public class Rectangle extends Shape {
	private int width, height;

	public Rectangle(int x, int y, int width, int h) {
		super(x, y);
		this.width = width;
		height = h;
	}

	@Override
	public String toString() {
		System.out.println("Rect : toString");
		return "Rect " + super.toString() + " width=" + width + " height=" + height;
	}

	@Override
	public double area() {
		System.out.println("Rect : area");
		return width*height;
	}

}
