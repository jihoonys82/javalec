package controlQuiz;

import java.util.Scanner;

public class ControlEx_Quiz {

	public static void main(String[] args) {
		
		int selector = 0;
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("=[JAVA=QUIZ]=SELECT=NUMBER=(1~6)=======");
			System.out.println("\t 1. Math table");
			System.out.println("\t 2. Get GCD, LCM");
			System.out.println("\t 3. Get denominators");
			System.out.println("\t 4. Sum of common number");
			System.out.println("\t 5. Get denominators");
			System.out.println("\t 6. Quit");
			System.out.println("=======================================");
			System.out.print(" >> ");
			
			selector = sc.nextInt();
			
			switch(selector) {
			case 1: 
				q1(sc); 
				break;
			case 2: 
				q2(sc);
				break;
			case 3: 
				q3(sc);
				break;
			case 4: 
				q4(sc);
				break;
			case 5: 
				q5(sc);
				break;
			case 6: 
				System.out.println("Exit the program... bye! ");
				break;
			default:
				System.out.println("Wrong Input!!!!");
			}
			
		} while (selector != 6);
		
//		q1(sc); // TEST - OK
//		q2(sc); // TEST - OK 
//		q3(sc); // TEST - OK 
//		q4(sc); // TEST - OK
//		q5(sc); // TEST - OK
		sc.close();
		
	}
	
	public static void q1(Scanner sc) {
		//Q1. 구구단
		int dan = 0; 
		
		System.out.print("Input >> ");
		dan = sc.nextInt();
		
		for(int i=1;i<10;i++) {
			System.out.println(dan + " x " + i + " = " + dan*i);
		}
	}
	
	public static void q2(Scanner sc) {
		//Q2. LCM최소공배수, GCD최대공약수
		int num2_1 = 0, num2_2 = 0; 
		
		System.out.print("num 1 >> ");
		num2_1 = sc.nextInt();
		System.out.print("num 2 >> ");
		num2_2 = sc.nextInt();
		
		int lcm = 0, gcd = 0;
		int multi = num2_1 * num2_2; //identify limitation of iteration for LCM
		int bigger, smaller; //identify bigger number to reduce the number of iteration. 
		if (num2_1>num2_2) {
			bigger = num2_1;
			smaller = num2_2;
		} else {
			bigger = num2_2;
			smaller = num2_1;
		}
		   
		//for GCD 
		for(int i=smaller;i>0;i--) {
//			if(smaller%i==0) {
//				for(int j=smaller;j>0;j--) {
//					if(bigger%j == 0 && smaller%j == 0) {
//						gcd = j; 
//						break;
//					}
//				}
//				if(gcd != 0) {
//					System.out.println("GCD : " + gcd);
//					break;
//				}
//			}
			if(smaller%i==0 && bigger%i==0) {
				gcd = i;
				break;
			}
			System.out.println("GCD : " + gcd);
		}
		
		//for LCM
		for(int i = bigger; i<=multi; i++) {
			if(i%num2_1 == 0 && i%num2_2 ==0) {
				lcm = i;
				System.out.println("LCM : " + lcm);
				break;
			}
		}
	}

	public static void q3(Scanner sc) {
		//Q3. get a denominator
		int num3 = 0;
		
		System.out.print("Input number >>");
		num3 = sc.nextInt();
		
		for(int i=1;i<=num3; i++) {
			if(num3%i ==0) {
				System.out.println("Number " + i + " is denominator of " + num3 +".");
			}
		}
	}
	
	public static void q4(Scanner sc) { 
		//Q4. Find the common number which has modulus 1 for 4 and 6 between 1 and 1000
		
		int num4 = 0;
		
		for(int i=1;i<=1000;i++) {
			if(i%4==1 && i%6 ==1) {
				num4 += i;
			}
		}
		System.out.println("Q4. Sum of the common number is " + num4);
	}
	
	public static void q5(Scanner sc) {
		//Q5. Find prime number
		
		int num5 = 0;
		boolean token = true; // check for prime number. if the number is prime number it is true in the for statement 
		//teacher use token name as "flag"
		
		System.out.print("Input Number >>");
		num5 = sc.nextInt();
		
		
		System.out.print("Prime Number between 1 and "+ num5 + " : ");
		for(int i=2;i<=num5;i++) {
			for(int j=2;j<i;j++) {
				if(i%j==0) {
					token = false;  // false means i is not prime number
					break;
				}
			}
			if(token) {
				System.out.println(i);
			} else {
				token = true; // reset token
			}
		}
		System.out.println();
	}
}
