package condition.loop;

import java.util.Scanner;

public class ForEx_07 {
	public static void main(String[] args) {
		
		//첫날에 10원 입금
		//다음날에는 2배 입금 
		//보름 동안 저축금액? 
		
		int money = 0; 
		int incre = 10; 
		for(int i=0;i<15;i++) {
			money += incre;
			incre *= 2; 
			
			//TEEST - print increment - TEST OK 
			//System.out.println("[Test] " +i +" money : " +money + ", incre : " +incre);
		}
		//it is also available : for(int i=0;i<15; i++, incre *= 2) { ... }
		
		System.out.println("Saved money : " + money);

		
		//Print divisor of input number
		Scanner sc = new Scanner(System.in);
		int num = 0;
		System.out.print("input number : ");
		num = sc.nextInt();
		
		for(int i=1;i<=num;i++) {
			if(num%i ==0) System.out.println(i+" is divisor of " + num); 
		}
		
		
		
		sc.close();
		
	}
	
}
