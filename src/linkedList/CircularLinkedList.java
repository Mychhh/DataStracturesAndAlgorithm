package linkedList;

import java.util.LinkedList;

public class CircularLinkedList {
	
	public static void main(String[] args) {
	
		LinkedList <String>Names = new LinkedList<>();
		
		Names.addFirst("Michael");
		Names.add("Del");
		Names.add(2, "Rosario");
		Names.add(3, "Krazy");
		Names.add(4, "Pabaya");
		
		Names.remove(3);
		
		System.out.println(Names);
	}
}
