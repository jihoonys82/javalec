package condition.loop;

import java.util.Scanner;

public class DoWhileEx_03 {
	public static void main(String[] args) {

		int select;	// �޴�����
		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("===============================");
			System.out.println("\tM  e  n  u");
			System.out.println("===============================");
			System.out.println("\t1. Hello World ���");
			System.out.println("\t2. �̸� ���");
			System.out.println("\t3. ���� ���");
			System.out.println("\t4. ����");
			System.out.println("===============================");
	
			// �޴� ���� �Է¹ޱ�
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












