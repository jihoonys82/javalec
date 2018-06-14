package exception;

public class ExceptionEx_03_try_Baisc {
	public static void main(String[] args) {
		
		int num1 = 7;
		int num2 = 0;
		
//		if(num2 != 0) {
//			System.out.println(num1/num2);			
//		}
		
		try {
			System.out.println(num1/num2);			
		} catch (Exception e) { 
//			e.printStackTrace();
			System.out.println(">> Error! <<");
			System.out.println(">> Can't devided by 0 <<");
			System.out.println(">> Please check the denominator <<");
		}
		
		System.out.println("terminate the program");
	}
}
