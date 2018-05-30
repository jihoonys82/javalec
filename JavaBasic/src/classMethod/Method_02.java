package classMethod;

public class Method_02 {
	
	/**
	 * print number 1 to 100
	 */
	public void print100() {
		for(int i=1;i<=100;i++) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
	
	/**
	 * print "Apple" * num times 
	 * @param num : number of Iteration
	 */
	public void printApple(int num) {
		for(int i=0;i<num;i++) {
			System.out.println("Apple");
		}
	}
	
	/**
	 * Print "num" times String "str"
	 * @param num : number of iteration
	 * @param str : iterated string
	 */
	public void iterPrint(int num, String str) {
		for(int i=0;i<num;i++) {
			System.out.println(str);
		}
	}
}
