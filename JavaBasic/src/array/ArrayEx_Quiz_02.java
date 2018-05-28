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

//
//int arr[] = {10, 17, 3, 9, 27, 10, 8, 9, 13, 21};
//배열이 선언된 뒤 문제를 푸시오
//
//- 위의 숫자를 invert_arr라는
//배열에 거꾸로 입력하시오
//	=> invert_arr : { 21, 13, 9, 8, 10, 27, 9, 3, 17, 10 }
//
//- 위의 숫자의
//(짝수번째 인덱스 내용의 합) - (홀수번째 인덱스 내용의 합)을
//구하시오
//
//- 위의 숫자를 높은 숫자가 1등이 되게하여
//rank_arr라는 배열에 순위를 입력하시오
//	=> arr : { 10, 17, 3, 9, 27, 10, 8, 9, 13, 21 }
//=> rank_arr :{  5,  3, 10,7,  1,  5, 9, 7,  4,  2 }
//
//- 중복된 값은 over_arr에 넣고 중복되지
//않은 값은 ret_arr에 입력하시오
//
//	정렬까지 했다면
//	=> over_arr : { 9, 10 }
//	=> ret_arr : { 3, 8, 13, 17, 21, 27 }


