package operator;

public class BinaryEx_05 {
	public static void main(String[] args) {
		//Shift operator
		// <<, >>, >>> 
		
		
		// Left shift
		// ����Ʈ �� ���ڸ�ŭ 2�� �����ؼ� ���Ѵ�.  
		int num = 7; 
		System.out.println( num << 1 );
		System.out.println( num << 2 );
		System.out.println( num << 3 );
		System.out.println( num << 4 );
		System.out.println("=========");
		
		// Right shift
		// ����Ʈ �� ���ڸ�ŭ 2�� �����ؼ� ������.(��Ȯ���� ����)   
		num = 7; 
		System.out.println( num >> 1 );
		System.out.println( num >> 2 );
		System.out.println( num >> 3 );
		System.out.println( num >> 4 );
		
		num = -23;
		System.out.println( num >>> 1 );
		System.out.println( num >>> 2 );
		System.out.println( num >>> 3 );
		System.out.println( num >>> 4 );
		
		num = -23;
		System.out.println( num >> 1 );
		System.out.println( num >> 2 );
		System.out.println( num >> 3 );
		System.out.println( num >> 4 );
		
		
	}
}