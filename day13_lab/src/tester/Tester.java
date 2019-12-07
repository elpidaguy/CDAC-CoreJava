package tester;

import java.util.Scanner;

import threadOddEven.Even;
import threadOddEven.EvenRunnable;
import threadOddEven.Odd;
import threadOddEven.OddRunnable;

public class Tester {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Enter Start and End for checking Even Odd: ");
		try(Scanner sc = new Scanner(System.in))
		{
			int start = sc.nextInt();
			int end = sc.nextInt();
			Even e = new Even(start, end, "Even");
			Odd o = new Odd(start, end, "Odd");
			
			EvenRunnable e1 = new EvenRunnable(start, end);
			OddRunnable o1 = new OddRunnable(start, end);
			
			Thread t1 = new Thread(e1,"EvenRunnable");
			Thread t2 = new Thread(o1,"OddRunnable");
			
			t1.start();
			t2.start();
			
			while(true)
			{
				Thread.sleep(500);
				System.out.println("Main is running");
			}
		}
	}

}
