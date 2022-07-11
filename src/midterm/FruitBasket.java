package midterm;
import java.util.Scanner;
import java.util.Stack;

public class FruitBasket {

	public static void main(String[] args) {
	
	Scanner s =  new Scanner(System.in);
	
	Stack<String> basket = new Stack<String>();
	
	System.out.println("Please enter a number of fruit(s) that you like to catch [1-4]");
	int numOfFruits = s.nextInt();
	
	for(int i = 0; i < numOfFruits; i++)
  //the system will ask the user on what and how many fruits he wants to pick up based on its number that they have entered 
	{
		System.out.println("                 Choose a fruit to catch");
		System.out.println("A for Apple,  O for Orange, M for Mango, G for Guava");
		char fruits = s.next().charAt(0);
		
		//the fruits that will be stored in a basket is depends on its choices
		  if(fruits == 'A')
		   {
			  basket.push("Apple");
		   }
		   else if(fruits == 'O')
		   {
			  basket.push("Orange");
		   }
		   else if(fruits == 'M')
		   {
			  basket.push("Mango");
		   }
		   else if(fruits == 'G')
		   {
			  basket.push("Guava");
		   }	              
	}
	
	System.out.println("This are your choosen fruit(s) my majesty " + basket);
	
	while (numOfFruits > 0) 
	{
		System.out.println("Please press 'E' to eat your food my Majesty");
		char eat = s.next().charAt(0);
		
		if(eat == 'E')//if the user press the letter 'E' 
		{
			basket.pop();//it will removes an item from the top
			
			if(basket.size() == 0)//if the basket is empty the program will stop
			{
				System.out.println("No More Fruits, My Majesty");
				break;
			}
			else //if the user still has a fruit to eat, it will show its remaining fruits
			{
				System.out.println("Your remaining fruits my Majesty " + basket);
				numOfFruits --;
			}
		}
		else //if the user entered an invalid letter, the system will ask again the user to eat their food(s)
		{
			System.out.println("Invalid Input, try again!");
		}
		
	}
	
	
	
		
	}
}
