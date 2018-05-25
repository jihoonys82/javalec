package condition;

public class SwitchEx_02 {

	public static void main(String[] args) {
		
		int num = 2; 
		switch(num * 10) { // formula is also available in ( ). 
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
