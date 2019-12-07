package tester;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class test1 {

	public static void main(String[] args) {
		Integer[] ints = {4,5,12,45,67,890};
		
		List<Integer> l2  = Arrays.asList(ints);	//List of fixed similar elements

		ArrayList<Integer> l1 = new ArrayList<Integer>();	//Array List of variable elements

		for(int i:l2)
			System.out.println("List: "+i);
		
	//	l2.add(23); //error - size of List<T> is fixed
		l2.set(0, 21);	//no error - not changing the size
		
		System.out.println(l2.getClass().getName()); //returns fully qualified name of class - java.util.Arrays$ArrayList - array{ArrayList}
		System.out.println(ints.getClass().getName());
		
		for(Integer i : ints)
			l1.add(i);
		
		for(int i:l2)
			System.out.println("ArrayList: "+i);
	}

}
