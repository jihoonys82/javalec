package condition.loop;

public class ForEx_01 {
	public static void main(String[] args) {
		//Iteration, loop
		
		//for, while, do-while 
		
		//for loop 
		// for(initialization ; termination ; increment) {
		//		iteration code;
		//	 	iteration when condition is true 
		// } 
		
		int i ; 
		for (i=0; i<5; i++) {
			System.out.println("Hello : " + i);
		}
		// run order 
		// 1. execute initialization.
		// 2. judge the termination. 
		// 	2-1. if it is true go to 3
		//  2-1. if it is false termination the 'for' statement
		// 3. execute iteration code.
		// 4. execute increment
		// 5. back to 2 
	}
}