package array;

import java.util.Scanner;

public class ArrayEx_Quiz_02 {

	public static void main(String[] args) {
		int arr[] = {10, 17, 3, 9, 27, 10, 8, 9, 13, 21};
		
		//quiz2_1(arr);
		
		//quiz2_2(arr);
		
		quiz2_3(arr);
		
	}
	
	public static void quiz2_1(int[] arr) {
		
		
		int[] invert_arr = new int[10];
		
		for(int i=0;i<arr.length;i++) {
			invert_arr[i] = arr[10-i-1];
		}
		
		//check the result
		for(int j=0;j<invert_arr.length;j++) {
			System.out.print(arr[j] + " ");
		}
		System.out.println();
		for(int j=0;j<invert_arr.length;j++) {
			System.out.print(invert_arr[j]+ " ");
		}	
		System.out.println();
	}
	
	public static void quiz2_2(int[] arr) {
		int oddsum=0, evensum=0;
		
		for(int i=0;i<arr.length;i++) {
			if(i%2==0) {
				evensum += arr[i];
			} else { 
				oddsum += arr[i];
			}
		}
		
		System.out.println("Odd number sum : " + oddsum +", Even number sum : "+ evensum + ", (even sum)-(odd sum) : " + (evensum-oddsum)); 
	}

	public static void quiz2_3(int[] arr) {
		int duplicatedRank = 0;
		int largestnumIndex= 0;
		int largestnum= 24;
		int rank = 0;
		int[] rank_arr = new int[arr.length];

		
//		for(int i=0;i<rank_arr.length;i++) {
//			for(int j=0;j<arr.length;j++) {
//				if(rank_arr[j] != 0) continue;
//				if(arr[j]>=largestnum) {
//					largestnum = arr[i];
//					largestnumIndex = i;
//				}
//			}
//			rank++;
//			rank_arr[largestnumIndex] = rank;
//		}
//		
	
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] +" ");
		}
		System.out.println();
		for(int i=0;i<arr.length;i++) {
			System.out.print(rank_arr[i] +" ");
		}
		System.out.println();
		
		
	}
}
