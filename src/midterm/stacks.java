package midterm;

import java.util.Stack;

public class stacks {
	
	static void pushpush(Stack st, int a) {
		st.push(new Integer (a));
		System.out.println("push (" + a +")");
		System.out.println("stack : "+st);
		System.out.println();
	}
	
	static void poppop(Stack st) {
		System.out.print("pop -> ");
		Integer a = (Integer) st.pop();
		System.out.println(a);
		System.out.println("stack: " + st);
	}

	public static void main(String[] args) {
		Stack st = new Stack();
		System.out.println("stack : " + st);
		pushpush(st, 50);
		pushpush(st, 80);
		pushpush(st, 99);
		poppop(st);
		poppop(st);
		poppop(st);
		System.out.println("Stack is empty : " + st.isEmpty());
	}

}
