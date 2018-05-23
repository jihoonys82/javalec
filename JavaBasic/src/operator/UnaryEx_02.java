package operator;

public class UnaryEx_02 {
	public static void main(String[] args) { 
		// Bitwise Not operator
		//  1의 보수 생성
		// ~
		
		byte num = 7;
		System.out.println(~num); // 1의 보수 : -8
		System.out.println(~num + 1); // 2의 보수 : -7 
		// 숫자의 부호를 바꾸는 역할
	}
}
