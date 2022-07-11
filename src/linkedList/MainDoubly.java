package linkedList;

public class MainDoubly {

	public static void main(String[] args) {
		
		DoublyLinkedList dll = new DoublyLinkedList();
		
		dll.addFirst(2);
		dll.addFirst(1);
		dll.addFirst(0);
		dll.addLast(3);
        
		dll.printlist();
	}

}
