package array;

public class ArrayEtc_03 {
	public static void main(String[] args) {
		
		//Swap 
		// exchange data between variables. 
		
		int num1 = 11;
		int num2 = 22;
		int tmp;
		
		System.out.println("[Before] " + num1 + " " + num2);
		
		tmp = num2; //backup  
		num2 = num1;
		num1 = tmp; //restore
		
		System.out.println("[ After] " + num1 + " " + num2);
	}
}
