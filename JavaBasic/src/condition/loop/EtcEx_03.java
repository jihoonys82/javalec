package condition.loop;

import java.util.Scanner;

public class EtcEx_03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num;
		//while(true) {
		for(;;) { // infinity loop
			System.out.println("1. Haha");
			System.out.println("2. Hoho");
			System.out.println("3. Quit");
			System.out.print(" >> ");
			num = sc.nextInt();
			
			// Exception if num is not in 1~3
			if(num<1 || num>3) {
				System.out.println("Wrong input");
				continue; 
			}
			
			
			switch(num) {
			case 1:
				System.out.println("HAHAHA");
				break;
			case 2: 
				System.out.println("HOHOHO");
				break;
			case 3: 
				System.out.println("Bye");
				break;
			//default: 
			//	System.out.println("Wrong input");
			}
			
			if(num==3) break;
		}
		

		sc.close();
	}

}
