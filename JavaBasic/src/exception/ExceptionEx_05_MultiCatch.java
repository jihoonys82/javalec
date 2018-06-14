package exception;

import java.util.Scanner;

public class ExceptionEx_05_MultiCatch {
	public static void main(String[] args) {
		
		try {
			//try block
			// make codes may occur error.
			
		} catch (ArithmeticException e) {
			// ArithmeticException handling code
			
		} catch (NullPointerException e) {
			// NullPointerExecption handling code
			
		} catch (Exception e) {
			// handle all of other exceptions except above. 
		} finally {
			// (optional) execute in spite of error occurred or not. 
		}
		
		
		
		
	}
}
