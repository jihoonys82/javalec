package operator;

public class BinaryEx_02 {
	public static void main(String[] args) {
		// relational operator (���迬���� or �񱳿�����) 
		// ���׿�����
		//  �������� �������� ������ ���� ���Ͽ� true/false�� ���迡 ���� �� ����� ��ȯ(����)�Ѵ�.
		
		int num1 = 11;
		int num2 = 22;
		
		System.out.println( num1 == num2 );
		System.out.println( num1 != num2 );
		System.out.println( num1 < num2 );
		System.out.println( num1 > num2 );
		System.out.println( num1 <= num2 );
		System.out.println( num1 >= num2 );
		
		System.out.println("===exception===");
		
		//boolean
		System.out.println( true == true ); //it works, but warning.
		//System.out.println(true < true); // less then(lt) is not working on between boolean and boolean
		// boolean is NOT treated with number (1: true, 0: false works only in C/C++)
		
		// ** reference type���� ���迬�� �Ժη� �ϸ� �ȵ�
		
		
		
	}
}
