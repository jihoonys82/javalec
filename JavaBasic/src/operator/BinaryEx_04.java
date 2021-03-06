package operator;

public class BinaryEx_04 {
	public static void main(String[] args) {
		//Logical operator 
		// logical value(true / false)의 논리식 결과를 반환하는 연산자
		// 논리값의 관계를 따지는 연산
		
		// AND(&&) , OR(||) , XOR(없음), NOT(!) 
		
		boolean b1 = true;
		boolean b2 = false; 
		
		System.out.println("b1 && b2 : " + (b1 && b2));
		System.out.println("b1 || b2 : " + (b1 || b2));
		// CAUTION!! '+' operator has higher priority then logical operator(&&, ||).
		
		//논리연산의 주 목적: 관계연산의 결과를 조합할 떄 사용
		int num = 57;
		System.out.println((num >= 1)&&(num <= 100));
		// 1. num is grater then 1?
		// 2. num is lesser then 100? 
		// does it fulfill the condition 1 and 2 at the same time?   
		
		System.out.println( !((num>=1)&&(num<=100)) );
		// Order
		// 1. (num>=1) ==> true
		// 2. (num<=100) ==> true
		// 3. true && true ==> true
		// 4. !(true) ==> false
		
		System.out.println( (num<1)||(num>100) );
	}
}
