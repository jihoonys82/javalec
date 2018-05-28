package array;

import java.util.Arrays;

public class ArrayEtc_02 {
	public static void main(String[] args) {
		
		int[] arr = {4, 9, 2, 1, 3};
		
		System.out.println("======before sorting======");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
		//Sorting via API
		Arrays.sort(arr);

		System.out.println("======After sorting======");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
	}
}
