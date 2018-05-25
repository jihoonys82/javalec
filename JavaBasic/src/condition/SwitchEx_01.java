package condition;

public class SwitchEx_01 {

	public static void main(String[] args) {
		
		//switch statement 
		//switch-case statement 
		
		// switch(value) { // integer value is in ( ), char is available as well.
		//		case value1:
		//		case value2:
		//		case value3:
		// 		....
		//		default:
		// }
		
		int num = 20; 
		switch(num) {
		case 10: 
			System.out.println("Value is 10");
			break;
		case 20: 
			System.out.println("Value is 20");
			break;
		case 30: 
			System.out.println("Value is 30");
			break;
		default: 
			System.out.println("default, there is no profer value");
		}
		
	}

}
