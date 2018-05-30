package classMethod;

public class Method_01 {
	// method (function)
	// implemented class's function 
	// called by class object.
	// method is communication between objects
	
	// usage : [Modifier] [return type] [method name] ( arguments ) {
	//		// code
	//		// Implementation 
	// }
	
	public void method_01() {
		System.out.println("Hello");
	}
	
	public void method_02(int parameter) {
		System.out.println("Paramenter value : " + parameter);
	}
	
	public void method_03(int num, String str) {
		System.out.println(num + ", " + str);
	}
	
	public int returnNum() {
		System.out.println("This method needs return value");
		return 33; 
	}
	
	public int add(int n1, int n2) { //method head, definition 
		
		//method body ,implementation
		int result;
		result = n1 + n2;
		
		return result; 
	}
	
	public int minus(int num1, int num2) {
		
		return num1-num2;
	}
}
