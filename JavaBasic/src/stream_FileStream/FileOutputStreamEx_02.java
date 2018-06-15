package stream_FileStream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamEx_02 {
	public static void main(String[] args) {
		
		//Output stream target file
		File file = new File("./src/stream_FileStream/", "Result");
		
		FileOutputStream fos = null;
		
//		byte[] buf = new byte[1024];
//		buf[1] = 'a';
		
		String str = "안녕하세요 자바!!";
		byte[] buf = str.getBytes();
		
		try {
			fos = new FileOutputStream(file, false); // declare new file object - if file is not exist, make a new file.
			// second parameter of FileOutputStream  - append mode
			// true : append mode, false(default): overwrite mode 
			
			//file output code - 
//			fos.write(buf);
			fos.write(buf, 0, buf.length);
			
		} catch (FileNotFoundException e) {
//			e.printStackTrace();
			System.out.println("[ERROR] File not found");
		} catch (IOException e) {
//			e.printStackTrace();
			System.out.println("[ERROR] I/O error");
		} finally {
			try {
				if(fos!=null) fos.close();
			} catch (IOException e) {
//				e.printStackTrace();
				System.out.println("[ERROR] File close fail");
			}
		}
		
		System.out.println("Program terminated successfully!");
		
		
	}

}
