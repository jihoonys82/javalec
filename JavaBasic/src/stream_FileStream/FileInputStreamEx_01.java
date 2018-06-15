package stream_FileStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamEx_01 {

	public static void main(String[] args) {
		
		File file = new File("./src/stream_FileStream/", "Hello");
		FileInputStream fis = null;
		StringBuffer sb = new StringBuffer(); //store whole data 
		int in = -1; //한글자씩 입력된 데이터
		
		try {
			 fis = new FileInputStream(file);
			 
			 //-1 : EOF(End of file) ^Z(ctrl+z) also means EOF. All of Input stream buffer has EOF in the end of its stream logically.   
			 while((in =fis.read()) != -1 ) {
				 sb.append((char)in);
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
		
		System.out.println("==========");
		System.out.println(sb);
		System.out.println("==========");
		System.out.println("Program terminated successfully!");
	}

}
