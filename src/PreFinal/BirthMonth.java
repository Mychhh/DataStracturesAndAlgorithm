package PreFinal;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class BirthMonth 
{

	public static void main(String[] args) 
	{
//Scanner		
		Scanner s = new Scanner(System.in);

//3 empty sets				
		Set group1 = new HashSet();
		Set group2 = new HashSet();
		Set self   = new HashSet();

//for loop that will be used to get the first three values of your classmates birth month that will be stored to group1 hashset
		for (int i = 0; i < 3; i++) 
		{
			System.out.print("Enter birth month " + (i+1) + " : ");
			String bmg1 = s.nextLine();			
			group1.add(bmg1);          //this will add the first three input birth month of the user
		}

//for loop that will be used to get the remaining three values of your classmates birth month that will be stored to group2 hashset		
		for (int i = 0; i < 3; i++) 
		{
			System.out.print("Enter birth month " + (i+1) + " : ");
			String bmg2 = s.nextLine();
			group2.add(bmg2);          //this will add the remaining three input birth month of the user
		}

//Display values each group		
		System.out.println("\nGroup 1 " + group1);
		System.out.println("Group 2 " + group2);

//The system will ask to enter your birth month, which will be stored to self hashset		
		System.out.print("\nEnter your birth month : ");
		String bms = s.nextLine();
		self.add(bms);
		System.out.println();//Just a space
		
		Set Union        = new HashSet(group1);
		Set Intersection = new HashSet(group1);
		Set Difference   = new HashSet(group1);
		
		Union.addAll(group2);	               //adds all the elements 
		Intersection.retainAll(group2);        //retain only the same element/s 
		Difference.removeAll(group2);          //removes all the not unique elements to another set
		
		System.out.println("Union        : " + Union);
		System.out.println("Intersection : " + Intersection);
		System.out.println("Difference   : " + Difference);
		
//check if I have the same birth month
		Set selfToCheck        = new HashSet(self);
		selfToCheck.retainAll(Union);
		
		if(selfToCheck.isEmpty()) 
		{
			System.out.println("\nYou dont have the same birth month with your classmates, you are genuine!");
		}
		else 
		{
			System.out.println("\nYou have the same birthmonth with your classmates");
		}

	}

}
