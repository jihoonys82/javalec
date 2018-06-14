package stream_ByteStream;

import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

public class InputStreamEx_02_read {

	public static void main(String[] args) {
		
		InputStream is;
		is = System.in;
				
		StringBuffer sb = new StringBuffer();
		
		byte[] buf = new byte[10];
		int len = -1; 
		System.out.println("Waiting for input ...");
		try {
			while((len = is.read(buf)) != -1) {
				sb.append(new String(buf));
				//flush buffer with Arrays.fill method. 
				Arrays.fill(buf, (byte)0);
				System.out.println("input length : " + len);	
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(is!=null) 	is.close();
			} catch (IOException e2) {
				e2.printStackTrace();
			}
		}
		
		System.out.println("\nInput result : " + sb);
		
	}

}
