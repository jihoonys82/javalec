package array;

public class ArrayEx_01 {
	public static void main(String[] args) {
		// Array ==> bunch of variables
		
		// declare int type variable
		int num; 
		
		// put value in int type variable
		num = 123;
		
		//declare int type array
		int[] arr; // same as int arr[];
		
		//create int type array
		arr = new int[5];
		
		// declare and initialize array together
		int[] arr2 = new int[10];
		
		//put data in array
		arr[0] = 1; 
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		
		//print each values
		System.out.println(arr[1]);
		
		//print array 
		System.out.println(arr); //return memory address of first value. It means, Array is reference type 
		
	}
}
