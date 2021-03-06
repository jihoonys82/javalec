package apiTest;

public class StringEx {
	public static void main(String[] args) {
		String str = "Hello Java";
		//String str = new String("Hello Java");
		
		System.out.println("======length()=====");
		System.out.println("str length : " + str.length());
		
		System.out.println("======toUpperCase()=====");
		System.out.println("toUpperCase() : " + str.toUpperCase());
		
		System.out.println("-----toLowerCase()-----");
		// 모두 소문자로 변환한 lowerCase를 출력
		System.out.println("toLowerCase() : " + str.toLowerCase());
		
		System.out.println("-----charAt()-----");
		// "Hello Java"에서 J 값 얻어서 char변수 ch에 저장,출력
		char ch = str.charAt(6); 
		System.out.println("charAt() : " + ch);
		
		System.out.println("-----concat()-----");
		// str에 ", HIHIHI" 라는 문자열 추가하고 출력
		System.out.println("concat() : " + str.concat(", HIHIHI"));
		
		System.out.println("-----replace()-----");
		// 'l'을 'X'로 변환
		System.out.println("replace() : " + str.replace('l', 'X'));
		// "ava"를 "AVA"로 변환
		System.out.println("replace() : " + str.replace("ava", "AVA"));
		
		System.out.println("-----substring()-----");
		// "Ja" 찾아서 출력
		System.out.println("substring(): " + str.substring(6, 8));
		
		System.out.println("-----contains()-----");
		// str에 "Java"가 있는지 판별
		System.out.println("contains(\"Java\") : " + str.contains("Java"));
		
		System.out.println("-----trim()-----");
		String trim = "    ASDFAF21432 5134gEER   ";
		System.out.println("trim() : " + trim.trim());
		
		System.out.println("-----split()-----");
		String splitData = "1,2,3,4,5,test";
		String[] splited = splitData.split(",");
		for(String s : splited) {
			System.out.println("split() : " + s);	
		}
		
		System.out.println("-----getBytes()-----");
		byte[] bytes = str.getBytes();
		
		System.out.println("getBytes() : " + bytes[0]);
		System.out.println("getBytes() : " + bytes[1]);
		System.out.println("getBytes() : " + bytes[2]);
		System.out.println("getBytes() : " + bytes[3]);
		// for to get further information refer Stream at I/O section 
		
		
	}
}
