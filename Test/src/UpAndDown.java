import java.util.Random;
import java.util.Scanner;

public class UpAndDown {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int user =0;
		
		Random ran = new Random();
		int com = ran.nextInt(50)+1;
		
		int count =7;
		
		while(count>0) {
			System.out.print("Input number (1~50) >> ");
			user = sc.nextInt();
			if(user<1 || user>50) {
				System.out.println("Please input number between 1 to 50");
				continue;
			}
			if(com<user) {
				System.out.println("Down! Remain chance : " + --count);
			} else if(com>user) {
				System.out.println("Up! Remain chance : " + --count);
			} else {
				System.out.println("Correct! You win!");
				sc.close();
				return;
			}
		}
		System.out.println("You Lose! Computer has the number " + com);
		sc.close();
	}
}
