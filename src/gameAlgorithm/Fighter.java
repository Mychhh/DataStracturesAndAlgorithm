package gameAlgorithm;
//subclass
class Fighter extends Hero {
//Leomord
	Fighter(){
		Role   = "Fighter";
		Name   = "Leomord";
		Weapon = "Sword";
		Dmg    = 1;
		HP     = 5;
	}
	void sayDialog () {
		System.out.println();
		System.out.println("     Despair is punishment for the undead");
	}
	
	void stats() {
		super.stats();//this will automatically copy all the values in a method 
	}
}
