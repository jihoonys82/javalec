package operator;

public class BinaryEx_04 {
	public static void main(String[] args) {
		//Logical operator 
		// logical value(true / false)�� ������ ����� ��ȯ�ϴ� ������
		// �������� ���踦 ������ ����
		
		// AND(&&) , OR(||) , XOR(����), NOT(!) 
		
		boolean b1 = true;
		boolean b2 = false; 
		
		System.out.println("b1 && b2 : " + (b1 && b2));
		System.out.println("b1 || b2 : " + (b1 || b2));
		// CAUTION!! '+' operator has higher priority then logical operator(&&, ||).
		
		//���������� �� ����: ���迬���� ����� ������ �� ���
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