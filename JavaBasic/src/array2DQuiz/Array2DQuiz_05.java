package array2DQuiz;

public class Array2DQuiz_05 {

	public static void main(String[] args) {
		int[][] arr = new int[5][5];

		// 입력부
		int cur = 1;
		int[] phase = {1, 1, -1 , -1}; // each element is a direction ( x, y, -x , -y )
		int phase_counter = 0;  //phase_counter%4 means index of phase, phase_counter%2 means cur axis(even: x-axis, odd y-axis) 
		int xpos = 0, ypos = 0; //indicate the current cur position
		
		for(int i=10;i>0;i--) {
			if(phase_counter%2==0) {
				//x axis moving
				for(int j=0;j<(i/2);j++) {
					arr[ypos][xpos] = cur;
					if(j!=(i/2)-1) {
						xpos += phase[phase_counter%4];	
					} else {
						ypos += phase[(phase_counter+1)%4]; //last number changes the direction 
					}
					cur++;
				}
			} else {
				//y axis moving
				for(int j=0;j<(i/2);j++) {
					arr[ypos][xpos] = cur;
					if(j!=(i/2)-1) {
						ypos += phase[phase_counter%4];						
					} else {
						xpos += phase[(phase_counter+1)%4]; //last number changes the direction 
					}
					cur++;
				}		
			}
			phase_counter++;
		
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

//Q5.
//1    2    3    4    5
//16   17   18   19   6
//15   24   25   20   7
//14   23   22   21   8
//13   12   11   10   9
