package gameAlgorithm;
//subclass
class Boss extends Enemies {
//zhask
	
	Boss(){
		Name  = "Zhask"; 
		Role  = "Boss"; 
		Power = "Dominator Descent";
		Dmg   = 1;
		HP    = 4;
		}
	
	void sayDialog() {
		System.out.println();
		System.out.println("       Feed, Destroy and Conquer");
	}
	
	void stats() {
		super.stats();//this will automatically copy all the values in a method 
	}
	
}
