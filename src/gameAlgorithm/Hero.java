package gameAlgorithm;
//Super class / Polymorphism
class Hero {
	
	String Name, Role;
	String Weapon;
	int Dmg, HP, Def;
	
    void sayDialog() {
	}
    
	void stats() {
		System.out.println();
		System.out.println("Role             : " + Role);
		System.out.println("Hero Name        : " + Name);
		System.out.println("Weapon           : " + Weapon);
		System.out.println("Damage           : " + Dmg );
		System.out.println("Defense          : " + Def );
		System.out.println("Health           : " + HP );
		System.out.println();
	}
	static int attack (int num) {
		
		return num;
	}
	
}