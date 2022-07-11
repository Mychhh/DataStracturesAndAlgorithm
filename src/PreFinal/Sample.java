package PreFinal;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Set;

public class Sample {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
//Empty map 
		Map<String, String> students = new HashMap<>();

//for loop that will ask the user to enter student number and names		
		for(int i = 0; i < 3; i++) 
		{
			System.out.print("Enter student number " + (i+1) + " : " );
			String sNumber = s.nextLine();
			System.out.print("Enter first name " + (i+1) + "     : " );	
			String sName = s.nextLine();
					
			students.put(sNumber, sName);
		}
				
		System.out.println("\nStudent List\n");
			
//for each loop that will iterate the students maps using Map entry		
		for(Map.Entry studentsKV : students.entrySet()) 
		{
			System.out.println(studentsKV.getKey() + " : " + studentsKV.getValue());
		}	
//Map entry is an interface to retrieve entries

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
