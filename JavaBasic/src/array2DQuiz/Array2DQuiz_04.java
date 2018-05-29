package array2DQuiz;

public class Array2DQuiz_04 {

	public static void main(String[] args) {
		int[][] arr = new int[5][5];

		// 입력부
		int cur = 1;
		for( int i=0; i<5; i++ ) {	
			for( int j=0; j<5; j++ ) {	
				arr[5-j-1][i] = cur++;
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

//Q4.
//5	10	15	20	25
//4	9	14	19	24
//3	8	13	18	23
//2	7	12	17	22
//1	6	11	16	21
