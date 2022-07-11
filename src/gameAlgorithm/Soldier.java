package gameAlgorithm;
//subclass
class Soldier extends Enemies {
//nightmaric spawn
	
	Soldier(){
		Name  = "Nightmaric Spawn"; 
		Role  = "Soldier"; 
		Power = "Death Ray";
		Dmg   = 1;
		HP    = 2;
		}
	
	void sayDialog() {
		System.out.println();
		System.out.println("              RrooOor");
	}
	
	void stats() {
		super.stats();//this will automatically copy all the values in a method 
	}
	
}
