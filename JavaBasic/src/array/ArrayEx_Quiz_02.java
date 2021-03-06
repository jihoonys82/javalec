package array;

public class ArrayEx_Quiz_02 {

	public static void main(String[] args) {
		int arr[] = {10, 17, 3, 9, 27, 10, 8, 9, 13, 21};
		
		quiz2_1(arr);
		System.out.println("======================");
		
		quiz2_2(arr);
		System.out.println("======================");
		
		quiz2_3(arr);
		System.out.println("======================");
		
		quiz2_4(arr);
		System.out.println("======================");
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
		int rank_arr[] = new int[arr.length];
		int max=0;
		int maxIndex=0;
		int rank = 0;
		int priv_max = 0;
		for(int j=0;j<rank_arr.length;j++) {
			for(int i=0;i<arr.length;i++) {
				if(rank_arr[i] != 0) continue;
				if(arr[i]>max) {
					max = arr[i];
					maxIndex = i;
				}
			}
			
			if(priv_max==max) {
				rank_arr[maxIndex] = rank;
				rank++;
			} else {
				rank++;
				rank_arr[maxIndex] = rank;				
			}
			priv_max = max;
			
			max=0;
		}
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] + "\t");
		}
		System.out.println();
		for(int j=0;j<rank_arr.length;j++) {
			System.out.print(rank_arr[j] + "\t");
		}
		System.out.println();
		
		
	}
	
	public static void quiz2_4(int[] arr) { 
		int[] over_arr = new int[10];
		int[] ret_arr = new int[10];
		int temp = 0; // temporary variable. it is for bubble sort
		int over_arr_nextIndex = 0; //when put data in over_arr, it needs to know empty index.
		int remain_length = over_arr.length; //when duplicated values are removed, it indicates how many element left. 
		//Deep copy arr to over_arr		
		for(int i=0;i<arr.length;i++) {
			ret_arr[i] = arr[i];
		}
		
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0;j<10-i-1;j++) {
				if(ret_arr[j+1]==0) continue;; // if element has 0, don't move. (0 means it was the element has duplicated number)
				if(ret_arr[j]>ret_arr[j+1]) { // basic bubble sort algorithm
					temp = ret_arr[j];
					ret_arr[j] = ret_arr[j+1];
					ret_arr[j+1] = temp;
				} else if(ret_arr[j] == ret_arr[j+1]) { // duplication check.
					over_arr[over_arr_nextIndex] = ret_arr[j]; // put duplicated number in over_arr
					remain_length = 10 - (over_arr_nextIndex * 2) -2; // calculate reduced array length 
					for(int k=j;k<remain_length;k++) { // for statement for shrink array.
						ret_arr[k] = ret_arr[k+2]; 
					}
					for(int l=remain_length;l<over_arr.length;l++) { // overflowed indexes become 0.
						ret_arr[l] = 0;
					}
					over_arr_nextIndex++;
				} // end of if - else if statement 
			}// end of for j statement 
		} // end of for i statement 
		
		//TODO: sort over_arr array
				
		//print results.
		for(int i=0;i<over_arr.length;i++) {
			if(over_arr[i] != 0) {
				System.out.print(over_arr[i] + "\t");
			}
		}
		System.out.println();
		for(int i=0;i<ret_arr.length;i++) {
			if(ret_arr[i] !=0 ) {
				System.out.print(ret_arr[i] + "\t");				
			}
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


