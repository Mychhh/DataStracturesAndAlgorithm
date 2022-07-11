package Finals;
//machine learning algorithm
//this is supervised machine learning
import java.util.Scanner;


public class Main 
{

	public static void main(String[] args) 
	{
		//first year first sem
		InfoAndRequirements IAR = new InfoAndRequirements(); 
		
		Scanner s = new Scanner(System.in);
		
		boolean run = true; //this variable will be used to identify if we will stop or continue the specific program

//while loop
		while(run) 
		{	
//this will just identify if the students are interested in limited face to face class			
			System.out.println("Hello Student, this is Online Apllication for upcoming Limited Face-to-Face Class");
			System.out.println("Press 'X' to continue\n");
			
			System.out.print("->");
			char x1 = s.next().charAt(0);
			s.nextLine();
			
//switch statement that will identify if the student press the right letter	
			switch(x1) 
			{
			case 'x':
				run = false;
				break;
			case 'X':
				run = false;
				break;
			default:
				continue;
			}
			
//the student will be asked if he has all the requirements  
			System.out.println("\nDo you have all of these?\n" + "Yes/No\n ");
			IAR.requiremets();
			
			System.out.print("->");
			String req = s.nextLine();

//if the user has all the requirements
			if(req.equalsIgnoreCase("YES")) 
			{	
				System.out.println("\nGreat\n");

//now because the run is equals to false for the meantime
//we will use it as an argument	while run == false			
				while(run == false) 
				{	
					System.out.println("Do you agree to the terms and Condition?\n" +"Agree/Disagree\n");
					
					System.out.print("->");
					String DisAgree = s.nextLine();

//if the user agree to the terms the run variable will be true for the meantime to stop the loop					
					if(DisAgree.equalsIgnoreCase("Agree")) 
					{
						System.out.println("Check the available Course in Limited Face-to-Face Class");
						IAR.availableCourse();
						run =  true;
//now, because the run variable is equals to true we will use it again for the meantime to the while loop argument						
						while(run == true) 
						{
							System.out.println("Is your course are available in the Limited Face-to-Face class?\n"+"Yes/No\n");
							
							System.out.print("->");
							String isCourseAvailable = s.nextLine();
							
//if the students course is available the system will ask them on what course they are belong
							if(isCourseAvailable.equalsIgnoreCase("Yes")) 
							{
								run = false;
//now, because the run variable is equals to false we will use it again for the meantime to the while loop argument
								while( run == false ) 
								{
									System.out.println("\nWhat Course are you belong?\n"+"Please choose among these (BSHM),(BHCM),(BSTM),(BSCpE)\n");
									
									System.out.print("->");
									String whatCourse = s.nextLine();
									
//The comments in this BSHM is the same on the other course						
									if(whatCourse.equalsIgnoreCase("BSHM")) 
									{
										run = true;
//now, because the run variable is equals to true we will use it again for the meantime to the while loop argument						
										while(run == true) 
										{
//the system will just simply ask if the student is working student or not											
											System.out.println("Are you working student?"+"Yes/No\n");
											
											System.out.print("->");
											String isWorkingStudent = s.nextLine();
//if the student is working student											
											if(isWorkingStudent.equalsIgnoreCase("Yes")) 
											{
//they will be asked whether AM or PM schedule they want												
												run = false;
												while(run == false) 
												{
													System.out.println("Choose your schedule\n" + "AM or PM\n");
													
													System.out.print("->");
													String AmOrPm = s.nextLine();
													
													if(AmOrPm.equalsIgnoreCase("AM")) 
													{
														run = true;
														IAR.AmSchedBHSM();
														break;
													}
													else if(AmOrPm.equalsIgnoreCase("PM"))
													{
														IAR.PMSchedBHSM();
														break;
													}
													else 
													{
														System.out.println("Invalid Answer\n");
													    continue;
													}	
												}
												break;
											}
//if the student is not working student, the system will give its regular schedule											
											else if(isWorkingStudent.equalsIgnoreCase("No")) 
											{
												run = false;
												System.out.println("This is your Regular Schedule");
												IAR.regularSchedBHSM();
												break;
											}
//if the student has invalid answer											
											else 
											{
												System.out.println("Invalid Answer\n");
											    continue;
											}					
										}
										
										break;
									}
									
									else if(whatCourse.equalsIgnoreCase("BHCM")) 
									{
										run = true;
										
										while(run == true) 
										{
											System.out.println("Are you working student?"+"Yes/No\n");
											
											System.out.print("->");
											String isWorkingStudent = s.nextLine();
											
											if(isWorkingStudent.equalsIgnoreCase("Yes")) 
											{
												run = false;
												while(run == false) 
												{
													System.out.println("Choose your schedule\n" + "AM or PM\n");
													
													System.out.print("->");
													String AmOrPm = s.nextLine();
													
													if(AmOrPm.equalsIgnoreCase("AM")) 
													{
														run = true;
														IAR.AmSchedBHCM();
														break;
													}
													else if(AmOrPm.equalsIgnoreCase("PM"))
													{
														IAR.PMSchedBHCM();
														break;
													}
													else 
													{
														System.out.println("Invalid Answer\n");
													    continue;
													}	
												}
												break;
											}
											else if(isWorkingStudent.equalsIgnoreCase("No")) 
											{
												run = false;
												System.out.println("This is your Regular Schedule");
												IAR.regularSchedBHCM();
												break;
											}
											else 
											{
												System.out.println("Invalid Answer\n");
											    continue;
											}					
										}
										
										break;
									}
									
									else if(whatCourse.equalsIgnoreCase("BSTM")) 
									{
										run = true;
										
										while(run == true) 
										{
											System.out.println("Are you working student?"+"Yes/No\n");
											
											System.out.print("->");
											String isWorkingStudent = s.nextLine();
											
											if(isWorkingStudent.equalsIgnoreCase("Yes")) 
											{
												run = false;
												while(run == false) 
												{
													System.out.println("Choose your schedule\n" + "AM or PM\n");
													
													System.out.print("->");
													String AmOrPm = s.nextLine();
													
													if(AmOrPm.equalsIgnoreCase("AM")) 
													{
														run = true;
														IAR.AmSchedBSTM();
														break;
													}
													else if(AmOrPm.equalsIgnoreCase("PM"))
													{
														IAR.PMSchedBSTM();
														break;
													}
													else 
													{
														System.out.println("Invalid Answer\n");
													    continue;
													}	
												}
												break;
											}
											else if(isWorkingStudent.equalsIgnoreCase("No")) 
											{
												run = false;
												System.out.println("This is your Regular Schedule");
												IAR.regularSchedBSTM();
												break;
											}
											else 
											{
												System.out.println("Invalid Answer\n");
											    continue;
											}					
										}
										
										break;
									}
									
									else if(whatCourse.equalsIgnoreCase("BSCpE")) 
									{
										run = true;
										
										while(run == true) 
										{
											System.out.println("Are you working student?"+"Yes/No\n");
											
											System.out.print("->");
											String isWorkingStudent = s.nextLine();
											
											if(isWorkingStudent.equalsIgnoreCase("Yes")) 
											{
												run = false;
												while(run == false) 
												{
													System.out.println("Choose your schedule\n" + "AM or PM\n");
													
													System.out.print("->");
													String AmOrPm = s.nextLine();
													
													if(AmOrPm.equalsIgnoreCase("AM")) 
													{
														run = true;
														IAR.AmSchedBSCpE();
														break;
													}
													else if(AmOrPm.equalsIgnoreCase("PM"))
													{
														IAR.PMSchedBSCpE();
														break;
													}
													else 
													{
														System.out.println("Invalid Answer\n");
													    continue;
													}	
												}
												break;
											}
											else if(isWorkingStudent.equalsIgnoreCase("No")) 
											{
												run = false;
												System.out.println("This is your Regular Schedule");
												IAR.regularSchedBSCpE();
												break;
											}
											else 
											{
												System.out.println("Invalid Answer\n");
											    continue;
											}					
										}
										
										break;
									}
									
									else 
									{
										System.out.println("Invalid Answer");
									    continue; 
									}
								}
																
								break;
							}
							else if(isCourseAvailable.equalsIgnoreCase("No")) 
							{
								System.out.println("Continue to Online Class");
								run = false;
								break;
							}
							else
							{
								System.out.println("\nInvalid Answer\n");
								continue;
							}
						}
						break;
					}
//if the user agree to the terms the run will be true for the meantime to stop the loop
//and the program will stop because the student did not agree to terms					
					else if(DisAgree.equalsIgnoreCase("DisAgree")) 
					{
						System.out.println("Continue to Online Class");
						run = true;
						break;
					}else 
					{
						System.out.println("\nInvalid Answer\n");
						continue;
					}	
				
				}
//the run variable will be false again because the system are already done for its specific purpose			
				run = false;
			}
//if the user is incomplete for the requirements			
			else if(req.equalsIgnoreCase("NO"))
			{
				System.out.println("\nPlease complete first all the requirements\n");
				run = true;
				//this will be true to check again if the user has met the requirements 				
			}

//if the user entered an invalid letter			
			else 
			{
				System.out.println("\nInvalid Answer\n");
				run = true;	
				//this will be true to check again if the user has met the requirements
				//because user mistakenly entered an invalid letter
			}
			
			
		}
		
		
	}

}
