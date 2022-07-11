package Finals;

public interface BSHM 
{
	
//static method cannot be overridden unlike default method
//but you can only access static method in interface by calling its interface name	
	
    default void regularSchedBHSM() 
	{
		System.out.println("                           Regular Schedule");
		System.out.println("-MONDAY/WEDNESDAY-");
		System.out.println(" 08:30 - 10:00 AM = Euthenics1 \n" + " 10:00 - 11:30 AM = Mathematics in Modern World\n"
                         + " 01:00 - 02:30 PM = National Service Training Program1\n");
		System.out.println("-TUESDAY/THURSDAY-");
		System.out.println(" 08:30 - 10:00 AM = Understanding the Self\n" + " 10:00 - 11:30 AM = Readings in Philippine History\n"
                         + " 01:00 - 02:30 PM = Physical Education1\n");
		System.out.println("    -FRIDAY-");
		System.out.println(" 08:00 - 10:00 AM = Macro Perspective of Tourism and Hospitality\n" 
                         + " 01:00 - 04:00 PM = Risk Management as Applied to Safety, Security, and Sanitation\n");
	}
    default void AmSchedBHSM() 
	{
		System.out.println("                           AM Schedule");
		System.out.println("-MONDAY/WEDNESDAY-");
		System.out.println(" 07:00 - 08:30 AM = Euthenics1\n" + " 08:30 - 09:00 AM = Mathematics in Modern World\n"
                         + " 10:00 - 11:30 AM = National Service Training Program1\n");
		System.out.println("-TUESDAY/THURSDAY-");
		System.out.println(" 07:00 - 08:30 AM = Understanding the Self\n" + " 08:30 - 09:00 AM = Readings in Philippine History\n"
                         + " 10:00 - 11:30 AM = Physical Education1\n");
		System.out.println("    -FRIDAY-");
		System.out.println(" 07:00 - 09:00 AM = Macro Perspective of Tourism and Hospitality\n" 
		                 + " 09:30 - 11:30 AM = Risk Management as Applied to Safety, Security, and Sanitation\n");
	}
    default void PMSchedBHSM() 
	{
		System.out.println("                          PM Schedule   ");
		System.out.println("-MONDAY/WEDNESDAY-");
		System.out.println(" 01:00 - 02:30 PM = Euthenics1\n" + " 02:30 - 03:30 PM = Mathematics in Modern World\n"
                         + " 04:00 - 05:30 PM = National Service Training Program1\n");
		System.out.println("-TUESDAY/THURSDAY-");
		System.out.println(" 01:00 - 02:30 PM = Understanding the Self\n" + " 02:30 - 03:30 PM = Readings in Philippine History\n"
                         + " 04:00 - 05:30 PM = Physical Education1\n");
		System.out.println("-FRIDAY-");
		System.out.println(" 01:00 - 03:00 PM = Macro Perspective of Tourism and Hospitality"
                         + " 03:30 - 05:30 PM = Risk Management as Applied to Safety, Security, and Sanitation\n");
	}
	
}
