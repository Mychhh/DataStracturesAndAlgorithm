package midterm;

import java.util.Queue;
import java.util.LinkedList;
import java.util.Scanner;

public class MovieTime {

	public static void main(String[] args) {
		
		Scanner s =  new Scanner(System.in);
		
		Queue<String> movies = new LinkedList<String>();
		Queue<String> snacks = new LinkedList<String>();

//i used for loop to store the value of the user		
		for(int i = 0; i < 3; i++) 
		{
			System.out.print("Enter Movie " + (i+1) + " of 3 : ");
			String movie = s.nextLine();
			movies.offer(movie);
		}
		for(int i = 0; i < 3; i++) 
		{
			System.out.print("Enter Snack " + (i+1) + " of 3 : ");
			String snack = s.nextLine();
			snacks.offer(snack);
		}
		
		System.out.println("Movies to watch are  : deque" + movies);
		System.out.println("Snacks available are : deque" + snacks);
		
//Do while loop	
		do 
		{
			System.out.println("Press S each time you finish a snack.");
			String finish = s.nextLine();
			
//I use switch statement because for me this is efficient to use in this program
			switch(finish)
			{
			case "S":
				snacks.poll();
//if statements *if the snacks is empty it will show a message and stopped the program				
				if(snacks.size() == 0) 
				{
					System.out.println("No more Snacks");
				    break;
				}
				System.out.println( "deque" + snacks);
				break;
				
			default: // if the user entered an invalid letter				
				System.out.println("Invalid");
				continue;
			}
			
			
			
		}
		while(snacks.size() > 0);

	}

}
