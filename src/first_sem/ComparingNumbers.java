package first_sem;
import java.util.Scanner;
public class ComparingNumbers {

	public static void main(String[] args) {
		int num1;
		int num2;		
		Scanner s = new Scanner(System.in);
		System.out.print("First Number  : ");
		num1 = s.nextInt();
		System.out.print("Sceond Number : ");
		num2 = s.nextInt();

		
		if(num1 < num2) {
			System.out.println(num1 + " is less than " + num2);
		}else if(num1 > num2) {
			System.out.println(num1 + " is greater than " + num2);
		}else {
			System.out.println(num1 + " is equals to " + num2);
		}
		
	}

}
