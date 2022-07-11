package linkedList;

import java.util.LinkedList;

public class SinglyLinkedList {
//This is singly linked List
	public static void main(String[] args) {
		
		LinkedList <Integer>list = new LinkedList<>();
		
		list.add(1);
		list.add(2);
		list.add(3);      //we have a total of 6 elements 
		list.add(4);
		list.addFirst(0);
		list.addLast(5);

		
		System.out.println("The List are : " + list);//printing all values in the list
		
		System.out.println();
		
		//Iterating SinglyLinkedList using for loop statements
		for (int i = 0; i < list.size(); i++) {
			System.out.println("Index # " + i + " = " + list.get(i));
		}
		
		


	}

}
