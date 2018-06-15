package stream_ByteStream;

import java.io.IOException;
import java.io.OutputStream;

public class OutputStreamEx_03_write {

	public static void main(String[] args) {
		
		OutputStream os;
		
		os = System.out; // PrintStream -> OutputStream, OutputStream inherit PrintStream's super class. 

		byte[] buf = new byte[1024]; 
		
		int len = 0 ; 
		buf[len++] = 65; // 'A'
		buf[len++] = 66; // 'B'
		buf[len++] = 67; // 'C'
		buf[len++] = 10; // '\n'
		
		buf[len++] = 'H'; // 72
		buf[len++] = 'i'; // 105
		buf[len++] = '\n'; // 10
		
		System.out.println("length: " + buf.length);
		try {
			os.write(buf, 0, len);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
//			try {
//				if(os!=null)	os.close();  //os is shallow copied from System.out, so console writing is no longer available.
//			} catch (IOException e2) {
//				e2.printStackTrace();
//			}
		}

		System.out.println("Program terminated successfully");
	}

}
