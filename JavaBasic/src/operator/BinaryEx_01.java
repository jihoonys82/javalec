package operator;

public class BinaryEx_01 {
	public static void main(String[] args) {
		//산술 연산자 Arithmetic operator
		int num1 = 17;
		int num2 = 4; 
		
		int result = num1 + num2;
		//int result = 17 + 4;
		//int result = 21;
		// "=" is also operator (대입 연산자)
		//  --> 오른쪽 항의 값을 왼쪽 변수에 저장한다. 
		// "=" has the latest priority.
		
		System.out.println("result : " + result);
		
		System.out.println("-------");
		System.out.println(num1 + num2); //add(addition)
		System.out.println(num1 - num2); //sub(subtraction)
		System.out.println(num1 * num2); //mul(multiply)
		System.out.println(num1 / num2); //div(division)
		System.out.println(num1 % num2); //mod(modulus)
		
		System.out.println("-------");
		System.out.println((double)num1 / (double)num2);
		System.out.println((double)num1 / num2); // num2: auto-casting from int to double
		
		System.out.println("-------");
		//double data  modulus 
		System.out.println(num1 % (double)num2);
		System.out.println(17%2.4); // it is error in C language but JAVA can calculate!
		
		System.out.println("====exception====");
		//System.out.println(11/0); // it occur arithmetic exception.
		System.out.println(12.34/0); // its result is infinity, not error.
		System.out.println(-12.34/0); // -Infinity
		
	}
}
