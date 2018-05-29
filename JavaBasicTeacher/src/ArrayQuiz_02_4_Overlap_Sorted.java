
public class ArrayQuiz_02_4_Overlap_Sorted {
	public static void main(String[] args) {
		
		int[] arr={10,17,3,9,27,10,8,9,13,21};
		
		// 중복데이터 배열
		int[] over_arr = new int[arr.length];
		// 중복되지않은 데이터 배열
		int[] ret_arr = new int[arr.length];

		int idx_over = 0;	// over_arr의 인덱스
		int idx_ret = 0;	// ret_arr의 인덱스
		
		int cur_val;	// 중복검사 기준값
		// {10,17,3,9,27,10,8,9,13,21}
		for( int i=0; i<arr.length; i++) {
			cur_val = arr[i];	//기준값 설정
			
			// 중복 검사
			boolean isOverlap = false;
			for(int j=0; j<arr.length; j++) {
				// 자기자신 넘기기
				if( i==j )	continue;
				
				if( cur_val == arr[j] ) {
					// 중복데이터 찾음
					isOverlap = true;
					break;
				}
			}	// j for end
			
			// 이미 over_arr에 들어있는지 판별
			boolean isExist = false;
			for( int j=0; j<over_arr.length; j++) {
				if(over_arr[j] == cur_val) {
					isExist = true;
					break;
				}
			}
			
			// 최종 값 처리
			if( isOverlap ) {
				if( !isExist )
					over_arr[idx_over++] = cur_val;
			} else {
				ret_arr[idx_ret++] = cur_val;
			}
		}	// i for end
		
		//정렬
		// 배열에 들어간 크기만큼만 정렬
		for(int i=1; i<idx_over; i++) {
			for(int j=0; j<idx_over-i; j++) {
				if(over_arr[j]>over_arr[j+1]) {
					int tmp = over_arr[j];
					over_arr[j] = over_arr[j+1];
					over_arr[j+1] = tmp;
				}
			}
		}
		for(int i=1; i<idx_ret; i++) {
			for(int j=0; j<idx_ret-i; j++) {
				if(ret_arr[j]>ret_arr[j+1]) {
					int tmp = ret_arr[j];
					ret_arr[j] = ret_arr[j+1];
					ret_arr[j+1] = tmp;
				}
			}
		}

		// 전체 길이에 대한 정렬
//		for(int i=1; i<over_arr.length; i++) {
//			for(int j=0; j<over_arr.length-i; j++) {
//				if(over_arr[j]>over_arr[j+1] && over_arr[j+1]!=0 ) {
//					int tmp = over_arr[j];
//					over_arr[j] = over_arr[j+1];
//					over_arr[j+1] = tmp;
//				}
//			}
//		}
//		for(int i=1; i<ret_arr.length; i++) {
//			for(int j=0; j<ret_arr.length-i; j++) {
//				if(ret_arr[j]>ret_arr[j+1] && ret_arr[j+1]!=0) {
//					int tmp = ret_arr[j];
//					ret_arr[j] = ret_arr[j+1];
//					ret_arr[j+1] = tmp;
//				}
//			}
//		}
		
		// 출력
		System.out.print("over_arr : ");
		for( int i=0; i<idx_over; i++ ) {
			System.out.print(over_arr[i] + " ");
		}
		System.out.println();
		
		System.out.print("ret_arr : ");
		for( int i=0; i<idx_ret; i++ ) {
			System.out.print(ret_arr[i] + " ");
		}
	}
}









