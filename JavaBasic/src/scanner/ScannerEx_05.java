package scanner;

import java.util.Scanner;

public class ScannerEx_05 {
	//Scanner method 
	// 1. next();
	// 2. nextLine();
	
	public static void main(String[] args) {
		
		// create scanner object variable, sc
		Scanner sc = new Scanner(System.in);
		
		String str1; 
		String str2;
		String str3; 
		
		// string input 
		System.out.print("Input : ");
		str1 = sc.next(); // input until white space
		//** White space means... 
		// \n : new line
		// ' ' : space
		// \t  : horizontal tab
		
		str2 = sc.next();
		
//		sc.skip("\r\n");
		sc.nextLine();
		
		System.out.print("Input : ");
		str3 = sc.nextLine();
		
		System.out.println("-----output-----");
		System.out.println("str1 : " + str1);
		System.out.println("str2 : " + str2);
		System.out.println("str3 : " + str3);
		
		sc.close();
	}
	
}
