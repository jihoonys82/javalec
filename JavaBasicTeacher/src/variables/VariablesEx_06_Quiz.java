package variables;

public class VariablesEx_06_Quiz {
	public static void main(String[] args) {
		/*
		 * Quiz
		 * 가상인물의 개인정보를 변수에 저장하고 출력하는 프로그램 작성
		 */
		//1. 개인정보 변수 생성
		// 이름, 나이, 성별, 키
		// name, age, gender, height
		// String, int, char, double
		
		String name;	// 이름
		int age;	// 나이
		char gender;	// 성별
		double height;	// 키
		
		
		//2. 변수에 알맞은 값 대입
		name = "한지오";
		age = 20;
		gender = '여';
		height = 190.5;
		
		
		//3. 출력
		// ex)	이름 : Bob
		//		나이 : 99
		//		성별 : 남
		//		키 : 212.78

		// println 사용
//		System.out.println("이름 : " + name);
//		System.out.println("나이 : " + age);
//		System.out.println("성별 : " + gender);
//		System.out.println("키 : " + height);

		// print 사용
		System.out.print("이름 : " + name + ", ");
		System.out.print("나이 : " + age);
		System.out.println();
		System.out.print("성별 : " + gender + ", ");
		System.out.print("키 : " + height);

		
	}
}










