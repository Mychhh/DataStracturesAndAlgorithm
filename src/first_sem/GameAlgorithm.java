package first_sem;
import java.util.Scanner;
public class GameAlgorithm {

	public static void main(String[] args) {
		
		Scanner s =  new Scanner(System.in);
		
		int firstHeroLives = 4;
		int heroesDMG = 2;
		
		int soldierLives = 3;
		int soldierDMG = 1;
		int bossLives =  5;
		int bossDMG = 3;
		boolean first =  true; 
		
		while (first) {
		
		System.out.print("Type 0 to continue : ");
		int choose = s.nextInt();
		
		//game begin
		if(choose == 0) {
			System.out.println("Game Begin");
			
			while (soldierLives > 0) {
			System.out.print("Press X to attack the Soldier and Y to let Soldier hurt you : ");
			char one = s.next().charAt(0);
			if( one == 'X') {
				soldierLives = soldierLives - heroesDMG;
				if(soldierLives <= 0) {
					System.out.println("Soldier Lose");
					//if hero won against soldier
					if(soldierLives <= 0) {
						System.out.println("You won against Soldier");
					while(firstHeroLives > 0 && bossLives > 0) {
						System.out.print("Press X to attack the Final Boss and Y to let Final Boss hurt you : ");
						char winS = s.next().charAt(0);
						
						if(winS == 'X') {
							bossLives = bossLives - heroesDMG;
							if(bossLives > 0) {
								System.out.println("Final Boss are still alive");	
							}else {
								System.out.println("You Defeated a Final Boss. You Win!");
								break;
							}
							
						}else if(winS == 'Y') {
							firstHeroLives = firstHeroLives - bossDMG;
							if(firstHeroLives > 0) {
								System.out.println("You has been attacked by soldier");	
							}
							else {
								System.out.println("You lose against Final Boss try again");
							}
						}else {
							System.out.println("Invalid letter!");
							continue;
						}
					}
					}	
				}else {
					System.out.println("Soldier are still alive");
				} 
			}
			else if(one == 'Y') {
				firstHeroLives = firstHeroLives - soldierDMG;
				if (firstHeroLives > 0) {
					System.out.println("You has been attacked by soldier");	
				}else if(firstHeroLives == 0) {
					System.out.println("You lose against soldier try again");
					break;
				}
				
			}
			else {
				System.out.println("Invalid Letter!");
			}
		}	
        //if the user type an invalid number    
		}else {
			System.out.println("Invalid Number try Again");
			continue;
		}
		//IF THE HERO WIN
		if(bossLives <= 0) {
			first = false;
		}
		}
		
		
		

	}		
}