package midterm;
//I import all this method one by one for me to know what my program will do
import java.util.Queue;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Scanner;

public class BookTitles {

	public static void main(String[] args) {
		
		Scanner s =  new Scanner(System.in);
		//last in, first out		
		Stack<String> bookTitles = new Stack<String>();
		//first in, first out
		Queue<String> orderOfBooks =  new LinkedList<String>();
		
		System.out.println("Enter four Book titles");
//the user will enter a book titles while the condition of for loop is met		
		for(int i = 0; i < 4; i++) 
		{
			System.out.print("Book " + (i+1) + ": " );
			String title = s.nextLine();
			bookTitles.push(title);
		}
		System.out.println("New Order of Books");

//the orderOfBooks will add the item at the top of bookTitles before it remove 		
		while(bookTitles.size() != 0) 
		{
			orderOfBooks.offer(bookTitles.peek());
			//peek will look to the item at top of the stack
			//offer will add item in to the queue
			bookTitles.pop();
			//pop will remove an item from the top of the stack
		}
		System.out.println(orderOfBooks);

	}
/*
Book 1: Ibong Adarna
Book 2: Florante at Laura
Book 3: Ilustrado
Book 4: ABNKKBSNPLAko?!
*/
	
}
