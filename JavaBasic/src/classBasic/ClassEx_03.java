package classBasic;

public class ClassEx_03 {
	// Access Control Modifier
	//  - private : access from same class only
	//  - default : access from same package 
	//  - protected  : access from same package + inherited class 
	//  - public : All access allowed 
	
	// Applicable at
	//  - class : default and public only
	//  - member field 
	//  - member method
	
	// private < default < protected < public
	
	private int num1 = 10;
	int num2 = 20;
	protected int num3 = 30;
	public int num4 = 40;
	
	public void setNum1(int data) {
		num1 = data; 
	}
	
	public int getNum1() {
		return num1;
	}
	
}
