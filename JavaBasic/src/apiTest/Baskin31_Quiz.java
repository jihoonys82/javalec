package apiTest;

import java.util.Random;
import java.util.Scanner;

public class Baskin31_Quiz {
	static final int ROBBINS = 31; // max number 
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random ran = new Random();
		
		int baskin	= 0;
		int com 	= 0;
		int user	= 0;
		
		do { 
			//computer turn
			if(baskin>26 && baskin<30) {
				com = 30 - baskin;	
			} else {	
				com = ran.nextInt(3) + 1;
			}
			for(int i=0;i<com;i++) {
				baskin++;
				System.out.println("Com : " + baskin); 
				if(baskin>=ROBBINS) {
					System.out.println("You win!");
					break;
				}
			}
			
			//user turn
			while(user<1 || user>3) {
				System.out.print("Input the number want to repeat(1~3) >>> ");
				user = sc.nextInt();
				if(user<1 || user>3) {
					System.out.println("Please Input the number 1~3");
				}
			} 
			for(int i=0;i<user;i++) {
				baskin++;
				System.out.println("User : " + baskin); 
				if(baskin>=ROBBINS) {
					System.out.println("You lose!");
					break;
				}
			}
			
			// Initialize user and computer number;
			user = 0; 
			com = 0;
		} while(baskin < ROBBINS);
		
		sc.close();
	}

}
