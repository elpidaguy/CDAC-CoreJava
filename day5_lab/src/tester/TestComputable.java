package tester;

import java.util.Scanner;
import static com.intrfce.computable.ComputableUtil.*;
import com.intrfce.computable.*;

public class TestComputable {

	public static void main(String[] args) {
		boolean flag = false;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number of Shapes you want to add: ");
		
		Point shapes[] = new Point[sc.nextInt()];
		
		while(!flag)
		{
		        System.out.println("Menu");
		        System.out.println("1.Add Circle");
		        System.out.println("2.Add Rectangle");
		        System.out.println("3.Display Area and Perimeter");
		        System.out.println("4.Exit");
		        System.out.println("Enter your choice: ");
		        
		        switch(sc.nextInt())
		        {
		        case 1:{
		        	System.out.println("Enter x,y,radius");
		        	addShape(new Circle(sc.nextDouble(),sc.nextDouble(),sc.nextDouble()), shapes );
		        }break;
		        case 2:{
		        	System.out.println("Enter x,y,width, height");
		        	addShape(new Rectangle(sc.nextDouble(),sc.nextDouble(),sc.nextDouble(),sc.nextDouble()), shapes );
		        }break;
		        case 3:{
		        	System.out.println("display area and perimeter");
		        	display(shapes);
		        }break;
		        case 4:{
		        	flag = true;
		        }break;
		        }
			
		}
		
		sc.close();
	}

}
