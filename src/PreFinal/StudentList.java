package PreFinal;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class StudentList 
{

	public static void main(String[] args) 
	{
/*
 2018-0004 Mark
 2018-0017 Nika
 2018-0134 Mairo
 
 2018-0046 Marco		
 */
		
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
		
		students.remove("2018-0134");//removes the third entry

//The system will ask my student number and names		
	    System.out.print("\nEnter your student number : ");
		String mySNumber = s.nextLine();
		System.out.print("Enter your first name     : " );	
		String mySName = s.nextLine();
		
		students.put(mySNumber, mySName);
		
		System.out.println("\nStudent List\n");
		
		for(Map.Entry studentsKV : students.entrySet()) 
		{
			System.out.println(studentsKV.getKey() + " : " + studentsKV.getValue());
		}
//Map entry is an interface to retrieve entries
	
	}

}
