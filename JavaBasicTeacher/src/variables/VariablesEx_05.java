package variables;

public class VariablesEx_05 {
	public static void main(String[] args) {
	
		// String
		//	참조형 타입
		//	문자열을 다룰 수 있게 해주는 클래스
		
		String name;	// String변수 선언
		name = "Alice";
		System.out.println(name);
		System.out.println("이름 : " + name);
		//System.out.println("이름 : Alice");
		
		int age = 22;
		System.out.println("나이 : " + age);
		
		
		String fruit;	//과일이름
		int price;	//가격
		int num;	//갯수
		
		// 좋아하는 과일 대입
		fruit = "포도";
				
		// 가격 대입
		price = 3000;
		
		// 갯수 대입
		num = 5;
		
		// 최종 출력
		//	ex) Grape, 5000원, 3개
		
		System.out.println(
			fruit+", "+price+"원, "+num+"개");
		
	}
}












