package operator;

public class BinaryEx_05 {
	public static void main(String[] args) {
		//Shift operator
		// <<, >>, >>> 
		
		
		// Left shift
		// 쉬프트 한 숫자만큼 2를 제곱해서 곱한다.  
		int num = 7; 
		System.out.println( num << 1 );
		System.out.println( num << 2 );
		System.out.println( num << 3 );
		System.out.println( num << 4 );
		System.out.println("=========");
		
		// Right shift
		// 쉬프트 한 숫자만큼 2를 제곱해서 나눈다.(정확하지 않음)   
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
