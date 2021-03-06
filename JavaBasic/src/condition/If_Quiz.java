package condition;

import java.util.Scanner;

public class If_Quiz {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Q1. inspect the number is multiple of 3. ");
		q1(sc);
		System.out.println("==============");
		
		System.out.println("Q2. Input 2 numbers and compare");
		q2(sc);
		System.out.println("==============");
		
		System.out.println("Q3. input 3 numbers and print  biggest number.");
		q3(sc);		
		System.out.println("==============");
		
		System.out.println("Q4. Input 2 numbers and inspect the addition is even number and multiple of 3.");
		q4(sc);	
		System.out.println("==============");
		
		System.out.println("Q5. Input the score of Korean, English and Mathematics and calculate total score, average and grade.");
		q5(sc);
		
		sc.close();
		
	}

	public static void q1(Scanner sc) {
		//Q1. inspect the number is multiple of 3. 
		
		int num1 = 0; 
		
		System.out.print("Input number : ");
		num1 = sc.nextInt();
		
		if(num1%3 == 0) {
			System.out.println("num[" + num1 + "] is multiple of 3.");
		} else {
			System.out.println("num[" + num1 + "] is NOT multiple of 3.");
		}
	}
	
	public static void q2(Scanner sc) {
		//Q2. Input 2 numbers and compare 
		
		int num2_1 = 0, num2_2 = 0;
		
		System.out.print("Input first number : ");
		num2_1 = sc.nextInt();
		System.out.print("Input second number : ");
		num2_2 = sc.nextInt();
		
		if(num2_1>num2_2) {
			System.out.println("Biggest number is " + num2_1 +".");
		} else if(num2_1<num2_2) {
			System.out.println("Biggest number is " + num2_2 +".");
		} else {
			System.out.println("Frist number " + num2_1 + " and Second number " + num2_2 +" are even.");
		}
				
	}
	
	public static void q3(Scanner sc) {
		//Q3. input 3 numbers and print  biggest number.
		
		//1. define variables
		int num3_1 = 0, num3_2 = 0, num3_3 = 0;
		
		//2. input numbers
		System.out.print("Input first number : ");
		num3_1 = sc.nextInt();
		System.out.print("Input second number : ");
		num3_2 = sc.nextInt();
		System.out.print("Input third number : ");
		num3_3 = sc.nextInt();
		//TEST - input results - TEST OK
		//System.out.println("[test]" + num3_1 +", " + num3_2 +", " + num3_3);
		
		//3. identify biggest number
		int max = 0; 
		if(num3_1>num3_2) {
			max = num3_1; 
		} else {
			max = num3_2;
		}
		if(max<num3_3) {
			max = num3_3;
		}
		
		//4. print results
		System.out.println(max + " is the biggest number in " + num3_1 +", " + num3_2 +", and" + num3_3 +".");
		
		
//		if(num3_1>=num3_2 && num3_1>=num3_3) {
//			System.out.println(num3_1 + " is the biggest number.");
//		} else if(num3_2>=num3_1 && num3_2>=num3_3) { 
//			System.out.println(num3_2 + " is the biggest number.");
//		} else if(num3_3>=num3_1 && num3_3>=num3_2) { 
//			System.out.println(num3_3 + " is the biggest number.");
//		} else {
//			System.out.println("Sorry I can't decide.");
//		}
	}
	
	public static void q4(Scanner sc) {
		//Q4. Input 2 numbers and inspect the addition is even number and multiple of 3. 
		
		//1. declare variables
		int num4_1 = 0, num4_2 = 0;
		
		//2. Input values
		System.out.print("Input first number : ");
		num4_1 = sc.nextInt();
		System.out.print("Input second number : ");
		num4_2 = sc.nextInt();
		
		//TEST - input results - TEST OK
		//System.out.println("[test]" + num4_1 +", " + num4_2 );
				
		//3. addition
		int sum = num4_1 + num4_2;
				
		//4. inspect multiple of 3 and even number. 
		// even number: sum%2 == 0
		// multiple of 3 : sum%3 ==0
		boolean b = false;
		if(sum%2 ==0 && sum%3 ==0) { 
			b = true; 
		}
				
		//5. print result
		System.out.print("the addition of [" + num4_1 + "] and ["+ num4_2 + "] is ["+sum);
		if(b) {
			System.out.println("] and it is multipul of 3 and even number.");
		} else {
			System.out.println("] and it is NOT multipul of 3 and even number.");
		}
		
//		if((num4_1+num4_2)%2 == 0 && (num4_1+num4_2)%3 == 0) {
//			System.out.println("the addition is even and multiple of 3.");
//		} else if((num4_1+num4_2)%2 != 0 && (num4_1+num4_2)%3 == 0) {
//			System.out.println("the addition is NOT even but multiple of 3.");
//		} else if((num4_1+num4_2)%2 == 0 && (num4_1+num4_2)%3 != 0) {
//			System.out.println("the addition is even but NOT multiple of 3.");
//		} else {
//			System.out.println("the addition is NOT even and NOT multiple of 3.");
//		}
	}
	
	public static void q5(Scanner sc) {
		//Q5. Input the score of Korean, English and Mathematics and calculate total score and average 
		// Print each grade if the average over 90 is "A", over 80 is "B", over 70 is "C", over 60 is "D", below 60 is "F".
		
		//1. declare variables 
		int kor, eng, mat, tot;
		double avg;
		char grade ='\0'; // '\0' means 'null' character in ASCII
		
		//2. input data
		System.out.print("Input Korean score : ");
		kor = sc.nextInt();
		System.out.print("Input English score : ");
		eng = sc.nextInt();
		System.out.print("Input Mathematics score : ");
		mat = sc.nextInt();
		
		//3. calculation (addition)
		tot= kor + eng + mat;
		
		//4. calculation (average)
		avg = (double) tot / 3.0;
		
		//5. get grade
		if(avg>=90) {
			grade = 'A';
		} else if(avg>=80) {
			grade = 'B';
		} else if(avg>=70) {
			grade = 'C';
		} else if(avg>=60) {
			grade = 'D';
		} else {
			grade = 'F';
		}
		
		//6. print results
		System.out.println("Korean score : " + kor);
		System.out.println("English score : " + eng);
		System.out.println("Mathematics score : " + mat);
		System.out.println("Total score : " + tot);
		System.out.printf("Average score : %.2f \n", avg);
		System.out.println("Grade : " + grade);
	}

}
