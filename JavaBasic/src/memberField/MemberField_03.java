package memberField;

public class MemberField_03 {
	
	//instance variable
	private int num = 777;
	private static int num2 = 55; 
	
	//int var - parameter
	public void method(int var) {
		// local variable, created when the method is called. 
		int num = 101; // it is only valid in { }.
		
		System.out.println(this.num); // it prints "777"(instance variable)
		System.out.println(num); // it prints "101"(local variable)	
		
	}
	
	public static void mehtod2() {
		//System.out.println(num); // instance variable(error occurred - needs to change static variable) 
		System.out.println(num2); // class variable
	}
}
