package array;

public class ArrayEx_05 {

	public static void main(String[] args) {
		
		//String Array
		//String[] 
		String[] strArr;
		strArr = new String[3]; //Space for 3 strings
		strArr[0] = "Apple";
		strArr[1] = "Banana";
		strArr[2] = "Cherry";
		
		for(int i=0;i<strArr.length;i++) { //strArr is Array
			System.out.println(strArr[i]);
			System.out.println("length of string : " + strArr[i].length()); // strArr[i] is element of strArr 
		}
		

	}

}
