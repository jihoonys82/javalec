package condition;

public class IfElseEx_03 {

	public static void main(String[] args) {
		
		int num1 = 7, num2 = 8;
		
		// inspect odd, even number. 
		if(num1%2 == 0 ) { // in other words, moduler of 2 is 0? 
			System.out.println(num1 + " is even.");
		} else {
			System.out.println(num1 + " is odd.");
		}
		
		//inspect num2 is multiple of 4
		if(num2%4 == 0) {
			System.out.println(num2 + " is multiple of 4");
		} else {
			System.out.println(num2 + " is not multiple of 4");
		}
		
	}

}
