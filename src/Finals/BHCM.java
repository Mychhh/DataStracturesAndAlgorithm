package Finals;

public interface BHCM 
{
	default void regularSchedBHCM() 
	{
		System.out.println("                           Regular Schedule");
		System.out.println("-MONDAY/WEDNESDAY-");
		System.out.println(" 08:30 - 10:00 AM = English I\n" + " 01:00 - 02:30 PM = Principles of Management\n");
		System.out.println("-TUESDAY/THURSDAY-");
		System.out.println(" 08:30 - 10:00 AM = Anatomy and Physiology\n" + " 10:00 - 11:30 AM = Principles of Healthcare\n");
		System.out.println("    -FRIDAY-");
		System.out.println(" 08:00 - 11:00 AM = Computer and IT Applications\n");
	}
	default void AmSchedBHCM() 
	{
		System.out.println("                           AM Schedule");
		System.out.println("-MONDAY/WEDNESDAY-");
		System.out.println(" 07:00 - 08:30 AM = English I\n" + " 09:00 - 10:30 AM = Principles of Management\n");
		System.out.println("-TUESDAY/THURSDAY-");
		System.out.println(" 07:00 - 08:30 AM = Anatomy and Physiology\n" + " 09:00 - 10:30 AM = Principles of Healthcare\n");
		System.out.println("    -FRIDAY-");
		System.out.println(" 08:00 - 11:00 AM = Computer and IT Applications\n");
	}
	default void PMSchedBHCM() 
	{
		System.out.println("                          PM Schedule   ");
		System.out.println("-MONDAY/WEDNESDAY-");
		System.out.println(" 01:00 - 02:30 PM = Euthenics1\n" + " 02:30 - 04:00 PM = Mathematics in Modern World\n");
		System.out.println("-TUESDAY/THURSDAY-");
		System.out.println(" 01:00 - 02:30 PM = Anatomy and Physiology\n" + " 02:30 - 03:30 PM = Principles of Healthcare\n");
		System.out.println("-FRIDAY-");
		System.out.println(" 01:00 - 04:00 PM = Computer and IT Applications");
	}
	
}
