package condition;

public class IfEx_02 {
	public static void main(String[] args) {
		
		int num = 10;
		
		if(num != 10) { 
			System.out.println("Hi"); 
		}
		
		System.out.println("Hello");
		
		System.out.println("============");
		int num1 = 11;
		int num2 = 22;
		
		if(num1<num2) {
			System.out.println("num1 is smaller.");
		} 
		
		System.out.println("============");
		if(num1>=1 && num1<=100) {
			System.out.println("num1 is an integer between 1 and 100");
		}
		
	}
}
