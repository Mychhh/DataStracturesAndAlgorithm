package PreFinal;

import java.util.PriorityQueue;
import java.util.Scanner;

public class Greeting {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		
//Chariz, Rastaman, Bogart, Sepini		
//this will be stored all the nicknames in a natural order
		PriorityQueue<String> nicknames = new PriorityQueue<>();
		
		System.out.println("Enter the nicknames of 4 of your classmates");

//in this for loop the system will ask the user to enter the nicknames of its classmates
//after the user entered the nickname of its classmates
//it will be added in to the PriorityQueues
		for(int i = 0; i < 4; i++) 
		{
			String names = s.nextLine();
			nicknames.add(names);
		}
		
		System.out.println("\nPress H to say Hi to each one of them ");

//the loop will continue as long as the PriorityQueues is not empty		
		while(!nicknames.isEmpty())
		{	
			System.out.print("-> ");
			String H = s.nextLine();

//if the user entered a letter H 
//the minimum element value in a PriorityQueue will be printout and remove
			if(H.equals("H")) 
			{
				System.out.println("Hi " + nicknames.poll());
//after the value in a PriorityQueue is removed
//the system will check if the the size of the PriorityQueue is empty 				
				if(nicknames.isEmpty()) 
				{
					System.out.println("Done saying Hi.");
				}
				
			}
//if the user entered an invalid answer the system will just loop			
			else 
			{
				System.out.println("Invalid answer, Try again!");
			}
			
		}
		
	}

}
