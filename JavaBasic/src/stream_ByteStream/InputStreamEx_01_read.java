package stream_ByteStream;

import java.io.IOException;
import java.io.InputStream;

public class InputStreamEx_01_read {

	public static void main(String[] args) {
		
		InputStream is;
		is = System.in;
		
		StringBuffer sb = new StringBuffer();
		
		int in;
		System.out.println("Waiting for input...");
		
		try {
			while((in = is.read())!=-1) {
				sb.append((char)in);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally { 
			try {
				if(is!=null) is.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("\nInput result : " + sb);
		
	}

}
