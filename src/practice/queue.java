package practice;

import java.util.LinkedList;
import java.util.Queue;

//First in, First out
public class queue {

	public static void main(String[] args) {

/*
The methods  
add(), remove(), and element()
perform the same tasks but perform an exception
*/
		Queue<String> q = new LinkedList<>();
		Queue<String> qopy = new LinkedList<>();
		
		//adds an item into the queue
		q.offer("Michael");
		q.offer("Miguel");
		q.offer("Mark");
		q.offer("Merry Joy");
		
		System.out.println(q);
		
		//retrieves the head of the queue 
		System.out.println("\nThe eldest child is " + q.peek());
		
		//removes the head of the queue
		System.out.println(q.poll() + " was the first child among them who graduated in High School");
		
		//check whether the Queue is empty or not
		System.out.println("\nNow, they are all graduated in High School : " + q.isEmpty());
		
//other methods that can be used for both Queue and Stack		
		//Return size
		System.out.println(q.size() + " of them are stil needed to graduate in High School");
		
		//this will delete all elements inside a queue
		q.clear();
		System.out.println(q.isEmpty());
		
		//The clone and reverse are needed to code manually


	}

}
