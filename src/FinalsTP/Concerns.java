package FinalsTP;

public class Concerns 
{
	
	void showGreet()
	{
		System.out.println(
				"Hello Customer, I am Chael’s Grocery Store chat bot. \n"
		      + "Our supervisor is currently unavailable right now. \n"
		      + "But I can help you with some of your concern. \n"
		      + "------------------------------------------------------\n"
		      + "Input specific number for your concern: \n"
		      + "1 - Delivery \n"
		      + "2 - Operating Hours \n"
		      + "3 - Customer Requirements \n"
				);
	}
	
	void showOperatingHours()
	{
		System.out.println("------------------------------------------------------");
		System.out.println("    -OPERATING HOURS-");
		System.out.println("WEEKDAYS: OPEN 24 HOURS");
		System.out.println("WEEKENDS: 9:00 AM - 9:00 PM");
	}
	
	void showCustomerRequirements()
	{
		System.out.println("------------------------------------------------------");
		System.out.println("Hello our dearest Customer, we are now in the time of pandemic. \n"
		    	          +"That is why we are requiring you to wear \n"
		    	          + "(facemask and faceshield), \n"
		    	          +"in order to protect our staff and also your own health.");
	}
	
	void showStatus()
	{
		System.out.println("------------------------------------------------------");
	  //System.out.println("Processing");
	  //System.out.println("Packing");
		System.out.println("Out for delivery");	
	  //PS. I will print out for delivery for sample only because
	}
	
	void showFees() 
	{
		System.out.println("------------------------------------------------------");
		System.out.println("This is our delivery rate \n");
		System.out.println("Within Balagtas  : 50 pesos ");
		System.out.println("Outside Balagtas :+10 pesos per KM \n");
		
		System.out.println("If you want to order online, this is the link for our online store\n");
		System.out.println("https://www.chaelonlinestore.com.ph");
	}
	
	void doYouhaveAnyQuestion() 
	{
		System.out.println("\n------------------------------------------------------");
		System.out.println("Do you have any question?");
		System.out.println("Input 1 - Yes, I have - \n"
				         + "Input 2 - None, I'm good -");
	}
	
}
