package condition;

import java.util.Scanner;

public class IfEx_03_Quiz {
	public static void main(String[] args) {
		
		// use if statement
		// input a number
		// if it is positive number print "positive number"
		// if it is negative number print "negative number" 
		
		int num =0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Any Integer ? : ");
		num = sc.nextInt();
		
		sc.close();
		
		if(num > 0) {
			System.out.println(num + " is a positive number!");
		} 
		if(num <0) {
			System.out.println(num + " is a negative number!");
		}
		
		
	}
}
