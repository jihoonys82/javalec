package classMethod;

public class MethodEx_03 {
	public static void main(String[] args) {
		
		Method_03 m03 = new Method_03();
		
		int[] arr = { 1,2,3,4,5 };
		m03.mul10(arr); // all element get *10. 
		m03.print(arr); // print all element;
		
		//arr= { 6,7,8,9,10} //it is impossible. it is only available when declare. 
		
		int[] arr2 = {6, 7, 8, 9, 10};
		int[] result = m03.mul10_v2(arr2); // conserve original array and make new array with 10 times of each element.
		
		m03.print(arr2);
		m03.print(result);
	}
	
}
