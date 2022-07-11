package first_sem;
import java.util.Scanner;
public class FindSum {

	public static void main(String[] args) {
		
		int num = 0;
		int sum = 0;
		
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a Number : ");
		num = s.nextInt();
		
		for(int i = 1; i <= num; i++) {
			sum = sum + i;
		}
		total(num, sum);
		
	}
	
	public static int total(int num1, int num2) {
		System.out.println("The sum of first "+ num1 +" numbers is " + num2);
		return num1 + num2;
	}
}
