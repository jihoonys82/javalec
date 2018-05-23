package condition;

import java.util.Scanner;

public class IfElseIfElseEx {
	public static void main(String[] args) {
		
		// if(condition1) { 
		//		execute when the condition1 is true 
		// } else if(condition2) {
		// 		execute when the condition1 is false and, 
		//		condition2 is true
		// } else if(condition3) {
		//		...
		// } else {
		// 		execute when all of conditions are false. 
		// }
		
		Scanner sc = new Scanner(System.in);
		int num = 0; 
		
		System.out.print("Input number : ");
		num = sc.nextInt();
		
		sc.close();
		
		if(num>0) {
			System.out.println("num[" + num + "] is a positiove number.");
		} else if(num<0) {
			System.out.println("num[" + num + "] is a negative number.");
		} else {
			System.out.println("num[" + num + "] is zero.");
		}
	}
}
