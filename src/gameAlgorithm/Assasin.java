package gameAlgorithm;
//subclass
class Assasin extends Hero {
//Hayabusa	
	Assasin(){
		Role   = "Assasin";
		Name   = "Hayabusa";
		Weapon = "Blades";
		Dmg    = 2;
		HP     = 4;
	}
	void sayDialog () {
		System.out.println();
		System.out.println("     Body must obey the mind");
	}
	
	void stats() {
		super.stats();//this will automatically copy all the values in a method 
	}
    static int attack (int num) {
		
    	
    	
		return num;
	}

}
