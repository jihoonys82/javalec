package condition;

import java.util.Scanner;

public class IfElseEx_02 {
	public static void main(String[] args) {
		
		int num = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Any Integer ? : ");
		num = sc.nextInt();
		
		sc.close();
		
		if(num > 0) {
			System.out.println(num + " is a positive number!");
		} else {
			System.out.println(num + " is NOT a positive number!");
		}
		
	}
}