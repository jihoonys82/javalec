package operator;

public class BinaryEx_02 {
	public static void main(String[] args) {
		// relational operator (관계연산자 or 비교연산자) 
		// 이항연산자
		//  왼쪽항을 기준으로 오른쪽 항을 비교하여 true/false로 관계에 대한 비교 결과를 반환(리턴)한다.
		
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
		
		// ** reference type에는 관계연산 함부러 하면 안됨
		
		
		
	}
}
