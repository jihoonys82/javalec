package array2D;

public class Array2DEx_06 {
	public static void main(String[] args) {
		
		int[] arr = new int[5];
		
		arr[0] = 10;
		arr[1] = 20;
		
		arr = new int[3]; // previous new int[5] has lost. it occur memory leak!
		//JAVA has Garbage collector in JVM. JVM deallocate and return the memory to system automatically at proper timing.
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i] + " ");
		}
	}
}
