package classBasic;

public class MainClass_02 {
	//member field 
	int num1 = 111; 
	int num2 = 222;
	
//	num1 = 10; // it occurs error because here is for declare(define) members.  
	
	public static void main(String[] args) {

		MainClass_02 mc = new MainClass_02();
		mc.out();
		
	}
	
	public void out() {
		System.out.println(num1 + "," + num2);
	}
}
