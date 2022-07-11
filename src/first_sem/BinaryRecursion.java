package first_sem;
import java.util.Scanner;
public class BinaryRecursion {
	
	public static int num (int f) {
		
		if (f <= 1) {
			return f;
		}else { 
			return num(f-1) + num(f-2);
		}
	}
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter a number higher than 0 : ");
		int n = s.nextInt();
		
	    System.out.println(num(n));
	}
}