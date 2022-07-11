package FinalsTP;
//simple chatbot for grocery store
import java.util.Scanner;

public class Main 
{

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		Concerns concern = new Concerns();
		
//this variable will be used for outer loop
		boolean run = true;
		
//outer loop
		while(run) 
		{
	
//this variable will be used to inner loop		
			boolean run1 = true;
			
			concern.showGreet();
			System.out.print("->");
			int concernNumber = s.nextInt();
			System.out.println();
			
			if(concernNumber == 3) 
			{
				concern.showCustomerRequirements();
//break key word is used to stop terminate the loop as soon as the condition is met				
//inner loop				
				while(run1) 
				{
					concern.doYouhaveAnyQuestion();
					System.out.print("->");
					int anyQuestion = s.nextInt();
					System.out.println();
//if the customer
					if(anyQuestion == 1) 
					{
						run1 = false;
						break;
					}
					else if(anyQuestion == 2) 
					{
						System.out.println("Okay, have a good day!");
						run1 = false;
						run  = false;	
						break;
					}
					else
					{
						System.out.println("You entered invalid answer! Try Again.\n");
						continue;	
					} 
				}
//PS: The algorithm I used in this condition is similar to the other condition. 
//    That is why I did not put comments on them, because it is self explanatory				
			}
			
			else if(concernNumber == 2) 
			{
				concern.showOperatingHours();
				
				while(run1) 
				{
					concern.doYouhaveAnyQuestion();
					System.out.print("->");
					int anyQuestion = s.nextInt();
					System.out.println();
					
					if(anyQuestion == 1) 
					{
						run1 = false;
						break;
					}
					else if(anyQuestion == 2) 
					{
						System.out.println("Okay, have a good day!");
						run1 = false;
						run  = false;	
						break;
					}
					else
					{
						System.out.println("You entered invalid answer! Try Again.");
						continue;	
					} 
				}
				
			}
			
			else if(concernNumber == 1) 
			{
				concern.showFees();
				while(run1) 
				{
					concern.doYouhaveAnyQuestion();
					System.out.print("->");
					int anyQuestion = s.nextInt();
					System.out.println();
					
					if(anyQuestion == 1) 
					{
						run1 = false;
						break;
					}
					else if(anyQuestion == 2) 
					{
						System.out.println("Okay, have a good day!");
						run1 = false;
						run  = false;	
						break;
					}
					else
					{
						System.out.println("You entered invalid answer! Try Again.");
						continue;	
					} 
				}
			}
			
			else 
			{
				System.out.println("You entered invalid answer! Try Again.");
				System.out.println("------------------------------------------------------\n");
				continue;
			}
		}
		
	}

}
