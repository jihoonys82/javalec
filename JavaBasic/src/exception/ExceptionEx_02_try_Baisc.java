package exception;

public class ExceptionEx_02_try_Baisc {
	public static void main(String[] args) {
		
		int[] arr = new int[3];
		
		try {
			for(int i =0; true ; i++) {
				arr[i] = i+1; 
				System.out.println(arr[i]);
			}			
		} catch (Exception e) {
			System.out.println("Error! Index out of bounds");
//			e.printStackTrace();
		}
		
		System.out.println("terminate the program");
	}
}
