package array2D;

public class Array2DEx_02 {

	public static void main(String[] args) {

		int[] arr1D = { 1,2,3,4,5 };
		// arr1D = new int[5]; 

		int[][] arr2D = { 
				{ 1,2,3 }, 
				{ 4,5,6 },
				{ 7,8,9 } 
		};

		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(arr2D[i][j] + " ");
				//System.out.print(arr2D[j][i] + " ");
			}
			System.out.println();
		}
	}

}
