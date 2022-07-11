package gameAlgorithm;
//subclass
class Marksman extends Hero {
//Moskov
	Marksman(){
		Role   = "Marksman";
		Name   = "Moskov";
		Weapon = "Spear";
		Dmg    = 3;
		HP     = 3;
	}
	void sayDialog () {
		System.out.println();
		System.out.println("     Everyone changes, so do I");
	}
	
	void stats() {
		super.stats();//this will automatically copy all the values in a method 
	}
}
