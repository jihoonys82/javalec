package scanner;

import java.util.Scanner;

public class ScannerEx_03 {
	public static void main(String[] args) {
		
		// declaration scanner object 
		Scanner input = new Scanner(System.in);
		
		System.out.print("Input message : " );
		String msg = input.nextLine();
		
		// input data variable can be used again!
		System.out.print("Input number : ");
		int num = input.nextInt();
		
		System.out.println("Msg : " + msg + ", Num : " + num);
		
		input.close();
		
	}
}