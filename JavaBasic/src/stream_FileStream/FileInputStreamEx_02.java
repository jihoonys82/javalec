package stream_FileStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

public class FileInputStreamEx_02 {

	public static void main(String[] args) {
		
		File file = new File("./src/stream_FileStream/", "Hello");
		FileInputStream fis = null;
		StringBuffer sb = new StringBuffer(); //store whole data 
		
		byte[] buf = new byte[8];
		int len = -1; //the number of byte read. 
		int total = 0; // the number of total bytes.
		
		try {
			 fis = new FileInputStream(file);
			 
			 //-1 : EOF(End of file) ^Z(ctrl+z) also means EOF. All of Input stream buffer has EOF in the end of its stream logically.   
			 while((len =fis.read(buf)) != -1 ) {
				 sb.append(new String(buf, 0, len));
				 System.out.println("the number of byte read : " + len);
				 total +=len;
				 
				 //clean remain buffer for receiving next input.
//				 Arrays.fill(buf, (byte)0);
			 }
			 
		} catch (FileNotFoundException e) { // FileNotFoundException is IOException's subclass so it have to be placed before IOException. 
			System.out.println("[ERROR] File not exists!");
//			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("[ERROR] Input/Output problem!");
//			e.printStackTrace();
		} finally {
			try {
				if(fis!=null)	fis.close();
			} catch (IOException e2) {
				e2.printStackTrace();
			}
		}
		
		System.out.println("===Number of Read===");
		System.out.println(total +" Bytes");		
		System.out.println("=====Read Data =====");
		System.out.println(sb);
		System.out.println("====================");
		System.out.println("Program terminated successfully!");
	}

}
