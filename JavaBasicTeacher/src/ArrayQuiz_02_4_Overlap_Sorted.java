
public class ArrayQuiz_02_4_Overlap_Sorted {
	public static void main(String[] args) {
		
		int[] arr={10,17,3,9,27,10,8,9,13,21};
		
		// �ߺ������� �迭
		int[] over_arr = new int[arr.length];
		// �ߺ��������� ������ �迭
		int[] ret_arr = new int[arr.length];

		int idx_over = 0;	// over_arr�� �ε���
		int idx_ret = 0;	// ret_arr�� �ε���
		
		int cur_val;	// �ߺ��˻� ���ذ�
		// {10,17,3,9,27,10,8,9,13,21}
		for( int i=0; i<arr.length; i++) {
			cur_val = arr[i];	//���ذ� ����
			
			// �ߺ� �˻�
			boolean isOverlap = false;
			for(int j=0; j<arr.length; j++) {
				// �ڱ��ڽ� �ѱ��
				if( i==j )	continue;
				
				if( cur_val == arr[j] ) {
					// �ߺ������� ã��
					isOverlap = true;
					break;
				}
			}	// j for end
			
			// �̹� over_arr�� ����ִ��� �Ǻ�
			boolean isExist = false;
			for( int j=0; j<over_arr.length; j++) {
				if(over_arr[j] == cur_val) {
					isExist = true;
					break;
				}
			}
			
			// ���� �� ó��
			if( isOverlap ) {
				if( !isExist )
					over_arr[idx_over++] = cur_val;
			} else {
				ret_arr[idx_ret++] = cur_val;
			}
		}	// i for end
		
		//����
		// �迭�� �� ũ�⸸ŭ�� ����
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

		// ��ü ���̿� ���� ����
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
		
		// ���
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









