package tester;

import java.util.Scanner;
import fruits.*;
//import static -- to access all static members directly 
import static fruits.FruitUtils.*;
import static java.lang.System.*;

public class CreateFruitBasket {

	public static void main(String[] args) {
		// sc
		Scanner sc = new Scanner(in);
		out.println("Enter size of basket");
		// create suitable array to hold ANY type of a fruit
		Fruit[] fruits = new Fruit[sc.nextInt()];
		boolean exit = false;
		while (!exit) {
			out.println("1 : Apple \n 2:Orange \n 3: Cherry 4 : Display n Exit \n 5.ermove fruit");
			System.out.println("Enter option");
			switch (sc.nextInt()) {
			case 1: // add apple
				Apple a = new Apple();
				addFruit(a, fruits);
				break;
			case 2: // add orange
				addFruit(new Orange(), fruits);
				break;
			case 3: // add cherry
				addFruit(new Cherry(), fruits);
				break;
			case 4: //display taste of all fruits in d basket
				for(Fruit f : fruits)//f=fruits[0]
					f.taste();
				//exit = true;
				break;
			case 5:
				System.out.println("Enter Fruit Number: ");
				removeFruit(sc.nextInt(), fruits);
				break;
			}
		}

	}

}
