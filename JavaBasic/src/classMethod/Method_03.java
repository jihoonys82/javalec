package classMethod;

public class Method_03 {
	
	public void mul10(int[] arr) {// arr is copied as shallow copy, so it dosen't need return. 
		for(int i=0;i<arr.length;i++) {
			arr[i] *= 10; 
		}
	}
	
	public void print(int[] arr) { 
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	public int[] mul10_v2(int[] arr) {
		int[] res = new int[arr.length]; // deep copy. 
		for(int i=0;i<res.length;i++) {
			res[i] = arr[i] * 10;
		}
		return res;
	}
}
