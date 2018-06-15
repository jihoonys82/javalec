package stream_FileStream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamEx_01 {
	public static void main(String[] args) {
		
		//Output stream target file
		File file = new File("./src/stream_FileStream/", "Result");
		
		FileOutputStream fos = null;
		
		try {
			fos = new FileOutputStream(file); // declare new file object - if file is not exist, make a new file. 
			
			fos.write(65); //A
			fos.write('C'); //67
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(fos!=null) fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("Program terminated successfully!");
		
		
	}

}
