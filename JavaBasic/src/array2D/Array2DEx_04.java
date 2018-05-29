package array2D;

public class Array2DEx_04 {
	public static void main(String[] args) {
		
		//variable length array 
		int[][] arr;
		arr = new int[3][];
		
//		arr[1][1] = 123; // it occurs null pointer exception. 
		
		arr[0] = new int[4];
		arr[1] = new int[8];
		arr[2] = new int[6]; //it is available to declare different column size. 
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}
