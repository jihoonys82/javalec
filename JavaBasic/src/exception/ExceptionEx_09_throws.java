package exception;

import java.io.IOException;

class ThrowsEx {
	public char readChar() throws IOException {
		return (char) System.in.read();
		
	}
}


public class ExceptionEx_09_throws {

	public static void main(String[] args) {
		
		ThrowsEx te = new ThrowsEx();
		
		System.out.print("Input : ");
		try {
			System.out.println(te.readChar());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}