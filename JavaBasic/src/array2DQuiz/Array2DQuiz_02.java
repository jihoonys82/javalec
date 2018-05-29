package array2DQuiz;

public class Array2DQuiz_02 {

	public static void main(String[] args) {
		int[][] arr = new int[5][5];

		// 입력부
		int cur = 1;
		for( int i=0; i<5; i++ ) {	
			for( int j=0; j<5; j++ ) {	
				arr[i][5-j-1] = cur++;
			}
		}
		
		// 출력부 - 수정 금지
		for( int i=0; i<5; i++ ) {
			for( int j=0; j<5; j++ ) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
	}

}

//Q2.
//5	4	3	2	1
//10	9	8	7	6
//15	14	13	12	11
//20	19	18	17	16
//25	24	23	22	21