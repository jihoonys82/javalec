package condition.loop;

import java.util.Scanner;

public class WhileEx_03_Quiz {

	public static void main(String[] args) {
		
		// Input a number
		// Addition all number from 1 to input number
		// use while statement
		
		int num = 0; 
		int total = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Input number : ");
		num = sc.nextInt();
		
		sc.close();
		
		int i = 1; 
		while(i<=num) {
			total += i;
			i++;
			
			//TEST - changes of total and i - TEST OK  
			//System.out.println("total: " + total + ", i : " + i);
		}
		System.out.println("1 to " + num +" total : " + total);
		
	}

}
