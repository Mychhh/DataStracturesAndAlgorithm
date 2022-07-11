package Finals;

public interface BSCpE 
{
	default void regularSchedBSCpE() 
	{
		System.out.println("                           Regular Schedule");
		System.out.println("-MONDAY/WEDNESDAY-");
		System.out.println(" 08:30 - 10:00 AM = Euthenics1 \n" + " 10:00 11:30 AM = Mathematics in Modern World\n"
                         + " 01:00 - 02:30 PM = National Service Training Program1\n");
		System.out.println("-TUESDAY/THURSDAY-");
		System.out.println(" 08:30 - 10:00 AM = Understanding the Self\n" + " 10:00 - 11:30 AM = College Calculus(Differential)\n"
                         + " 01:00 - 02:30 PM = Physical Education1\n");
		System.out.println("    -FRIDAY-");
		System.out.println(" 08:00 - 10:00 AM = Chemistry for Engineers\n" 
                         + " 01:00 - 04:00 PM = Computer Engineering as a Discipline\n");
		System.out.println("    -SATURDAY-");
		System.out.println(" 08:00 - 10:00 AM = Programming Logic and Design\n" 
                         + " 01:00 - 04:00 PM = The Contemporary World\n");	
	}
	default void AmSchedBSCpE() 
	{
		System.out.println("                           AM Schedule");
		System.out.println("-MONDAY/WEDNESDAY-");
		System.out.println(" 07:00 - 08:30 AM = Euthenics1\n" + " 08:30 - 09:00 AM = Mathematics in Modern World\n"
                         + " 10:00 - 11:30 AM = National Service Training Program1\n");
		System.out.println("-TUESDAY/THURSDAY-");
		System.out.println(" 07:00 - 08:30 AM = Understanding the Self\n" + " 08:30 - 09:00 AM = College Calculus(Differential)\n"
                         + " 10:00 - 11:30 AM = Physical Education1\n");
		System.out.println("    -FRIDAY-");
		System.out.println(" 07:00 - 09:00 AM = Chemistry for Engineers\n" 
		                 + " 09:30 - 11:30 AM = Computer Engineering as a Discipline\n");
		System.out.println("    -SATURDAY-");
		System.out.println(" 07:00 - 09:00 AM = Programming Logic and Design\n" 
                         + " 09:30 - 11:30 AM = The Contemporary World\n");
	}
	default void PMSchedBSCpE() 
	{
		System.out.println("                          PM Schedule   ");
		System.out.println("-MONDAY/WEDNESDAY-");
		System.out.println(" 01:00 - 02:30 PM = Euthenics1\n" + " 02:30 - 03:30 PM = Mathematics in Modern World\n"
                         + " 04:00 - 05:30 PM = National Service Training Program1\n");
		System.out.println("-TUESDAY/THURSDAY-");
		System.out.println(" 01:00 - 02:30 PM = Understanding the Self\n" + " 02:30 - 03:30 PM = College Calculus(Differential)\n"
                         + " 04:00 - 05:30 PM = Physical Education1\n");
		System.out.println("-FRIDAY-");
		System.out.println(" 01:00 - 03:00 PM = Chemistry for Engineers\n"
                         + " 03:30 - 05:30 PM = Computer Engineering as a Discipline\n");
		System.out.println("    -SATURDAY-");
		System.out.println(" 01:00 - 03:00 PM = Programming Logic and Design\n" 
                         + " 03:30 - 05:30 PM = The Contemporary World\n");
	}
	
}
