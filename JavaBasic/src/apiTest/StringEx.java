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
		// ��� �ҹ��ڷ� ��ȯ�� lowerCase�� ���
		System.out.println("toLowerCase() : " + str.toLowerCase());
		
		System.out.println("-----charAt()-----");
		// "Hello Java"���� J �� �� char���� ch�� ����,���
		char ch = str.charAt(6); 
		System.out.println("charAt() : " + ch);
		
		System.out.println("-----concat()-----");
		// str�� ", HIHIHI" ��� ���ڿ� �߰��ϰ� ���
		System.out.println("concat() : " + str.concat(", HIHIHI"));
		
		System.out.println("-----replace()-----");
		// 'l'�� 'X'�� ��ȯ
		System.out.println("replace() : " + str.replace('l', 'X'));
		// "ava"�� "AVA"�� ��ȯ
		System.out.println("replace() : " + str.replace("ava", "AVA"));
		
		System.out.println("-----substring()-----");
		// "Ja" ã�Ƽ� ���
		System.out.println("substring(): " + str.substring(6, 8));
		
		System.out.println("-----contains()-----");
		// str�� "Java"�� �ִ��� �Ǻ�
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
