package array;

public class ArrayEx_03 {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5};
		
		//length, size ,number of Array
		System.out.println("Lenth of Array : " + arr.length);

		for(int i=0;i<arr.length;i++) {
			System.out.println(i);
		}
		
//		arr[5] =99; //ArrayIndexOutOfBoundsException
		
//		arr[-1] = 88; //ArrayIndexOutOfBoundsException
		
//		int[] arr2 = new int[-10]; //NegativeArraySizeException
		
	}

}