package exception;

import java.io.IOException;

public class ExceptionEx_08_throws {

	public static void main(String[] args) {
		// throws at main method is not recommended!! 
		
		
		int input = -1; // -1 means "end of stream"
		// For calling the method which has throws, error handling have to be used. 
		try {
			input = System.in.read();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(input);
	}

}
