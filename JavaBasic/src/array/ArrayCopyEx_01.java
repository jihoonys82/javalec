package array;

public class ArrayCopyEx_01 {

	public static void main(String[] args) {
		
		int[] arr1 = {10, 20, 30};
		int[] arr2; 
		
		//shallow copy
		// just copied reference
		arr2 = arr1;
		
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
