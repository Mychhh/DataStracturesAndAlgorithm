package Finals;

public interface BSTM 
{
	default void regularSchedBSTM() 
	{
		System.out.println("                           Regular Schedule");
		System.out.println("-MONDAY/WEDNESDAY-");
		System.out.println(" 08:30 - 10:00 AM = Euthenics1 \n" + " 10:00 - 11:30 AM = Mathematics in Modern World\n"
                         + " 01:00 - 02:30 PM = Macro Perspective of Tourism and Hospitality\n");
		System.out.println("-TUESDAY/THURSDAY-");
		System.out.println(" 08:30 - 10:00 AM = Understanding the Self\n" + " 10:00 - 11:30 AM = Readings in Philippine History\n"
                         + " 01:00 - 02:30 PM = Risk Management as Applied to Safe, Security, and Sanitation\n");
		System.out.println("    -FRIDAY-");
		System.out.println(" 08:00 - 10:00 AM = Physical Education 1\n" 
                         + " 01:00 - 04:00 PM = National Service Training Program 1\n");
	}
	default void AmSchedBSTM() 
	{
		System.out.println("                           AM Schedule");
		System.out.println("-MONDAY/WEDNESDAY-");
		System.out.println(" 07:00 - 08:30 AM = Euthenics1\n" + " 08:30 - 09:00 AM = Mathematics in Modern World\n"
                         + " 10:00 - 11:30 AM = Macro Perspective of Tourism and Hospitality\n");
		System.out.println("-TUESDAY/THURSDAY-");
		System.out.println(" 07:00 - 08:30 AM = Understanding the Self\n" + " 08:30 - 09:00 AM = Readings in Philippine History\n"
                         + " 10:00 - 11:30 AM = Risk Management as Applied to Safe, Security, and Sanitation\n");
		System.out.println("    -FRIDAY-");
		System.out.println(" 07:00 - 09:00 AM = Physical Education 1\n" 
		                 + " 09:30 - 11:30 AM = National Service Training Program 1\n");
	}
	default void PMSchedBSTM() 
	{
		System.out.println("                          PM Schedule   ");
		System.out.println("-MONDAY/WEDNESDAY-");
		System.out.println(" 01:00 - 02:30 PM = Euthenics1\n" + " 02:30 - 03:30 PM = Mathematics in Modern World\n"
                         + " 04:00 - 05:30 PM = Macro Perspective of Tourism and Hospitality\n");
		System.out.println("-TUESDAY/THURSDAY-");
		System.out.println(" 01:00 - 02:30 PM = Understanding the Self\n" + " 02:30 - 03:30 PM = Readings in Philippine History\n"
                         + " 04:00 - 05:30 PM = Risk Management as Applied to Safe, Security, and Sanitation\n");
		System.out.println("-FRIDAY-");
		System.out.println(" 01:00 - 03:00 PM = Physical Education 1"
                         + " 03:30 - 05:30 PM = National Service Training Program 1\n");
	}
	
}
