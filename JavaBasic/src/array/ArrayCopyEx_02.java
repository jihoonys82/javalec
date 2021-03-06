package array;

public class ArrayCopyEx_02 {

	public static void main(String[] args) {

		int[] arr1 = {10, 20, 30}; // Source
		int[] arr2; // Destination
		
		//deep copy
		// copy the contents in the reference
		
		// 1. make space to use "new" in the Destination 
		arr2= new int[arr1.length];
		
		// 2. use API method in System class to copy
		// System.arraycopy(source name, star index in source, destination, start index in destination, length);
		System.arraycopy(arr1, 0, arr2, 0, arr1.length);
		
		
		System.out.println("====Before modify=====");
		for(int i=0;i<3;i++) {
			System.out.println(arr1[i] + " : " + arr2[i]);
		}
		
		arr1[1] = 7777;
		System.out.println("====After modify=====");
		for(int i=0;i<3;i++) {
			System.out.println(arr1[i] + " : " + arr2[i]);
		}
	}

}
