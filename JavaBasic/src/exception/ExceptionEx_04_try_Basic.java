package exception;

import java.util.Scanner;

public class ExceptionEx_04_try_Basic {
	public static void main(String[] args) {
		
		try {
			System.out.println("try block");
			
		} catch (ArithmeticException | NullPointerException e) {
			// multi catch for ArithemeticException and NullPointerException
			// since java SE 7
			
		} finally {
			// (optional) execute in spite of error occurred or not. 
		}
		
		
		
		
	}
}
