package classMethod;

public class Method_Quiz {
	private int num1; 
	private int num2;
	private char operator;
	

	public int getNum1() {
		return num1;
	}
	public void setNum1(int num1) {
		this.num1 = num1;
	}
	public int getNum2() {
		return num2;
	}
	public void setNum2(int num2) {
		this.num2 = num2;
	} 
	public char getOperator() {
		return operator;
	}
	public void setOperator(String operator) {
		if(operator.length() != 0) {
			this.operator = operator.charAt(0);
		}
		else this.operator = ' ';
	}
	
	public int sum(int num1, int num2) {
		return num1 + num2;
	}
	
	public int sub(int num1, int num2) {
		return num1 - num2;
	}
	
	public int mul(int num1, int num2) { 
		return num1*num2;
	}
	
	public double div(int num1, int num2) { 
		try {
			return (double)num1 / num2;
		} catch (Exception e) {
			System.out.println("Can't calculate");
			return 0.0;
		}
	}
	
}
