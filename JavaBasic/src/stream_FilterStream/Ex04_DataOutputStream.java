package stream_FilterStream;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex04_DataOutputStream {

	public static void main(String[] args) {
		
		File file = new File("./src/stream_FilterStream","DataTest");
		
		FileOutputStream fos = null;
		DataOutputStream dos = null;
		
		try {
			fos = new FileOutputStream(file);
			dos = new DataOutputStream(fos);
			
			dos.writeInt(100);
			dos.writeBoolean(false);
			dos.writeChar('T');
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {		
			e.printStackTrace();
		} finally { 
			try {
				if(dos!=null) dos.close();
				if(fos!=null) fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		

	}

}
