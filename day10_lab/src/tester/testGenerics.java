package tester;

import java.util.ArrayList;
import java.util.Date;

public class testGenerics {

	public static void main(String[] args) {
		
		ArrayList l1 = new ArrayList();
		
		l1.add(100);
		l1.add("abc");
		l1.add(new Date());
		
		System.out.println(l1);
		
		//String s = l1.get(0);		//cannot auto downcast from object to string
		String s = (String)l1.get(1);	//explicit conversion is required - possibility of getting ClassCastException
		
		System.out.println(s);
	}

}
