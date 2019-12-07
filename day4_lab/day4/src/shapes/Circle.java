package shapes;
import static java.lang.Math.PI;

public class Circle extends Shape{
	private int radius;

	public Circle(int x, int y, int radius) {
		super(x, y);//invoking Shape's constr
		this.radius = radius;
	}
	//override area
	@Override
	public double area()
	{
		System.out.println("in circle:area");
		return PI*radius*radius;
	}
	//tostring --to ret COMPLETE details of circle
	@Override
	public String toString()
	{
		System.out.println("circle : toString");
		return "Circle "+super.toString()+" radius="+radius;
	}
	
}
