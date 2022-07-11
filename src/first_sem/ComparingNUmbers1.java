package first_sem;

import java.util.Scanner;

public class ComparingNUmbers1 {

	public static void main(String[] args) {
		
		int num1;
		int num2;		
		Scanner s = new Scanner(System.in);
		System.out.print("First Number  : ");
		num1 = s.nextInt();
		System.out.print("Sceond Number : ");
		num2 = s.nextInt();

		
		if(num1 < num2) {
			lessThan(num1, num2);
		}else if(num1 > num2) {
			greaterThan(num1,num2);
		}else {
			equals(num1,num2);
		}
		
	}
	public static int lessThan(int num1, int num2) {
		System.out.println(num1 + " is less than " + num2);
		return num1 + num2;
	}
	public static int greaterThan(int num1, int num2) {
		System.out.println(num1 + " is greater than " + num2);
		return num1 + num2;
	}
	public static int equals(int num1, int num2) {
		System.out.println(num1 + " is equals to " + num2);
		return num1 + num2;
	}

}

