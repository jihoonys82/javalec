package array;

public class ArrayEx_02 {

	public static void main(String[] args) {
		
		//declare and init  variable together
		int num = 123;
		
		//declare and init array together
		int[] arr = {1,2,3,4,5};
		
		//print all element
		for(int i =0; i<5; i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println("========");
		//put values in all element
		for(int i =0; i<5; i++) {
			arr[i] = (i+1) * 10;
		}
		for(int i =0; i<5; i++) {
			System.out.println(arr[i]);
		}		
		
	}

}
