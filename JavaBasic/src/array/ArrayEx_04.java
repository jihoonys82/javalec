package array;

public class ArrayEx_04 {

	public static void main(String[] args) {
		
		//String
		//Character array
		//char[] ch_arr;
		
		String str = "Apple";
		// 'A', 'p', 'p', 'l', 'e'
		
		System.out.println(str.charAt(0));
		System.out.println(str.charAt(3));
		
		//length of array
		System.out.println("length() : " + str.length());
		
		char[] c_arr = str.toCharArray();
		System.out.println(c_arr);
		System.out.println("length() : " + c_arr.length);
		for(char ch : c_arr) {
			System.out.println(ch);
		}
	}

}
