package linkedList;
//DLLNode->DoublyLinkedList->MainDoubLy
public class DLLNode {
	
	private Integer value;	
	private DLLNode prev;   //nodes attributes prev|value|next
	private DLLNode next;
	
  //DLL Constructor           Parameter
	public DLLNode(Integer value, DLLNode prev, DLLNode next) {
		this.setValue(value);
		this.setPrev(prev);
		this.setNext(next);
	}
    //value getters and setters
	public Integer getValue() {
		return value;
	}

	public void setValue(Integer value) {
		this.value = value;
	}
	//prev getters and setters
	public DLLNode getPrev() {
		return prev;
	}

	public void setPrev(DLLNode prev) {
		this.prev = prev;
	}
	//next getters and setters
	public DLLNode getNext() {
		return next;
	}

	public void setNext(DLLNode next) {
		this.next = next;
	}



}
