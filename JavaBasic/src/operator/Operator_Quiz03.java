package operator;

import java.util.Scanner;

public class Operator_Quiz03 {
	public static void main(String[] args) {
		//get a 2 number and print bigger Number.
		// use condition operator
		
		// ex) 
		// Input Number1 : 123 
		// Input Number2 : 333
		// Bigger number is 333.
		
		//declare variables 
		int num1 , num2; 
		
		// Scanner method call
		Scanner sc = new Scanner(System.in);
		
		//receive inputs 
		System.out.print("Input Number 1 : ");
		num1 = sc.nextInt();
		System.out.print("Input Number 2 : ");
		num2 = sc.nextInt();
		
		sc.close();
		
		//print result 
		System.out.println("Bigger number is " + (num1>num2? num1 : num2) + ".");
	}
}
