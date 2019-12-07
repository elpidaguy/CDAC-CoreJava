
package fruits;

public class FruitUtils {
	//add static counter
	public static int counter;
	/*
	 *  Add static method , addFruit to add a fruit to
	 * the Fruit Basket.
	 * 
	 */
	public static void addFruit(Fruit f,Fruit[] basket)
	{
		if(counter < basket.length)
			basket[counter++]=f;
		else
			System.out.println("Basket Full!!!!");
	}
	
	public static void removeFruit(int index,Fruit[] basket)
	{
		if(counter == 0)
		{
			System.out.println("Basket is empty");
		}
		else
		{
			basket[index-1] = null;
			counter--;
		}
	}

}
