package operator;

public class BinaryEx_03 {
	public static void main(String[] args) {
		//���� ���� ������ (��� ���� ������)
		// ���Կ����ڿ� ��� �����ڸ� �����ؼ� ���°� 
		int num1 = 17;
		int num2 = 4; 
		
		System.out.println("=======");
		System.out.println("num1 = " + num1 + ", num2 = " + num2);
		
		num2 +=num1;
		// same as, num2 = num2 + num1;
		
		//num2 -= num1;
		//num2 =- num1;  // CAUTION! it means num2 = (-num1); it might be logical error that is really hard to find the problem!  
		
		//num2 *= num1;
		
		//num2 /= num1; // casting is not working in this case.
		
		//num2 %= num1;
		
		System.out.println("num2 += num1 : " + num2);
		
	}
}