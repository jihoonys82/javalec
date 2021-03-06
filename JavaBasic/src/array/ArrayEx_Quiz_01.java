package array;

import java.util.Scanner;

public class ArrayEx_Quiz_01 {
	
	public static final int FEE = 12000; // make variable to constant.
	
	//constant : unchangeable value.
	// 1. literal constant : 123, 'A', "Apple", 3.4F. 2.1, true ......
	// 2. named (variable to constant) 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[6];
		int[] arr2 = new int[6];
		
		//input number of people who live in each floor. 
		System.out.println("=====Input=====");
		for(int i=0;i<arr.length-1;i++) {
			System.out.print((i+1) +"층에 사는 인원은?");
			arr[i] = sc.nextInt();
			arr[5] += arr[i];
			arr2[i] = arr[i]*FEE;
			arr2[5] += arr2[i];		
		}
		
		//print output
		System.out.println("=====Output====");
		for(int j=0;j<arr.length-1;j++) {
			System.out.println((j+1)+ " 층의 총 관리비 : " + arr2[j] + "원");
		}
		System.out.println("건물에 사는 총 인원은 " + arr[5] + "명입니다.");
		System.out.println("관리비의 총 금액은 " + arr[5] + "원입니다.");
		
		sc.close();
	}

}
