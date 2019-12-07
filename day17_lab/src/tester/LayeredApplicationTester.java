package tester;

import java.util.Scanner;

public class LayeredApplicationTester {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)) {
			boolean exit = false;
			
			while(!exit)
			{
				System.out.println("---------OPTION--------");
				System.out.println("1.Display Details as per Course");
				System.out.println("2.Admit Student");
				System.out.println("3.Display Topper");
				System.out.println("4.Cancel Admission");
				System.out.println("5.Update Marks");
				System.out.println("Enter Choice: ");
				
				switch (sc.nextInt()) {
				case 1:
					
					break;

				default:
					break;
				}
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
