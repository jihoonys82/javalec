package scanner;

import java.util.Scanner;

public class ScannerEx_02 {
	public static void main(String[] args) {
		
		// declaration scanner object 
		Scanner input = new Scanner(System.in);
		
		// guide to input 
		System.out.print("Input : ");
		
		// receive input data as String type 
		String str = input.nextLine();
		
		// print result
		System.out.println("Input data : " + str);
		
		input.close();
		
	}
}