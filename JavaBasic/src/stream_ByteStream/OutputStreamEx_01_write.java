package stream_ByteStream;

import java.io.IOException;
import java.io.OutputStream;

public class OutputStreamEx_01_write {

	public static void main(String[] args) {
		
		OutputStream os;
		
		os = System.out; // PrintStream -> OutputStream, OutputStream inherit PrintStream's super class. 
		
		//os.println();	//error, because println() is method in PrintStream class. 
		
		try {
//			os.write(97);
//			os.write(98);
//			os.write(99);
//			os.write(10);
			
			os.write('a');
			os.write('b');
			os.write('c');
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

		System.out.println("\nProgram terminated successfully");
	}

}
