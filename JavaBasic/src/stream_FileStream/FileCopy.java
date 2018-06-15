package stream_FileStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.UUID;

public class FileCopy {

	public static void main(String[] args) {
		
		File dir = new File("./src/stream_FileStream/");
		File source = new File(dir,"Source.txt");
		File dest = new File(dir,"Dest_"+ UUID.randomUUID() +".txt");
		// UUID inserted in the dest file for identify each execution of the program.
		
		
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		byte[] buf = new byte[1024];
		
		int len = -1; 
		int total = 0; 
		
		try {
			fis = new FileInputStream(source);
			fos = new FileOutputStream(dest, true);
			
			while((len = fis.read(buf))!= -1 ) {
				fos.write(buf, 0, len);
				total += len;
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("[ERROR] File not found!");
//			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("[ERROR] Input/Output has problem!");
//			e.printStackTrace();
		} finally {
			try {
				if(fos != null)	fos.close();
				if(fis != null)	fis.close();
			} catch (IOException e) {
				System.out.println("[ERROR] IO exception error : failed to close File Input/Output Stream");
//				e.printStackTrace();
			}
		}
		
		System.out.println("Copy complete!, " + total + " Bytes");
				
		

	}

}
