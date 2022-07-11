package gameAlgorithm;
import java.util.Scanner;
public class Main {
//Main Class
	public static void main(String[] args) {
	 
		Scanner s = new Scanner(System.in);
		
	  //Instantiation of those subclasses	
		Hero   assassin = new Assasin ();
		Hero   fighter  = new Fighter ();
		Hero   marksman = new Marksman();
		Enemies soldier = new Soldier();
		Enemies boss    = new Boss();
	
	  //Declaration of values that i will be needed in While loop
		boolean x = true;
		String Haya = "Hayabusa";
		String Leo  = "Leomord";
		String Mosk ="Moskov";
		
	 //Hero Attributes
		int assassinAttack  = assassin.Dmg;// 2
		int assassinHP      = assassin.HP; // 4 Assassin
		int fighterAttack   = fighter.Dmg; // 1
		int fighterHP       = fighter.HP;  // 5 Fighter
		int marksmanAttack  = marksman.Dmg;// 3
		int marksmanHP      = marksman.HP; // 3 Marksman
		
	//Enemy Attributes
		int soldierAttack   = soldier.HP;  // 3 Marksman
		int soldierHP       = soldier.Dmg; // 3 Marksman
		int bossAttack      = boss.HP;     // 3 Marksman
		int bossHP          = boss.Dmg;    // 3 Marksman

//while loop
	        //x = true  	   
  		while(x) {         //the Hero selection will loop as long as the user deosn't input a right choice of hero   
		System.out.println("         Choose a Hero to defeat Zhask");
		System.out.println("         ---------------------------------");
		System.out.println("         |  Hayabusa | Leomord | Moskov  |");
		System.out.println("         ---------------------------------");
		System.out.print("I choose : "); //The user will chose what hero they want to play
		String Hero = s.nextLine();
            
		//if the user chose a right hero the value of x will change in to false. therefore the loop will stop 
			if(Hero.equalsIgnoreCase(Haya)) {
				assassin.sayDialog();
				assassin.stats();    //This will show the attributes of a hero
				
				while(assassinHP > 0 && soldierHP > 0) {//while their HP doest go to 0 they will fight to the end 

					System.out.println("Fighting : Soldier and Hero");//fighting hero and soldier
					System.out.println();
					System.out.println("Type : X to attack or Y to Depend ");//Choose how to fight
					char fightSoldier =  s.next().charAt(0);
					
					if(fightSoldier == 'X') {
						soldierHP = assassinAttack - soldierHP;
						System.out.println(soldierHP);
					}else if (fightSoldier == 'Y') {
						assassinHP = assassinHP - soldierHP;
						System.out.println(assassinHP);
					}else {
						System.out.println("Invalid letter!");
					}
				
			}
			}	
			else if(Hero.equalsIgnoreCase(Leo)){
				fighter.sayDialog();
				fighter.stats();  //This will show the attributes of a hero
				
				while(fighter.HP > 0 ) {
					System.out.println("Fighting");//fighting hero and soldier
					fighter.HP--;
				}
				System.out.println("You Lose ");// if you lose
				
				
			}
			else if(Hero.equalsIgnoreCase(Mosk)) {
				marksman.sayDialog();
				marksman.stats();     //This will show the attributes of a hero
				x = false;
			}else {        //this dialog box will show if the user failed to choose a given hero 
				System.out.println("          --------------------------");
				System.out.println("         |Invalid choice. Try again!|");
				System.out.println("          --------------------------");
				System.out.println("-----------------------------------------------");
				continue;
				
			}
			
		}
  	
  	}
	static int heroenemy(int num1) {
		
		return num1;
	}
}