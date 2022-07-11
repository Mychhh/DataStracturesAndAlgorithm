package first_sem;

import java.util.LinkedList;

public class GameCharacter {

	public static void main(String[] args) {
		
		LinkedList <String> charater = new LinkedList<>();
		charater.add("Rastaman (Ama ng Universe)");
		charater.add("Ghost");
		charater.add("Price");     //Game Character
		charater.add("Soap");
		charater.add("Krueger");
		
				
		for(int i = 0; i < charater.size(); i++) {
		System.out.println("Character #" + (i + 1) + " " + charater.get(i));
		}

	}

}
