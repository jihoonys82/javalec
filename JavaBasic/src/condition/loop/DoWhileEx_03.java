package condition.loop;

import java.util.Scanner;

public class DoWhileEx_03 {
	public static void main(String[] args) {

		int select;	// 메뉴선택
		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("===============================");
			System.out.println("\tM  e  n  u");
			System.out.println("===============================");
			System.out.println("\t1. Hello World 출력");
			System.out.println("\t2. 이름 출력");
			System.out.println("\t3. 성별 출력");
			System.out.println("\t4. 종료");
			System.out.println("===============================");
	
			// 메뉴 선택 입력받기
			System.out.print("\n >> ");
			select = sc.nextInt();			
			
			switch(select) {
			case 1: 
				System.out.println("Hello World");
				break;
			case 2: 
				System.out.println("Ji");
				break;
			case 3: 
				System.out.println("male");
				break;
			case 4: 
				System.out.println("Exit the program.... ");
				break;
			
			default: 
				System.out.println("Wrong Input");
			}
			
		} while( select != 4 );	// while end
		
		sc.close();
		
	} // main end
}













