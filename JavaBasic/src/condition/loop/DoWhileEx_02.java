package condition.loop;

import java.util.Scanner;

public class DoWhileEx_02 {

	public static void main(String[] args) {
		
		Scanner	 sc = new Scanner(System.in);
		
		// input iteration until get 99 
		int num = 0;
		do { // it is required when develop CLI base programming 
			num = sc.nextInt();
			System.out.println(num);
		} while(num != 99);
		
		sc.close();
	}

}