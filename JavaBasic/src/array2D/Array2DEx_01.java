package array2D;

public class Array2DEx_01 {

	public static void main(String[] args) {
		
		int[][] arr;
		arr = new int[2][3];
		
		//int[2][3] ==> [[ooo][ooo]]
		//int[2][2][3] ==> [[[ooo][ooo]][[ooo][ooo]]]
		
		arr[1][2] = 555;
		System.out.println(arr[1][2]);
		
		

	}

}
