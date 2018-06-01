package constructor;

class Constructor_01 {
	
	private int num1;
	private int num2 = 200;
	
	public Constructor_01() {
		System.out.println("Default Constructor");
		this.num1 = 100;
		//this.num2 = 200;
		
	}
	
	public Constructor_01(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
		
	}
	
	public void out() {
		System.out.println("(" + num1 + "," + num2 + ")");
	}
	
//	public void Constructor_01() { 
//		System.out.println("it just method");
//	}
	
}

public class ConstructorEx_01 {
	public static void main(String[] args) {
		
		Constructor_02 cons01;
		
		cons01 = new Constructor_02();
		cons01.out();
		
		Constructor_02 cons02;
		cons02 = new Constructor_02(111,222);
		cons02.out();
		
	}
}
