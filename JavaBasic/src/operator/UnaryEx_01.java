package operator;

public class UnaryEx_01 {
	public static void main(String[] args) {
		//증감 연산자
		// 증가(++), 감소(--) 연산자
		// 정수 1 증가/감소 시키는 연산
		// 단항 연산자
		// num++; // 후위(후치)증가 연산자
		// num--; // 전위(전치)증가 연산자
		
		int num; 
		num = 15; 

		System.out.println("before : " + num);
		System.out.println("run : " + num++);
		System.out.println("after : " + num);
		System.out.println("============");
		
		num = 15;
		
		System.out.println("before : " + num);
		System.out.println("run : " + ++num);
		System.out.println("after : " + num);
		System.out.println("============");
		
		// 변수의 값을 1 증가시키는 코드 
		// num = num + 1; 
		// num += 1; 
		// num++;  --> the most priority! and best performance! 
		// ++num;		
		
	}
}
