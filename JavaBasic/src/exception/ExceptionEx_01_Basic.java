package exception;

public class ExceptionEx_01_Basic {
	public static void main(String[] args) {
		
		int[] arr = new int[3];
		
		int i= 0;
		while(true) {
			
			//exception handling code
			if( i>= arr.length ) { 
				System.out.println("Index must not larger then " + arr.length + ".");
				break;
			}
			
			arr[i] = i+1;
			System.out.println(arr[i]);
			
			i++;
		}
	}
}
