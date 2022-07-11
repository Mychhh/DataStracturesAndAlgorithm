package midterm;

import java.util.Scanner;
import java.util.Stack;

public class Sample {

	public static void main(String[] args) {

		    String testStr = "TEST";
		    int count = count(testStr,'T');
		    String newStr = testStr.replaceAll("T", "?");
		    System.out.println("Total T: " + count);
		    System.out.println("Old:" + testStr +" | New: "+newStr);
		}

		public static int count(String str, char letter){
			
		    int counter = 0;
		    for( int i=0; i<str.length(); i++ ) {
		        if( Character.toUpperCase(str.charAt(i)) == Character.toUpperCase(letter)) {
		            counter++;
		        }
		    }
		    return counter;
		}


}
