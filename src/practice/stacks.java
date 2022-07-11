package practice;

import java.util.Stack;

//First in, Last out
public class stacks {
	
	public static void main (String[] args) {
		
		Stack<String> games = new Stack<String>();
		
		//adds an item from the top of the stack
		games.push("Call of duty");
		games.push("Guitar Hero");       
		games.push("Super Monker Ball");
		
		//looks an item from the top of the stack
		System.out.println("The top of the stock is : " + games.peek());
		
		//removes an item from the top of the stack
		System.out.println("I will get this game    : " + games.pop());
		
		System.out.println("The remaing games are   : " + games);
		
		//check whether the stack is empty or not
		System.out.println("\nThe remaining games are empty : " + games.isEmpty());

	}

}
