package scanner;


//When the program want to use method/class which is located outside of package, it needs to import correspondent package 
import java.util.Scanner;

public class ScannerEX_01 {
	public static void main(String[] args) {
		
		// create scanner object.
		//	it has a function for input via keyboard  
		
		Scanner sc = new Scanner(System.in); 
		
		int num = sc.nextInt();
		// nextInt()  - receive user keyboard input (int type only!)  
		
		
		System.out.println("Input Number : " + num);
		
		sc.close();
		
		
	}
}
