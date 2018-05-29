package array2D;

import java.util.Scanner;

public class Array2DEx_05 {
	public static void main(String[] args) {
		// new : ���� �Ҵ� ������ 
		// assign : create memory space
		
		// ���� <-> ����
		// ����: ������, Run-time
		// ����: ��������, Compile-time
		
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
