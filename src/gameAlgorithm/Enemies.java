package gameAlgorithm;
//this is Superclass Polymorphism
class Enemies {
	
	String Name, Role;
	String Power;
	int Dmg, HP;
	
	void sayDialog() {
		}
	    
    void stats() {
			System.out.println();
			System.out.println("Role             : " + Role);
			System.out.println("Hero Name        : " + Name);
			System.out.println("Weapon           : " + Power);
			System.out.println("Damage           : " + Dmg );
			System.out.println("Health           : " + HP );
			System.out.println();
		}

}