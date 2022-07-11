package arrayList;

import java.util.ArrayList;

public class arrayList_Sample {

	public static void main(String[] args) {
		
		ArrayList<Integer> value = new ArrayList<Integer>();
		
		value.add(1);
		value.add(50);
		value.add(100);
		
		System.out.println(value);
		
		for(Integer myValue : value) 
		{
			System.out.println(myValue);
		}

	}

}
