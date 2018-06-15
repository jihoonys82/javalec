package stream_ByteStream;

import java.io.IOException;
import java.io.OutputStream;

public class OutputStreamEx_02_write {

	public static void main(String[] args) {
		
		OutputStream os;
		
		os = System.out; // PrintStream -> OutputStream, OutputStream inherit PrintStream's super class. 

		byte[] buf = new byte[1024]; 
		
		buf[0] = 65; // 'A'
		buf[1] = 66; // 'B'
		buf[2] = 67; // 'C'
		buf[3] = 10; // '\n'
		
		buf[4] = 'H'; // 72
		buf[5] = 'i'; // 105
		buf[6] = '\n'; // 10
		
		
		try {
			os.write(buf);
			os.write('\n');
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
