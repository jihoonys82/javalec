package stream_FilterStream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {

	public static void main(String[] args) {
		
		File dir = new File("./src/stream_FilterStream/");
		File source = new File(dir,"Source.txt");
		File dest = new File(dir,"Dest.txt");
		
		FileInputStream 	 fis = null;
		BufferedInputStream  bis = null;
		FileOutputStream 	 fos = null;
		BufferedOutputStream bos = null;
		
		byte[] buf = new byte[1024];
		
		int len = -1; 
		int total = 0; 
		
		try {
			fis = new FileInputStream(source);
			bis = new BufferedInputStream(fis);
			fos = new FileOutputStream(dest);
			bos = new BufferedOutputStream(fos);
			
			while((len = bis.read(buf))!= -1 ) {
				bos.write(buf, 0, len);
				total += len;				
			}
			
			bos.flush();// flush all data in buffer. It pushes data to fos and empty bos. 
			//if flush is not executed, some data may be thrown and not be written in the file.
			
		} catch (FileNotFoundException e) {
			System.out.println("[ERROR] File not found!");
//			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("[ERROR] Input/Output has problem!");
//			e.printStackTrace();
		} finally {
			try {
				if(bos != null) bos.close(); // it also contains flush() itself. 
				if(fos != null)	fos.close();
				if(bis != null) bis.close();
				if(fis != null)	fis.close();
			} catch (IOException e) {
				System.out.println("[ERROR] IO exception error : failed to close File Input/Output Stream");
//				e.printStackTrace();
			}
		}
		
		System.out.println("Copy complete!, " + total + " Bytes");
				
		

	}

}
