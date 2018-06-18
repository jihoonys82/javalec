package stream_FilterStream;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

public class Ex02_BufferedInputStream {

	public static void main(String[] args) {
		
		File file = new File("./src/stream_FilterStream/", "Test");
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		
		byte[] buf = new byte[1024];
		int len = -1;
		
		try {
			fis = new FileInputStream(file);
			bis = new BufferedInputStream(fis);
			
			while((len = bis.read(buf))!=-1) {
				System.out.println(new String(buf).trim());
				
				Arrays.fill(buf, (byte)0);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(bis!=null)	bis.close();
				if(fis!=null)	fis.close();//Order is important bis have to close before fis.
			} catch (IOException e2) {
				e2.printStackTrace();
			}
		}
		
	}

}
