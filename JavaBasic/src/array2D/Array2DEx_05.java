package array2D;

import java.util.Scanner;

public class Array2DEx_05 {
	public static void main(String[] args) {
		// new : 동적 할당 연산자 
		// assign : create memory space
		
		// 동적 <-> 정적
		// 동적: 동작중, Run-time
		// 정적: 정지상태, Compile-time
		
		// ex) int num; // declare int type variable --> static assign 
		// ex) int[] arr; // declare int[] type variable --> static assign 
		// 		arr = new int[5]; // create int[5] --> dynamic assign 
		
		// int[] arr = new int[5];
			
		int[][] arr = new int[3][];
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0;i<arr.length;i++) {
			System.out.println("Input size >>");
			int len = sc.nextInt();
			
			arr[i] = new int[len];
		}
	}
}
