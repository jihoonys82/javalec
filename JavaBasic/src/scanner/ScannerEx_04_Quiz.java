package scanner;

import java.util.Scanner;

public class ScannerEx_04_Quiz {
	public static void main(String[] args) {
		/*
		 * Quiz
		 * Make variables about Personal information for artificial person and print the results
		 */
		
		// 1. personal info variable
		// pName, pAge, pSex, pHeight
		String pName;
		int pAge;
		//char pSex;
		String pGender;
		double pHeight; 
		
		// 2. receive proper values in each variables via Scanner method 
		Scanner sc = new Scanner(System.in);
		// Ctrl+Shift+O : import classes automatically.
		
		System.out.print("Name : ");
		pName = sc.nextLine();
		
		System.out.print("Age : ");
		pAge = sc.nextInt();
		
		// Problem on input buffer.
		// 	all of nextXXX() except nextLine() treat input strings without enter ("\r\n")
		// so remained input stream buffer (\r\n) is inut 
		sc.nextLine(); //solution1. get and throwaway "\r\n"
		// sc.skip("\r\n"); //solution2. skip "\r\n"
		
		
		System.out.print("Gender : ");
		//String strSex = sc.nextLine(); 
		//pSex = strSex.charAt(0);
		pGender = sc.nextLine();
						
		System.out.print("Height : ");
		pHeight = sc.nextDouble();
				
		// 3. print result in console
		System.out.println("================");
		System.out.println("Name : " + pName);
		System.out.println("Age : " + pAge);
		System.out.println("Gender : " + pGender);
		System.out.println("Height : " + pHeight);
		
		sc.close();
		
	}
}
